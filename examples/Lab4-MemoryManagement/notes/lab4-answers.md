## G1 Logs
[0.001s][info][gc] Using G1
===== Garbage Collection Demonstration =====                                                                                            

===== JVM Memory Report: Before Allocation =====                                                                                        
Total Memory : 492 MB                                                                                                                   
Free Memory  : 489 MB                                                                                                                   
Used Memory  : 2 MB                                                                                                                     
Max Memory   : 7800 MB                                                                                                                  
-----------------------------                                                                                                                        
Creating Objects...                                                                                                                     
[0.039s][info][gc] GC(0) Pause Young (Normal) (G1 Evacuation Pause) 25M->22M(492M) 1.921ms                                              
Objects Created: 100000                                                                                                                 
                                                                                                                                            
===== JVM Memory Report: After Allocation =====                                                                                         
Total Memory : 492 MB                                                                                                                   
Free Memory  : 468 MB                                                                                                                       
Used Memory  : 23 MB                                                                                                                        
Max Memory   : 7800 MB                                                                                                                      
-----------------------------                                                                                                               
Removing strong references...                                                                                                               
Triggering garbage collection...                                                                                                            
[0.042s][info][gc] GC(1) Pause Full (System.gc()) 23M->1M(40M) 1.725ms                                                                      
Garbage Collection Complete                                                                                                                 
                                                                                                                                            
===== JVM Memory Report: After Garbage Collection =====                                                                                     
Total Memory : 40 MB                                                                                                                        
Free Memory  : 38 MB                                                                                                                        
Used Memory  : 1 MB                                                                                                                         
Max Memory   : 7800 MB                                                                                                                  
-----------------------------                                                                                                               
Time elapsed: 30ms

## Performance Test Results
===== Performance Measurement =====                                                                                                 
                                                                                                                                                     
===== JVM Memory Report: Start =====                                                                                                                 
Total Memory : 130 MB                                                                                                                                
Free Memory  : 127 MB
Used Memory  : 2 MB
Max Memory   : 512 MB
-----------------------------

Objects      Used Memory    Execution Time
10           0              0
100          482760         0
1000         486360         0
100000       10968184       3
1000000      112217936      34

Additional measurements:
Time elapsed in Loop Execution: 1
Time elapsed in Memory Allocation: 1

===== JVM Memory Report: Before Large byte[] =====
Total Memory : 128 MB
Free Memory  : 122 MB
Used Memory  : 5 MB
Max Memory   : 512 MB
-----------------------------

===== JVM Memory Report: After Large byte[] Allocation =====
Total Memory : 128 MB
Free Memory  : 107 MB
Used Memory  : 20 MB
Max Memory   : 512 MB
-----------------------------

===== JVM Memory Report: After Releasing byte[] =====
Total Memory : 128 MB
Free Memory  : 126 MB
Used Memory  : 1 MB
Max Memory   : 512 MB
-----------------------------

## Reflection Questions
Stack vs Heap?
The stack stores the local variables and method calls while the heap stores object data.

Why locals on the Stack?
Local variables on the stack because they require little amount of references and memory. 

Why objects on the Heap?
They can be referenced frequently and may need large amounts of memory.

When is an object GC-eligible?
When the reference is set to null;

Does System.gc() guarantee collection?
No

What caused the leak?
The collection of objects were not cleared and dereferenced.

How did clearing the list fix it?
It removes all references of the object which allows for the list and items to be GC-eligable.

Why are WeakReferences useful?
When you want to deallocate a reference.

What happens when the heap is exhausted?
It becomes full of allocated memory.

Which laptop tool would you try first for rising heap—and why?
VisualVM

How could a CRM unbounded cache repeat this leak?
Yes

## How Leak differs from fix
With the leak objects were allocated to a list and filled but never dereferenced/cleared and eligable for garbage collection. On the other hand the fix actually does those steps which allows the memory to be deallocated from the heap.  
