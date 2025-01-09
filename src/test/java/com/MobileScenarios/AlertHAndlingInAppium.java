package com.MobileScenarios;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import com.Generic.DriverUtil;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class AlertHAndlingInAppium {
  @Test
  public void testAlert() 
  {
	  /*
	   * Alert is interface
	   * 1.accept()====>Ok
	   * 2.dismiss()====>cancel
	   * 3.getText()===>get the text
	   * 4.sendKeys()===>prompt
	   */
	  
	  
	  //create appium driver session
	  AppiumDriver driver=DriverUtil.initDriver();
	  
	  //app
	  
	  driver.findElement(AppiumBy.accessibilityId("App")).click();
	  
	  //alerts
	  driver.findElement(AppiumBy.accessibilityId("Alert Dialogs")).click();
	  
	  //open alert
	  driver.findElement(AppiumBy.accessibilityId("OK Cancel dialog with a message")).click();
	  
	  
	  //handle alert
	  Alert alt1=driver.switchTo().alert();
	  System.out.println("Alert text is: "+alt1.getText());
	  alt1.accept();
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
