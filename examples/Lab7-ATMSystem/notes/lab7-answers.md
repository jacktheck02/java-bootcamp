## Lab 7 Reflection Questions

Why are InvalidAmountException and friends checked in this lab, while NullPointerException is unchecked?
This is because NullPointerException does not need to be caught as it is a RuntimeException.

What does throws on Account.withdraw(...) force callers to do?
It forces callers to follow the requirements of withdraw or there will be exceptions thrown

Why catch specific exceptions before a broad catch (Exception ex)?    
To provide more context through messages and logs in the catch block

What guarantee does finally give you that catch alone does not?
That the code will execute

Why prefer try-with-resources over reader.close() in a finally block?
It automatically closes the resources without the programmer specifiying it.

Why log stack traces to a file while showing short messages to the ATM user?
Provide context of the error to the programmer and keeping that complexity away from the user.

Where should validation throw—deep in Account or only in Main? Why?
It depends but it should for the mostpart be in Account because that is where the exceptions are being made.

How will CRM later reuse “domain exception + boundary catch + log” (without claiming CRM is done today)?
It can do this using the existing custom exceptions made along with the handling and logging in the code

