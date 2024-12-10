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
package io.ecocode.ios.swift.checks.sobriety;

import io.ecocode.ios.swift.SwiftRuleCheck;
import io.ecocode.ios.swift.antlr.generated.Swift5Parser;
import org.antlr.v4.runtime.tree.ParseTree;
import org.sonar.check.Rule;

import java.util.Objects;

import static io.ecocode.ios.swift.checks.CheckHelper.*;

@Rule(key = "EC528")
public class FeedbackGeneratorUsageCheck extends SwiftRuleCheck {
    private static final String DEFAULT_ISSUE_MESSAGE = "Avoid using the device vibrator to use less energy.";
    public static final String UI_KIT = "UIKit";
    public static final String IMPACT_OCCURRED = "impactOccurred";
    public static final String UI_IMPACT_FEEDBACK_GENERATOR_CLASS = "UIImpactFeedbackGenerator";
    protected boolean isUIKitImported;

    protected Swift5Parser.ExpressionContext id;

    protected boolean isFeedbackGeneratorInstantiated;
    protected boolean isImpactMethodCalled;

    @Override
    public void apply(ParseTree tree) {

        isUIKitImported = isUIKitImported || isImportExisting(tree, UI_KIT);

        isFeedbackGeneratorInstantiated = isFeedbackGeneratorInstantiated ||
                (isUIKitImported &&
                        isExpressionPresent(tree, UI_IMPACT_FEEDBACK_GENERATOR_CLASS));

        isImpactMethodCalled = isImpactMethodCalled ||
                (isFeedbackGeneratorInstantiated &&
                        isFunctionCalled(tree, IMPACT_OCCURRED));

        if (Objects.isNull(id) &&
                tree instanceof Swift5Parser.ExpressionContext &&
                isImpactMethodCalled
        ) {
            id = (Swift5Parser.ExpressionContext) tree;
        }

        if (isEndOfFile(tree)) {
            if (isImpactMethodCalled) {
                this.recordIssue(id.getStart().getStartIndex(), DEFAULT_ISSUE_MESSAGE);
            }
            isUIKitImported = false;
            isFeedbackGeneratorInstantiated = false;
            isImpactMethodCalled = false;
        }
    }
}

