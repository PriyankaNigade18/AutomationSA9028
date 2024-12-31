package com.ApiScenarios;

import org.testng.Assert;
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

public class CookiesHeadersValidation {
  @Test(priority=1)
  public void testHeaders() 
  {
	  
	  Response res=given()
			  .when().get("https://www.google.com/");
	  
	  //get all headers
	  res.then().log().headers();
	  
	  //validate header
	  String expValue="text/html; charset=ISO-8859-1";
	 String actHeader= res.getHeader("Content-Type");
	 
	 Assert.assertEquals(actHeader,expValue);
	 System.out.println("Headers value is matched: "+actHeader);
	  
	  	  
	  
  }
  
  
  @Test
  public void validateCookies()
  {
	  /*
	   * Cookies values are always dynamic
	   * 
	   */
	  Response res=given()
			  .when().get("https://www.google.com/");
	  
	  //get the all cookies
	  res.then().log().cookies();
	  
	  //validate any cookies- two cookies values should not be same
	  
	  String actCookie=res.getCookie("AEC");
	  String cookieValue="IrqmfIPQMrHFMul9MHTYy";
	  
	  Assert.assertFalse(actCookie.contains(cookieValue));
	  System.out.println("Test Pass: As cookie value is dynamic");
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
