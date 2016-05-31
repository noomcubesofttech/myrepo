package net.serenity_bdd.samples.etsy.features;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        format = { "pretty", "html:target/cucumber", "json:target/cucumber/report2.json", "junit:target/cucumber/junit2.xml" },
        glue = "net.serenity_bdd.samples.esty.features.steps",
        features = "classpath:features/search/search_by_keyword.feature"
)

public class AcceptanceTests {}
