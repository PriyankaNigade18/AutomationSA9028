package com.TestApplicationScenarios;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.Generic.DriverUtil;
import com.Generic.Utility;
import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class SwipeGestureTest {
  @Test
  public void testGesture()
  {
	  //create driver session
	  AppiumDriver driver=DriverUtil.initDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  //view
	  driver.findElement(AppiumBy.accessibilityId("Views")).click();
	  
	  //gallery
	  driver.findElement(AppiumBy.accessibilityId("Gallery")).click();
	  
	  //photos
	  driver.findElement(AppiumBy.accessibilityId("1. Photos")).click();
	  
	  
	  //area
WebElement area=driver.findElement(AppiumBy.id("io.appium.android.apis:id/gallery"));


	  //gesture
	Utility.swipeLeft(driver, area);
/*
	driver.executeScript("mobile: swipeGesture",ImmutableMap.of(
			"elementId",((RemoteWebElement)area).getId(),
			"direction","left",
			"percent",1.0
			
			));


*/





  }
}
