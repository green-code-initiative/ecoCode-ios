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
package io.ecocode.ios.pbxproj;

import org.antlr.v4.runtime.tree.ParseTree;
import org.sonar.api.batch.sensor.SensorContext;
import org.sonar.api.utils.log.Logger;
import org.sonar.api.utils.log.Loggers;

import java.util.List;

import io.ecocode.ios.antlr.AntlrContext;
import io.ecocode.ios.antlr.ParseTreeItemVisitor;
import io.ecocode.ios.checks.RuleLoader;

public class EcoCodePbxprojVisitor implements ParseTreeItemVisitor {
    private static final Logger LOGGER = Loggers.get(EcoCodePbxprojVisitor.class);

    private final List<PbxprojRuleCheck> checks;

    public EcoCodePbxprojVisitor(RuleLoader<PbxprojRuleCheck> ruleLoader) {
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