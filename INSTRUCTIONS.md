**Crime Investigation API - Participant Guide**

_Your Mission_
A suspicious €50,000 transaction has been detected.
Your task is to investigate the transaction, follow the money trail, identify the account owner and create an investigation.
During the investigation, you will use a REST API and Swagger UI to work with the available data.
Swagger UI: http://localhost:8080/swagger-ui/index.html#/

_Your Goal_
By the end of the investigation, you should be able to answer:
Who is behind the suspicious transaction?

_Available Operations_
* GET - find and inspect information
* POST - create an investigation
* PUT - update an investigation
* DELETE - remove a false lead

_Final Result_
Identify the suspicious account and its owner and leave the relevant investigation with the status: UNDER_INVESTIGATION
Use Swagger UI to explore the API and follow the money trail.

**Unit Testing - Participant Guide**

_Your Mission_
The REST API is working, but how do we know that the application logic continues to work correctly?
In this part of the workshop, you will work with unit tests for the investigation service.

_Your Task_
Run the existing unit tests and investigate the result.
You should:

Run the InvestigationServiceTest class
Check which tests pass and which test fails
Read and understand the error message
Determine what is causing the failure
Fix the problem
Run the tests again

_Your Goal_
All tests should pass:
4 / 4 TESTS PASSED

Remember: a failing test does not necessarily mean that the application code is wrong. The test itself can contain a mistake.
