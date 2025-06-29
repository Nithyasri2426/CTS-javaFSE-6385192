PL/SQL Control Structures Exercises
This repository contains PL/SQL control structure exercises implemented in the context of a banking system. Each scenario addresses a real-world problem using basic PL/SQL constructs such as loops and conditionals.

📁 Contents
Scenario 1: Apply discount to loan interest rates for senior customers

Scenario 2: Promote customers to VIP based on account balance

Scenario 3: Send reminders for upcoming loan due dates


💼 Scenario Descriptions
🧓 Scenario 1: Interest Discount for Senior Customers
Objective:
Loop through all customers and apply a 1% discount to their loan interest rate if they are older than 60 years.


💰 Scenario 2: Promote to VIP Based on Balance
Objective:
Check each customer's account balance and set their IsVIP status to TRUE if their balance exceeds $10,000.


⏰ Scenario 3: Loan Due Reminder
Objective:
Fetch loans that are due within the next 30 days and print a reminder message for each associated customer.


📝 Notes
These exercises assume the presence of customers and loans tables in the database.

You may need to adjust table/column names based on your schema.

Ensure DBMS_OUTPUT is enabled in your PL/SQL environment to view printed output (e.g., reminders).

