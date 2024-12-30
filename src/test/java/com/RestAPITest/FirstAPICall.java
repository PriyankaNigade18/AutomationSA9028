package com.RestAPITest;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class FirstAPICall 
{
	/*
	 * Ways
	 * =====
	 * 1.NoBDD
	 * 2.Using BDD(more readable)
	 */
  @Test
  public void singleUSerTest()
  {
	 Response res= RestAssured.get("https://reqres.in/api/users/2");
	  
	 System.out.println("Status code: "+res.getStatusCode());
	 
	 System.out.println("Respose statusline: "+res.getStatusLine());
	 
	 System.out.println("Raw type result: "+res.asString());
	 
	 System.out.println("Preety result: "+res.asPrettyString());
	 
	 System.out.println("Response time: "+res.getTime());
	 
	 System.out.println("Repsonse time in ms: "+res.getTimeIn(TimeUnit.MILLISECONDS));
	 
	 System.out.println("Header content type: "+res.getContentType());
	 
	  
	  
	  
	  
  }
}
