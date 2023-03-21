package com.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Login {

	public static void main(String[] args) throws AWTException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\God\\eclipse-workspace\\selenium\\webdriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
        driver.findElement(By.xpath("//span[text()='Account & Lists']")).click();
		
		driver.findElement(By.id("ap_email")).sendKeys("8248203324");
		
		driver.findElement(By.id("continue")).click();
		
		driver.findElement(By.id("ap_password")).sendKeys("Gajalakshmi@98");
		
		driver.findElement(By.id("signInSubmit")).click();
		
 
	 WebElement fr = driver.findElement(By.xpath("//a[text()='Fresh']"));
	 fr.click();
	 


JavascriptExecutor js = (JavascriptExecutor) driver;

js.executeScript("window.scrollBy(0,900)");

WebElement skin = driver.findElement(By.xpath("(//img[@alt='Drinks'])[1]"));

js.executeScript("arguments[0].scrollIntoView();", skin);

js.executeScript("arguments[0].click()", skin);

driver.findElement(By.xpath("(//span[text()='Limca 750 ml Bottle'])[2]")).click();


driver.findElement(By.xpath("//input[contains(@aria-labelledby,'freshAddToCartButton-announce')]")).click();

driver.findElement(By.id("nav-cart-count")).click();

WebElement car = driver.findElement(By.xpath("//a[@href='/ref=nav_logo']"));
car.click();

WebElement face = driver.findElement(By.xpath("//span[text()='Browsing History']"));

Actions ref = new Actions(driver);

ref.contextClick(face).perform();

Robot r = new Robot();

r.keyPress(KeyEvent.VK_DOWN);
r.keyPress(KeyEvent.VK_ENTER);














		

		
		
}}
