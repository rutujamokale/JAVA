package com.transflower.statuscodeplayground.stepdefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static io.restassured.RestAssured.given;
import io.restassured.response.Response;

public class StatusSteps {

    private Response response;

    @When("I send GET request to {string}")
    public void iSendGetRequestTo(String path) {
        String url = "http://localhost:8080" + path;
         response = given().when().get(url);
    }

    @When("I send POST request to {string}")
    public void iSendPostRequestTo(String path) {
        String url = "http://localhost:8080"  + path;
        response = given().when().post(url);
    }

    @Then("the response status should be {int}")
    public void theResponseStatusShouldBe(int statusCode) {
        response.then().statusCode(statusCode);
    }

    // @And("the response should contain {string}")
    // public void theResponseShouldContain(String expectedText) {
    //     Assert.assertTrue(response.getBody().toLowerCase().contains(expectedText.toLowerCase()));
    // }
}
