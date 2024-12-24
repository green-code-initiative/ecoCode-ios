/*
 * Creedengo iOS plugin - Help the earth, adopt this green plugin for your applications
 * Copyright © 2023 green-code-initiative (https://green-code-initiative.org/)
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
package org.greencodeinitiative.creedengo.ios.swift.checks.sobriety;

import org.greencodeinitiative.creedengo.ios.swift.SwiftRuleCheck;
import org.greencodeinitiative.creedengo.ios.swift.antlr.generated.Swift5Parser;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;
import org.sonar.check.Rule;
import org.sonarsource.analyzer.commons.annotations.DeprecatedRuleKey;

import static org.greencodeinitiative.creedengo.ios.swift.checks.CheckHelper.isEndOfFile;
import static org.greencodeinitiative.creedengo.ios.swift.checks.CheckHelper.isFunctionCalled;

@Rule(key = "GCI514")
@DeprecatedRuleKey(repositoryKey = "ecocode-ios", ruleKey = "EC514")
public class MotionSensorLeakCheck extends SwiftRuleCheck {
    private static final String DEFAULT_ISSUE_MESSAGE = "Any motion sensor started should be stopped.";
    private boolean motionSensorStarted = false;
    private boolean motionSensorStopped = false;
    Swift5Parser.ExpressionContext id;

    @Override
    public void apply(ParseTree tree) {
        if (isFunctionCalled(tree,"startAccelerometerUpdates")) {
            id = (Swift5Parser.ExpressionContext) tree;
            motionSensorStarted = true;
        }

        if (isFunctionCalled(tree,"stopAccelerometerUpdates")) {
            motionSensorStopped = true;
        }

        if (isEndOfFile(tree)) {
            if (motionSensorStarted && !motionSensorStopped) {
                this.recordIssue(id.getStart().getStartIndex(), DEFAULT_ISSUE_MESSAGE);
            }
            motionSensorStarted = false;
            motionSensorStopped = false;
        }
    }
}