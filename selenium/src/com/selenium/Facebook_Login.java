package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook_Login {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\God\\eclipse-workspace\\selenium\\webdriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.name("firstname")).sendKeys("Manickam");
		Thread.sleep(2000);
		
		driver.findElement(By.name("lastname")).sendKeys("Balakrishna");
		Thread.sleep(2000);
		
		driver.findElement(By.name("reg_email__")).sendKeys("7845349700");
		Thread.sleep(2000);
		
		WebElement findElement2 = driver.findElement(By.id("password_step_input"));
		
		findElement2.sendKeys("Manickam");
		
		WebElement day = driver.findElement(By.id("day"));
		
		Select single =new Select(day);
		
		single.selectByIndex(15);
		
		
		WebElement month = driver.findElement(By.id("month"));
		
		Select single1 = new Select(month);
		
		single1.selectByVisibleText("Jun");
		
		WebElement year = driver.findElement(By.id("year"));
		
		Select single2= new Select(year);
		
		single2.selectByValue("1992");
		
		driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
		
		driver.findElement(By.name("websubmit")).click();
		
		
				
	
	    
		
		
		
		
		

}}
