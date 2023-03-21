package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {
	
	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\God\\eclipse-workspace\\selenium\\webdriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.timeanddate.com/holidays/india/2023");
		
		List<WebElement> hol = driver.findElements(By.xpath("//table/tbody/tr/td[3]"));
		
		for (WebElement a : hol) {
			
			System.out.println(a.getText());
			
		}
		
	}

}
