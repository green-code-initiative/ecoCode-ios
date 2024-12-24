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
package org.greencodeinitiative.creedengo.ios.swift.checks.sobriety;

import org.greencodeinitiative.creedengo.ios.swift.SwiftRuleCheck;
import org.greencodeinitiative.creedengo.ios.swift.antlr.generated.Swift5Parser;
import org.antlr.v4.runtime.tree.ParseTree;
import org.sonar.check.Rule;
import org.sonarsource.analyzer.commons.annotations.DeprecatedRuleKey;

import static org.greencodeinitiative.creedengo.ios.swift.checks.CheckHelper.isEndOfFile;
import static org.greencodeinitiative.creedengo.ios.swift.checks.CheckHelper.isFunctionCalled;


@Rule(key = "GCI513")
@DeprecatedRuleKey(repositoryKey = "ecocode-ios", ruleKey = "EC513")
public class LocationLeakCheck extends SwiftRuleCheck {
    public static final String START_UPDATING_LOCATION_METHOD = "startUpdatingLocation";
    public static final String STOP_UPDATING_LOCATION_METHOD = "stopUpdatingLocation";
    private static final String DEFAULT_ISSUE_MESSAGE = "calls must be carefully paired: CLLocationManager." + START_UPDATING_LOCATION_METHOD + "() and CLLocationManager." + STOP_UPDATING_LOCATION_METHOD + "()";
    protected boolean firstCallExist = false;
    protected boolean secondCallExist = false;
    protected Swift5Parser.ExpressionContext id;

    @Override
    public void apply(ParseTree tree) {

        if (isFunctionCalled(tree, START_UPDATING_LOCATION_METHOD)) {
            firstCallExist = true;
            id = (Swift5Parser.ExpressionContext) tree;
        }

        if (isFunctionCalled(tree, STOP_UPDATING_LOCATION_METHOD)) {
            secondCallExist = true;
        }

        if (isEndOfFile(tree)) {
            if (firstCallExist && !secondCallExist) {
                this.recordIssue(id.getStart().getStartIndex(), DEFAULT_ISSUE_MESSAGE);
            }
            firstCallExist = false;
            secondCallExist = false;
        }
    }
}
