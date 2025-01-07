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

import org.reflections.Reflections;
import org.sonar.api.batch.sensor.Sensor;
import org.sonar.api.batch.sensor.SensorContext;
import org.sonar.api.batch.sensor.SensorDescriptor;

import org.greencodeinitiative.creedengo.ios.checks.DefaultRuleLoader;
import org.greencodeinitiative.creedengo.ios.checks.RuleLoader;
import org.greencodeinitiative.creedengo.ios.antlr.ParseTreeAnalyzerFactory;

public class PbxprojSensor implements Sensor {
    private final PbxprojSensorExecutor sensorExecutor;

    public PbxprojSensor() {
        RuleLoader ruleLoader = new DefaultRuleLoader(PbxprojRuleCheck.class, new Reflections("org.greencodeinitiative.creedengo.ios.pbxproj.checks"));
        ParseTreeAnalyzerFactory parseTreeAnalyzerFactory = new ParseTreeAnalyzerFactory();
        this.sensorExecutor = new PbxprojSensorExecutor(ruleLoader, parseTreeAnalyzerFactory);
    }

    @Override
    public void describe(SensorDescriptor sensorDescriptor) {
        sensorExecutor.describe(sensorDescriptor);
    }

    @Override
    public void execute(SensorContext sensorContext) {
        sensorExecutor.execute(sensorContext);
    }
}