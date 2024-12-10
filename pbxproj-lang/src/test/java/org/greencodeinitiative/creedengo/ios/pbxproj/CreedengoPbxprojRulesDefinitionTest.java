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
package org.greencodeinitiative.creedengo.ios.pbxproj;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import org.sonar.api.SonarRuntime;
import org.sonar.api.rules.RuleType;
import org.sonar.api.server.rule.RulesDefinition;
import org.sonar.api.server.rule.RulesDefinition.Rule;
import org.sonar.api.server.debt.DebtRemediationFunction.Type;
import org.sonar.api.utils.Version;

public class CreedengoPbxprojRulesDefinitionTest {

    private CreedengoPbxprojRulesDefinition sut;
    private RulesDefinition.Context context;
    private RulesDefinition.Repository repository;

    @Before
    public void setUp() {
        final SonarRuntime sonarRuntime = mock(SonarRuntime.class);
        doReturn(Version.create(0, 0)).when(sonarRuntime).getApiVersion();
        sut = new CreedengoPbxprojRulesDefinition(sonarRuntime);
        context = new RulesDefinition.Context();
        sut.define(context);
        repository = context.repository(sut.repositoryKey());
    }

    @Test
    public void define() {
        RulesDefinition.Context context = new RulesDefinition.Context();
        CreedengoPbxprojRulesDefinition rulesDefinition = new CreedengoPbxprojRulesDefinition(mock(SonarRuntime.class));
        rulesDefinition.define(context);
        RulesDefinition.Repository repository = context.repository(rulesDefinition.repositoryKey());
        assertNotNull(repository);
    }

    @Test
    public void testMetadata() {
        assertEquals("PBXProj Rules Repository", repository.name());
        assertEquals("pbxproj", repository.language());
        assertEquals("creedengo-pbxproj", repository.key());
    }

    @Test
    public void testRegisteredRulesNumber() {
        assertEquals(1, repository.rules().size());
    }

    @Test
    public void assertRuleProperties() {
        Rule rule = repository.rule("GCI547");
        assertNotNull(rule);
        assertEquals("Light Mode Forced", rule.name());
        assertEquals(Type.CONSTANT_ISSUE, rule.debtRemediationFunction().type());
        assertEquals("5min", rule.debtRemediationFunction().baseEffort());
        assertEquals(RuleType.CODE_SMELL, rule.type());
    }
}