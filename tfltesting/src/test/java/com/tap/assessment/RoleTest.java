package com.tap.assessment;



import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;
import io.restassured.http.ContentType;

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

    @Test

public void testGetUserByRole() {
    given()
        .queryParam("roleIds", 1)
        .queryParam("roleIds", 2)
    .when()
        .get("/api/role/users")
    .then()
        .statusCode(anyOf(is(200), is(400), is(404)));
}

   @Test
    public void testAddNewRole(){
        
    String requestBody = "{\n" +
                "    \"id\":4,\n" +
                "    \"name\":\"mentor\",\n" +
                "    \"lob\":\"teaching\"\n" +
                "}";
                      
                given()
                .contentType(ContentType.JSON)  
                .body(requestBody)  
                
                .when()
                    .post("/api/role/roles")

                    .then()     
                     .statusCode(anyOf(is(200), is(404)));

}
@Test

public void testRemoveExitingRole(){

    int roleIdToDelete=5;
    given()
    .when()
        .delete("/api/role/roles/" +roleIdToDelete)   
        
        .then()
        .statusCode(200) ;



}



}
