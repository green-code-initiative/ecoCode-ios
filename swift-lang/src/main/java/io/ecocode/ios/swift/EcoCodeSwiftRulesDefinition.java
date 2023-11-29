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
package io.ecocode.ios.swift;

import io.ecocode.ios.Const;
import org.reflections.Reflections;
import org.sonar.api.SonarRuntime;
import org.sonar.api.server.rule.RulesDefinition;
import org.sonarsource.analyzer.commons.RuleMetadataLoader;

import java.util.ArrayList;
import java.util.Set;

public class EcoCodeSwiftRulesDefinition implements RulesDefinition {
    private static final String RESOURCE_BASE_PATH = "io/ecocode/rules/swift";

    private static final String NAME = Swift.REPOSITORY_NAME;
    private static final String LANGUAGE = Swift.KEY;

    private final SonarRuntime sonarRuntime;

    public EcoCodeSwiftRulesDefinition(SonarRuntime sonarRuntime) {
        this.sonarRuntime = sonarRuntime;
    }

    @Override
    public void define(Context context) {
        NewRepository repository = context.createRepository(Const.SWIFT_REPOSITORY_KEY, LANGUAGE).setName(NAME);
        RuleMetadataLoader ruleMetadataLoader = new RuleMetadataLoader(RESOURCE_BASE_PATH, sonarRuntime);
        Reflections reflections = new Reflections("io.ecocode.ios.swift.checks");
        Set<Class<? extends SwiftRuleCheck>> checkClasses = reflections.getSubTypesOf(SwiftRuleCheck.class);
        ruleMetadataLoader.addRulesByAnnotatedClass(repository, new ArrayList<>(checkClasses));
        repository.done();
    }

    public String repositoryKey() {
        return Const.SWIFT_REPOSITORY_KEY;
    }
}
