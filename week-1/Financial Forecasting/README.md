# FinancialForecasting

## 💼 Overview

This project demonstrates how **recursive algorithms** can be applied to **financial forecasting** by predicting future values based on historical data and a consistent growth rate. It also highlights the importance of understanding **time complexity** and recursive optimization techniques.

---

## 🎯 Objective

- Use **recursion** to forecast future financial values
- Analyze the **efficiency** of recursive methods
- Demonstrate ways to **optimize** recursive computations for scalability

---

## 🔁 What is Recursion?

Recursion is a programming technique where a method calls itself to solve smaller instances of a problem until it reaches a base case.

Example:  
Forecasting future value recursively:
FutureValue(n) = FutureValue(n-1) * (1 + growthRate)

---

## 🗂️ Project Structure

FinancialForecasting/
│
├── FinancialForecast.java // Core recursive logic
├── ForecastTest.java // Test class to run and evaluate forecasting


---

## ⚙️ How It Works

1. **Input:** Initial amount, growth rate, and number of years
2. **Recursive Method:** Predicts value at year `n` using:
futureValue(year) = futureValue(year - 1) * (1 + rate)

3. **Base Case:** Year 0 returns the initial value

---

## 🔍 Time Complexity

- **Recursive Approach (without memoization):**  
`O(n)` time and `O(n)` space due to call stack
- **Optimized Approach (with memoization or iteration):**  
`O(n)` time and `O(1)` space

---

## 🧪 Example

```java
Initial value: $1000  
Annual growth rate: 5%  
Years: 5  

Output:
Year 0: $1000.00
Year 1: $1050.00
Year 2: $1102.50
Year 3: $1157.63
Year 4: $1215.51
Year 5: $1276.28

🚀 How to Run
Clone or download the project

Open in an IDE (e.g., IntelliJ or Eclipse)

Compile and run ForecastTest.java

💡 Optimization Tips
Use memoization to cache previously computed results

Alternatively, use an iterative loop to avoid stack overflow in large inputs

📚 Topics Covered
Recursion in Java

Financial modeling

Time complexity analysis

Optimization of recursive functions.
