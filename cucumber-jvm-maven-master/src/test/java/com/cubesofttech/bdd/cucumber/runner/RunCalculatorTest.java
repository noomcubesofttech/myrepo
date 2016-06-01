package com.cubesofttech.bdd.cucumber.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        format = { "pretty", "html:target/cucumber", "json:target/cucumber/report.json", "junit:target/cucumber/junit.xml" },
        features = "classpath:cucumber/calculator.feature"
)
public class RunCalculatorTest {
}
