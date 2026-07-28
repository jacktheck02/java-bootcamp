## Exercise 5

| Artifact | Direct or transitive? | Scope |
| -------- | --------------------- | ----- |
| `junit-jupiter` | Direct (you declared it) | `test` |
| `junit-jupiter-params` | Transitive (comes with Jupiter) | `test` |


| Question | Answer |
| -------- | ------ |
| What does `-B` mean? | Batch mode — less interactive prompts, friendlier for CI logs |
| Why `verify` instead of casual `install` on every push? | Proves package + checks without writing into every agent’s `~/.m2` unless the pipeline intentionally installs |
| Preferred CI-style command for this bootcamp | `mvn -B verify` |
