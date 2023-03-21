package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Single_Multiple_Frame {
	
	public static void main(String[] args) {
	
System.setProperty("webdriver.chrome.driver", "C:\\Users\\God\\eclipse-workspace\\selenium\\webdriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		driver.switchTo().frame("singleframe");
		
		WebElement findElement = driver.findElement(By.xpath("//input[@type='text']"));
		
		findElement.sendKeys("gaja");
		
		driver.switchTo().defaultContent();
		
	List<WebElement> findElements = driver.findElements(By.tagName("iframe"));
	int size = findElements.size();
	System.out.println(size);
	
	
	driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();
	driver.switchTo().frame(1);
	driver.switchTo().frame(0);
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("selenium");
		
		
	}

}
