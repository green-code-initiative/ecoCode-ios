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
package io.ecocode.ios.checks;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import io.ecocode.ios.antlr.AntlrContext;
import io.ecocode.ios.antlr.ParseTreeItemVisitor;
import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.batch.sensor.SensorContext;
import org.sonar.check.Rule;

import static java.util.Optional.ofNullable;

public abstract class RuleCheck implements ParseTreeItemVisitor {

    protected String ruleId;

    private class Issue {

        protected Issue(String ruleId, int startIndex, String message) {
            this.ruleId = ruleId;
            this.startIndex = startIndex;
            this.message = Objects.requireNonNull(message);
        }
        final String ruleId;
        final int startIndex;
        final String message;
    }

    private final List<Issue> issues = new ArrayList<>();

    protected RuleCheck() {
        this.ruleId = ofNullable(this.getClass().getAnnotation(Rule.class))
                .orElseThrow(() -> new IllegalArgumentException("Please add @org.sonar.check.Rule to: " + this.getClass()))
                .key();
    }

    protected void recordIssue(int startIndex, String message) {
        issues.add(new Issue(this.ruleId, startIndex, message));
    }

    @Override
    public void fillContext(SensorContext context, AntlrContext antlrContext) {
        final InputFile file = antlrContext.getFile();
        if (file == null) {
            return;
        }

        // Build ReportIssue list
        List<ReportIssue> reportIssues = new ArrayList<>();
        for (Issue i : issues) {
            // Compute location
            int[] loc = antlrContext.getLineAndColumn(i.startIndex);
            // Retrieve rule data
            reportIssues.add(new ReportIssue(i.ruleId, i.message, file.toString(), loc[0]));
        }

        // Record
        ReportIssueRecorder recorder = new ReportIssueRecorder(context);
        recorder.recordIssues(reportIssues);

        // Clear issues for next file
        issues.clear();
    }
}
