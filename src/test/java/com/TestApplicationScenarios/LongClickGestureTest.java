package com.TestApplicationScenarios;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.Generic.DriverUtil;
import com.Generic.Utility;
import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class LongClickGestureTest {
  @Test
  public void testLongClickGesture()
  {
	  //create driver session
	  AppiumDriver driver=DriverUtil.initDriver();
	  
	  //view
	  driver.findElement(AppiumBy.accessibilityId("Views")).click();
	  
	  Utility.getScreenshot(driver,"ViewPage");
	  
	  //drag n drop
	  driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();
	  
	  Utility.getScreenshot(driver,"Dotpage");
	  //dot 1
	  WebElement expEle=driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_dot_1"));
	  
	  //Long click
	  driver.executeScript("mobile: longClickGesture",ImmutableMap.of(
			  
			  "elementId",((RemoteWebElement)expEle).getId(),
			  "duration",4000
			    ));
	  
	  System.out.println("Long click Gesture is completed!");
	  
	  Utility.getScreenshot(driver,"dragPage");
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
