## JRebel gradle plugin setup

- When using Gradle 2.1 or newer, add the following snippet to the top of your `build.gradle` script:

```
plugins {
   id "org.zeroturnaround.gradle.jrebel" version "1.1.9"
}
```

- The plugin provides a new task called generateRebel that by default depends on the processResources phase. For more fine-tuned control it can be changed to only run before certain tasks, for example only before building a war artifact:

```
war.dependsOn(generateRebel)
```

- In most cases, this is all you need to do. The plugin should be able to read the locations of your classes and resources from Gradle’s project model and put them into your `rebel.xml`

- List tasks: `./gradlew tasks --all`. Look for `generateRebel` task.

- Run: `./gradlew build` or `./gradlew generateRebel` and look for generated file into: `{projectPath}/build/jrebel/rebel.xml`

## References
- https://manuals.jrebel.com/jrebel/standalone/gradle.html