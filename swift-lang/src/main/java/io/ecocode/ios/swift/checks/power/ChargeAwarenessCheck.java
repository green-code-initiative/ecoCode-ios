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

/**
 * Look for `UIDevice.current.batteryLevel` or `UIDevice.current.batteryState`
 * or `UIDevice.batteryLevelDidChangeNotification` or `UIDevice.batteryStateDidChangeNotification`.
 * If found, reports a (positive) issue.
 */
@Rule(key = "EC602")
public class ChargeAwarenessCheck extends SwiftRuleCheck {
    private static final String DEFAULT_ISSUE_MESSAGE = "Monitoring power changes and customizing behavior depending on battery level is a good practice";
    private static final String PROPERTY_BATTERY_LEVEL = "UIDevice.current.batteryLevel";
    private static final String PROPERTY_BATTERY_STATE = "UIDevice.current.batteryState";
    private static final String CONSTANT_BATTERY_LEVEL_NOTIFICATION = "UIDevice.batteryLevelDidChangeNotification";
    private static final String CONSTANT_BATTERY_STATE_NOTIFICATION = "UIDevice.batteryStateDidChangeNotification";

    private static final List<String> EXPRESSIONS_TO_CHECK = List.of(
        PROPERTY_BATTERY_LEVEL,
        PROPERTY_BATTERY_STATE,
        CONSTANT_BATTERY_LEVEL_NOTIFICATION,
        CONSTANT_BATTERY_STATE_NOTIFICATION
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
