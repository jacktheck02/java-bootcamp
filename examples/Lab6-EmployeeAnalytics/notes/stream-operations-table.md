## Stream Operations Table

| Operation / API | Used? | Where (method / menu) | Notes |
| --------------- | :---: | --------------------- | ----- |
| Lambda `forEach` | Yes | displayAllEmployees  | Used in each stream were iterating each employee was needed |
| `Predicate` | Yes | demonstrateFunctionalInterfaces | Lambda functions that are used for filtering or other condionals |
| `Function` | Yes | demonstrateFunctionalInterfaces | Lambda functions that take in a value and return another for transfroms |
| `Consumer` | Yes | demonstrateFunctionalInterfaces | Lamdba functions that can be void functions that do a certain task |
| `Supplier` | Yes | demonstrateFunctionalInterfaces | Lambda functions that supplies a result by getting the supplier |
| `filter` | Yes | demonstrateFunctionalInterfaces | Stream function that uses conditional to filter items in a stream |
| `map` | Yes | demonstrateFunctionalInterfaces | Stream function that transforms a stream using function |
| `sorted` | Yes | demonstrateSorting | Stream function that sorts a stream given a Comparator to sort with |
| `distinct` | Yes | displayDistinctDepartments | Stream function that returns all the unique values of a stream |
| `limit` / `skip` | Yes | demonstrateFunctionalInterfaces | Stream function that sets a cap of the number of items to have in a stream |
| `count` | Yes | displayCounts | Stream function that counts the number of items in a stream and returns it |
| `reduce` | Yes | displayReductions | Stream function that reduces the number of elements based off a associative accumulation function and returns a Optional |
| `collect(toList/toSet)` | Yes | demonstrateCollectors | Stream function that collects all items in stream into a Collection object like a List or Set |
| `groupingBy` | Yes | demonstrateCollectors | Collectors method that groups two objects together to create a Map object which stores the data types as the key and value |
| `partitioningBy` | Yes | displayPartitionedEmplyees | Collectors method that partitions a streamgiven a conditional and stores it in a map |
| `summarizingDouble` | Yes | displaySummaryStatistics | Collectors method that returns a DoubleSummaryStatistics of a toDouble method |
| `Optional` (`max` / `ifPresent`) | Yes | displayReductions | A class that stores a value that can be either non-null or null |
| Method references | Yes | all | Method refrences occur all throughout the codebase and are used to abstract functionality |
| Dashboard composed report | Yes | menu 8 | The dashboard displays the stats summary called in the employee service |


