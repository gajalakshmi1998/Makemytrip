package com.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse {
	public static void main(String[] args) throws AWTException {
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\God\\eclipse-workspace\\selenium\\webdriver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.amazon.in/");
	
	WebElement findElement = driver.findElement(By.xpath("//a[@data-csa-c-slot-id='nav_cs_1']"));
	
	Actions mou = new Actions(driver);
	
	mou.contextClick(findElement).perform();
	
	Robot key = new Robot();
	
	key.keyPress(KeyEvent.VK_DOWN);
	
	key.keyPress(KeyEvent.VK_ENTER);
	key.keyRelease(KeyEvent.KEY_RELEASED);
	
	
	

}}
