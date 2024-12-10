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

import static org.junit.Assert.assertEquals;

import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.sonar.api.batch.sensor.SensorContext;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.greencodeinitiative.creedengo.ios.antlr.AntlrContext;
import org.greencodeinitiative.creedengo.ios.checks.RuleLoader;

public class EcoCodePbxprojVisitorTest {

    private CreedengoPbxprojVisitor sut;
    private RuleLoader<PbxprojRuleCheck> mockRuleLoader;
    private PbxprojRuleCheck mockRuleCheck1;
    private PbxprojRuleCheck mockRuleCheck2;

    @Before
    public void setUp() {
        // Create mock RuleLoader and mock RuleChecks
        mockRuleLoader = mock(RuleLoader.class);
        mockRuleCheck1 = mock(PbxprojRuleCheck.class);
        mockRuleCheck2 = mock(PbxprojRuleCheck.class);

        // Simulate the loading of the rules using the RuleLoader
        List<PbxprojRuleCheck> mockRules = Arrays.asList(mockRuleCheck1, mockRuleCheck2);
        when(mockRuleLoader.loadRules()).thenReturn(mockRules);

        // Initialize the PbxprojVisitor with the mock RuleLoader
        sut = new CreedengoPbxprojVisitor(mockRuleLoader);
    }

    @After
    public void tearDown() {
        sut = null;
    }

    @Test
    public void shouldLoadAllChecks() {
        // Ensure that the visitor loads all the checks using the RuleLoader
        List<PbxprojRuleCheck> loadedChecks = sut.getChecks();
        assertEquals(2, loadedChecks.size());  // We expect 2 mocks
    }

    @Test
    public void shouldApplyAllChecksToParseTree() {
        // GIVEN
        ParseTree mockParseTree = mock(ParseTree.class);

        // WHEN
        sut.apply(mockParseTree);

        // THEN
        // Verify that each rule's apply method was called with the ParseTree
        verify(mockRuleCheck1).apply(mockParseTree);
        verify(mockRuleCheck2).apply(mockParseTree);
    }

    @Test
    public void shouldFillContextForAllChecks() {
        // GIVEN
        SensorContext mockContext = mock(SensorContext.class);
        AntlrContext mockAntlrContext = mock(AntlrContext.class);

        // WHEN
        sut.fillContext(mockContext, mockAntlrContext);

        // THEN
        verify(mockRuleCheck1).fillContext(mockContext, mockAntlrContext);
        verify(mockRuleCheck2).fillContext(mockContext, mockAntlrContext);
    }
}