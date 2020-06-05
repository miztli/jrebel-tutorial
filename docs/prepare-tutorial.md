- open one tab, run tmux:
	- split vertically
	- on the left side, create 3 horizontal sections:
		- section 1, run: `watch -ls -la ${project}/build/classes/pathToClassesThatWillChange` 
		- section 2, run: `watch -ls -la ${project}/build/libs/app.jar` 
		- section 3, run: `./gradlew -t classes` 
	- on the right side just one section, run: `tail -f .jrebel/jrebel.log`

- open second tab, and run jar file with jrebel agent.

- make changes to files for demonstration.