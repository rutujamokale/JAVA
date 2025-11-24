package com.tap.assessment;

import static org.hamcrest.Matchers.equalTo;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;

public class AsessmentTest {
    @BeforeClass
    public void setup(){
       
            RestAssured.baseURI="http://localhost:5238";



    }
    @Test

    public void testGetAssessmentDetails(){
        given()

       . when()
            .get("/api/assessment/1")
        .then()

        .statusCode(200)
        .body("id",equalTo(1));


    }
}
