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

import org.greencodeinitiative.creedengo.ios.swift.SwiftRuleCheck;
import org.greencodeinitiative.creedengo.ios.swift.antlr.generated.Swift5Parser;
import org.antlr.v4.runtime.tree.ParseTree;
import org.sonar.check.Rule;
import org.sonarsource.analyzer.commons.annotations.DeprecatedRuleKey;

import java.util.Arrays;
import java.util.List;

import static org.greencodeinitiative.creedengo.ios.swift.checks.CheckHelper.isExpressionPresent;


/**
 * Check the use of "UIScreen.main.brightness" and triggers when set.
 */
@Rule(key = "GCI603")
@DeprecatedRuleKey(repositoryKey = "ecocode-ios", ruleKey = "EC603")
public class AnimationFreeCheck extends SwiftRuleCheck {

    private static final String DEFAULT_ISSUE_MESSAGE = "Usage of Animations must absolutely be avoided";

    private static final List<String> ANIMATION_METHODS = Arrays.asList("UIView.animate", "UIView.animateKeyframes",
            "UIView.transition", "CABasicAnimation", "CAKeyframeAnimation", "CATransition");

    private static final List<String> SWIFTUI_ANIMATION_METHODS = Arrays.asList("withAnimation", "Animation",
            "AnyTransition");


    public void apply(ParseTree tree) {
        if (tree instanceof Swift5Parser.ExpressionContext) {
            boolean containsAnimationMethod = ANIMATION_METHODS.stream()
                                                .anyMatch(animation -> isExpressionPresent(tree, animation));
             boolean containsUISwiftAnimationMethod = SWIFTUI_ANIMATION_METHODS.stream()
                                                .anyMatch(animation -> isExpressionPresent(tree, animation));
            if (containsAnimationMethod || containsUISwiftAnimationMethod) {
                Swift5Parser.ExpressionContext id = (Swift5Parser.ExpressionContext) tree;
                this.recordIssue(id.getStart().getStartIndex(), DEFAULT_ISSUE_MESSAGE);
            }
        }
    }
}
