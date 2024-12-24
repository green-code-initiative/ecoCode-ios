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
package org.greencodeinitiative.creedengo.ios.swift.checks.sobriety;

import org.greencodeinitiative.creedengo.ios.swift.checks.CheckTestHelper;

import org.junit.Test;
import org.sonar.api.batch.sensor.internal.SensorContextTester;
import org.sonar.api.batch.sensor.issue.Issue;
import org.sonar.api.batch.sensor.issue.IssueLocation;

import static org.assertj.core.api.Assertions.assertThat;

public class AnimationFreeCheckTest {

//    @Test
//     public void shouldTriggerOnAnyTransition() {
//         assertAnimationFreeIssue("checks/sobriety/AnimationFreeCheck_AnyTransition_trigger.swift", 11);
//     }

    @Test
    public void shouldTriggerOnCAKeyframeAnimation() {
        assertAnimationFreeIssue("checks/sobriety/AnimationFreeCheck_CAKeyframeAnimation_trigger.swift", 11);
    }

    @Test
    public void shouldTriggerOnCABasicAnimation() {
        assertAnimationFreeIssue("checks/sobriety/AnimationFreeCheck_CABasicAnimation_trigger.swift", 11);
    }

    @Test
    public void shouldTriggerOnCATransition() {
        assertAnimationFreeIssue("checks/sobriety/AnimationFreeCheck_CATransition_trigger.swift", 11);
    }

    @Test
    public void shouldTriggerOnUIViewAnimate() {
        assertAnimationFreeIssue("checks/sobriety/AnimationFreeCheck_UIViewAnimate_trigger.swift", 11);
    }

    @Test
    public void shouldTriggerOnUIViewAnimateKeyframes() {
        assertAnimationFreeIssue("checks/sobriety/AnimationFreeCheck_UIViewAnimateKeyframes_trigger.swift", 11);
    }

    @Test
    public void shouldTriggerOnUIViewTransition() {
        assertAnimationFreeIssue("checks/sobriety/AnimationFreeCheck_UIViewTransition_trigger.swift", 11);
    }

    @Test
    public void shouldTriggerOnWithAnimation() {
        assertAnimationFreeIssue("checks/sobriety/AnimationFreeCheck_WithAnimation_trigger.swift", 10);
    }

    @Test
    public void shouldNoDetectAnimationUsage() {
        SensorContextTester context = CheckTestHelper.analyzeTestFile("checks/sobriety/AnimationFreeCheck_no_trigger.swift");
        assertThat(context.allIssues()).isEmpty();
    }

    private void assertAnimationFreeIssue(String file, int line) {
        SensorContextTester context = CheckTestHelper.analyzeTestFile(file);
        assertThat(context.allIssues()).hasSize(1)
                .allSatisfy(issue -> {
                    assertIssue(issue, line);
                });
    }
    
    private void assertIssue(Issue issue, int line) {
        assertThat(issue.ruleKey().rule()).isEqualTo("GCI603");
        assertThat(issue.ruleKey().repository()).isEqualTo("creedengo-swift");
        IssueLocation location = issue.primaryLocation();
        assertThat(location.textRange().start().line()).isEqualTo(line);
    }
}
