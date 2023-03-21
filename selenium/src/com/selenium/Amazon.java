package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\God\\eclipse-workspace\\selenium\\webdriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.xpath("//a[contains(@data-csa-c-content-id,'nav_cs_bestsellers')]")).click();
		
		driver.findElement(By.xpath("//a[contains(@href,'/gp/bestsellers/electronics/ref=zg_bs_nav_0')]")).click();
		
		driver.findElement(By.xpath("//div[contains(text(),'HP 680 Original Ink Advantage')]")).click();
	}

}
