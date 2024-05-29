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
package io.ecocode.ios.swift.checks.camera;

import io.ecocode.ios.swift.SwiftRuleCheck;
import io.ecocode.ios.swift.antlr.generated.Swift5Parser;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;
import org.sonar.check.Rule;

@Rule(key = "EC512")
public class CameraLeak extends SwiftRuleCheck {
    private static final String DEFAULT_ISSUE_MESSAGE = "Any started capture session should be stopped.";
    private boolean captureSessionStarted = false;
    private boolean captureSessionStopped = false;
    Swift5Parser.ExpressionContext id;

    @Override
    public void apply(ParseTree tree) {
        if (tree instanceof Swift5Parser.ExpressionContext && tree.getText().contains("startRunning")) {
            id = (Swift5Parser.ExpressionContext) tree;
            captureSessionStarted = true;
        }

        if (tree instanceof Swift5Parser.ExpressionContext
                && (tree.getText().contains("stopRunning"))) {
            captureSessionStopped = true;
        }

        if (tree instanceof TerminalNodeImpl && tree.getText().equals("<EOF>")) {
            if (captureSessionStarted && !captureSessionStopped) {
                this.recordIssue(id.getStart().getStartIndex(), DEFAULT_ISSUE_MESSAGE);
            }
            captureSessionStarted = false;
            captureSessionStopped = false;
        }
    }
}

