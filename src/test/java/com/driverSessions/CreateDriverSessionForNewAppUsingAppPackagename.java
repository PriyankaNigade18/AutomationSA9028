package com.driverSessions;

import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class CreateDriverSessionForNewAppUsingAppPackagename {
  @Test
  public void testSessionUsingPackageAndActivity() throws MalformedURLException 
  {
	  
	  //set the capability
	  UiAutomator2Options option=new UiAutomator2Options();
	  
	  //application package name and activity name
	  option.setCapability("appium:appPackage","com.android.deskclock");
	  option.setCapability("appium:appActivity","com.android.deskclock.DeskClock");
	  
	//2.set the appium sever address
	  URL url=new URL("http://0.0.0.0:4723");
	  
	  
	  //3.create an appium driver session
	  AppiumDriver driver=new AndroidDriver(url,option);
	System.out.println("Session id is: "+driver.getSessionId());
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
