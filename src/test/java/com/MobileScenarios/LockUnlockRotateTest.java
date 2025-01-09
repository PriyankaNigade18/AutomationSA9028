package com.MobileScenarios;

import org.openqa.selenium.ScreenOrientation;
import org.testng.annotations.Test;

import com.Generic.DriverUtil;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class LockUnlockRotateTest {
  @Test
  public void testAppInteraction() throws InterruptedException
  {
	  //create driver session
	  
	  AppiumDriver driver=DriverUtil.initDriver();
	  
	  
	  /*
	   * to lock device--->lockDevice()
	   * to unlock device--->unlockDevice()
	   * to rotate ----->rotate(ScreenOrientation class)
	   */
	  /*
	  ((AndroidDriver)driver).lockDevice();
	  
	  System.out.println("Device locked!");
	  
	  Thread.sleep(2000);
	  
	  ((AndroidDriver)driver).unlockDevice();
	  System.out.println("Device unlocked!");
	  */
	  //rotate
	  ((AndroidDriver)driver).rotate(ScreenOrientation.LANDSCAPE);
	  
	  Thread.sleep(2000);
	  
	  ((AndroidDriver)driver).rotate(ScreenOrientation.PORTRAIT);
	  
	  
	  
	  
	  
  }
}
