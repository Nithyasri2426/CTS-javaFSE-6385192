# EcommerceSearchFunction

## 🔍 Overview

This project demonstrates the implementation and comparison of two fundamental search algorithms — **Linear Search** and **Binary Search** — in the context of an e-commerce platform. The goal is to optimize search performance for product data based on attributes like product ID, name, or category.

---

## 🎯 Objective

- Understand the performance of different search algorithms using **Big O notation**
- Implement and compare **Linear Search** and **Binary Search**
- Choose the most efficient algorithm for fast and scalable search on an e-commerce platform

---

## 📦 Features

- Java class `Product` to represent items with searchable attributes
- Implementation of both **linear** and **binary** search methods
- Example product data stored in arrays
- Performance and complexity analysis of each method

---

## 🧮 Asymptotic Notation & Analysis

### 📌 What is Big O Notation?
Big O notation is used to describe the **time complexity** of an algorithm — how its runtime grows as the input size increases.

### 🧾 Linear Search
- **Best Case:** O(1) → Target is at the start
- **Average Case:** O(n)
- **Worst Case:** O(n) → Target is at the end or not found

### 🧾 Binary Search
- **Best Case:** O(1) → Target is at the middle
- **Average/Worst Case:** O(log n)
- Requires the array to be **sorted**

---

## 🗂️ Project Structure
EcommerceSearchFunction/
│
├── Product.java // Class representing each product
├── SearchAlgorithms.java // Contains linear and binary search implementations
└── SearchTest.java // Test class for running and comparing the algorithms


---

## 💻 Example Product Attributes

```java
int productId;
String productName;
String category;

⚙️ How It Works
Products are stored in an array for linear search.

A sorted array is used for binary search (sorted by product ID or name).

SearchTest runs both algorithms and compares results and performance.

📊 Time Complexity Comparison
Algorithm	Best Case	Average Case	Worst Case	Sorted Required?
Linear Search	O(1)	O(n)	O(n)	No
Binary Search	O(1)	O(log n)	O(log n)	✅ Yes

🤔 Recommendation
For small data sets, linear search is simple and effective.
For large, sorted product catalogs, binary search is significantly faster and more scalable, making it ideal for e-commerce platforms with thousands of products.

🧪 How to Run
Open the project in an IDE (e.g., IntelliJ or Eclipse)

Compile all Java files

Run SearchTest.java to test and compare results

