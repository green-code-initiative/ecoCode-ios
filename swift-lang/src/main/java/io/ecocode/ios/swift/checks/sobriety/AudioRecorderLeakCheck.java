package io.ecocode.ios.swift.checks.sobriety;

import io.ecocode.ios.swift.SwiftRuleCheck;
import io.ecocode.ios.swift.antlr.generated.Swift5Parser;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;
import org.sonar.check.Rule;

@Rule(key = "EC515")
public class AudioRecorderLeakCheck extends SwiftRuleCheck {
    private static final String DEFAULT_ISSUE_MESSAGE = "Any audio recording started should be stopped.";
    Swift5Parser.ExpressionContext id = null;
    private boolean audioRecorderStarted = false;
    private boolean audioRecorderStopped = false;
    private boolean importExist = false;


    @Override
    public void apply(ParseTree tree) {
        if (!importExist && tree instanceof Swift5Parser.ExpressionContext && tree.getText().contains("AVAudioRecorder")) {
            importExist = true;
        }

        if (importExist) {
            if (tree instanceof Swift5Parser.ExpressionContext && tree.getText().contains("record()")) {
                id = (Swift5Parser.ExpressionContext) tree;
                audioRecorderStarted = true;
            }

            if (tree instanceof Swift5Parser.ExpressionContext
                    && (tree.getText().contains("stop()"))) {
                audioRecorderStopped = true;
            }

            if (tree instanceof TerminalNodeImpl && tree.getText().equals("<EOF>")) {
                if (audioRecorderStarted && !audioRecorderStopped) {
                    this.recordIssue(id.getStart().getStartIndex(), DEFAULT_ISSUE_MESSAGE);
                }
                audioRecorderStarted = false;
                audioRecorderStopped = false;
                importExist = false;
            }
        }
    }
}


