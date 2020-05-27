# Tutorial

- Download [JRebel ZIP archive](https://www.jrebel.com/products/jrebel/download/prev-releases). We are basically downloading the JRebel agent.
- Unzip file and locate agent lib file according to our OS. For the sake of this example we'll use `libjrebel64.dylib`.
- Add gradle JRebel [plugin](jrebel-gradle-plugin.md).
- Generate rebel.xml file: 
```
./gradlew tasks --all
./gradlew generateRebel
```
- Show generated file:  `build/jrebel/rebel.xml`
- Build project `./gradlew build`
- Run app `java -agentpath:/Users/miztlimelgoza/Documents/jrebel/jrebel-2020.2.2/lib/libjrebel64.dylib -jar build/libs/jrebel_tutorial-0.0.1-SNAPSHOT.jar`

Missing:
how to recompile class automatically