## Lab 9 Reflection Questions

The main data or request flow in this lab (source → compile → package → optional install)


The trust boundary between Maven Central artifacts and your own source


The success and failure contract of each lifecycle phase


Stable identity of the artifact (groupId:artifactId:version) versus customer IDs (CUS-1001)


Retry and idempotency of mvn install (safe to repeat; overwrites snapshot)


Local development shortcut (dev profile) versus production design (prod)


Logs or evidence needed when a CI build fails


Behavior with two application instances built from the same POM version


Why test scope keeps JUnit out of the runtime image mindset


Why CI prefers verify over casually installing snapshots on shared agents


