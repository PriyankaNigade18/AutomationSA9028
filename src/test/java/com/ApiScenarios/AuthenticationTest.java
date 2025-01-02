package com.ApiScenarios;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;


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
public class AuthenticationTest {
  @Test(priority=1)
  public void basicAuthentication()
  {
	  /*
	   * Base 64 algorithm
	   */
	  
	  System.out.println("Basic authentication validation!");
	  
	  Response res=given()
			  .auth().basic("postman","password")
			  .when().get("https://postman-echo.com/basic-auth");
	  
	  //log the result
	  res.then().log().body();
	  
	  Assert.assertEquals(res.getStatusCode(),200);
	  System.out.println("Status code: "+res.getStatusCode());
	  
	  //json
	  boolean status=res.jsonPath().getBoolean("authenticated");
	  System.out.println("Basic authentication status is: "+status);
	  
  }
  @Test(priority=2)
  public void testDigestAuth()
  {
	  //algorithm MD5 /SHA
	  System.out.println("Digest Authentication validation!");
	  
	  Response res=given()
			  .auth().digest("postman","password")
	  
			  .when().get("https://postman-echo.com/digest-auth");
	  
	  //geth the log
	  res.then().log().body();
	  
	 
	  
  }
  
  @Test(priority=3)
  public void bearerTokenTEst()
  {
	  System.out.println("Bearer Token validation!");
	  
	  Response res=given()
	  .header("Authorization","Bearer 1234")
	  
	  .when().get("https://postman-echo.com");
	  
	  
	  //get the log
	  res.then().log().body();
	  
	  
	  
	  
	  
	  
	  
  }
  
  
//  @Test
//  public void testBearerforGithub()
//  {
//	  String token="gittesttoken_pat_";
//	  
//	  Response res=given()
//	  .header("Authorization","Bearer "+token)
//	  
//	  .when().get("https://api.github.com/user/repos");
//	  
//	  //get the log
//	  res.then().log().body();
//	  
//  }
  
  @Test
  public void OAuth2Test()
  {
	  Response res=given()
	  .auth().oauth2("18SA9028")
	  
	  .when().get("https://postman-echo.com");
	  
	  //get the log
	  
	  res.then().log().body();
	  
	  
	  
	  
	  
	  
	  
  }
  
  
}
