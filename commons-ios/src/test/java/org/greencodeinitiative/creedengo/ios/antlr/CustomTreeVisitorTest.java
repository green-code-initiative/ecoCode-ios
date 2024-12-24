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

import static org.mockito.Mockito.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.sonar.api.batch.sensor.SensorContext;

public class CustomTreeVisitorTest {

    private CustomTreeVisitor sut;
    private ParseTreeItemVisitor mockVisitor1;
    private ParseTreeItemVisitor mockVisitor2;
    private ParseTree mockParseTree;
    private SensorContext sensorContext;
    private AntlrContext antlrContext;

    @Before
    public void setup() {
        // GIVEN
        mockVisitor1 = mock(ParseTreeItemVisitor.class);
        mockVisitor2 = mock(ParseTreeItemVisitor.class);
        mockParseTree = mock(ParseTree.class);
        sensorContext = mock(SensorContext.class);
        antlrContext = mock(AntlrContext.class);
        when(antlrContext.getRoot()).thenReturn(mockParseTree);

        sut = new CustomTreeVisitor(mockVisitor1, mockVisitor2);
    }
    @After
    public void tearDown() {
        reset(mockVisitor1, mockVisitor2, mockParseTree,sensorContext, antlrContext);
        sut = null;
    }
    @Test
    public void visit_ShouldCallApplyOnAllVisitors() {
        // GIVEN
        when(mockParseTree.getChildCount()).thenReturn(0);

        // WHEN
        sut.visit(mockParseTree);

        // THEN
        verify(mockVisitor1).apply(mockParseTree);
        verify(mockVisitor2).apply(mockParseTree);
    }

    @Test
    public void visit_ShouldVisitAllChildren() {
        // GIVEN
        ParseTree child1 = mock(ParseTree.class);
        ParseTree child2 = mock(ParseTree.class);
        when(mockParseTree.getChildCount()).thenReturn(2);
        when(mockParseTree.getChild(0)).thenReturn(child1);
        when(mockParseTree.getChild(1)).thenReturn(child2);

        // WHEN
        sut.visit(mockParseTree);

        // THEN
        verify(mockVisitor1).apply(mockParseTree);
        verify(mockVisitor1).apply(child1);
        verify(mockVisitor1).apply(child2);

        verify(mockVisitor2).apply(mockParseTree);
        verify(mockVisitor2).apply(child1);
        verify(mockVisitor2).apply(child2);

    }

    @Test
    public void fillContext_ShouldInvokeApplyAndFillContextOnVisitors() {
        // WHEN
        sut.fillContext(sensorContext, antlrContext);

        // THEN
        verify(mockVisitor1).fillContext(sensorContext, antlrContext);
        verify(mockVisitor2).fillContext(sensorContext, antlrContext);

        verify(mockVisitor1).apply(mockParseTree);
        verify(mockVisitor2).apply(mockParseTree);
    }

    @Test
    public void apply_ShouldCallVisit() {
        // WHEN
        sut.apply(mockParseTree);

        // THEN
        verify(mockVisitor1).apply(mockParseTree);
        verify(mockVisitor2).apply(mockParseTree);
    }

    @Test
    public void visit_ShouldHandleTreeWithNoChildren() {
        // GIVEN
        when(mockParseTree.getChildCount()).thenReturn(0);

        // WHEN
        sut.visit(mockParseTree);

        // THEN
        verify(mockVisitor1).apply(mockParseTree);
        verify(mockVisitor2).apply(mockParseTree);
    }
}