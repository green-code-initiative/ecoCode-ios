/*
 * Creedengo iOS plugin - Help the earth, adopt this green plugin for your applications
 * Copyright © 2023 green-code-initiative (https://green-code-initiative.org/)
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
package org.greencodeinitiative.creedengo.ios.swift;

import org.greencodeinitiative.creedengo.ios.antlr.AntlrContext;
import org.greencodeinitiative.creedengo.ios.antlr.ParseTreeItemVisitor;
import org.antlr.v4.runtime.tree.ParseTree;
import org.reflections.Reflections;
import org.sonar.api.batch.sensor.SensorContext;
import org.sonar.api.utils.log.Logger;
import org.sonar.api.utils.log.Loggers;
import org.sonar.check.Rule;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class CreedengoSwiftVisitor implements ParseTreeItemVisitor {
    private static final Logger LOGGER = Loggers.get(CreedengoSwiftVisitor.class);

    private final List<SwiftRuleCheck> checks = new ArrayList<>();

    public CreedengoSwiftVisitor() {
        // Load checks
        Reflections reflections = new Reflections("org.greencodeinitiative.creedengo.ios.swift.checks");

        Set<Class<? extends SwiftRuleCheck>> allClasses = reflections.getSubTypesOf(SwiftRuleCheck.class);

        for (Class<? extends SwiftRuleCheck> clazz : allClasses) {
            Annotation[] annotations = clazz.getAnnotations();

            for (Annotation annotation : annotations) {
                if (annotation instanceof Rule) {
                    try {
                        checks.add(clazz.getDeclaredConstructor().newInstance());
                    } catch (Exception e) {
                        LOGGER.warn("Unexpected error while instantiating rule " + clazz, e);
                    }
                }
            }
        }
    }

    @Override
    public void apply(ParseTree tree) {
        for (SwiftRuleCheck check : checks) {
            check.apply(tree);
        }
    }

    @Override
    public void fillContext(SensorContext context, AntlrContext antlrContext) {
        for (SwiftRuleCheck check : checks) {
            check.fillContext(context, antlrContext);
        }
    }

    public List<SwiftRuleCheck> getChecks() {
        return checks;
    }
}
