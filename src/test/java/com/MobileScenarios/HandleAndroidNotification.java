package com.MobileScenarios;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.Generic.DriverUtil;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class HandleAndroidNotification {
  @Test
  public void testNotifications()
  {
	  
	  //create  driver session
	  
	  AppiumDriver driver=DriverUtil.initDriver();
	  
	  
	  //open notification
	  ((AndroidDriver)driver).openNotifications();
	  
	  //number of Notifications
	  List<WebElement> list=driver.findElements(AppiumBy.id("android:id/title"));
	  System.out.println("Total number of Notifications are: "+list.size());
	  
	  //print the title
	  System.out.println("Notification titles are: ");
	  for(WebElement i:list)
	  {
		  System.out.println(i.getText());
	  }
	  
	  //notification 1
	  String n1=driver.findElement(AppiumBy.id("android:id/big_text")).getText();
	  System.out.println("Notification 1 message is: "+n1);
	  
	  String n2=driver.findElement(AppiumBy.id("android:id/text")).getText();
	  System.out.println("Notification 2 message is: "+n2);

	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
