# Lab 15 — Fill Activate Ravi Pseudocode TODOs

## Step 1 — Copy pseudocode

customer = repo.findById(customerId)
if customer is null → throw IllegalArgumentException
if status is not pending → throw Exception
set status to Active
repo.addCustomer(customer)
log correlation id

## Step 2 — Fill blanks

Fill with CUS-1002, NotFound, PROSPECT, IllegalState/domain exception, ACTIVE, save/update, lab-request-001.

## Step 3 — Repo boundary note

Write: *Repository saves state; it does not decide PROSPECT→ACTIVE.*

## Step 4 — Self-check

Confirm Ravi starts PROSPECT and ends ACTIVE in the filled sheet.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
