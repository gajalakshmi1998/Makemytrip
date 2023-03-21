package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver_Method {
	
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\God\\eclipse-workspace\\selenium\\webdriver\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		//max
		
				driver.manage().window().maximize();
				
		
		
		//get
		
		driver.get("https://www.instagram.com/");
		
		//get Title
		
		String title = driver.getTitle();
		System.out.println(title);
		
		//get currenturl
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		
		//navigate
		
		driver.navigate().to("https://www.amazon.in/account");
		
		WebElement findElement = driver.findElement(By.id("ap_customer_name"));
		findElement.sendKeys("gajaperumal1998@gmail.com");
		
	WebElement findElement2 = driver.findElement(By.id("ap_phone_number"));
	findElement2.sendKeys("8248203324");
	
	WebElement findElement3 = driver.findElement(By.id("ap_password"));
	findElement3.sendKeys("gaja@1998");
	
	WebElement findElement4 = driver.findElement(By.id("continue"));
	findElement4.click();
	
	
	
	
	
	
	
		
		
		
		
		
		
		
		 
		
		
			
		
		
	}

}
