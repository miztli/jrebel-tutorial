# JRebel Tutorial

## Theory
### What JRebel is!

- JRebel is a tool designed for Java, monitors and reloads changes to your code without the need to:
    - Re-build
    - Redeploy

- A plugin for the JVM. JRebel uses `-agentpath` command line option to allow custom instrumentation plugins to be registered.
- A simple `.jar` file. No need to install, simply unzip, and enjoy!

### What JRebel is not!

- Is not an IDE plugin. 
    - IDE plugins for JRebel register via the `agentpath` (give examples).
    - JRebel is IDE agnostic (can be used outside IDE).
    - An app server. Though it works with a wide variety of app servers, it's not one of them.
    - A custom JVM. It works with all JVM disregarding implementation.

### Misconceptions
- Just uses [instrumentation API](./instrumentation-api.README)
Instrumentation is limited to only changing method bodies (as is [Hot-Swap](docs/HOTSWAP.md)). jRebel agent uses it to instrument classloader and basic classes but not actually for the reloading process.

### How does it work
- Integrates with the JVM and app servers at the `class loader` level. 
    - But how, creating new class loaders?, no!, extends existing with the ability to manage reloaded classes.
- When a class is loaded, JRebel will try to find that class in paths declared in the `rebel.xml` file. Then, jrebel instruments the loaded `.class` and associates it with the `.class` file saving the timestamp of the `.class`.
    - What happens next?, well, the `.class` timestamp is monitored for changes. When a change in file's timestamp is detected, validates if the `.class` is different from the loaded class and if so, the magic occurs, `.class` gets reloaded and propagated through the extended classloader to our application. 
    - TODO: I need to figure out if it's possible to load a new bean into the spring application context.

IMPORTANT: when updating a class, already existing instances of classes will be preserved. This means that when we add a new instance field, this will only work for new instances and previous will remain unchanged, since constructor is not re-run. 

## Practice

- Generate `jrebel.xml`
    - [manually](./docs/standalone-setup.md)
    - Using the [jrebel-gradle-plugin](docs/jrebel-gradle-plugin.md)
    - Using the [intellij-plugin](docs/intellij-plugin.md)
    
        *NOTES on `jrebel.xml` file:* 
        - In case of _JAR files_: `rebel.xml` should be included in the root folder.
        - When working with _WAR files_: the `rebel.xml` should be located within the WEB-INF/classes folder.
        - _EAR files_: require a `rebel.xml` for each internal EAR module (that means JARs and WARs).

- Include:
    - How to reload a bean definition in spring
    - How to reload a POJO class (what happens if we add new fields to the class)
    - (Pending) Add new xml file and add it to spring's context
    - (Pending) Add new controller / service (bean managed by application context)
    - (Pending) Add new jsp
    - Check license for statistics about redeploys and saved work hours

## Doubts 

- Does it really only work with Java? 
    - Since it works with compiled classes (.class), then it can work for any language around the JVM (fe: groovy).

### References:
- [Docs](https://www.jrebel.com/products/jrebel/learn)
- [FAQ](https://www.jrebel.com/jrebel/learn/faq)
- (Pending) read on instrumentation API
- (Pending) read on HotSwap
- (Pending) read on classloaders
- (Pending) read on agents
