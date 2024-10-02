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

package io.ecocode.ios.pbxproj.checks.sobriety;

import org.junit.Test;
import org.sonar.api.batch.sensor.internal.SensorContextTester;
import org.sonar.api.batch.sensor.issue.Issue;
import static org.junit.Assert.assertEquals;

import java.util.List;

import io.ecocode.ios.pbxproj.checks.CheckTestHelper;

public class DisabledDarkModeCheckTest {
    private static final String TEST_CASE_PBXPROJ_UIUSERINTERFACESTYLE_LIGHT = "checks/sobriety/DisabledDarkModeCheck_light.pbxproj";
    private static final String TEST_CASE_PBXPROJ_UIUSERINTERFACESTYLE_AUTOMATIC = "checks/sobriety/DisabledDarkModeCheckliant_automatic.pbxproj";
    private static final String TEST_CASE_PBXPROJ_UIUSERINTERFACESTYLE_NO_KEY = "checks/sobriety/DisabledDarkModeCheckliant_no_key.pbxproj";

    @Test
    public void disabledDarkModeCheckTest_forcedLightMode_shouldTrigger(){
        SensorContextTester context = CheckTestHelper.analyzeTestFile(TEST_CASE_PBXPROJ_UIUSERINTERFACESTYLE_LIGHT);
        List<Issue> issues = context.allIssues().stream().toList();
        assertEquals(2, issues.size());

        Issue firstIssue = issues.get(0);
        assertEquals("EC547", firstIssue.ruleKey().rule());
        assertEquals("ecoCode-pbxproj", firstIssue.ruleKey().repository());
        assertEquals(334, firstIssue.primaryLocation().textRange().start().line());

        Issue secondIssue = issues.get(1);
        assertEquals("EC547", secondIssue.ruleKey().rule());
        assertEquals("ecoCode-pbxproj", secondIssue.ruleKey().repository());
        assertEquals(364, secondIssue.primaryLocation().textRange().start().line());
    }

    @Test
    public void disabledDarkModeCheckTest_automaticMode_shouldNotTrigger(){
        SensorContextTester context = CheckTestHelper.analyzeTestFile(TEST_CASE_PBXPROJ_UIUSERINTERFACESTYLE_AUTOMATIC);
        List<Issue> issues = context.allIssues().stream().toList();
        assertEquals(0, issues.size());
    }

    @Test
    public void disabledDarkModeCheckTest_noKey_shouldNotTrigger(){
        SensorContextTester context = CheckTestHelper.analyzeTestFile(TEST_CASE_PBXPROJ_UIUSERINTERFACESTYLE_NO_KEY);
        List<Issue> issues = context.allIssues().stream().toList();
        assertEquals(0, issues.size());
    }
}
