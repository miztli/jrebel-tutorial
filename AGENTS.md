A quick overview on java agents.

### What is an agent

In general, a java agent is just a specially crafted jar file. It uses the [Instrumentation API](https://www.baeldung.com/java-instrumentation) that the JVM provides to alter existing byte-code that is loaded in a JVM.

For an agent to work, we need to define two methods:

- premain: will statically load the agent using `-javaagent` parameter at JVM startup
- agentmain: will dynamically load the agent into the JVM using the Java Attach API

*NOTE:* An interesting concept to keep in mind is that a JVM implementations, like Oracle, OpenJDK, and others, can provide a mechanism to start agents dynamically, but it is not a requirement.

#### Static load

#### Dynamic load

_Demonstration_


#### References

- https://docs.oracle.com/javase/8/docs/api/java/lang/instrument/Instrumentation.html
- https://www.baeldung.com/java-instrumentation
