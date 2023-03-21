package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Film {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\God\\eclipse-workspace\\selenium\\webdriver\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/Prime-Video/b?node=2676882011");
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("kantara");
		
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
		
		
		
	}

}
