Find Country by Country Code - Spring Data JPA
This module demonstrates how to use Spring Data JPA to retrieve a Country entity by its country code. It includes custom exception handling and explains how Spring manages transactions using @Transactional

📦 Feature Overview
1.Retrieve a country based on its primary key (country code).
2.Use of Optional<T> with findById().
3.Custom exception handling when a country is not found.
4.Use of @Transactional to ensure proper session and transaction management.

📁 Project Structure
com.cognizant.ormlearn
│
├── model
│   └── Country.java
│
├── repository
│   └── CountryRepository.java
│
├── service
│   └── CountryService.java
│
├── service.exception
│   └── CountryNotFoundException.java
│
└── OrmLearnApplication.java

🔄 Steps Implemented
1. Create a Custom Exception
CountryNotFoundException is created in the service.exception package to handle invalid country codes.
public class CountryNotFoundException extends Exception {
    public CountryNotFoundException(String message) {
        super(message);
    }
}

2. Update the CountryService
A new method findCountryByCode(String countryCode) is added.
Annotated with @Transactional to let Spring manage the transaction lifecycle.
Uses Optional to avoid NullPointerException and make code more expressive.
Throws CountryNotFoundException if the country is not found.

3. Test the Method in Main Class
In OrmLearnApplication.java, the testGetCountryByCode() method is added to validate the feature. It logs the result of searching for a country with code "IN".

🧠 Concept Highlight: @Transactional
The @Transactional annotation indicates that the method should be executed within a transactional context.
Spring manages the Hibernate session, opens and closes connections, and commits or rolls back the transaction based on success or failure.
It simplifies database logic and ensures data integrity.

✅ How to Run the Test
Ensure the database contains the country with code 'IN'.
Run the OrmLearnApplication class.

Observe logs for:
*Start of method
*Country details fetched
*End of method

Example Output
INFO  Start
DEBUG Country: Country(code=IN, name=India)
INFO  End

