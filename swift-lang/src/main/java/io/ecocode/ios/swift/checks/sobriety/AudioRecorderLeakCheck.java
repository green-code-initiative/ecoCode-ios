/*
 * ecoCode iOS plugin - Help the earth, adopt this green plugin for your applications
 * Copyright © 2023 green-code-initiative (https://www.ecocode.io/)
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package io.ecocode.ios.swift.checks.sobriety;

import io.ecocode.ios.swift.SwiftRuleCheck;
import io.ecocode.ios.swift.antlr.generated.Swift5Parser;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;
import org.sonar.check.Rule;

import static io.ecocode.ios.swift.checks.CheckHelper.*;

@Rule(key = "EC515")
public class AudioRecorderLeakCheck extends SwiftRuleCheck {
    private static final String DEFAULT_ISSUE_MESSAGE = "Any audio recording started should be stopped.";
    Swift5Parser.ExpressionContext id = null;
    private boolean audioRecorderStarted = false;
    private boolean audioRecorderStopped = false;
    private boolean importExist = false;
    private boolean isAudioRecorderUsed = false;


    @Override
    public void apply(ParseTree tree) {
        importExist = importExist || isImportExisting(tree, "AVFoundation");
        isAudioRecorderUsed = isAudioRecorderUsed || (importExist && isExpressionPresent(tree, "AVAudioRecorder"));

        if (isAudioRecorderUsed) {
            findStartedButNotStoppedAudioRecord(tree);
        }
    }

    private void findStartedButNotStoppedAudioRecord(ParseTree tree) {
        if (isFunctionCalled(tree, "record")) {
            id = (Swift5Parser.ExpressionContext) tree;
            audioRecorderStarted = true;
        }

        if (isFunctionCalled(tree, "stop")) {
            audioRecorderStopped = true;
        }

        if (isEndOfFile(tree)) {
            if (audioRecorderStarted && !audioRecorderStopped) {
                this.recordIssue(id.getStart().getStartIndex(), DEFAULT_ISSUE_MESSAGE);
            }
            audioRecorderStarted = false;
            audioRecorderStopped = false;
            isAudioRecorderUsed = false;
            importExist = false;
        }
    }
}