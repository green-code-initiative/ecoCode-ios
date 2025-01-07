# Contributing

## Requirements

- Java JDK 11+
- Maven 3.8 or later
- A local SonarQube instance for local testing

## General information

The iOS plugin is split into 3 different modules:

- `swift-lang` is for Swift source files parsing and checks
- `commons-ios` gather common parsing utils and models that can be reused to implement other languages support
- `sonar-ios-plugin` the actual SonarQube plugin declaration

Swift file parser is build using the [ANTLR](https://www.antlr.org/) parser generator.

The generated parser source files are located into `swift-lang/src/main/java/org/greencodeinitiative/creedengo/ios/swift/antlr/generated`. Those source files should not be edited manually. 

When necessary (in case of Swift language syntax upgrade for example), those source files should be re-generated with ANTLR.

## Adding new rules

When adding a new rule, the following steps are required:

- Declare the rule
- Implement a check
- Add the @Rule to the class

### Declaring the rule

The new rule must be declared in `swift-lang/src/resources/creedengo_swift_profile.json`

> Note: in case the new rule is not available in https://github.com/green-code-initiative/creedengo/tree/main/creedengo-rules-specifications yet create a matching <RULE_ID>.json ans <RULE_ID>.html in `swift-lang/src/resources/io/creedengo/rules/swift/` to provide rule metadata.

### Implementing a check

In order to implement a check for the rule, create a Check class inherited from `SwiftRuleCheck` in `src/main/java/org/greencodeinitiative/creedengo/ios/swift/checks`.

    Have a look at `swift-lang/src/main/java/org/greencodeinitiative/creedengo/ios/swift/checks/idleness/IdleTimerDisabledCheck` to learn more about the implementation.

Don't forget to add the `@org.sonar.check.Rule` annotation to the check in order to register it to the AST visitor.
