| Dependency | Decision | Why? |
| ---------- | -------- | ---- |  
| controller → service | Acceptable | | 
| service → repository | Acceptable | |
| repository → entity | Acceptable | |
| entity → controller | Problematic: domain depends on transport | |
| repository → controller | Problematic: persistence depends on presentation | | 
| service → DTO | Needs context; acceptable in this lab’s simple mapping, but avoid transport leakage | |
| DTO → repository | Problematic: boundary model should not perform storage | |

Higher-level request handling may call inward services and repositories.
Domain/entity and repository packages must not import controller classes.
