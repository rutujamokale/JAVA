package com.tap.assessment;





import java.io.File;

import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.CoreMatchers.everyItem;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.Matchers.notNullValue;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;
import io.restassured.http.ContentType;
import io.restassured.response.Response;


public class RoleTest {
    
      @BeforeClass
    public void setup(){
       
            RestAssured.baseURI="http://localhost:5238";



    }

    @Test

    public void testGetAllRoles(){
        ObjectMapper mapper=new ObjectMapper();
        List<Role> rolelist =new ArrayList<Role>();
        try{
            rolelist=mapper.readValue(new File("src/test/resource/role.json"),new TypeReference <List<Role>>(){});

        }catch(Exception e){
               e.printStackTrace();
        }
        for(Role r:rolelist){
            String roleJson = String.format(
                "{\n" +
                "    \"id\":\"%d\",\n" +
                "    \"name\":\"%s\",\n" +
                "    \"lob\":\"%s\"\n" +
                "}",
                r.getId(), r.getName(), r.getLob());
        
        given()
                    .contentType(ContentType.JSON)
        .when()
            .get("/api/role/roles")

         .then()  
        .statusCode(200)

        .body("$", not(empty()))      
            .body("id", everyItem(notNullValue()))
            .body("name", everyItem(notNullValue()))
            .log().all();     
            }   
    }



 @Test
    public void testGetUsersByRole() {
       
        Response response = given()
                .contentType(ContentType.JSON)
                  .queryParam("roleIds", 1) 
                
            .when()
                .get("http://localhost:5238/api/role/users")
            .then()
                .extract().response();  

        int statusCode = response.getStatusCode();

        if (statusCode == 200) {
         
            response.then()
                    .body("$", not(empty()))
                    .body("id", everyItem(notNullValue()))
                    .body("firstname", everyItem(notNullValue()))
                    .body("lastname", everyItem(notNullValue()));
            System.out.println("Users found for the roles: " + response.asString());
        } else if (statusCode == 400) {
            System.out.println("Bad request: No roleIds provided.");
        } else if (statusCode == 404) {
            System.out.println("No users found for the selected roles.");
        } else {
            System.out.println("Unexpected status code: " + statusCode);
        }
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

    int roleIdToDelete=9;
    given()
    .when()
        .delete("/api/role/roles/" +roleIdToDelete)   
        
        .then()
        .statusCode(200) ;



}



}
