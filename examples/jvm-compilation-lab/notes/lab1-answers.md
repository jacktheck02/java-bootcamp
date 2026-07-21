#### Step 3 Question: What is the difference between HelloWorld.java and HelloWorld.class?

The difference between HelloWorld.java and HelloWorld.class is that HelloWorld.java is the java code while HelloWorld.class is the bytecode generated after compiling HelloWorld.java.

#### Step 6 Table:

| Code element | Memory area |
| ------------ | ----------- |
| Locals `x`, `y`, `sum` in `main` | Stack (locals in `main` frame) |
| Parameters `a`, `b` and local `result` in `add` | Stack (`add` frame) |
| Method call `add(x, y)` | New stack frame pushed, then popped on return |
| Class metadata for `Calculator` | Metaspace (simplified course term) |
| Temporary `String` for `"Sum = " + sum` | Heap (String / builder intermediates) |



#### Step 7 Diagram
flowchart LR
  subgraph Stack["Thread stack (per call)"]
    S1["main frame: x, y, sum"]
    S2["add frame: a, b, result"]
  end
  subgraph Heap["Heap (shared)"]
    H1["Employee (id, name -> String)"]
    H2["ArrayList + many Employees"]
  end
  S1 -.->|emp reference| H1
  META["Metaspace<br/>class metadata"] -.-> Stack
  META -.-> Heap

#### Step 10:
   size_t InitialHeapSize                          = 511705088                                 {product} {ergonomic}
   size_t MaxHeapSize                              = 8178892800                                {product} {ergonomic}
   size_t SoftMaxHeapSize                          = 8178892800                             {manageable} {ergonomic}
     bool UseG1GC                                  = true                                      {product} {ergonomic}
