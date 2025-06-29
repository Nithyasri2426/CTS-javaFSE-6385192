Exercise 1: Setting Up JUnit in a Java Project
This exercise demonstrates how to set up JUnit 4 in a Java project to begin writing and running unit tests. JUnit is a popular testing framework that helps ensure your code behaves as expected.

📁 Project Structure
- src/main/java/ – Your main application code
- src/test/java/ – Your unit test code (using JUnit)

⚙️ Setup Instructions
1. Create a Java Project
Set up a new Java project using your preferred IDE:

IntelliJ IDEA
Eclipse
NetBeans, etc.

2. Add JUnit Dependency
If you're using Maven, add the following dependency to your pom.xml file:
<dependency>
  <groupId>junit</groupId>
  <artifactId>junit</artifactId>
  <version>4.13.2</version>
  <scope>test</scope>
</dependency>

For Gradle, add this to your build.gradle:
testImplementation 'junit:junit:4.13.2'

3. Create a Test Class
Inside the src/test/java/ directory, create a new Java class with test methods annotated using @Test.

Example:

- CalculatorTest.java
- UserServiceTest.java
