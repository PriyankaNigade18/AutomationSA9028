package com.RestAPITest;

import java.util.HashMap;

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
public class Assignment2 
{
	/*
	 * { 
 
"name": "Apple MacBook Pro 16", 
"data": { 
"year": 2019, 
"price": 1849.99, 
"CPUmodel": "Intel Core i9", 
"Harddisksize": "1 TB" 
}
}
	 */
  @Test
  public void UsingHashmap()
  {
	  HashMap<String,Object> innerData=new HashMap<String,Object>();
	  innerData.put("year", 2019);
	  innerData.put("price", 1849.99);
	  innerData.put("CPUmodel","Intel core i9");
	  innerData.put("Harddisksixe","1TB");
	  
	  HashMap<String,Object> outerData=new HashMap<String,Object>();
	  outerData.put("name","Apple MacBook Pro 16");
	  outerData.put("data",innerData);
	  
	  Response res=given()
	  .header("Content-Type","application/json")
	  .body(outerData)
	  
	  .when().post("https://api.restful-api.dev/objects");
	  
	 //log
	  res.then().log().all();
	  
	  
	  
	  
	  
	  
	  
  }
}
