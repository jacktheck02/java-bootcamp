# AI review notes — Lab 10

## lab10-001 — weak vs strong (entity)
- Date: 7/28/2026
- Weak prompt used: customer class 
- Output summary: Asked for more questions and created a class that was not explicitly what I wanted
- Strong prompt used: Java entity class Customer in package com.northstar.crm.entity representing a Northstar CRM customer. Fields: customerId (String, format "CUS-1001"), fullName (String), email (String), phone (String), status (CustomerStatus enum: PROSPECT, ACTIVE, SUSPENDED, CLOSED), createdAt (LocalDateTime). No-args constructor, all-args constructor, getters and setters, equals/hashCode based only on customerId, toString. 
- Output summary: Created a entity class that fit perfectly within the guidelines that I wanted
- Decision: accepted strong prompt
- Reason (1 sentence): This is because the output by the llm for the strong prompt match what was required.

## lab10-002 — weak vs strong (addCustomer)
- Date: 7/28/2026
- Decision: accepted strong prompt
- Reason: Like in the previous prompt the llm created an output that met all the requirements.

## lab10-003 — CustomerStatus / Customer scaffold
- Rejected JPA? yes / no
- Notes:

## lab10-004 — CustomerService review
What real customer data did you avoid typing into Chat, and what did you use instead (CUS-1001 / CUS-1002)?


If Copilot suggests a block that looks copied verbatim from a known library/article, what do you do before accepting?


What is your team’s rule for code Copilot generates that you do not fully understand?



## Reflection Questions

Difference between a Copilot inline completion and a Copilot Chat request—when is each better?


Why prompt specificity (fields, types, rules) changes enterprise Java output quality vs a vague comment?


What is the “trust boundary” between an AI suggestion and code allowed to touch real customer data?


Which business rule protects integrity in Customer (fixed CustomerStatus enum vs free-text String)?


What happens if Copilot suggests a class/annotation/library not on this project’s classpath?


Why must every accepted suggestion be reviewed line-by-line, not only “does it compile”?


What is the risk of pasting real customer data or credentials into Copilot Chat?


How does license/provenance risk apply to a multi-line AI block, and what if it looks copied from a known OSS project?


Why is Copilot not a runtime dependency of customer-service?


How will Lab 11 reuse today’s review discipline when generating tests?

