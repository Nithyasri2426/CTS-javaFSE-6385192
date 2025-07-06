package com.cognizant.ormlearn;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.service.CountryService;
import com.cognizant.ormlearn.service.exception.CountryNotFoundException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class OrmLearnApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);
    private static CountryService countryService;

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);
        countryService = context.getBean(CountryService.class);

        try {
            testAddCountry();
        } catch (CountryNotFoundException e) {
            LOGGER.error("Exception: {}", e.getMessage());
        }
    }

    private static void testAddCountry() throws CountryNotFoundException {
        LOGGER.info("Start testAddCountry");

        // Step 1: Create a new country
        Country newCountry = new Country();
        newCountry.setCode("JP");
        newCountry.setName("Japan");

        // Step 2: Add the country
        countryService.addCountry(newCountry);

        // Step 3: Fetch and verify
        Country retrievedCountry = countryService.findCountryByCode("JP");
        LOGGER.debug("Added Country: {}", retrievedCountry);

        LOGGER.info("End testAddCountry");
    }
}
