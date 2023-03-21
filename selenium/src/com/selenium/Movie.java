package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Movie {
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\God\\eclipse-workspace\\selenium\\webdriver\\chromedriver.exe" );
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.imdb.com/");
	
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("96");
	
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	driver.findElement(By.xpath("//a[text()='96']")).click();
	
	WebElement findElement = driver.findElement(By.xpath("(//a[@aria-label='View User Ratings'])[1]"));
	findElement.click();
	 

}
		
	}


