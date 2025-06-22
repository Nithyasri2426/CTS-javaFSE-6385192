# SingletonPatternExample

## 📌 Overview
This project demonstrates the **Singleton Design Pattern** in Java by implementing a simple logging utility. The Singleton Pattern ensures that a class has only one instance and provides a global point of access to it. In this example, a `Logger` class is created following the singleton approach to maintain consistent logging throughout the application lifecycle.

---

## 🛠️ Project Structure
SingletonPatternExample/
│
├── src/
│ ├── Logger.java // Singleton class
│ └── LoggerTest.java // Test class to verify singleton behavior


---

## 🔁 Singleton Pattern Details

- **Class Name:** `Logger`
- **Key Features:**
  - Private constructor to restrict instantiation.
  - A private static variable to hold the single instance.
  - A public static method `getInstance()` that returns the single instance of the `Logger` class.

---

## ✅ How It Works

1. When the application requests a `Logger` instance via `Logger.getInstance()`, it checks if an instance already exists.
2. If it does, it returns the existing instance.
3. If it doesn't, it creates a new one and returns it.

This ensures that **only one `Logger` object is used across the entire application**.

---

## 🔍 Testing

- A test class `LoggerTest` is used to create multiple references to `Logger`.
- It verifies that all references point to the same instance, proving that the Singleton pattern is correctly implemented.

---

## 📄 Example Output
Logger instance 1 hash: 12345678
Logger instance 2 hash: 12345678
Logger instance 3 hash: 12345678


This confirms that all instances share the same memory address (i.e., the same object).

---

## 🧠 Why Use Singleton?

Using the Singleton pattern for utilities like logging:
- Saves resources
- Ensures consistency
- Makes debugging and log tracking easier

---

## 🚀 How to Run

1. Clone or download the project
2. Open it in any Java IDE (like IntelliJ, Eclipse)
3. Compile and run `LoggerTest.java` to see the singleton in action

---

## 📚 Related Concepts

- Design Patterns in Java
- Thread-safe Singleton implementation (not covered here)
- Static methods and variables

---

## 🔒 Note
This implementation is **not thread-safe**. For multithreaded applications, additional synchronization or using `enum` Singleton is recommended.


