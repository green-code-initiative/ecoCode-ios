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
package io.ecocode.ios.swift.checks.geolocalisation;

import io.ecocode.ios.swift.SwiftRuleCheck;
import io.ecocode.ios.swift.antlr.generated.Swift5Parser;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;
import org.sonar.check.Rule;

import static io.ecocode.ios.swift.checks.CheckHelper.isImportExisting;

@Rule(key = "EC522")
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

        if (!geolocationUpdated
            && tree instanceof Swift5Parser.ExpressionContext
            && (tree.getText().contains("desiredAccuracy") || tree.getText().contains("CLActivityType"))) {
            geolocationUpdated = true;
        }

        if (tree instanceof TerminalNodeImpl && tree.getText().equals("<EOF>")) {
            if (importExist && !geolocationUpdated) {
                this.recordIssue(importTree.getStart().getStartIndex(), DEFAULT_ISSUE_MESSAGE);
            }
            importExist = false;
            geolocationUpdated = false;
        }
    }
}
