package com.ApiScenarios;

import org.testng.annotations.Test;

import com.TestPojo.AuthenticationTest;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

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
 * POJO----->JSON = Serialization
 * JSON ---->Pojo = deserialization
 * 
 */
public class SerializationDeserializationTest {
  @Test
  public void testSerialization() throws JsonProcessingException
  {
	  //pojo
	  AuthenticationTest auth=new AuthenticationTest();
	  auth.setUsername("admin");
	  auth.setPassword("password123");
	  
	  //json
	  ObjectMapper obj=new ObjectMapper();
	  
	  String json=obj.writerWithDefaultPrettyPrinter().writeValueAsString(auth);
	  
	  System.out.println(json);
	  
	  
	  
	
	
	  
  }
  
  
  @Test
  public void testDeserialization() throws JsonMappingException, JsonProcessingException
  {
	  
	  //json--->pojo
	  String json="{\n"
	  		+ "  \"username\" : \"admin\",\n"
	  		+ "  \"password\" : \"password123\"\n"
	  		+ "}";
	  
	  //pojo
	  ObjectMapper obj=new ObjectMapper();
	  
	  AuthenticationTest pojo=obj.readValue(json,AuthenticationTest.class);
	  
	  System.out.println(pojo.getUsername());
	  System.out.println(pojo.getPassword());
	  
	  
	  
	  
	  
	  
  }
}
