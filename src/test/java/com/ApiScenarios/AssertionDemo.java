package com.ApiScenarios;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionDemo {
  @Test
  public void testAssertion()
  {
	  
	  String act="Selenium WebDriver is webui library";
	  String exp="webui";
	  
	  //exp string should be part of act string
//	  Assert.assertTrue(act.contains(exp),"Test Fail: exp string is not a part of actual");
//	  System.out.println("Test pass: exp string is part of actual");
//	  
	  
	  //exp string shoul not the part of actual string
	  Assert.assertFalse(act.contains(exp),"Test Fail: Exp string is a part of actual");
	  System.out.println("Test Pass: As exp string is not a part of actual");
	  
	  
	  
	  
	  
  }
  
}
