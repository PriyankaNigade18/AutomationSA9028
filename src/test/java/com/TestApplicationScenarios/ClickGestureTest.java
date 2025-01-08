package com.TestApplicationScenarios;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.Generic.DriverUtil;
import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class ClickGestureTest {
  @Test
  public void testClickGesture()
  {
	  
	  //create driver session
	  
	 AppiumDriver driver= DriverUtil.initDriver();
	 
	 //click on Views
	 
	 WebElement expEle=driver.findElement(AppiumBy.accessibilityId("Views"));
	 
	 //ele.click();
	 
	 //Gesture
	 driver.executeScript("mobile: clickGesture",ImmutableMap.of(
			 
			 "elementId",((RemoteWebElement)expEle).getId()
			 
			 
			 ));
	 
	 System.out.println("Click gesture is Completed!");
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
