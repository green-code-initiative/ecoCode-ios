package io.ecocode.ios.swift.checks.sobriety;

import io.ecocode.ios.swift.checks.CheckTestHelper;
import org.junit.Test;
import org.sonar.api.batch.sensor.internal.SensorContextTester;
import org.sonar.api.batch.sensor.issue.Issue;
import org.sonar.api.batch.sensor.issue.IssueLocation;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

public class AudioRecorderLeakCheckTest {
    private static final String TEST_AUDIO_CASE_MISSING_RELEASE_CALL = "checks/sobriety/AudioRecorderLeak_trigger.swift";
    private static final String TEST_AUDIO_CASE_COMPLIANT = "checks/sobriety/AudioRecorderLeak_no_trigger.swift";

    private static final String TESTED_RULE_ID = "EC515";
    private static final String TEST_REPOSITORY = "ecoCode-swift";

    @Test
    public void audioLeakCheck_missing_release_trigger() {
        SensorContextTester context = CheckTestHelper.analyzeTestFile(TEST_AUDIO_CASE_MISSING_RELEASE_CALL);
        assertThat(context.allIssues()).hasSize(1);
        Optional<Issue> issue = context.allIssues().stream().findFirst();
        issue.ifPresent(i -> {
            assertThat(i.ruleKey().rule()).isEqualTo(TESTED_RULE_ID);
            assertThat(i.ruleKey().repository()).isEqualTo(TEST_REPOSITORY);
            IssueLocation location = i.primaryLocation();
            assertThat(location.textRange().start().line()).isEqualTo(15);
        });
    }

    @Test
    public void audioLeakCheck_no_trigger() {
        SensorContextTester context = CheckTestHelper.analyzeTestFile(TEST_AUDIO_CASE_COMPLIANT);
        assertThat(context.allIssues()).isEmpty();
    }
}