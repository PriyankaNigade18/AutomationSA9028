package com.MobileScenarios;

import java.util.List;

import org.testng.annotations.Test;

import com.Generic.DriverUtil;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Performanceanalysis {
  @Test
  public void testPerformanceParam()
  {
	  //create  driver session
	  
	  AppiumDriver driver=DriverUtil.initDriver();
	  
	  //get the current app package
	  String packageName=((AndroidDriver)driver).getCurrentPackage();
	  System.out.println("App package name: "+packageName);
	  
	  //perfomance parameters
	  List<String> types=((AndroidDriver)driver).getSupportedPerformanceDataTypes();
	  System.out.println(types);
	  //[cpuinfo, memoryinfo, batteryinfo, networkinfo]
	  
	  
	 List<List<Object>> batteryInfo= ((AndroidDriver)driver).getPerformanceData(packageName,"batteryinfo",5);
	  System.out.println(batteryInfo);
	  
	  
	  
	  List<List<Object>> memoryInfo= ((AndroidDriver)driver).getPerformanceData(packageName,"memoryinfo",5);
	  System.out.println(memoryInfo);
	  
	  
	  List<List<Object>> networkInfo= ((AndroidDriver)driver).getPerformanceData(packageName,"networkinfo",5);
	  System.out.println(networkInfo);
	  
	  

//	  List<List<Object>> cpuInfo= ((AndroidDriver)driver).getPerformanceData(packageName,"cpuinfo",5);
//	  System.out.println(cpuInfo);
	  
  }
}
