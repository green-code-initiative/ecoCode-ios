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
package org.greencodeinitiative.creedengo.ios.swift;

import org.junit.Test;
import org.reflections.Reflections;

import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

public class CreedengoSwiftVisitorTest {
    @Test
    public void analyze() throws Throwable {
        Reflections reflections = new Reflections("org.greencodeinitiative.creedengo.ios.swift.checks");
        Set<Class<? extends SwiftRuleCheck>> allClasses = reflections.getSubTypesOf(SwiftRuleCheck.class);

        CreedengoSwiftVisitor creedengoSwiftVisitor = new CreedengoSwiftVisitor();
        assertThat(creedengoSwiftVisitor.getChecks()).hasSize(allClasses.size());
    }
}
