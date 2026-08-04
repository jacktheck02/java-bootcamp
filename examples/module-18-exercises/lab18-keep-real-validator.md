# Lab 18 — When to Keep Real Validator

## Mock repo?
Mock CustomerRepository — I/O boundary.

## Real validator?
Keep pure validator real if deterministic and fast.

## Mock notifier?
Mock notifier to avoid email/IO.

## Rule
Rule: mock I/O and unstable deps; keep pure domain helpers real when cheap.

## Scope
Pre-lab only.
