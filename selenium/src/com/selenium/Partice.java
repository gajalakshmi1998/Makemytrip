package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Partice {
	
	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\God\\eclipse-workspace\\selenium\\webdriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/webhp?tab=rw");
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("https://www.amazon.in/");
		
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("voltas ac 1.5 ton");
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		
JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0,1000)");
		
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0,-1000)");
		
		Thread.sleep(2000);
		
		WebElement ac = driver.findElement(By.xpath("//img[@alt='Voltas Inverter Split Air Conditioner 1.5 Ton 5 Star']"));
		
		js.executeScript("arguments[0].scrollIntoView();",ac);
		
			Thread.sleep(2000);
			
			js.executeScript("arguments[0].click();",ac);	
			
			
		driver.findElement(By.name("submit.add-to-cart")).click();
		
		
		
		
		
	}

}
