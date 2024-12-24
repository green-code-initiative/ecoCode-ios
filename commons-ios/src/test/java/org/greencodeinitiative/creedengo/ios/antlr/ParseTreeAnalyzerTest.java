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
package org.greencodeinitiative.creedengo.ios.antlr;

import static org.junit.Assert.fail;
import static org.mockito.Mockito.*;

import org.junit.After;

import org.junit.Before;
import org.junit.Test;
import org.sonar.api.batch.fs.FilePredicate;
import org.sonar.api.batch.fs.FilePredicates;
import org.sonar.api.batch.fs.FileSystem;
import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.batch.sensor.SensorContext;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;

class TestableParseTreeAnalyzer extends ParseTreeAnalyzer {
    private final CustomTreeVisitor mockVisitor;

    public TestableParseTreeAnalyzer(CustomTreeVisitor mockVisitor, String languageKey, InputFile.Type type, AntlrContext antlrContext, SensorContext sensorContext) {
        super(languageKey, type, antlrContext, sensorContext);
        this.mockVisitor = mockVisitor;
    }

    @Override
    protected CustomTreeVisitor createVisitor(ParseTreeItemVisitor... visitors) {
        return mockVisitor;
    }
}

public class ParseTreeAnalyzerTest {

    private ParseTreeAnalyzer sut; // System Under Test
    private AntlrContext antlrContext;
    private SensorContext sensorContext;
    private FileSystem fileSystem;
    private FilePredicate hasLangPredicate;
    private FilePredicate hasTypePredicate;
    private FilePredicate langAndTypePredicate;
    private Charset charset;
    private CustomTreeVisitor mockVisitor;

    @Before
    public void setup() {
        // GIVEN
        antlrContext = mock(AntlrContext.class);
        sensorContext = mock(SensorContext.class);
        fileSystem = mock(FileSystem.class);
        hasLangPredicate = mock(FilePredicate.class);
        hasTypePredicate = mock(FilePredicate.class);
        langAndTypePredicate = mock(FilePredicate.class);
        charset = Charset.forName("UTF-8");
        mockVisitor = mock(CustomTreeVisitor.class);

        when(sensorContext.fileSystem()).thenReturn(fileSystem);
        when(fileSystem.predicates()).thenReturn(mock(FilePredicates.class));
        when(fileSystem.predicates().hasLanguage(anyString())).thenReturn(hasLangPredicate);
        when(fileSystem.predicates().hasType(any(InputFile.Type.class))).thenReturn(hasTypePredicate);
        when(fileSystem.predicates().and(any(FilePredicate.class), any(FilePredicate.class))).thenReturn(langAndTypePredicate);
        when(fileSystem.encoding()).thenReturn(charset);

        sut = new TestableParseTreeAnalyzer(mockVisitor, "myLang", InputFile.Type.MAIN, antlrContext, sensorContext);
    }

    @After
    public void tearDown() {
        reset(antlrContext, sensorContext, fileSystem, hasLangPredicate, hasTypePredicate, langAndTypePredicate, mockVisitor);
        sut = null;
    }

    @Test
    public void analyze_ShouldInvokeAntlrContextAndVisitor() throws IOException {
        // GIVEN
        InputFile inputFile = mock(InputFile.class);
        List<InputFile> inputFiles = Arrays.asList(inputFile);
        when(fileSystem.inputFiles(langAndTypePredicate)).thenReturn(inputFiles);

        ParseTreeItemVisitor mockParseTreeItemVisitor = mock(ParseTreeItemVisitor.class);

        // WHEN
        sut.analyze(mockParseTreeItemVisitor);

        // THEN
        verify(antlrContext).loadFromFile(inputFile, charset);
        verify(mockVisitor).fillContext(sensorContext, antlrContext);
    }


    @Test
    public void analyze_ShouldHandleIOExceptionGracefully() throws IOException {
        // GIVEN
        InputFile inputFile = mock(InputFile.class);
        when(inputFile.filename()).thenReturn("testfile.swift");

        List<InputFile> inputFiles = Arrays.asList(inputFile);
        when(fileSystem.inputFiles(langAndTypePredicate)).thenReturn(inputFiles);

        ParseTreeItemVisitor mockParseTreeItemVisitor = mock(ParseTreeItemVisitor.class);

        // WHEN
        doThrow(new IOException("Test Exception")).when(antlrContext).loadFromFile(inputFile, charset);
        sut.analyze(mockParseTreeItemVisitor);

        // THEN
        verify(antlrContext).loadFromFile(inputFile, charset);
        verify(mockVisitor, never()).fillContext(sensorContext, antlrContext);
    }


    @Test
    public void analyze_ShouldNotInvokeVisitorWhenNoFilesMatch() {
        // GIVEN
        when(fileSystem.inputFiles(langAndTypePredicate)).thenReturn(Arrays.asList());
        ParseTreeItemVisitor mockParseTreeItemVisitor = mock(ParseTreeItemVisitor.class);

        // WHEN
        sut.analyze(mockParseTreeItemVisitor);

        // THEN
        try {
            verify(antlrContext, never()).loadFromFile(any(InputFile.class), eq(charset));
        } catch (IOException e) {
            fail("IOException should not be thrown: " + e.getMessage());
        }
        verify(mockVisitor, never()).fillContext(any(SensorContext.class), any(AntlrContext.class));
    }
}
