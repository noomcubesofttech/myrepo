package com.cubesofttech.bdd.seleniumcucumber;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
//@CucumberOptions(format = "pretty")
@CucumberOptions(
        format = { "pretty", "html:target/cucumber", "json:target/cucumber/reportgoogleweb.json", "junit:target/cucumber/junit3.xml" },
        glue = {"com.cubesofttech.bdd.seleniumcucumber"},
        features = "classpath:cucumber2/searchgoogle.feature"
)
public class SeleniumCucumberGoogleTest {
	
}