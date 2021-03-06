package com.cubesofttech.bdd.cucumber.steps;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import com.cubesofttech.bdd.cucumber.calculator.Calculator;
import com.cubesofttech.bdd.cucumber.calculator.ScienceCalculator;

public class CalculatorSteps {

    private Calculator calculator;
    private ScienceCalculator sciencecalculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
        sciencecalculator = new ScienceCalculator();
        
    }

    @Given("^I have a calculator$")
    public void i_have_a_calculator() throws Throwable {
        assertNotNull(calculator);
    }

    @When("^I add (\\d+) and (\\d+)$")
    public void i_add_and(double arg1, double arg2) throws Throwable {
        calculator.add(arg1, arg2);
    }
    
    @When("^I minus (\\d+) and (\\d+)$")
    public void i_minus_and(double arg1, double arg2) throws Throwable {
        calculator.minus(arg1, arg2);
    }
    
    @When("^I multiply (\\d+) and (\\d+)$")
    public void i_multiply_and(double arg1, double arg2) throws Throwable {
        calculator.multiply(arg1, arg2);
    }
    
    @When("^I divide (\\d+) and (\\d+)$")
    public void i_division_and(double arg1, double arg2) throws Throwable {
        calculator.division(arg1, arg2);
    }

    @Then("^the result1 should be (\\d+)$")
    public void the_result1_should_be(double result) throws Throwable {
        assertEquals(result, calculator.getResult1(),0);
    }
    
    @Then("^the result2 should be (\\d+)$")
    public void the_result2_should_be(double result) throws Throwable {
        assertEquals(result, calculator.getResult2(),0);
    }
    
    @Then("^the result3 should be (\\d+)$")
    public void the_result3_should_be(double result) throws Throwable {
        assertEquals(result, calculator.getResult3(),0);
    }
    
    @Then("^the result4 should be (\\d+)$")
    public void the_result4_should_be(double result) throws Throwable {
        assertEquals(result, calculator.getResult4(),0);
    }
    
    @Given("^I have a science calculator$")
    public void i_have_a_sciencecalculator() throws Throwable {
        assertNotNull(sciencecalculator);
    }
    
    
    @When("^(\\d+) power (\\d+)$")
    public void i_power_and(int arg1, int arg2) throws Throwable {
        sciencecalculator.power(arg1, arg2);
    }
    
    @Then("^the result5 should be (\\d+)$")
    public void the_result5_should_be(int result) throws Throwable {
        assertEquals(result, sciencecalculator.getResult(),0);
    }
}
