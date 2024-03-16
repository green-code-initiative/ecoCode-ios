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
package io.ecocode.ios.swift.checks.power;

import io.ecocode.ios.swift.SwiftRuleCheck;
import io.ecocode.ios.swift.antlr.generated.Swift5Parser;
import org.antlr.v4.runtime.tree.ParseTree;
import org.sonar.check.Rule;

import java.util.List;

@Rule(key = "EC543")
public class SaveModeAwarenessCheck extends SwiftRuleCheck {
    private static final String DEFAULT_ISSUE_MESSAGE = "Taking into account when the device is entering or exiting the power save mode is a good practice";
    private static final String PROCESS_INFO = "ProcessInfo.processInfo.isLowPowerModeEnabled";
    private static final String POWER_STATE_NOTIFICATION_FULL = "Notification.Name.NSProcessInfoPowerStateDidChange";
    private static final String POWER_STATE_NOTIFICATION_SHORT = ".NSProcessInfoPowerStateDidChange";

    private static final List<String> EXPRESSIONS_TO_CHECK = List.of(
        PROCESS_INFO,
        POWER_STATE_NOTIFICATION_FULL,
        POWER_STATE_NOTIFICATION_SHORT
    );

    @Override
    public void apply(ParseTree tree) {
        if (tree instanceof Swift5Parser.Postfix_expressionContext) {
            Swift5Parser.Postfix_expressionContext id = (Swift5Parser.Postfix_expressionContext) tree;
            if (EXPRESSIONS_TO_CHECK.contains(id.getText())) {
                this.recordIssue(id.getStart().getStartIndex(), DEFAULT_ISSUE_MESSAGE);
            }
        }
    }
}
