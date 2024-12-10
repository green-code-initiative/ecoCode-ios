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
package org.greencodeinitiative.creedengo.ios.swift.checks.sobriety;

import org.greencodeinitiative.creedengo.ios.swift.checks.CheckTestHelper;
import org.assertj.core.api.ObjectAssert;
import org.junit.Test;
import org.sonar.api.batch.fs.TextPointer;
import org.sonar.api.batch.fs.TextRange;
import org.sonar.api.batch.sensor.internal.SensorContextTester;
import org.sonar.api.batch.sensor.issue.Issue;
import org.sonar.api.batch.sensor.issue.IssueLocation;
import org.sonar.api.rule.RuleKey;

import static org.assertj.core.api.Assertions.assertThat;

public class FeedbackGeneratorUsageCheckTest {

    private static final String TEST_CASE_FEEDBACK_GENERATOR_USE = "checks/sobriety/FeedbackGeneratorUsageCheck_abusive_use_trigger.swift";
    private static final String TEST_CASE_COMPLIANT = "checks/sobriety/FeedbackGeneratorUsage_compliant_no_trigger.swift";
    @Test
    public void feedbackGeneratorUsageCheck_usage_trigger(){
        SensorContextTester context = CheckTestHelper.analyzeTestFile(TEST_CASE_FEEDBACK_GENERATOR_USE);
        ObjectAssert<Issue> issue = assertThat(context.allIssues()).hasSize(1)
                .first();
        issue.extracting(Issue::ruleKey).extracting(RuleKey::rule).isEqualTo("GCI528");
        issue.extracting(Issue::ruleKey).extracting(RuleKey::repository)
                .isEqualTo("creedengo-swift");
        issue.extracting(Issue::primaryLocation)
                .extracting(IssueLocation::textRange)
                .extracting(TextRange::start)
                .extracting(TextPointer::line)
                .isEqualTo(5);
    }

    @Test
    public void locationLeakCheck_compliant_no_trigger(){
        SensorContextTester context = CheckTestHelper.analyzeTestFile(TEST_CASE_COMPLIANT);
        assertThat(context.allIssues()).isEmpty();
    }
}
