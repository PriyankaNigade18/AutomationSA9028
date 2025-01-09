package com.MobileScenarios;

import org.testng.annotations.Test;

import com.Generic.DriverUtil;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class WorkingWithApp {
  @Test
  public void testAppManagement()
  {
	  
	  //create driver session
	  AppiumDriver driver=DriverUtil.initDriver();
	  
	  //get the current application package name
	  String packageName=((AndroidDriver)driver).getCurrentPackage();
	  System.out.println("Application package name is: "+packageName);
	  
	  //get the current status application-queryAppState
	  System.out.println("Current App status: "+((AndroidDriver)driver).queryAppState(packageName));
	  
	  //terminate app
	  ((AndroidDriver)driver).terminateApp(packageName);
	  System.out.println("After terminate current App status: "+((AndroidDriver)driver).queryAppState(packageName));

	  
	  //activate app
	  ((AndroidDriver)driver).activateApp(packageName);
	  System.out.println("After activate current App status: "+((AndroidDriver)driver).queryAppState(packageName));

	  //uninstall app()
	  ((AndroidDriver)driver).removeApp(packageName);
	  System.out.println("After uninstall current App status: "+((AndroidDriver)driver).queryAppState(packageName));

	  String path=System.getProperty("user.dir")+"//src//test//resources//ApiDemos-debug.apk";

	  
	  //install app
	  ((AndroidDriver)driver).installApp(path);
	  System.out.println("After install current App status: "+((AndroidDriver)driver).queryAppState(packageName));

	  //activate app
	  ((AndroidDriver)driver).activateApp(packageName);
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
