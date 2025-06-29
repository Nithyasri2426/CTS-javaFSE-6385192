🔍 Mockito Hands-On: Exercise 1 – Mocking and Stubbing
This project demonstrates how to use Mockito to mock dependencies and stub method behaviors in unit tests. It focuses on testing a service class that depends on an external API, allowing us to isolate and test the service logic without relying on real external calls.


📌 Objective
1.Learn how to create mock objects using Mockito.
2.Stub method calls on mock objects to return controlled values.
3.Verify interactions between components in isolation.
4.Perform unit testing without depending on external systems.

🧪 Scenario
We have a service class (MyService) that depends on an ExternalApi. Since we want to test the service independently, we use Mockito to:
Create a mock of ExternalApi.
Stub the getData() method to return "Mock Data".
Inject the mock into MyService and verify that the service uses it correctly.

📁 Project Structure
/src
  ├── main/java
  │   ├── ExternalApi.java
  │   └── MyService.java
  └── test/java
      └── MyServiceTest.java

🛠️ Technologies Used
Java
JUnit 5 (Jupiter)
Mockito 5.x+

▶️ How to Run Tests
1.Clone the repository.

2.Import into IntelliJ or Eclipse.

3.Ensure Maven dependencies are downloaded.

4.Right-click MyServiceTest.java → Run as JUnit Test.
