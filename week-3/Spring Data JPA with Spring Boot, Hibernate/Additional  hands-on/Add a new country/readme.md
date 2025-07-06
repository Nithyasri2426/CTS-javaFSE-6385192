Add a New Country — Spring Data JPA
This functionality allows adding a new country record to the database using Spring Data JPA's save() method inside a service annotated with @Transactional.

✅ Objective
Create a new method in CountryService to add a country.
Use JpaRepository.save() to persist the entity.
Test the addition from OrmLearnApplication.java.
Verify persistence using findCountryByCode() and database query.

📁 File/Package Changes
1. CountryService.java
Create a new method:
@Transactional
public void addCountry(Country country)

2. OrmLearnApplication.java
Create a new test method testAddCountry() that:
Creates a Country instance with a unique code and name.
Calls countryService.addCountry(...).
Retrieves the country using findCountryByCode(...).
Logs the output to verify insertion.

🧪 Testing Steps
Run the main() method in OrmLearnApplication.java.
Observe the logs for confirmation of addition.
Manually verify in MySQL:
SELECT * FROM country WHERE co_code = 'XX';

⚙️ Technical Notes
The method is annotated with @Transactional to allow Spring to manage the persistence context and commit the insert operation.
Using JpaRepository.save() simplifies the need for manually handling the session or transaction.
If a country with the same code already exists, it will be updated instead of inserted.

💡 Example Scenario
Adding:
Code: JP
Name: Japan
Expected SQL (via Hibernate):
insert into country (co_name, co_code) values ('Japan', 'JP');
