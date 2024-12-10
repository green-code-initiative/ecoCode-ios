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
package io.ecocode.ios.pbxproj.antlr;

import org.antlr.v4.runtime.Token;
import org.apache.commons.io.IOUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.nio.charset.Charset;

import static org.junit.Assert.assertEquals;


public class PbxprojAntlrContextTest {

    private PbxprojAntlrContext sut;

    @Before
    public void setUp() {
        sut = new PbxprojAntlrContext();
    }

    @After
    public void tearDown() {
        sut = null;
    }

    @Test
    public void shouldCorrectlyDetectTokens() throws Throwable {
        // GIVEN
        String line = "KEY1 = Value1;\n" +
                      "KEY2 = Value2;";

        // WHEN
        sut.loadFromStreams(null,
                IOUtils.toInputStream(line, Charset.defaultCharset()),
                IOUtils.toInputStream(line, Charset.defaultCharset()),
                Charset.defaultCharset());

        // THEN
        assertEquals(2, sut.getLines().length);
        assertEquals(2, sut.getLines().length);
        Token[] tokens = sut.getTokens();
        assertEquals(9, tokens.length);
        assertEquals("KEY1",   tokens[0].getText());
        assertEquals("=",      tokens[1].getText());
        assertEquals("Value1", tokens[2].getText());
        assertEquals(";",      tokens[3].getText());

        assertEquals("KEY2",   tokens[4].getText());
        assertEquals("=",      tokens[5].getText());
        assertEquals("Value2", tokens[6].getText());
        assertEquals(";",      tokens[7].getText());

        assertEquals("<EOF>",  tokens[8].getText());

    }

    @Test
    public void shouldCorrectlyDetermineLineAndCharPositions() throws Throwable {
        // GIVEN
        String line = "KEY1 = Value1;\n" +
                "KEY2 = Value2;";

        // WHEN
        sut.loadFromStreams(null,
                IOUtils.toInputStream(line, Charset.defaultCharset()),
                IOUtils.toInputStream(line, Charset.defaultCharset()),
                Charset.defaultCharset());

        // THEN
        assertEquals(2, sut.getLines().length);

        Token[] tokens = sut.getTokens();
        assertEquals(9, tokens.length);

        Token key1Token = tokens[0]; // KEY1
        assertEquals(1, key1Token.getLine());
        assertEquals(0, key1Token.getCharPositionInLine());

        Token value1Token = tokens[2]; // Value1
        assertEquals(1, value1Token.getLine());
        assertEquals(7, value1Token.getCharPositionInLine());

        Token key2Token = tokens[4]; // KEY2
        assertEquals(2, key2Token.getLine());
        assertEquals(0, key2Token.getCharPositionInLine());

        Token value2Token = tokens[6]; // Value2
        assertEquals(2, value2Token.getLine());
        assertEquals(7, value2Token.getCharPositionInLine());
    }
}