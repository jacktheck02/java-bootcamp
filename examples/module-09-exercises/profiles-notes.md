## Exercise 2

```xml
<profiles>
  <profile>
    <id>dev</id>
    <activation>
      <activeByDefault>true</activeByDefault>
    </activation>
    <properties>
      <app.env>dev</app.env>
    </properties>
  </profile>
  <profile>
    <id>prod</id>
    <properties>
      <app.env>prod</app.env>
    </properties>
  </profile>
</profiles>
```


| Question | Your answer |
| -------- | ----------- |
| Which profile is active when you run plain `mvn package`? | dev |
| How do you activate `prod` on the command line? | mvn -Pprod |
| What is the `app.env` value under `dev`? | dev |
| What is the `app.env` value under `prod`? | prod |


Keep `dev` as the laptop default.
Activate `prod` intentionally with `-Pprod`.
Never store real production secrets in `pom.xml` profiles.
