#Model-based testing with Graphwalker and SoapUI

 * .../login folder contains the stub (generated by Graphwalker) and tests.
 * .../wiremock folder contains the mocked REST-service
 * ...test/resources/soapui contains the SoapUI project which is being executed

SoapUI (free version) 5.1.3 was used for testing. The libs folder includes the SoapUI jar
and all its dependencies.

##Run it

 1. Run the mock REST service: switch to the directory contain the wiremock...jar file
 2. $ java -jar wiremock-1.56-standalone.jar
 3. In *SimpleTest* adjust the paths to the SoapUI project and the .graphml file representing the system
 4. Run *SimpleTest* in your IDE