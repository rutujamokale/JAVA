package com.example.demo.Demo.stepdefs;
import static org.testng.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class CalculatorSteps {

    private int result;
    private int num1;
    private int num2;

    @Given("I have a calculator")
    public void i_have_a_calculator(){

    }
    @When("I add {int }  and {int }")
    public void i_add_and(Integer a,Integer b){
        num1=a;
        num2=b;
        result=num1+num2;
    }
    @Then("the result should be  {int}")
    public void the_result_should_be(Integer expected){
        assertEquals(result,expected.intValue(),"addition result mismatch");
    }
    
}
