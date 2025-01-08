package com.TestApplicationScenarios;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.Generic.DriverUtil;
import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class DragnDropGesture {
  @Test
  public void testGesture()
  {
	  
	  //craete driver session
AppiumDriver driver=DriverUtil.initDriver();

//view
driver.findElement(AppiumBy.accessibilityId("Views")).click();

//drag n drop
driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();

//dot-3
WebElement expEle=driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_dot_3"));

//gesture
driver.executeScript("mobile: dragGesture", ImmutableMap.of(
		"elementId",((RemoteWebElement)expEle).getId(),
		"endX",735,
		"endY",1135
		));






  }
}
