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
package org.greencodeinitiative.creedengo.ios.swift.checks.geolocalisation;

import org.greencodeinitiative.creedengo.ios.swift.SwiftRuleCheck;
import org.greencodeinitiative.creedengo.ios.swift.antlr.generated.Swift5Parser;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;
import org.sonar.check.Rule;
import org.sonarsource.analyzer.commons.annotations.DeprecatedRuleKey;

import static org.greencodeinitiative.creedengo.ios.swift.checks.CheckHelper.*;

@Rule(key = "GCI524")
@DeprecatedRuleKey(repositoryKey = "ecocode-ios", ruleKey = "EC524")
public class ThriftyGeolocation extends SwiftRuleCheck {
    private static final String DEFAULT_ISSUE_MESSAGE = "Adapt location accuracy and type to applications needs.";
    private Swift5Parser.Import_declarationContext importTree = null;
    private boolean geolocationUpdated = false;
    protected boolean importExist = false;

    @Override
    public void apply(ParseTree tree) {
        if (isImportExisting(tree, "CLLocationManager")) {
            importTree = (Swift5Parser.Import_declarationContext) tree;
            importExist = true;
        }

        geolocationUpdated = geolocationUpdated ||
                (isExpressionPresent(tree, "desiredAccuracy") ||
                isExpressionPresent(tree, "CLActivityType"));

        if (isEndOfFile(tree)) {
            if (importExist && !geolocationUpdated) {
                this.recordIssue(importTree.getStart().getStartIndex(), DEFAULT_ISSUE_MESSAGE);
            }
            importExist = false;
            geolocationUpdated = false;
        }
    }
}
