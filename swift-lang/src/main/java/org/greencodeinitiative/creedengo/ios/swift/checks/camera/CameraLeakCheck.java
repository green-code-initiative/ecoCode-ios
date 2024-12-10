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
package org.greencodeinitiative.creedengo.ios.swift.checks.camera;

import org.greencodeinitiative.creedengo.ios.swift.SwiftRuleCheck;
import org.greencodeinitiative.creedengo.ios.swift.antlr.generated.Swift5Parser;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;
import org.sonar.check.Rule;

import static org.greencodeinitiative.creedengo.ios.swift.checks.CheckHelper.isEndOfFile;
import static org.greencodeinitiative.creedengo.ios.swift.checks.CheckHelper.isExpressionPresent;

@Rule(key = "GCI512")
public class CameraLeakCheck extends SwiftRuleCheck {
    private static final String DEFAULT_ISSUE_MESSAGE = "Any started capture session should be stopped.";
    private boolean captureSessionStarted = false;
    private boolean captureSessionStopped = false;
    Swift5Parser.ExpressionContext id;

    @Override
    public void apply(ParseTree tree) {
        if (isExpressionPresent(tree,"startRunning")) {
            id = (Swift5Parser.ExpressionContext) tree;
            captureSessionStarted = true;
        }

        if (isExpressionPresent(tree,"stopRunning")) {
            captureSessionStopped = true;
        }

        if (isEndOfFile(tree)) {
            if (captureSessionStarted && !captureSessionStopped) {
                this.recordIssue(id.getStart().getStartIndex(), DEFAULT_ISSUE_MESSAGE);
            }
            captureSessionStarted = false;
            captureSessionStopped = false;
        }
    }
}

