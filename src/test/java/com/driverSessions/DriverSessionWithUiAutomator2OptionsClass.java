package com.driverSessions;

import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class DriverSessionWithUiAutomator2OptionsClass {
  @Test
  public void testAppiumDriverSession() throws MalformedURLException
  {
	  
	  //1.set the capabilities
	  UiAutomator2Options option=new UiAutomator2Options();
	  
	  //application path
	  String path=System.getProperty("user.dir")+"//src//test//resources//ApiDemos-debug.apk";
	  option.setCapability("appium:app",path);
	  
	   //2.set the appium sever address
	  URL url=new URL("http://0.0.0.0:4723");
	  
	  
	  //3.create an appium driver session
	  AppiumDriver driver=new AndroidDriver(url,option);
	System.out.println("Session id is: "+driver.getSessionId());
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
