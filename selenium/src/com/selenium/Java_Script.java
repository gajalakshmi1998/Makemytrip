package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Java_Script {
	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\God\\eclipse-workspace\\selenium\\webdriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.flipkart.com/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0,500)");
		
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0,-500)");
		
		Thread.sleep(2000);
		
		WebElement ear = driver.findElement(By.xpath("//img[@alt='Philips HP8100/46 Hair Dryer']"));
		
		
		
		js.executeScript("arguments[0].scrollIntoView();", ear);
		
		Thread.sleep(2000);
		
		js.executeScript("arguments[0].click()", ear);
		
	}

}
