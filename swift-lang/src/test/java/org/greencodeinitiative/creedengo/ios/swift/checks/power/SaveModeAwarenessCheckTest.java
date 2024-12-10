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
package org.greencodeinitiative.creedengo.ios.swift.checks.power;

import org.greencodeinitiative.creedengo.ios.swift.checks.CheckTestHelper;
import org.junit.Test;
import org.sonar.api.batch.sensor.internal.SensorContextTester;
import org.sonar.api.batch.sensor.issue.Issue;
import org.sonar.api.batch.sensor.issue.IssueLocation;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

public final class SaveModeAwarenessCheckTest {
    @Test
    public void saveModeAwareness_processInfo_trigger() {
        saveModeAwareness_trigger("checks/power/SaveModeAwareness_ProcessInfo_trigger.swift", 11);
    }

    @Test
    public void saveModeAwareness_powerStateNotification_trigger() {
        saveModeAwareness_trigger("checks/power/SaveModeAwareness_PowerStateNotification_trigger.swift", 11);
    }

    @Test
    public void saveModeAwareness_powerStateNotificationShort_trigger() {
        saveModeAwareness_trigger("checks/power/SaveModeAwareness_PowerStateNotificationShort_trigger.swift", 11);
    }

    @Test
    public void saveModeAwareness_no_trigger() {
        SensorContextTester context = CheckTestHelper.analyzeTestFile("checks/power/SaveModeAwareness_no_trigger.swift");
        assertThat(context.allIssues()).isEmpty();
    }

    private void saveModeAwareness_trigger(String filePath, int lineNumber) {
        SensorContextTester context = CheckTestHelper.analyzeTestFile(filePath);
        assertThat(context.allIssues()).hasSize(1);
        Optional<Issue> issue = context.allIssues().stream().findFirst();
        issue.ifPresent(i -> {
            assertThat(i.ruleKey().rule()).isEqualTo("GCI520");
            assertThat(i.ruleKey().repository()).isEqualTo("creedengo-swift");
            IssueLocation location = i.primaryLocation();
            assertThat(location.textRange().start().line()).isEqualTo(lineNumber);
        });
    }
}
