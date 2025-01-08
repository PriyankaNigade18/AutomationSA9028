package com.TestApplicationScenarios;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.Generic.DriverUtil;
import com.Generic.Utility;
import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class ScrollGestureTest {
  @Test
  public void testGesture() 
  {
	  //create driver session
	  AppiumDriver driver=DriverUtil.initDriver();
	    
	  //view
	  driver.findElement(AppiumBy.accessibilityId("Views")).click();
	  
	  //area
	  WebElement area=driver.findElement(AppiumBy.id("android:id/list"));
	  
	  
	  //Utility.scrollDown(driver,area);
	  
	  Utility.scrollUpToTheCount(driver, area, 3);
	  
	  
	  /*
	  //scroll
	  driver.executeScript("mobile: scrollGesture",ImmutableMap.of(
			  
			  "elementId",((RemoteWebElement)area).getId(),
			  "direction","down",
			  "percent",1.0//100% area it will cover
			  
			  ));
	  
	  System.out.println("Scroll down process is completed!");
	  */
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
