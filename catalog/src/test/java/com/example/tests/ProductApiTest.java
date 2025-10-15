package com.example.tests;



import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.notNullValue;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;
import io.restassured.http.ContentType;

public class ProductApiTest {

    @Test
    public void testGetAllProducts() {
        RestAssured.baseURI = "http://localhost:8080";

        given()
            .when().get("/api/products")
            .then()
            .statusCode(200)
            .body("size()", greaterThan(0))
            .body("[0].name", notNullValue());
    }


     @Test
    public void getProductById_shouldReturnOne() {
        RestAssured.baseURI = "http://localhost:8080";
        given()
        .when()
            .get("/api/products/1")
        .then()
            .statusCode(200);

    }
 
    @Test
    public void createProduct_shouldReturn201() {
        RestAssured.baseURI = "http://localhost:8080";
        String newProductJson = """
        {
            "id" :4,
            "name": "Wireless Mouse",
            "price": 1500
        }
        """;

        given()
            .contentType(ContentType.JSON)
            .body(newProductJson)
        .when()
            .post("/api/products")
        .then()
            .statusCode(200) // Created
            .body("id", notNullValue())
            .body("name", equalTo("Wireless Mouse"))
            .body("price", equalTo(1500.0F));
    }

    @Test
    public void updateProduct_shouldReturn200() {
        RestAssured.baseURI = "http://localhost:8080";
        String updatedProductJson = """
        {
            "id": 1,
            "name": "Dell",
            "price": 19000.0
        }
        """;

        given()
            .contentType(ContentType.JSON)
            .body(updatedProductJson)
        .when()
            .put("/api/products/1")
        .then()
            .statusCode(200)
            .body("name", equalTo("Dell"))
            .body("price", equalTo(19000.0F));
    }

    // @Test
    // public void deleteProduct_shouldReturn204() {
    //     RestAssured.baseURI = "http://localhost:9090";
    //     given()
    //     .when()
    //         .delete("/api/products/1")
    //     .then()
    //         .statusCode(204); // No Content
    // }

}