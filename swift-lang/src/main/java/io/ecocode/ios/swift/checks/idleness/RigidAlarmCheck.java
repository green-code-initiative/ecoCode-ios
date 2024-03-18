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
package io.ecocode.ios.swift.checks.idleness;

import io.ecocode.ios.swift.SwiftRuleCheck;
import io.ecocode.ios.swift.antlr.generated.Swift5Parser;
import org.antlr.v4.runtime.tree.ParseTree;
import org.sonar.check.Rule;

/**
 * Check the presence of the class "Timer".
 */
@Rule(key = "EC506")
public class RigidAlarmCheck extends SwiftRuleCheck {
    private static final String DEFAULT_ISSUE_MESSAGE = "Setting a tolerance for timers will allow them to fire later than the scheduled fire date.";

    @Override
    public void apply(ParseTree tree) {
        if (tree instanceof Swift5Parser.IdentifierContext) {
            Swift5Parser.IdentifierContext id = (Swift5Parser.IdentifierContext) tree;
            if (id.getText().equals("Timer")) {
                this.recordIssue(id.getStart().getStartIndex(), DEFAULT_ISSUE_MESSAGE);
            }
        }
    }

}
