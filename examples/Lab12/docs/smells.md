# Code smells — Lab 12

Catalog **≥8** smells from the messy baseline (`doStuff`). Tie each to CRM impact (CUS-1001).

| # | Smell | Location | Impact on CUS-1001 |
| - | ----- | -------- | ------------------ |
| 1 | Poor naming (`doStuff`, `data`) | Line 13 | Terrible readablity for the code and what the method does|
| 2 | Raw types | Line 13 | methods return object instaed of the customer data type|
| 3 | Long method / mixed responsibilities | line 13 | method doStuff just does a series of multiple things that don't align with one another|
| 4 | Stringly-typed status | line 31| to set status it goes through a if else block to set each to what they need to be|
| 5 | Incorrect equality (`==`) | line 55 | compares strings with == and not .equals|
| 6 | Null as control flow | line 59 | method returns null at the end of it|
| 7 | Side-effect logging | line 16 | logs are only three letters for different actions |
| 8 | Magic `"UPDATE"` behavior | line 39 | Hard coded literal |
