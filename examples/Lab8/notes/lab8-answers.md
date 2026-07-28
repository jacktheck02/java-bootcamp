## Lab 8 Reflection Questions

Which browser, network, event, or database inputs are untrusted? (Design: future API inputs)
They should all not be trusted till the input is validated.

Where are authentication, authorization, and validation enforced? (Which layer will own them?)
They will be enforced in the business layer but the processes themselves live all throughout the application

Which values are sensitive, and where are they stored? (None in Lab 8—keep it that way)
They are stored in the database to provide a protected layer.

What can be retried safely? (mvn compile; not “create customer” yet)
mvn comile

What happens after a partial failure? (Stub methods throw before storing)
The methods throw before storing the value.

What would an operator monitor later? (API latency, DB health—note the gap)
API latency and DB health

Which local default is unacceptable in production? (Empty stubs / no auth / later in-memory without hardening)
no authentication should be unacceptable in a no auth environment.

How are schema/event/API contracts versioned later? (Packages + future WSDL/OpenAPI labs)
Packages

