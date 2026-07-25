## Lab 6 Reflection Questions

What are the advantages of Streams over loops?
Some advantages of Streams over loops is readability, loose coupling, and less mutability.

When should Streams be preferred?
Streams should be prefered where performance is not an issue and are in need of using larger datasets.

What is the difference between filter() and map()?
The difference between filter and map is that filter removes items that do not match its conditional while map transforms objects in the stream give a function.

Why is reduce() useful?
reduce() is useful because it can remove the complexity of imperitive code to find single elements in a list.

What does Collectors.groupingBy() do?
Collectors.groupingBy() takes one or two collections and maps the pair together in a HashMap or Map like interface.

What is the benefit of using Optional?
The benefit of using Optional gives the programmer the opprotunity to make a decision based on what a function returns. Since Optional can either be a non-null or null value it gives room to determine 
error handling steps.

Why are Lambda Expressions more readable?
Lambda expressions are more readable because they are more similar to functions like in math.

When should method references be used?
Method refrences should be used in stream functions when there is limited complexity in refrencing them.

Which stream operation is terminal? Give three examples from your lab.
forEach, collect, and reduce

How do Streams improve enterprise Java applications?
They can improve productivity with concise and expressive code, they are ideal for collections, large datasets, and realtime dataflows, and they enable parallel processing for performance at scale.

(Forward look) How would a future CRM use filter / map / groupingBy on customers the same way this lab uses them on employees—without claiming the CRM is implemented today?
The CRM can group customers that make similar purchases using group by. Using map and filter the CRM can pick certain groups of customers and transform their data.
