JREBEL Tutorial

- Skip build & redeploy
- Monitor code changes

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

More on support here: https://jrebel.com/software/jrebel/download/changelog/2019-x/
