## Test Coverage Notes
mvn test
INFO] Scanning for projects...
[INFO] 
[INFO] ----------------------< com.northstar:lab17-crm >-----------------------
[INFO] Building Northstar Customer Service 0.1.0-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- jacoco:0.8.12:prepare-agent (default) @ lab17-crm ---
[INFO] argLine set to -javaagent:/home/jacktheck02/.m2/repository/org/jacoco/org.jacoco.agent/0.8.12/org.jacoco.agent-0.8.12-runtime.jar=destfile=/home/jacktheck02/java-bootcamp/examples/Lab17/target/jacoco.exec
[INFO] 
[INFO] --- resources:3.3.1:resources (default-resources) @ lab17-crm ---
[INFO] Copying 1 resource from src/main/resources to target/classes
[INFO] 
[INFO] --- compiler:3.13.0:compile (default-compile) @ lab17-crm ---
[INFO] Nothing to compile - all classes are up to date.
[INFO] 
[INFO] --- resources:3.3.1:testResources (default-testResources) @ lab17-crm ---
[INFO] skip non existing resourceDirectory /home/jacktheck02/java-bootcamp/examples/Lab17/src/test/resources
[INFO] 
[INFO] --- compiler:3.13.0:testCompile (default-testCompile) @ lab17-crm ---
[INFO] Nothing to compile - all classes are up to date.
[INFO] 
[INFO] --- surefire:3.5.2:test (default-test) @ lab17-crm ---
[INFO] Using auto detected provider org.apache.maven.surefire.junitplatform.JUnitPlatformProvider
[INFO] 
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running com.northstar.crm.exception.GlobalExceptionHandlerTest
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.019 s -- in com.northstar.crm.exception.GlobalExceptionHandlerTest
[INFO] Running com.northstar.crm.service.CustomerServiceTests
[INFO] Tests run: 4, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.009 s -- in com.northstar.crm.service.CustomerServiceTests
[INFO] Running com.northstar.crm.service.CustomerValidatorParameterizedTest
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.039 s -- in com.northstar.crm.service.CustomerValidatorParameterizedTest
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 8, Failures: 0, Errors: 0, Skipped: 0
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  0.688 s
[INFO] Finished at: 2026-07-31T14:18:24-07:00
[INFO] ------------------------------------------------------------------------

mvn clean verify
[INFO] Scanning for projects...
[INFO] 
[INFO] ----------------------< com.northstar:lab17-crm >-----------------------
[INFO] Building Northstar Customer Service 0.1.0-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- clean:3.2.0:clean (default-clean) @ lab17-crm ---
[INFO] Deleting /home/jacktheck02/java-bootcamp/examples/Lab17/target
[INFO] 
[INFO] --- jacoco:0.8.12:prepare-agent (default) @ lab17-crm ---
[INFO] argLine set to -javaagent:/home/jacktheck02/.m2/repository/org/jacoco/org.jacoco.agent/0.8.12/org.jacoco.agent-0.8.12-runtime.jar=destfile=/home/jacktheck02/java-bootcamp/examples/Lab17/target/jacoco.exec
[INFO] 
[INFO] --- resources:3.3.1:resources (default-resources) @ lab17-crm ---
[INFO] Copying 1 resource from src/main/resources to target/classes
[INFO] 
[INFO] --- compiler:3.13.0:compile (default-compile) @ lab17-crm ---
[INFO] Recompiling the module because of changed source code.
[INFO] Compiling 18 source files with javac [debug release 21] to target/classes
[INFO] 
[INFO] --- resources:3.3.1:testResources (default-testResources) @ lab17-crm ---
[INFO] skip non existing resourceDirectory /home/jacktheck02/java-bootcamp/examples/Lab17/src/test/resources
[INFO] 
[INFO] --- compiler:3.13.0:testCompile (default-testCompile) @ lab17-crm ---
[INFO] Recompiling the module because of changed dependency.
[INFO] Compiling 3 source files with javac [debug release 21] to target/test-classes
[INFO] 
[INFO] --- surefire:3.5.2:test (default-test) @ lab17-crm ---
[INFO] Using auto detected provider org.apache.maven.surefire.junitplatform.JUnitPlatformProvider
[INFO] 
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running com.northstar.crm.exception.GlobalExceptionHandlerTest
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.020 s -- in com.northstar.crm.exception.GlobalExceptionHandlerTest
[INFO] Running com.northstar.crm.service.CustomerServiceTests
[INFO] Tests run: 4, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.010 s -- in com.northstar.crm.service.CustomerServiceTests
[INFO] Running com.northstar.crm.service.CustomerValidatorParameterizedTest
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.041 s -- in com.northstar.crm.service.CustomerValidatorParameterizedTest
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 8, Failures: 0, Errors: 0, Skipped: 0
[INFO] 
[INFO] 
[INFO] --- jar:3.4.2:jar (default-jar) @ lab17-crm ---
[INFO] Building jar: /home/jacktheck02/java-bootcamp/examples/Lab17/target/customer-service.jar
[INFO] 
[INFO] --- jacoco:0.8.12:report (report) @ lab17-crm ---
[INFO] Loading execution data file /home/jacktheck02/java-bootcamp/examples/Lab17/target/jacoco.exec
[INFO] Analyzed bundle 'Northstar Customer Service' with 16 classes
[INFO] 
[INFO] --- jacoco:0.8.12:check (jacoco-check) @ lab17-crm ---
[INFO] Loading execution data file /home/jacktheck02/java-bootcamp/examples/Lab17/target/jacoco.exec
[INFO] Analyzed bundle 'lab17-crm' with 16 classes
[INFO] All coverage checks have been met.
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  1.211 s
[INFO] Finished at: 2026-07-31T14:18:50-07:00
[INFO] ------------------------------------------------------------------------
