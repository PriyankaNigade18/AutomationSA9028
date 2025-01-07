package com.driverSessions;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
//import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class DriverSessionWithDesiredCapabilities
{
  @Test
  public void testDriverSession() throws MalformedURLException
  {
	  //ctrl+shift+O
	  
	  //1.set platform capabilities
	  DesiredCapabilities cap=new DesiredCapabilities();
	  cap.setCapability("platformName","Android");
	  cap.setCapability("appium:automationName","uiautomator2");
	  cap.setCapability("appium:deviceName","pixel_5");
	  cap.setCapability("appium:udid","emulator-5554");
	  
	  String path=System.getProperty("user.dir")+"//src//test//resources//ApiDemos-debug.apk";
	  //application path
	  cap.setCapability("appium:app",path);
	  
	  
	  //2.server address to initiate session
	  URL url=new URL("http://0.0.0.0:4723");
	  
	  //3.appium driver session to start
	  //create a driver session
	  AppiumDriver driver=new AndroidDriver(url,cap);
	  
	  //server send sessionId to the client
	  System.out.println("Session Id is: "+driver.getSessionId());
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
