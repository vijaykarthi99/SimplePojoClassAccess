package com.base;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By.ByName;
import org.openqa.selenium.Keys;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\JavaClassProjectsEclipse\\SeleniumTasks\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	driver.findElement(By.name("field-keywords")).sendKeys("iphone 13",Keys.ENTER);
	driver.findElement(By.xpath("(//span[text()='Apple iPhone 13 (128GB) - Midnight'])[3]")).click();
	Set<String> windowHandles = driver.getWindowHandles();
	
	List<String> li= new ArrayList<>(windowHandles);
	
	driver.switchTo().window(li.get(1));
	driver.findElement(By.id("add-to-cart-button")).click();
	driver.switchTo().window(li.get(0));
	driver.close();
	driver.switchTo().window(li.get(1));
	System.out.println(driver.getCurrentUrl());
	
	
}
}
