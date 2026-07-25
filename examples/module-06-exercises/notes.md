## Exercise 5 Step 3:

map produced a new list of proposed values; it did not modify the immutable Employee records in the source list.

## Exercise 6 Step 3:

Why is the value type Long, not Integer?
Collectors count uses long

What would the values contain if you removed Collectors.counting()?
it would be lists

Why is a TreeMap used only for presentation here?
To make the map in alphabetical order

## Exercise 7 Step 4:
Why should department filtering happen before mapping to names?
It would map all the names in to one stream removing the department data.
