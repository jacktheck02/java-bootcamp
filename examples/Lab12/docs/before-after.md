# Before / after — Lab 12

## Before
- API: `doStuff` / `get`
- Failures return null; `==` on IDs

### Tests
[INFO] --- resources:3.3.1:testResources (default-testResources) @ customer-service ---                                                                                                                     [0/64]
[INFO] skip non existing resourceDirectory /home/jacktheck02/java-bootcamp/examples/Lab12/src/test/resources
[INFO]
[INFO] --- compiler:3.13.0:testCompile (default-testCompile) @ customer-service ---
[INFO] Recompiling the module because of changed source code.
[INFO] Compiling 1 source file with javac [debug release 21] to target/test-classes
[INFO] -------------------------------------------------------------
[ERROR] COMPILATION ERROR :
[INFO] -------------------------------------------------------------
[ERROR] /home/jacktheck02/java-bootcamp/examples/Lab12/src/test/java/com/northstar/crm/service/CustomerServiceTest.java:[16,20] cannot find symbol
  symbol:   method createCustomer(java.lang.String,java.lang.String,java.lang.String,<nulltype>,com.northstar.crm.entity.CustomerStatus)
  location: variable svc of type com.northstar.crm.service.CustomerService
[ERROR] /home/jacktheck02/java-bootcamp/examples/Lab12/src/test/java/com/northstar/crm/service/CustomerServiceTest.java:[24,39] cannot find symbol
  symbol:   method getCustomer(java.lang.String)
  location: variable svc of type com.northstar.crm.service.CustomerService
[ERROR] /home/jacktheck02/java-bootcamp/examples/Lab12/src/test/java/com/northstar/crm/service/CustomerServiceTest.java:[30,12] cannot find symbol
  symbol:   method createCustomer(java.lang.String,java.lang.String,java.lang.String,<nulltype>,com.northstar.crm.entity.CustomerStatus)
  location: variable svc of type com.northstar.crm.service.CustomerService
[ERROR] /home/jacktheck02/java-bootcamp/examples/Lab12/src/test/java/com/northstar/crm/service/CustomerServiceTest.java:[35,28] cannot find symbol
  symbol:   method createCustomer(java.lang.String,java.lang.String,java.lang.String,<nulltype>,com.northstar.crm.entity.CustomerStatus)
  location: variable svc of type com.northstar.crm.service.CustomerService
[ERROR] /home/jacktheck02/java-bootcamp/examples/Lab12/src/test/java/com/northstar/crm/service/CustomerServiceTest.java:[46,63] cannot find symbol
  symbol:   method getCustomer(java.lang.String)
  location: variable svc of type com.northstar.crm.service.CustomerService
[INFO] 5 errors
[INFO] -------------------------------------------------------------
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  0.358 s
[INFO] Finished at: 2026-07-29T13:08:12-07:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.13.0:testCompile (default-testCompile) on project customer-service: Compilation failure: Compilation failure:
[ERROR] /home/jacktheck02/java-bootcamp/examples/Lab12/src/test/java/com/northstar/crm/service/CustomerServiceTest.java:[16,20] cannot find symbol
[ERROR]   symbol:   method createCustomer(java.lang.String,java.lang.String,java.lang.String,<nulltype>,com.northstar.crm.entity.CustomerStatus)
[ERROR]   location: variable svc of type com.northstar.crm.service.CustomerService
[ERROR] /home/jacktheck02/java-bootcamp/examples/Lab12/src/test/java/com/northstar/crm/service/CustomerServiceTest.java:[24,39] cannot find symbol
[ERROR]   symbol:   method getCustomer(java.lang.String)
[ERROR]   location: variable svc of type com.northstar.crm.service.CustomerService
[ERROR] /home/jacktheck02/java-bootcamp/examples/Lab12/src/test/java/com/northstar/crm/service/CustomerServiceTest.java:[30,12] cannot find symbol
[ERROR]   symbol:   method createCustomer(java.lang.String,java.lang.String,java.lang.String,<nulltype>,com.northstar.crm.entity.CustomerStatus)
[ERROR]   location: variable svc of type com.northstar.crm.service.CustomerService
[ERROR] /home/jacktheck02/java-bootcamp/examples/Lab12/src/test/java/com/northstar/crm/service/CustomerServiceTest.java:[35,28] cannot find symbol
[ERROR]   symbol:   method createCustomer(java.lang.String,java.lang.String,java.lang.String,<nulltype>,com.northstar.crm.entity.CustomerStatus)
[ERROR]   location: variable svc of type com.northstar.crm.service.CustomerService
[ERROR] /home/jacktheck02/java-bootcamp/examples/Lab12/src/test/java/com/northstar/crm/service/CustomerServiceTest.java:[46,63] cannot find symbol
[ERROR]   symbol:   method getCustomer(java.lang.String)
[ERROR]   location: variable svc of type com.northstar.crm.service.CustomerService
[ERROR] -> [Help 1]
[ERROR]
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR]
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException

## After (TODO)
- API: `createCustomer` / `getCustomer` / `updateStatus`
- Exceptions for unknown/duplicate
- Typed `List<Customer>`; no `doStuff`

### Tests
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::staticFieldBase has been called by com.google.inject.internal.aop.HiddenClassDefiner (file:/usr/share/maven/lib/guice-5.1.0-classes.jar)
WARNING: Please consider reporting this to the maintainers of class com.google.inject.internal.aop.HiddenClassDefiner
WARNING: sun.misc.Unsafe::staticFieldBase will be removed in a future release
[INFO] Scanning for projects...
[INFO]
[INFO] -------------------< com.northstar:customer-service >-------------------
[INFO] Building Northstar Customer Service 0.1.0-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO]
[INFO] --- clean:3.2.0:clean (default-clean) @ customer-service ---
[INFO] Deleting /home/jacktheck02/java-bootcamp/examples/Lab12/target
[INFO]
[INFO] --- resources:3.3.1:resources (default-resources) @ customer-service ---
[INFO] Copying 1 resource from src/main/resources to target/classes
[INFO]
[INFO] --- compiler:3.13.0:compile (default-compile) @ customer-service ---
[INFO] Recompiling the module because of changed source code.
[INFO] Compiling 8 source files with javac [debug release 21] to target/classes
[INFO]
[INFO] --- resources:3.3.1:testResources (default-testResources) @ customer-service ---
[INFO] skip non existing resourceDirectory /home/jacktheck02/java-bootcamp/examples/Lab12/src/test/resources
[INFO]
[INFO] --- compiler:3.13.0:testCompile (default-testCompile) @ customer-service ---
[INFO] Recompiling the module because of changed dependency.
[INFO] Compiling 1 source file with javac [debug release 21] to target/test-classes
[INFO]
[INFO] --- surefire:3.5.2:test (default-test) @ customer-service ---
[INFO] Using auto detected provider org.apache.maven.surefire.junitplatform.JUnitPlatformProvider
[INFO]
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running com.northstar.crm.service.CustomerServiceTest
[INFO] Tests run: 3, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.022 s -- in com.northstar.crm.service.CustomerServiceTest
[INFO]
[INFO] Results:
[INFO]
[INFO] Tests run: 3, Failures: 0, Errors: 0, Skipped: 0
[INFO]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  0.684 s
[INFO] Finished at: 2026-07-29T13:48:15-07:00
[INFO] ------------------------------------------------------------------------
