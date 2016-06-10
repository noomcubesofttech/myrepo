package com.cubesofttech.bdd.seleniumcucumber;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SeleniumCucumberSteps {

	WebDriver driver;
	
	@Before
	public void beforeTest() {
		driver = new FirefoxDriver();
	}

	@Given("^the ParaBank home page is displayed$")
	public void theParaBankHomepageIsDisplayed() {

		driver.get("http://parabank.parasoft.com");
	}

	@When("^user \"(.*)\" logs in using password \"(.*)\"$")
	public void userJohnLogsInUsingPasswordDemo(String username, String password) {

		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.cssSelector("input[value='Log In']")).click();
		
	}

	@Then("^the login is successful$")
	public void theLoginIsSuccessful() {
		Assert.assertEquals("ParaBank | Accounts Overview",driver.getTitle());
	}
	
	@After
	public void afterTest() {
		driver.quit();
	}

}