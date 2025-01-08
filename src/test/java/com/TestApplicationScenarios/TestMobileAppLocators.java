package com.TestApplicationScenarios;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.Generic.DriverUtil;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class TestMobileAppLocators {
  @Test
  public void testLocators() throws InterruptedException
  {
	  //create a driver session
	  AppiumDriver driver=DriverUtil.initDriver();
	  
	  //mobile element
	  //Locator1: accessibilityId
	  WebElement ele=driver.findElement(AppiumBy.accessibilityId("Access'ibility"));
	  System.out.println("Text of element1: "+ele.getText());
	  ele.click();
	  
	  Thread.sleep(2000);
	  //navigate back 
	  driver.navigate().back();
	  
	  
	  //Locator2: Android uiautomator
	  WebElement ele2=driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Animation\")"));
	  System.out.println("Text of element2: "+ele2.getText());
	  ele2.click();
	  
	  Thread.sleep(2000);
	  //navigate back 
	  driver.navigate().back();
	  
	  
	  //Locator3: xpath
	  WebElement ele3=driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"App\"]"));
	  System.out.println("Text of element3: "+ele3.getText());
	  ele3.click();

	  Thread.sleep(2000);
	  //navigate back 
	  driver.navigate().back();
	  
	  
	  //Locator4: className
	  WebElement ele4=driver.findElements(AppiumBy.className("android.widget.TextView")).get(5);
	  System.out.println("Text of element4: "+ele4.getText());
	  ele4.click();
	  
	  
	  Thread.sleep(2000);
	  //navigate back 
	  driver.navigate().back();
	  
	  //Locator5: resource-id/id
	  WebElement ele5= driver.findElements(AppiumBy.id("android:id/text1")).get(11);
	  System.out.println("Text of element5: "+ele5.getText());
	  ele5.click();
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
