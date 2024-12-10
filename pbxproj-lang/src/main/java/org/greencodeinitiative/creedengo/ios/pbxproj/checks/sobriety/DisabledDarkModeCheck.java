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
package io.ecocode.ios.pbxproj.checks.sobriety;

import org.antlr.v4.runtime.tree.ParseTree;

import io.ecocode.ios.pbxproj.PbxprojRuleCheck;
import io.ecocode.ios.pbxproj.antlr.generated.PbxprojParser;

import org.sonar.check.Rule;

@Rule(key = "EC547")
public class DisabledDarkModeCheck extends PbxprojRuleCheck {

    private static final String DEFAULT_ISSUE_MESSAGE = "The app should handle dark mode.";
    private static final String SEARCHED_PROPERTY_NAME = "INFOPLIST_KEY_UIUserInterfaceStyle";
    private static final String SEARCHED_PROPERTY_VALUE = "Light";

    @Override
    public void apply(ParseTree tree) {
        if (tree instanceof PbxprojParser.Key_valueContext) {
            PbxprojParser.Key_valueContext context = (PbxprojParser.Key_valueContext) tree;
            String propertyName = context.str_number_variable(0).getText();
            String propertyValue = context.str_number_variable(1).getText();

            if (propertyName.equals(SEARCHED_PROPERTY_NAME) && propertyValue.equals(SEARCHED_PROPERTY_VALUE)) {
                this.recordIssue(context.getStart().getStartIndex(), DEFAULT_ISSUE_MESSAGE);
            }
        }
    }

}