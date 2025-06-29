🔍 Mockito Hands-On: Exercise 1 – Mocking and Stubbing
This project demonstrates how to use Mockito to mock dependencies and stub method behaviors in unit tests. It focuses on testing a service class that depends on an external API, allowing us to isolate and test the service logic without relying on real external calls.

📌 Objective
Learn how to create mock objects using Mockito.
Stub method calls on mock objects to return controlled values.
Verify interactions between components in isolation.
Perform unit testing without depending on external systems.

🧪 Scenario
We have a service class (MyService) that depends on an ExternalApi. Since we want to test the service independently, we use Mockito to:
1.Create a mock of ExternalApi.
2.Stub the getData() method to return "Mock Data".
3.Inject the mock into MyService and verify that the service uses it correctly.

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

🧩 Maven Dependencies
<dependency>
  <groupId>org.mockito</groupId>
  <artifactId>mockito-core</artifactId>
  <version>5.11.0</version>
  <scope>test</scope>
</dependency>

<dependency>
  <groupId>org.junit.jupiter</groupId>
  <artifactId>junit-jupiter</artifactId>
  <version>5.10.0</version>
  <scope>test</scope>
</dependency>


▶️ How to Run Tests
1.Clone the repository.
2.Import into IntelliJ or Eclipse.
3Ensure Maven dependencies are downloaded.
4.Right-click MyServiceTest.java → Run as JUnit Test.
