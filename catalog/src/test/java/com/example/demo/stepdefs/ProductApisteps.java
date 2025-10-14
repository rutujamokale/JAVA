package com.example.demo.stepdefs;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.notNullValue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class ProductApisteps {

    private Response response;

    @Given("the product API is available")
    public void the_product_api_is_available(){
        RestAssured.baseURI="http://localhost:9090";
    }

    @When("I Get all products")
     public void i_get_all_products(){
        response=given().when().get("/api/products");
     }   
     @Then("the response status code should be{int}")
     public  void the_response_status_code_should_be(Integer statuscode){
        response.then().statusCode(statuscode);
     }
     @Then("the response should at least one product ")
    public void the_response_should_at_least_one_product(){
        response.then().body("size()",greaterThan(0))
                .body("[0].name",notNullValue());
    }
    @When("I POST a new product with id{int},name{string},price{int}")
    public void i_post_a_new_product(Integer id,String name,Integer price){
        String jsonBody=String.format("""
                {
                    "id":%d,
                    "name":%s,
                    "price":%d
        
                }
                """,id, name ,price);
            response=given()
                    .contentType(ContentType.JSON)
                    .body(jsonBody)
                    .when()
                    .post("/api/products");    
    } 

    @Then("the response product name should  be {string}")
    public void the_response_product_name_should_be(String expectedName){
        response.then().body("name",equalTo(expectedName));
    }
}
