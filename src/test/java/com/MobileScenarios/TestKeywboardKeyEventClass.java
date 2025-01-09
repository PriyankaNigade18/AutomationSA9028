package com.MobileScenarios;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.Generic.DriverUtil;
import com.Generic.Utility;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class TestKeywboardKeyEventClass {
  @Test
  public void testKeyEvent() 
  {
	  //create a driver session
	  AppiumDriver driver=DriverUtil.initDriver();
	  
	  //views
	  driver.findElement(AppiumBy.accessibilityId("Views")).click();
	  
	  //scroll area
	  WebElement area=driver.findElement(AppiumBy.id("android:id/list"));
	  
	  //scroll the page 3 time
	  Utility.scrollUpToTheCount(driver,area,3 );
	  
	  //text field
	  driver.findElement(AppiumBy.accessibilityId("TextFields")).click();
	  
	  //input area
	  WebElement typeArea=driver.findElement(AppiumBy.id("io.appium.android.apis:id/edit"));
	  
	  //sendKeys()
	  //typeArea.sendKeys("Hello All!");
	  
	  
	  /*
	   * KeyEvent is class for AndroidDriver 
	   * so type cast AppiumDriver into AndroidDriver
	   * AndroidKey is class for all keyboard keys
	   */
	  
	 ((AndroidDriver)driver).pressKey(new KeyEvent(AndroidKey.T));
	 ((AndroidDriver)driver).pressKey(new KeyEvent(AndroidKey.E));
	 ((AndroidDriver)driver).pressKey(new KeyEvent(AndroidKey.S));
	 ((AndroidDriver)driver).pressKey(new KeyEvent(AndroidKey.T));
	 ((AndroidDriver)driver).pressKey(new KeyEvent(AndroidKey.I));
	 ((AndroidDriver)driver).pressKey(new KeyEvent(AndroidKey.N));
	 ((AndroidDriver)driver).pressKey(new KeyEvent(AndroidKey.G));
	 
	  
	  
  }
}
