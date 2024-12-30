package com.RestAPITest;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class TestJsonValidation {
  @Test
  public void valiadteSingleUSerStatus() 
  {
	  Response res=RestAssured.get("https://reqres.in/api/users/2");
	  
	  int statuscode=res.getStatusCode();
	  Assert.assertEquals(statuscode,200,"status code is not matched!");
	  System.out.println("Status code is matched!");
	  
	    
	  
  }
  
  
  
  @Test 
  public void validateJsonFields()
  {
	  Response res=RestAssured.get("https://reqres.in/api/users/2");
	  
	  //to validate json field-jsonPath()
	  int id=res.jsonPath().getInt("data.id");
	  Assert.assertEquals(id,2);
	  System.out.println("User id is: "+id);
	  
	  String email=res.jsonPath().getString("data.email");
	  Assert.assertEquals(email,"janet.weaver@reqres.in");
	  
	  Assert.assertTrue(email.endsWith("reqres.in"));
	  
	  Assert.assertTrue(email.startsWith("janet"));
	  System.out.println("Email matched!");
	  
	  JsonPath path=res.jsonPath();
	  String firstname=path.getString("data.first_name");
	  String lastname=path.getString("data.last_name");
	  
	  System.out.println("Firstname:"+firstname);
	  System.out.println("Lastname: "+lastname);
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
