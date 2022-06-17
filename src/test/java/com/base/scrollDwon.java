package com.base;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class scrollDwon {
	
static	WebDriver driver;
	public static void main(String[] args) throws InterruptedException, AWTException{
		
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
		driver.get("http://greenscart.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//div[@class='form-group']//child::input[@id='loginEmailId']")).sendKeys("vijaymani.1699@gmail.com");
	
		driver.findElement(By.id("loginPassword")).sendKeys("Greens@123");
		
		WebElement mac = driver.findElement(By.xpath("//div[@class='col-md-6']//input[@type='submit' or @value='loginEmailId']"));
		mac.click();
//		JavascriptExecutor executor = (JavascriptExecutor) driver;
//		Thread.sleep(3000);
//		executor.executeScript("arguments[0].scrollIntoView(true);", cok);
//		executor.executeScript("arguments[0].click()", cok);
//		Thread.sleep(800);
//	
//		r.keyPress(KeyEvent.VK_ALT);
//		r.keyPress(KeyEvent.VK_LEFT);
//		r.keyRelease(KeyEvent.VK_LEFT);
//		r.keyRelease(KeyEvent.VK_ALT);
//		Thread.sleep(800);
//		driver.findElement(By.id("349jbv-lm6lks-61xsgp-54ddgr")).click();
	
		 
		 
		
//		WebElement fl = driver.findElement(By.xpath("//span[text()='Flight tickets']"));
//		Thread.sleep(3000);
//		executor.executeScript("arguments[1].scrollIntoView(true);", fl);
//		fl.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
