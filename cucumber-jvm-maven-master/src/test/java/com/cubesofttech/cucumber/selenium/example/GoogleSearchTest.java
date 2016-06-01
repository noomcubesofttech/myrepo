package com.cubesofttech.cucumber.selenium.example;

//import cucumber.junit.Cucumber;
//import org.junit.runner.RunWith;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(format = {"pretty", "html:target/cucumber", "json:target/cucumbergoogle.json"},
                 features = "classpath:cucumber3/GoogleSearch.feature"		
)
public class GoogleSearchTest {
	
	
}
