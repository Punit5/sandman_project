To run the service via IDE (Intellij)
1) do a clean maven install "mvn clean install"
2) simply run the Application.java class


Can use the swagger ui at :

http://{hostname}:{port}/swagger-ui.html#/details-controller

For example in default setting it will be:

http://localhost:8080/swagger-ui.html#/details-controller

click the "/getDetails" button and then  "Try it out" button , and execute with your input details.


Or can simply use:

curl -X GET "http://{hostname}:{port}/getDetails?checkInDate={check-in-date}&checkOutDate={check-out-date}&code={code}" -H "accept: application/json;charset=UTF-8"

For example is default setting it will be :

curl -X GET "http://localhost:8080/getDetails?checkInDate=2018-11-01&checkOutDate=2018-11-02&code=BOS" -H "accept: application/json;charset=UTF-8"



NOTE:
The port to run can be configured in application.properties


