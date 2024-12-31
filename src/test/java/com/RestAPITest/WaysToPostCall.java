package com.RestAPITest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.TestPojo.AuthenticationTest;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
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
public class WaysToPostCall
{
  @Test(enabled=false)
  public void createBasicPost()
  {
	 Response res= given()
			 .header("Content-Type","application/json")
			 .body("{\n"
	  		+ "    \"username\" : \"admin\",\n"
	  		+ "    \"password\" : \"password123\"\n"
	  		+ "}")
	  
	  .when().post("https://restful-booker.herokuapp.com/auth");
	 
	 //log()- to log all response
	 //res.then().log().all();
	 
	 //log()- only header
	 //res.then().log().headers();
	 
	 //log()--only body
	 res.then().log().body();
	 
	 //status code should be 200
	 int code=res.getStatusCode();
	 Assert.assertEquals(code, 200);
	 System.out.println("Status code is matched: "+code);
	 
	 //validate json
	 String tokenvalue=res.jsonPath().getString("token");
	 System.out.println("Token generated: "+tokenvalue);
	 
	   }
  
  
  
  @Test(enabled=false)
  public void createPostUsingHashMap()
  {
	  //Request payload
	  HashMap<String,Object> map=new HashMap<String,Object>();
	  map.put("username","admin");
	  map.put("password","password123");
	  
	  Response res=given()
			  	.header("Content-Type","application/json")
			  	.body(map)
	  
			  	.when().post("https://restful-booker.herokuapp.com/auth");
	  
	  //log
	  res.then().log().body();
	  
	  //status code
	  Assert.assertEquals(res.getStatusCode(),200);
	  System.out.println("Status code is: "+res.getStatusCode());
	  
	  //jsonpath
	  String tokenvalue=res.jsonPath().getString("token");
	  System.out.println("Token generated: "+tokenvalue);
	  
	  
	  
	  
	  
	  
  }
  
  @Test
  public void createPostUsingPOJO()
  {
	  
	  //Request Payload
	  AuthenticationTest auth=new AuthenticationTest();
	  auth.setUsername("admin");
	  auth.setPassword("password123");
	  
	  Response res=given()
	  .header("Content-Type","application/json")
	  .body(auth)
	  
	  .when().post("https://restful-booker.herokuapp.com/auth");
	  
	  
	  //log
	  res.then().log().all();
	  
	  //token
	  String tokenvalue=res.jsonPath().getString("token");
	  System.out.println("Token generated: "+tokenvalue);
	  
	  
	  
	  
	  
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}
