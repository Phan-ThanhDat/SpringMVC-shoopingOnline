Spring framework Tutorial application
==============

**This repository contains the source code that my project using spring mvc framework to build fashion shopping online [Spring Framework tutorial](https://spring.io/docs).**

If you are new to Maven, read [these instructions](https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html) to get your project properly imported into Eclipse or your IDE of choice.



Below are some instructions how to work with this application.

Workflow
========

To compile the entire project, run "mvn install".

To run the application, run your browswer and open http://localhost:8080/ .

Debugging client side code
  - run button Debug on a separate console while the application is running
  - activate Super Dev Mode in the debug window of the application

To produce a deployable production mode WAR:
- change productionMode to true in the servlet class configuration (nested in the UI class)
- run "clean package"
- test the war file

References
-------------------------

*1.https://spring.io/docs
*2.http://o7planning.org/en/10201/java-hibernate-tutorial-for-beginners
*3.https://docs.spring.io/spring/docs/current/spring-framework-reference/data-access.html#jdbc
-------------------------


