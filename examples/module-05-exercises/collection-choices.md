# Collection choices


| # | Scenario | Interface | Implementation | Why |
| - | -------- | --------- | -------------- | --- |
| 1 | Ordered catalog; duplicate titles allowed | List<String> | ArrayList<> | Duplicates allowed and ordered catalog |
| 2 | Unique registered book IDs | Set<String> | HashSet<> | No duplicates |
| 3 | Book ID → current borrower ID | Map<String, String> | HashMap<> | Key value pair with no sorting|
| 4 | Alphabetically sorted categories | Set<String> | TreeSet<> | Unique values that are sorted |
| 5 | Category → count, sorted by category | Map<String, Integer> | TreeMap<> | Key value pair and it sorted |
| 6 | Checkout history in event order | List<String> | ArrayList<> | Can contain duplicates and no key value pairs |


