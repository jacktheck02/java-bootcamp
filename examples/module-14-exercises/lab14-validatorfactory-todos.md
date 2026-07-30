# Lab 14 — Fill ValidatorFactory TODOs

## Step 1 — Copy TODOs

Bootstrap: ValidatorFactory factory = new ValidatorFactory();
Validator validator = new Validator();
Invalid blank name → expect 2 violations
Invalid status TYPO → expect none
Valid Amina ACTIVE sketch → expect 3 violations
Spring @Valid in this pre-lab? Yes

## Step 2 — Fill blanks

Fill with Validation.buildDefaultValidatorFactory(), factory.getValidator(), counts/messages ideas, and `no` for Spring `@Valid`.

## Step 3 — Invalid cases list

Add bullets: blank fullName; unknown status; null customerId on activate.

## Step 4 — Self-check

Confirm Spring `@Valid` blank is no / not in this pre-lab.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
