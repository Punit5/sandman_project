To run the service via IDE (Intellij)
1) do a clean maven install "mvn clean install"
2) simply run the Application.java class

The port to run can be configured in application.properties
Once the service is running do :
http://{servername}:{port_configured}/getDetails?code={areaCode}&checkInDate={check-in-date}&checkOutDate={check-out-date}

NOTE:
At the moment , we are mocking the actual response to the same static response for every request.
Once we have the APIKEY, will replace that mock response with an actual response.

