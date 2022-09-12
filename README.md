# Snake and Ladder
Snakes and ladders is a board game for two or more players regarded today as a worldwide classic

# Technology / Tools used 🛠

- Kotlin: Programming language for development
- Kotest: Kotlin Testing library
- KtLint: Lint checker

## Local setup:
Required tools:
1. Gradle

## Ktlint Commands:

Following Commands are related to Ktlint

1. Configure IntelliJ IDEA - `./gradlew ktlintApplyToIdea`
2. Configure Pre-commit Hook for Format - `./gradlew addKtlintFormatGitPreCommitHook`
3. Format Kotlin Code - `./gradlew ktlintFormat`
4. Check Kotlin Lint - `./gradlew ktlintCheck`

### Running API : ` ./gradlew run `

### Using Kotest plugin

- Install Kotest plugin in IntelliJ.
- In Test class, on the left side of class name (after line number) you'll see GREEN Play button 🟢▶️.
  Just click on that and test will be executed.

