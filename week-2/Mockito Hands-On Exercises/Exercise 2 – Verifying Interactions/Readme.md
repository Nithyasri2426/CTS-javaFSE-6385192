✅ Mockito Hands-On: Exercise 2 – Verifying Interactions
This project demonstrates how to use Mockito to verify that a method was called with specific arguments. It ensures that your unit tests not only check output, but also confirm correct interaction between components.

📌 Objective
Create mock objects for dependencies.
Call methods on the class under test.
Use Mockito.verify() to ensure specific methods were called on the mocks.
Improve confidence in internal logic and method flow.

🧪 Scenario
We have a service class (MyService) that depends on an ExternalApi. The goal is to:
Mock the ExternalApi dependency.
Inject the mock into MyService.
Call the method under test.
Verify that ExternalApi.getData() was called during execution.

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
Mockito 5.x

📦 Maven Dependencies
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


▶️ How to Run
Clone the repository.
Import the project into your Java IDE (e.g., IntelliJ, Eclipse).
Ensure Maven dependencies are installed.
Right-click the test file → Run As > JUnit Test.
