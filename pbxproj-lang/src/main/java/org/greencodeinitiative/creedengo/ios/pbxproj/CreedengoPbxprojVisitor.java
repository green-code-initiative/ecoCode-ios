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
package org.greencodeinitiative.creedengo.ios.pbxproj;

import org.antlr.v4.runtime.tree.ParseTree;
import org.sonar.api.batch.sensor.SensorContext;
import org.sonar.api.utils.log.Logger;
import org.sonar.api.utils.log.Loggers;

import java.util.List;

import org.greencodeinitiative.creedengo.ios.antlr.AntlrContext;
import org.greencodeinitiative.creedengo.ios.antlr.ParseTreeItemVisitor;
import org.greencodeinitiative.creedengo.ios.checks.RuleLoader;

public class CreedengoPbxprojVisitor implements ParseTreeItemVisitor {
    private static final Logger LOGGER = Loggers.get(CreedengoPbxprojVisitor.class);

    private final List<PbxprojRuleCheck> checks;

    public CreedengoPbxprojVisitor(RuleLoader<PbxprojRuleCheck> ruleLoader) {
        this.checks = ruleLoader.loadRules();
    }
    @Override
    public void apply(ParseTree tree) {
        for (PbxprojRuleCheck check : checks) {
            check.apply(tree);
        }
    }

    @Override
    public void fillContext(SensorContext context, AntlrContext antlrContext) {
        for (PbxprojRuleCheck check : checks) {
            check.fillContext(context, antlrContext);
        }
    }

    public List<PbxprojRuleCheck> getChecks() {
        return checks;
    }
}