# Lifecycle evidence — Lab 9

Run each phase separately and paste a short excerpt.

| Phase | Command | BUILD SUCCESS? | Notes |
| ----- | ------- | -------------- | ----- |
| validate | `mvn validate` | Yes | |
| compile | `mvn compile` | Yes | |
| test | `mvn test` | Yes | |
| package | `mvn package` | Yes | ../target/customer-service.jar |
| verify | `mvn verify` | Yes | |
| install | `mvn install` | Yes | ~/.m2/repository/com/northstar/customer-service/0.1.0-SNAPSHOT/customer-service-0.1.0-SNAPSHOT.pom |



[INFO] Scanning for projects...
[INFO] 
[INFO] -------------------< com.northstar:customer-service >-------------------
[INFO] Building Northstar Customer Service 0.1.0-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- dependency:3.7.0:tree (default-cli) @ customer-service ---
[INFO] com.northstar:customer-service:jar:0.1.0-SNAPSHOT
[INFO] +- org.springframework:spring-context:jar:6.2.3:compile - direct
[INFO] |  +- org.springframework:spring-aop:jar:6.2.3:compile
[INFO] |  +- org.springframework:spring-beans:jar:6.2.3:compile
[INFO] |  +- org.springframework:spring-core:jar:6.2.3:compile
[INFO] |  |  \- org.springframework:spring-jcl:jar:6.2.3:compile
[INFO] |  +- org.springframework:spring-expression:jar:6.2.3:compile
[INFO] |  \- io.micrometer:micrometer-observation:jar:1.14.4:compile
[INFO] |     \- io.micrometer:micrometer-commons:jar:1.14.4:compile
[INFO] \- org.junit.jupiter:junit-jupiter:jar:5.11.4:test - direct
[INFO]    +- org.junit.jupiter:junit-jupiter-api:jar:5.11.4:test
[INFO]    |  +- org.opentest4j:opentest4j:jar:1.3.0:test
[INFO]    |  +- org.junit.platform:junit-platform-commons:jar:1.11.4:test
[INFO]    |  \- org.apiguardian:apiguardian-api:jar:1.1.2:test
[INFO]    +- org.junit.jupiter:junit-jupiter-params:jar:5.11.4:test
[INFO]    \- org.junit.jupiter:junit-jupiter-engine:jar:5.11.4:test
[INFO]       \- org.junit.platform:junit-platform-engine:jar:1.11.4:test
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  0.339 s
[INFO] Finished at: 2026-07-28T11:23:45-07:00
[INFO] ------------------------------------------------------------------------


Save `mvn dependency:tree` output to `docs/dependency-tree.txt` and mark direct vs transitive; confirm junit is test scope.
