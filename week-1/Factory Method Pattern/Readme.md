# FactoryMethodPatternExample

## 📘 Overview

This project demonstrates the **Factory Method Design Pattern** in Java using a document management system scenario. The system supports the creation of various document types such as Word, PDF, and Excel. The Factory Method Pattern is used to encapsulate the instantiation logic of these document objects, promoting flexibility and scalability.

---

## 🧱 Project Structure
FactoryMethodPatternExample/
│
├── src/
│ ├── Document.java // Abstract or Interface for documents
│ ├── WordDocument.java // Concrete Word document
│ ├── PdfDocument.java // Concrete PDF document
│ ├── ExcelDocument.java // Concrete Excel document
│
│ ├── DocumentFactory.java // Abstract Factory
│ ├── WordDocumentFactory.java // Concrete Factory for Word
│ ├── PdfDocumentFactory.java // Concrete Factory for PDF
│ ├── ExcelDocumentFactory.java // Concrete Factory for Excel
│
│ └── FactoryTest.java // Test class


---

## ⚙️ Design Pattern Used

### 🏭 Factory Method Pattern
- **Problem Solved:** Creating document objects without exposing the instantiation logic to the client.
- **Benefit:** Allows adding new document types with minimal changes to existing code.

---

## 🧩 Components

### 🧾 Document Interface (or Abstract Class)
Defines the common structure or behavior for all document types.

### 🧾 Concrete Documents
- `WordDocument.java`
- `PdfDocument.java`
- `ExcelDocument.java`

Each class implements the `Document` interface with specific behavior.

### 🏗️ Abstract Factory: `DocumentFactory`
Defines the `createDocument()` method that subclasses must implement.

### 🏭 Concrete Factories
- `WordDocumentFactory.java`
- `PdfDocumentFactory.java`
- `ExcelDocumentFactory.java`

Each factory creates a specific type of document.

---

## 🧪 How to Run

1. Clone or download the project.
2. Open it in a Java IDE (like IntelliJ or Eclipse).
3. Compile and run the `FactoryTest.java` class.

---

## 💡 Example Output
Creating Word Document...
Opening Word document...

Creating PDF Document...
Opening PDF document...

Creating Excel Document...
Opening Excel document...


---

## 🚀 Extending the System

To add a new document type (e.g., `TextDocument`):
1. Create a `TextDocument` class implementing `Document`.
2. Create `TextDocumentFactory` extending `DocumentFactory`.
3. Use the new factory in your test or application code.

---

## 📚 Concepts Covered

- Factory Method Design Pattern
- Abstraction and Polymorphism
- Encapsulation of Object Creation

---

## 🏷️ Tags

`#FactoryMethod` `#JavaDesignPatterns` `#OOP` `#DocumentSystem`

---




