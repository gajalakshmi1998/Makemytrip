package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple_Drop {
	
	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\God\\eclipse-workspace\\selenium\\webdriver\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/select-menu");
		
	
		 
	WebElement findElement = driver.findElement(By.id("cars"));
	
	Select o1= new Select(findElement);
	

    o1.selectByValue("volvo");
	o1.selectByVisibleText("Audi");
	o1.selectByIndex(1);
	
	
	o1.deselectByIndex(1);
	
	boolean multiple = o1.isMultiple();
	System.out.println(multiple);
	
	
	
	List <WebElement>options = o1.getOptions();
	for (WebElement webElement : options) {
		System.out.println(webElement.getText());
		
	}
	
	List<WebElement> allSelectedOptions = o1.getAllSelectedOptions();
	for (WebElement webElement : allSelectedOptions) {
		System.out.println(webElement.getText());
		
	}
	
	WebElement firstSelectedOption = o1.getFirstSelectedOption();
	System.out.println(firstSelectedOption.getText());
	
	
	o1.deselectAll();
	
	
	
	}
	
	
	
}
