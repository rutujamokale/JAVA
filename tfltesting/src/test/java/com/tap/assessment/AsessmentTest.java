package com.tap.assessment;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
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

    @Test
    public void testGetAllAssessmentByDate(){
        given()

        .when()
                .get("/api/assessment/creationdate/fromDate/2023-12-05/toDate/2025-02-07")
        .then()
        .statusCode(200)
        
        .body("$",notNullValue());


        
    }
    @Test

    public void testGetAllEmployee(){
        given()
        .when()
            .get("/api/assessment/employees")
        .then()
        .statusCode(200)
        . body("$",notNullValue());   
    }

}
