/*
 * Creedengo iOS plugin - Help the earth, adopt this green plugin for your applications
 * Copyright © 2024 green-code-initiative (https://green-code-initiative.org/)
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
package org.greencodeinitiative.creedengo.ios.swift.checks.motionsensor;

import org.greencodeinitiative.creedengo.ios.swift.SwiftRuleCheck;
import org.greencodeinitiative.creedengo.ios.swift.antlr.generated.Swift5Parser;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;
import org.sonar.check.Rule;
import org.sonarsource.analyzer.commons.annotations.DeprecatedRuleKey;

import java.util.Arrays;
import java.util.List;

import static org.greencodeinitiative.creedengo.ios.swift.checks.CheckHelper.*;

@Rule(key="GCI534")
@DeprecatedRuleKey(repositoryKey = "ecocode-ios", ruleKey = "EC534")
public class MotionSensorUpdateRateCheck extends SwiftRuleCheck {
    private static final String DEFAULT_ISSUE_MESSAGE = "Set appropriate motion sensor update rates for the application's needs";
    private Swift5Parser.Import_declarationContext importTree = null;
    private boolean sensorRateUpdated = false;
    private boolean importExist = false;

    private final List<String> sensorRateUpdateExpressions = Arrays.asList("desiredAccuracy", "activityType", "requestLocation", "magnetometerUpdateInterval");

    @Override
    public void apply(ParseTree tree) {
        if (isImportExisting(tree, "CoreMotion")) {
            importTree = (Swift5Parser.Import_declarationContext) tree;
            importExist = true;
        }
        sensorRateUpdated = sensorRateUpdated || sensorRateUpdateExpressions.stream()
                .anyMatch(exp -> isExpressionPresent(tree, exp));

        if (isEndOfFile(tree)) {
            if (importExist && !sensorRateUpdated) {
                this.recordIssue(importTree.getStart().getStartIndex(), DEFAULT_ISSUE_MESSAGE);
            }
            importExist = false;
            sensorRateUpdated = false;
        }
    }
}
