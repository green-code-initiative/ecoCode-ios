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
package org.greencodeinitiative.creedengo.ios.pbxproj.checks;

import org.greencodeinitiative.creedengo.ios.antlr.ParseTreeAnalyzer;
import org.greencodeinitiative.creedengo.ios.checks.DefaultRuleLoader;
import org.greencodeinitiative.creedengo.ios.checks.RuleLoader;
import org.greencodeinitiative.creedengo.ios.pbxproj.CreedengoPbxprojVisitor;
import org.greencodeinitiative.creedengo.ios.pbxproj.PbxprojLanguage;
import org.greencodeinitiative.creedengo.ios.pbxproj.PbxprojRuleCheck;
import org.greencodeinitiative.creedengo.ios.pbxproj.antlr.PbxprojAntlrContext;
import org.greencodeinitiative.creedengo.ios.pbxproj.TestHelper;

import org.reflections.Reflections;
import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.batch.sensor.internal.SensorContextTester;

public class CheckTestHelper {


    public static SensorContextTester analyzeTestFile(String relativePath) {
        SensorContextTester context = TestHelper.testFile(relativePath);

        final PbxprojAntlrContext antlrContext = new PbxprojAntlrContext();
        RuleLoader ruleLoader = new DefaultRuleLoader(PbxprojRuleCheck.class, new Reflections("org.greencodeinitiative.creedengo.ios.pbxproj.checks"));
        new ParseTreeAnalyzer(PbxprojLanguage.KEY, InputFile.Type.MAIN, antlrContext, context)
                .analyze(new CreedengoPbxprojVisitor(ruleLoader));

        return context;
    }
}
