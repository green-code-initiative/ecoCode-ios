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
package org.greencodeinitiative.creedengo.ios.checks;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.reflections.Reflections;
import org.sonar.check.Rule;

import java.util.List;

public class DefaultRuleLoaderTest {

    private DefaultRuleLoader<BaseTestRule1> sut;

    @Before
    public void setUp() {
        sut = new DefaultRuleLoader<>(BaseTestRule1.class, new Reflections("org.greencodeinitiative.creedengo.ios.checks"));
    }

    @After
    public void tearDown() {
        sut = null;
    }

    @Test
    public void shouldLoadOnlyTestRule1Rules() {
        // WHEN
        List<BaseTestRule1> loadedRules = sut.loadRules();

        // THEN
        // Ensure only one rule is loaded (TestRule1)
        assertEquals(1, loadedRules.size());
        // Ensure TestRule1 is loaded
        assertTrue(loadedRules.stream().anyMatch(rule -> rule.getClass().equals(TestRule1.class)));
        // Ensure TestRule2 is not loaded
        assertFalse(loadedRules.stream().anyMatch(rule -> rule.getClass().equals(TestRule2.class)));
    }
}

// Base test rule class for the test case
abstract class BaseTestRule1 extends RuleCheck { }

// Rule implementation for testing purposes
@Rule(key = "TestRule1")
class TestRule1 extends BaseTestRule1 {
    @Override
    public void apply(ParseTree parseTree) {
        // Empty implementation for testing
    }
}

// Another base class for different test rule type
abstract class BaseTestRule2 extends RuleCheck { }

// Rule implementation that should not be loaded in the test
@Rule(key = "TestRule2")
class TestRule2 extends BaseTestRule2 {
    @Override
    public void apply(ParseTree parseTree) {
        // Empty implementation for testing
    }
}