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

package io.ecocode.ios.pbxproj;

import org.reflections.Reflections;
import org.sonar.api.batch.sensor.Sensor;
import org.sonar.api.batch.sensor.SensorContext;
import org.sonar.api.batch.sensor.SensorDescriptor;

import io.ecocode.ios.checks.DefaultRuleLoader;
import io.ecocode.ios.checks.RuleLoader;
import io.ecocode.ios.antlr.ParseTreeAnalyzerFactory;

public class PbxprojSensor implements Sensor {
    private final PbxprojSensorExecutor sensorExecutor;

    public PbxprojSensor() {
        RuleLoader ruleLoader = new DefaultRuleLoader(PbxprojRuleCheck.class, new Reflections("io.ecocode.ios.pbxproj.checks"));
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