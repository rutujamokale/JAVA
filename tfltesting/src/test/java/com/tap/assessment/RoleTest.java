package com.tap.assessment;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.everyItem;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;


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
                .get("/api/role/users")
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
    public void testAddNewRole() {

        String requestBody = "{\n" +
                "  \"id\": 4,\n" +
                "  \"name\": \"mentor\",\n" +
                "  \"lob\": \"teaching\"\n" +
                "}";

        given()
            .contentType(ContentType.JSON)
            .body(requestBody)
        .when()
            .post("/api/role/roles")
        .then()
            .statusCode(anyOf(is(200), is(201))) 
            .body(equalTo("true")); 
    }
    

@Test
public void testRemoveExistingRole() {
    int roleId = 22;  
    Response response = 
        given()
            .when()
            .delete("/api/role/roles/" + roleId)
            .then()
            .extract()
            .response();
    int status = response.getStatusCode();
    if (status == 200) {
        System.out.println("Role deleted successfully.");
        Assert.assertEquals(status, 200);  
    } 
    else if (status == 404) {
        System.out.println("Role not found.");
        Assert.fail("Role ID " + roleId + " does not exist – TEST FAILED");  
    } 
    else {
        Assert.fail("Unexpected status: " + status); 
    }
}



}





