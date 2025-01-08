package com.Generic;

import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class DriverUtil 
{
	public static AppiumDriver driver;
	
	public static AppiumDriver initDriver()
	{
		//set the capability
		UiAutomator2Options option=new UiAutomator2Options();
		
		 String path=System.getProperty("user.dir")+"//src//test//resources//ApiDemos-debug.apk";
		//app
		option.setCapability("appium:app",path);
		
		//server address
		URL url;
		try {
			url = new URL("http://0.0.0.0:4723");
			//create a driver session
			 driver=new AndroidDriver(url,option);
			System.out.println("Session id is: "+driver.getSessionId());
		} catch (MalformedURLException e) {
			
			e.printStackTrace();
		}
		
		
		return driver;
		
		
		
	}

}
