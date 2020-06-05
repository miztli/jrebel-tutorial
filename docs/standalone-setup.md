## Standalone installation and setup

- Download zip file from [here](https://www.jrebel.com/products/jrebel/download/prev-releases)
- Unpack zip in preferred path `{installationPath}`
- Locate agent lib file according to our OS. For the sake of this example we'll use `libjrebel64.dylib`.
- Run: `java -jar {installationPath}/bin/jrebel-activation.jar` (activation will need to happen either using standalone / IDE plugin)
- Select your license activation means accordingly (I used license server provided by my company).
- Generate `rebel.xml file` manually under `main/resources` dir
- Compile app:
    - Compile classes and process resources `./gradlew -t classes`

    _NOTE:_ Don´t execute tasks that regenerate the `.jar` file. This will cause file not found issues when reloading spring classes.
        
    _from [gradle](https://docs.gradle.org/current/userguide/command_line_interface.html#sec:continuous_build) docs:_ `-t` option, enables continuous task excecution. Gradle does not exit and will re-execute tasks when task file inputs change. Notice how only changed classes and dependent classes are recompiled ([compiler-avoidance](https://blog.gradle.org/incremental-compiler-avoidance))

- Run app:
    - Using fat jar: `java -agentpath:/Users/miztlimelgoza/Documents/jrebel/jrebel-2020.2.2/lib/libjrebel64.dylib -jar build/libs/jrebel_tutorial-0.0.1-SNAPSHOT.jar`

    - Using bootRun: `./gradlew bootRunWithJRebel`
        (notice how we set jvm variable in task declaration)
  
## References
- [JAR configuration docs](https://manuals.jrebel.com/jrebel/standalone/config.html#jar-configuration)
