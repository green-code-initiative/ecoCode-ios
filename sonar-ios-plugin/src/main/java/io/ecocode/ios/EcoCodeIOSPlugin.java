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
package io.ecocode.ios;

import io.ecocode.ios.swift.EcoCodeSwiftProfile;
import io.ecocode.ios.swift.EcoCodeSwiftRulesDefinition;
import io.ecocode.ios.swift.SwiftSensor;
import io.ecocode.ios.pbxproj.PbxprojLanguage;
import io.ecocode.ios.pbxproj.EcoCodePbxprojQualityProfile;
import io.ecocode.ios.pbxproj.EcoCodePbxprojRulesDefinition;
import io.ecocode.ios.pbxproj.PbxprojSensor;
import org.sonar.api.Plugin;
import org.sonar.api.config.PropertyDefinition;
import org.sonar.api.resources.Qualifiers;

public class EcoCodeIOSPlugin implements Plugin  {

    @Override
    public void define(Context context) {

        context.addExtensions(SwiftSensor.class, EcoCodeSwiftProfile.class, EcoCodeSwiftRulesDefinition.class);
        context.addExtensions(
                PropertyDefinition.builder("sonar.pbxproj.file.suffixes")
                        .name("File suffixes")
                        .description("Comma-separated list of suffixes for PBXProj files to analyze.")
                        .defaultValue(".pbxproj")
                        .multiValues(true)
                        .category("PBXProj")
                        .onQualifiers(Qualifiers.PROJECT)
                        .build(),
                PbxprojLanguage.class,
                EcoCodePbxprojRulesDefinition.class,
                EcoCodePbxprojQualityProfile.class,
                PbxprojSensor.class
        );
    }
}
