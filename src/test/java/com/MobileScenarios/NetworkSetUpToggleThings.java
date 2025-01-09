package com.MobileScenarios;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.Generic.DriverUtil;
import com.Generic.Utility;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class NetworkSetUpToggleThings {
  @Test
  public void testToggleSetup() throws InterruptedException 
  {
	  /*
	   * wifi==>toggleWifi()
	   * mobile data--->toggleData()
	   * airplane mode---> toggleAirplaneMode()
	   */
	  //create  a driver session
	  AppiumDriver driver=DriverUtil.initDriver();
	  
	  
	  System.out.println("Initial Wifi status: ON");
	  
	  ((AndroidDriver)driver).toggleWifi();//off
	  
	  System.out.println("After toggle Wifi status: OFF");
	  Thread.sleep(2000);
	  
	  ((AndroidDriver)driver).toggleWifi();//on
	  
	  //swipe left
	  WebElement area=driver.findElement(AppiumBy.id("com.android.systemui:id/tile_page"));
	  Utility.swipeLeft(driver,area);
	  Thread.sleep(2000);
	  
	  
	  //mobile data
	  System.out.println("Current status is: ON");
	  ((AndroidDriver)driver).toggleData();
	  System.out.println("After toggle: OFF");
	  Thread.sleep(1500);
	  
	  ((AndroidDriver)driver).toggleData();//on
	  
	  //airplaneMode
	  System.out.println("Initial status of AirplaneMode is: OFF");
	  
	  ((AndroidDriver)driver).toggleAirplaneMode();//On
	  
	  System.out.println("Current status is: ON");
	  
	  Thread.sleep(1500);
	  ((AndroidDriver)driver).toggleAirplaneMode();//off
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
