package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drop {
	public static void main(String[] args) {
		
		   System.setProperty("webdriver.chrome.driver", "C:\\Users\\God\\eclipse-workspace\\selenium\\webdriver\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				
				driver.get("https://demoqa.com/droppable/");
				
				Actions act = new Actions(driver);
				
				WebElement scr = driver.findElement(By.id("draggable"));
				
				WebElement rep = driver.findElement(By.id("droppable"));
				
				act.dragAndDrop(scr, rep).build().perform();
				
				
				

}}
