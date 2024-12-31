package com.RestAPITest;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.List;
/*
 * given(): Prerequisite
 * ==============
 * headers,cookies,path parameter,query parameter,authentication,request payload
 * 
 * when():Api Call/Request type
 * =============
 * GET,POST,PUT,PATCH,DELETE
 * 
 * then():Validate response
 * ===================
 * status code, message,time,Response payload,headers,cookies
 * 
 * 
 * 
 */
public class APITestUsingBDD {
  @Test
  public void getSingleUser() 
  {
	 
	  
	  
	  given()
	  
	  .when()
	  	.get("https://reqres.in/api/users/2")
	  	.then()
	  	.statusCode(200)
	  	.log().all();
	  
	  
	
  }
  
  
  @Test
  public void validateSingleUser()
  {
	 Response res= given()
			 		.when().get("https://reqres.in/api/users/2");
	 
	 //validation-status code
	 int code=res.getStatusCode();
	 Assert.assertEquals(code,200);
	 System.out.println("Status code is: "+code);
	 
	 //validation -json field
	 
	 String exp="Caddy generate";
	String text= res.jsonPath().getString("support.text");
	 Assert.assertTrue(text.contains(exp));
	 System.out.println("Text is matched!");
	 
	 
	 
	 
	 
	 
  }
  
  @Test
  public void validateListOfUsers()
  {
	  
	  Response res=given()
			  			.when().get("https://reqres.in/api/users?page=2");
	  
	  
	  //validate id should be 8
	  JsonPath json=res.jsonPath();	
	  int id=json.getInt("data[1].id");
	  Assert.assertEquals(id,8);
	  System.out.println("Id is: "+id);
	  
	  
	  //all ids from list
	  
	  List<Integer> allIds=json.getList("data.id");
	  System.out.println("Total ids are: "+allIds.size());
	  
	  Assert.assertTrue(allIds.size()==6);
	  System.out.println("Id count matched!");
	  
	  for(Integer i:allIds)
	  {
		  System.out.println(i);
	  }
	  
	  
	  //response with then()
	  res.then().log().all();
	  
	  res.then().statusCode(200);
	  
	  
	  
	  
	  
	  
	  
	  
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}
