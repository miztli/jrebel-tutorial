JRebel Tutorial

### What JRebel is!

- JRebel is a tool designed for Java, monitors and reloads changes to your code without the need to:
    - Re-build
    - Redeploy

- A plugin for the JVM. JRebel uses `-agentpath` command line option to allow custom plugins to be registered.
- A simple `.jar` file. No need to install, simply unzip, and enjoy!

##### Doubts 

- Does it really only work with Java? 
    - Since it seems to work with compiled classes (.class), then it can work for any language around the JVM (fe: groovy).

_Demontration_
- JRebel download & setup.
- Use of `-agentpath` command line option.
- Compile a java and a groovy file.

### What JRebel is not!

- Is not an IDE plugin. 
    - IDE plugins for JRebel register via the `agentpath` (give examples).
    - JRebel is IDE agnostic (can be used outside IDE).
    - An app server. Though it works with a wide variety of app servers, it's not one of them.
    - A custom JVM. It works with all JVM disregarding implementation.

### How does it work
- Integrates with the JVM and app servers at the `class loader` level. 
    - But how, creating new class loaders?, no!, extends existing with the ability to manage reloaded classes.
- When a class is loaded, JRebel will try to find that class in paths declared in the `rebel.xml` file. Then, jrebel instruments the loaded `.class` and associates it with the `.class` file saving the timestamp of the `.class`.
    - What happens next?, well, the `.class` timestamp is monitored for changes. When a change in file's timestamp is detected, validates if the `.class` is different from the loaded class and if so, the magic occurs, `.class` gets reloaded and propagated through the extended classloader to our application. Great, isn't it! 
- IMPORTANT: when loading updates to a class, already existing instances of classes will be preserved. This means that when we add a new instance field, this will only work for new instances and previous will remain unchanged, since constructor is not re-run. Doubly great, isn't it!

##### Doubts     
- How does `rebel.xml` file gets generated?

_Demontration_
- Show how to create `rebel.xml` file.
- Create an instance of a class, then add a new class field and reload, compare previous vs new instances!

### Misconceptions
- Just uses [instrumentation API](./instrumentation-api.README)
Instrumentation is limited to only changing method bodies (as is [Hot-Swap](./HOTSWAP.md)). jRebel agent uses it to instrument classloader and basic classes but not actually for the reloading process.

### How to's
- How to reload a class
- How to reload a bean definition in spring
- Add new xml file and add it to spring's context
- Add new controller
- Probably add new jsp
- Check license for statistics about redeploys and saved work hours

- Install JRebel plugin to IDE: https://www.youtube.com/watch?v=NkQh_XR6woA

How it works:
- Makes classes reloadable using existing class loaders on application servers (Maybe check sth on classdoading). Recompiled classes are instantly reloaded in the running application.
- Classes and static resources are loaded straight from IDE workspaces and build systems.
- Rebuilds caches, rewires components and applies configuration changes to the runtime as necessary for over 100 frameworks. (How does it work with spring)

What's new for version 2019.2.0
- includes support for java 13
- increased microserivces support: Dropwizard, Thorntail, Springboot.

Additional support for:
- Tomcat, WebSphere Liberty, Jetty, Payara, tc Server, Hybris, KumuluzEE, RestEasy, DeltaSpike, and MyBatis-Spring.

### References:
- [Docs](https://www.jrebel.com/products/jrebel/learn)
- [FAQ](https://www.jrebel.com/jrebel/learn/faq)
- [IntelliJ setup](https://www.jrebel.com/products/jrebel/quickstart/intellij)
- Missing read on instrumentation API
- Missing read on HotSwap
