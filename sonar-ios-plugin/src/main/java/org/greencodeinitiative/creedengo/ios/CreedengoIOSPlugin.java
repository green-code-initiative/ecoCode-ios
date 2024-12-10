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
package org.greencodeinitiative.creedengo.ios;

import org.greencodeinitiative.creedengo.ios.swift.CreedengoSwiftProfile;
import org.greencodeinitiative.creedengo.ios.swift.CreedengoSwiftRulesDefinition;
import org.greencodeinitiative.creedengo.ios.swift.SwiftSensor;
import org.greencodeinitiative.creedengo.ios.pbxproj.PbxprojLanguage;
import org.greencodeinitiative.creedengo.ios.pbxproj.CreedengoPbxprojQualityProfile;
import org.greencodeinitiative.creedengo.ios.pbxproj.CreedengoPbxprojRulesDefinition;
import org.greencodeinitiative.creedengo.ios.pbxproj.PbxprojSensor;
import org.sonar.api.Plugin;
import org.sonar.api.config.PropertyDefinition;
import org.sonar.api.resources.Qualifiers;

public class CreedengoIOSPlugin implements Plugin  {

    @Override
    public void define(Context context) {

        context.addExtensions(SwiftSensor.class, CreedengoSwiftProfile.class, CreedengoSwiftRulesDefinition.class);
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
                CreedengoPbxprojRulesDefinition.class,
                CreedengoPbxprojQualityProfile.class,
                PbxprojSensor.class
        );
    }
}
