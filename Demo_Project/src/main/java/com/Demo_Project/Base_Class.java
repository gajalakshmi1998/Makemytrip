package com.Demo_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_Class {
	
	public static WebDriver driver;
	
	
	public static void getDriver() {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\God\\eclipse-workspace\\Demo_Project");
		 driver = new ChromeDriver();
		

		
	}
	
	public static void getUrl(String url)
	{
		driver.get(url);
	}
	
	public static void maxi() {
		
		driver.manage().window().maximize();
		
	}
	
	
	
	
	
	
	
		
	
	
	
	
	

}
