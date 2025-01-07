package com.ApiScenarios;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.TestPojo.*;


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
public class HotelAPIChaining 
{
	int id;
	String tokenvalue;
	
  @Test(priority=1)
  public void createNewBooking()
  {
	  //request payload
	  BookingDates date=new BookingDates();
	  date.setCheckin("2024-12-30");
	  date.setCheckout("2024-12-31");
	  
	  BookingDetails data=new BookingDetails();
	  data.setFirstname("Priyanka");
	  data.setLastname("Nigade");
	  data.setTotalprice(99999);
	  data.setDepositpaid(true);
	  data.setBookingdates(date);
	  data.setAdditionalneeds("Dinner");
	  
	  
	 Response res=given()
	  .header("Content-Type","application/json")
	  .body(data)
	  
	  .when().post("https://restful-booker.herokuapp.com/booking");
	  
	 //log
	 //res.then().log().all();
	 
	 //log 
	 res.then().log().body();
	 
	 //get the booking id
	 id=res.jsonPath().getInt("bookingid"); 
	 System.out.println("Booking ctreated with id: "+id);
	 
	 
  }
  
  
  @Test(priority=2)
  public void getBookingDetials()
  {
	  
	  System.out.println("Details for the same user using id: "+id);
	  Response res=given()
	  
	  .when().get("https://restful-booker.herokuapp.com/booking/"+id);
	  
	  
	  //log
	  res.then().log().body();
	  
	  

  }
  
  @Test(priority=3)
  public void createToken()
  {
	  //request payload
	  AuthenticationTest auth=new AuthenticationTest ();
//	  auth.setUsername("admin");
//	  auth.setPassword("password123");
	  
	  Response res=given()
	  .header("Content-Type","application/json")
	  .body(auth)
	  .when().post("https://restful-booker.herokuapp.com/auth");
	 
	  //log
	  res.then().log().body();
	  
	  //get the token
	  
	  tokenvalue=res.jsonPath().getString("token");
	  System.out.println("Token created: "+tokenvalue);
	  
  }
  
  @Test(priority=4)
  public void fullBookingUpdate()
  {
	  
	  
	  BookingDates date=new BookingDates();
	  date.setCheckin("2024-12-31");
	  date.setCheckout("2025-01-01");
	  
	  BookingDetails data=new BookingDetails();
	  data.setFirstname("Piyu");
	  data.setLastname("Nigade");
	  data.setTotalprice(10000);
	  data.setDepositpaid(true);
	  data.setBookingdates(date);
	  data.setAdditionalneeds("lunch");
	  
	  Response res=given()
	  .header("Content-Type","application/json")
	  .header("Accept","application/json")
	  .header("Cookie","token="+tokenvalue)
	  .body(data)
	  
	  .when().put("https://restful-booker.herokuapp.com/booking/"+id);
	  
	  //log
	  res.then().log().body();
	  
	  
	  
	  Assert.assertEquals(res.getStatusCode(),200);
	  System.out.println("Status code match: "+res.getStatusCode());
	  
	  System.out.println("Booking updated with id: "+id+" and token: "+tokenvalue);
	  
	  
  }
  
  
  
  
  
  
  
  
  
  
  
  
}
