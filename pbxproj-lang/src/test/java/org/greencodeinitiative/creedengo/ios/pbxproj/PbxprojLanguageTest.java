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

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PbxprojLanguageTest {
    private PbxprojLanguage sut;

    @Before
    public void setUp() {
        sut = new PbxprojLanguage();
    }

    @After
    public void tearDown() {
        sut = null;
    }

    @Test
    public void PbxprojLanguageInitialization_shouldBeCorrect() {
        // THEN
        assertEquals("pbxproj", sut.getKey());
        assertEquals("Pbxproj", sut.getName());
    }

    @Test
    public void PbxprojLanguage_getFileSuffixes_ShouldBeCorrect() {
        // WHEN
        String[] fileSuffixes = sut.getFileSuffixes();
        // THEN
        String[] expectedFileSuffixes = { "pbxproj" };
        assertEquals(expectedFileSuffixes.length, fileSuffixes.length);
        assertEquals(expectedFileSuffixes[0], fileSuffixes[0]);
    }
}
