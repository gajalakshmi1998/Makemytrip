package com.selenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handle {
	
	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\God\\eclipse-workspace\\selenium\\webdriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.nykaa.com/");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//driver.findElement(By.xpath("//a[@href='/?root=logo']")).click();
		//Thread.sleep(2000);
		

		
		WebElement face = driver.findElement(By.xpath("(//a[text()='skin'])[2]"));
		Thread.sleep(2000);
		
		WebElement skin = driver.findElement(By.xpath("//a[contains(text(),'Face Moisturizer & Day Cream')]"));
		Thread.sleep(2000);
		
		Actions ref = new Actions(driver);
		
		ref.moveToElement(face).perform();
		ref.click(skin).perform();
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		for (String string : windowHandles) {
			
			String title = driver.switchTo().window(string).getTitle();
			System.out.println(title);
			
		}
		
		driver.findElement(By.xpath("//div[text()='Plum Green Tea Mattifying Moisturizer']")).click();
		Thread.sleep(2000);
		
		Set<String> windowHandles2 = driver.getWindowHandles();
		for (String string : windowHandles2) {
			
			driver.switchTo().window(string).getTitle();
			
		}
		
		WebElement bag = driver.findElement(By.xpath("(//span[text()='Add to Bag'])[1]"));
		bag.click();

		Thread.sleep(2000);
		WebElement cart = driver.findElement(By.xpath("(//button[@type='button'])[1]"));
		cart.click();
		
		WebElement fra = driver.findElement(By.xpath("//iframe[@src='/mobileCartIframe?ptype=customIframeCart']"));
		
	     driver.switchTo().frame(fra);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//span[text()='Proceed']")).click();
		
		
		
		
		
	}

}
