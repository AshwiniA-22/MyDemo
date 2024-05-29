package com.TS.MyTestNG;

import java.io.File;
import java.io.IOException;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyListeners implements ITestListener{
	
	
	@Override
	public void onTestFailure(ITestResult result) {
		 System.out.println("Test case is failed");
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https://mvnrepository.com/artifact/commons-io/commons-io/2.16.1");
		File srcFile= driver.getScreenshotAs(OutputType.FILE);
		try {
	        String timestamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
			FileUtils.copyFile(srcFile, new File("F:\\Peony23A\\Gitemo\\src\\Screenshots.ss" +timestamp+".jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 
	}
}
