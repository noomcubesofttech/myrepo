package com.cubesofttech.bdd.seleniumcucumber;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
//@CucumberOptions(format = "pretty")
@CucumberOptions(
        format = { "pretty", "html:target/cucumber", "json:target/cucumber/report3.json", "junit:target/cucumber/junit3.xml" },
        features = "classpath:cucumber2/login.feature"
)
public class SeleniumCucumberTest {
	
}