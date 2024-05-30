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

import org.assertj.core.api.SoftAssertions;
import org.junit.Before;
import org.junit.Test;
import org.sonar.api.SonarRuntime;
import org.sonar.api.rules.RuleType;
import org.sonar.api.server.debt.DebtRemediationFunction.Type;
import org.sonar.api.server.rule.RulesDefinition;
import org.sonar.api.server.rule.RulesDefinition.Rule;
import org.sonar.api.utils.Version;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;


public class EcoCodeSwiftRulesDefinitionTest {

    private RulesDefinition.Repository repository;

    @Before
    public void init() {
        final SonarRuntime sonarRuntime = mock(SonarRuntime.class);
        doReturn(Version.create(0, 0)).when(sonarRuntime).getApiVersion();
        EcoCodeSwiftRulesDefinition rulesDefinition = new EcoCodeSwiftRulesDefinition(sonarRuntime);
        RulesDefinition.Context context = new RulesDefinition.Context();
        rulesDefinition.define(context);
        repository = context.repository(rulesDefinition.repositoryKey());
    }

    @Test
    public void testMetadata() {
        assertThat(repository.name()).isEqualTo("ecoCode");
        assertThat(repository.language()).isEqualTo("swift");
        assertThat(repository.key()).isEqualTo("ecoCode-swift");
    }

    @Test
    public void testRegisteredRules() {
        assertThat(repository.rules()).hasSize(14);
    }

    @Test
    public void assertRuleProperties() {
        Rule rule = repository.rule("EC603");
        assertThat(rule).isNotNull();
        assertThat(rule.name()).isEqualTo("Animation Free");
        assertThat(rule.debtRemediationFunction().type()).isEqualTo(Type.CONSTANT_ISSUE);
        assertThat(rule.debtRemediationFunction().baseEffort()).isEqualTo("5min");
        assertThat(rule.type()).isEqualTo(RuleType.CODE_SMELL);
    }

    @Test
    public void testAllRuleParametersHaveDescription() {
        SoftAssertions assertions = new SoftAssertions();
        repository.rules().stream()
                .flatMap(rule -> rule.params().stream())
                .forEach(param -> assertions.assertThat(param.description()).as("description for " + param.key()).isNotEmpty());
        assertions.assertAll();
    }

    @Test
    public void define() {
        RulesDefinition.Context context = new RulesDefinition.Context();
        EcoCodeSwiftRulesDefinition rulesDefinition = new EcoCodeSwiftRulesDefinition(mock(SonarRuntime.class));
        rulesDefinition.define(context);
        RulesDefinition.Repository repository = context.repository(rulesDefinition.repositoryKey());
        assertThat(repository).isNotNull();
    }

}
