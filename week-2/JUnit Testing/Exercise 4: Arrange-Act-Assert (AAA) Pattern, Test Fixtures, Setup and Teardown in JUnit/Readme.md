 Exercise 4: Arrange-Act-Assert (AAA) Pattern, Test Fixtures, Setup and Teardown in JUnit
 This repository demonstrates how to structure unit tests in Java using the Arrange-Act-Assert (AAA) pattern, along with test fixture setup and cleanup using JUnit's @Before and @After annotations.

 📌 Objectives
Use the AAA pattern to make tests more readable and maintainable.
Apply @Before and @After to set up and tear down test fixtures.
Understand the lifecycle of JUnit test methods.

🧱 Arrange-Act-Assert Pattern
The AAA pattern is a structured way to write unit tests:

Arrange – Set up test data and environment
Act – Call the method under test
Assert – Verify the result

🛠️ Setup and Teardown
@Before – Runs before each test method, used to initialize objects.
@After – Runs after each test method, used to release resources or reset state.

🧪 Example Test Class
The sample test file includes:
A simple class (e.g., Calculator) to test basic arithmetic.
A test class (CalculatorTest) structured with @Before, @After, and AAA-style methods.

📁 Project Structure
/src
  ├── main/java
  │   └── Calculator.java
  └── test/java
      └── CalculatorTest.java

📦 Dependencies (JUnit 4)
Add the following to your pom.xml:
<dependency>
  <groupId>junit</groupId>
  <artifactId>junit</artifactId>
  <version>4.13.2</version>
  <scope>test</scope>
</dependency>

▶️ How to Run
Clone the repository.
Open in Eclipse, IntelliJ, or any Java IDE.
Right-click the test class → Run As > JUnit Test.

✅ Expected Output
All tests should pass, showing a green bar in your IDE or clean test output in the terminal.
Console may print messages from setup and teardown methods if included.
