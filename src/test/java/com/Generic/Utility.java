package com.Generic;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumDriver;

public class Utility
{
	
	
	//Screenshot
	public static void getScreenshot(AppiumDriver driver,String fname)
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File temp=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File(System.getProperty("user.dir")+"//Screenshots//"+fname+System.currentTimeMillis()+".png");
		try {
			FileHandler.copy(temp,dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	
	
	
	//scroll utilities
	
	public static void scrollUpToTheCount(AppiumDriver driver,WebElement area,int count)
	{
		for(int i=1;i<=count;i++)
		{
		driver.executeScript("mobile: scrollGesture",ImmutableMap.of(
				  
				  "elementId",((RemoteWebElement)area).getId(),
				  "direction","down",
				  "percent",1.0//100% area it will cover
				  
				  ));
		System.out.println("Iteration: "+i);
		}
		
	}
	public static void scrollDown(AppiumDriver driver,WebElement area)
	{
		driver.executeScript("mobile: scrollGesture",ImmutableMap.of(
				  
				  "elementId",((RemoteWebElement)area).getId(),
				  "direction","down",
				  "percent",1.0//100% area it will cover
				  
				  ));
		
	}

	
	
	public static void scrollUp(AppiumDriver driver,WebElement area)
	{
		driver.executeScript("mobile: scrollGesture",ImmutableMap.of(
				  
				  "elementId",((RemoteWebElement)area).getId(),
				  "direction","up",
				  "percent",1.0//100% area it will cover
				  
				  ));
		
	}
	
	
	public static void scrollLeft(AppiumDriver driver,WebElement area)
	{
		driver.executeScript("mobile: scrollGesture",ImmutableMap.of(
				  
				  "elementId",((RemoteWebElement)area).getId(),
				  "direction","left",
				  "percent",1.0//100% area it will cover
				  
				  ));
		
	}
	
	public static void scrollRight(AppiumDriver driver,WebElement area)
	{
		driver.executeScript("mobile: scrollGesture",ImmutableMap.of(
				  
				  "elementId",((RemoteWebElement)area).getId(),
				  "direction","right",
				  "percent",1.0//100% area it will cover
				  
				  ));
		
	}
	
	//Swipe utilities
	public static void swipeLeft(AppiumDriver driver,WebElement area)
	{
		driver.executeScript("mobile: swipeGesture",ImmutableMap.of(
				"elementId",((RemoteWebElement)area).getId(),
				"direction","left",
				"percent",1.0
				
				));
	}
	
	public static void swipeDown(AppiumDriver driver,WebElement area)
	{
		driver.executeScript("mobile: swipeGesture",ImmutableMap.of(
				"elementId",((RemoteWebElement)area).getId(),
				"direction","down",
				"percent",1.0
				
				));
	}
	
	
	
	public static void swipeUp(AppiumDriver driver,WebElement area)
	{
		driver.executeScript("mobile: swipeGesture",ImmutableMap.of(
				"elementId",((RemoteWebElement)area).getId(),
				"direction","up",
				"percent",1.0
				
				));
		
	}
	public static void swipeRight(AppiumDriver driver,WebElement area)
	{
		driver.executeScript("mobile: swipeGesture",ImmutableMap.of(
				"elementId",((RemoteWebElement)area).getId(),
				"direction","right",
				"percent",1.0
				
				));
	}
}
