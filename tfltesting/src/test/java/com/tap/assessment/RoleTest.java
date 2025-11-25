package com.tap.assessment;

import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.not;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;

public class RoleTest {
    
      @BeforeClass
    public void setup(){
       
            RestAssured.baseURI="http://localhost:5238";



    }

    @Test

    public void testGetAllRoles(){
        given()
        .when()
            .get("/api/role/roles")

         .then()   
         .statusCode(200)
         .body("$",not (empty()));
            
    }

    

}
