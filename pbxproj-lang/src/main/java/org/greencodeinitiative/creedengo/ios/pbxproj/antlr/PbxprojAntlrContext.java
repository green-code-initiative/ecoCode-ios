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
package org.greencodeinitiative.creedengo.ios.pbxproj.antlr;


import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.sonar.api.batch.fs.InputFile;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

import org.greencodeinitiative.creedengo.ios.antlr.AntlrContext;
import org.greencodeinitiative.creedengo.ios.antlr.SourceLine;
import org.greencodeinitiative.creedengo.ios.antlr.SourceLinesProvider;
import org.greencodeinitiative.creedengo.ios.pbxproj.antlr.generated.PbxprojLexer;
import org.greencodeinitiative.creedengo.ios.pbxproj.antlr.generated.PbxprojParser;

public class PbxprojAntlrContext extends AntlrContext {

    @Override
    public void loadFromStreams(InputFile inputFile, InputStream file, InputStream linesStream, Charset charset) throws IOException {
        final SourceLinesProvider linesProvider = new SourceLinesProvider();
        final CharStream charStream = CharStreams.fromStream(file, charset);
        final PbxprojLexer lexer = new PbxprojLexer(charStream);

        lexer.removeErrorListeners();

        final CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        tokenStream.fill();
        final PbxprojParser parser = new PbxprojParser(tokenStream);

        parser.removeErrorListeners();

        final PbxprojParser.StartContext root = parser.start();
        final SourceLine[] lines = linesProvider.getLines(linesStream, charset);

        this.setFile(inputFile);
        this.setStream(tokenStream);
        this.setLines(lines);
        this.setRoot(root);
    }
}