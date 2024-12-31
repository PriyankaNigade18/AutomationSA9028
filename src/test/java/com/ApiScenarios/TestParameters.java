package com.ApiScenarios;

import org.testng.annotations.Test;

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
public class TestParameters {
  @Test
  public void setQueryPathParam()
  {
	  //https://api.restful-api.dev/objects?id=3&id=5&id=10
	  
	  Response res=given()
	  .pathParam("path","/objects")
	  .queryParam("id",3)
	  .queryParam("id",5)
	  .queryParam("id",10)
	  
	  .when().get("https://api.restful-api.dev/{path}");
	  
	  //log the result
	  res.then().log().body();
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
