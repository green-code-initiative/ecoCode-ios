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

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.batch.sensor.SensorContext;
import org.sonar.api.batch.sensor.SensorDescriptor;
import org.sonar.api.batch.sensor.internal.SensorContextTester;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.anyString;
import static org.mockito.Mockito.when;

import org.greencodeinitiative.creedengo.ios.antlr.ParseTreeAnalyzer;
import org.greencodeinitiative.creedengo.ios.antlr.ParseTreeAnalyzerFactory;
import org.greencodeinitiative.creedengo.ios.checks.RuleLoader;
import org.greencodeinitiative.creedengo.ios.pbxproj.antlr.PbxprojAntlrContext;

public class PbxprojSensorExecutorTest {

    private PbxprojSensorExecutor sut;
    private RuleLoader<PbxprojRuleCheck> mockRuleLoader;
    private ParseTreeAnalyzerFactory mockAnalyzerFactory;
    private ParseTreeAnalyzer mockAnalyzer;
    private CreedengoPbxprojVisitor mockVisitor;
    private SensorContext mockSensorContext;
    private SensorDescriptor mockSensorDescriptor;

    @Before
    public void setUp() {
        // Mocking dependencies
        mockRuleLoader = mock(RuleLoader.class);
        mockAnalyzerFactory = mock(ParseTreeAnalyzerFactory.class);
        mockAnalyzer = mock(ParseTreeAnalyzer.class);
        mockVisitor = mock(CreedengoPbxprojVisitor.class);
        mockSensorContext = mock(SensorContext.class);
        mockSensorDescriptor = mock(SensorDescriptor.class);

        // Mock behavior for factory
        when(mockAnalyzerFactory.create(anyString(), any(InputFile.Type.class), any(PbxprojAntlrContext.class), any(SensorContext.class)))
                .thenReturn(mockAnalyzer);

        // Ensure methods return the mocked sensorDescriptor to allow chaining
        when(mockSensorDescriptor.onlyOnLanguage(anyString())).thenReturn(mockSensorDescriptor);
        when(mockSensorDescriptor.name(anyString())).thenReturn(mockSensorDescriptor);
        when(mockSensorDescriptor.onlyOnFileType(any(InputFile.Type.class))).thenReturn(mockSensorDescriptor);


        // Initialize the PbxprojSensorExecutor with mocks
        sut = new PbxprojSensorExecutor(mockRuleLoader, mockAnalyzerFactory);
    }

    @After
    public void tearDown() {
        sut = null;
    }

    @Test
    public void shouldDescribeSensorCorrectly() {
        // WHEN
        sut.describe(mockSensorDescriptor);

        // THEN
        verify(mockSensorDescriptor).onlyOnLanguage(PbxprojLanguage.KEY);
        verify(mockSensorDescriptor).name("Creedengo pbxproj Sensor");
        verify(mockSensorDescriptor).onlyOnFileType(InputFile.Type.MAIN);
    }

    @Test
    public void shouldExecuteAndCallAnalyzeOnParseTreeAnalyzer() {
        // GIVEN
        SensorContextTester sensorContext = SensorContextTester.create(new java.io.File("."));

        // WHEN
        sut.execute(sensorContext);

        // THEN
        verify(mockAnalyzer).analyze(any(CreedengoPbxprojVisitor.class));
    }
}