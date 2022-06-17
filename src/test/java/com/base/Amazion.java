package com.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazion extends BaseClass {
	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement txtxsearch = driver.findElement(By.id("twotabsearchtextbox"));
		txtxsearch.sendKeys("iphone 13 pro", Keys.ENTER);

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// getName xpath==>(//span[text()='Apple iPhone 13 Pro (128GB) - Sierra
		// Blue'])[1]//ancestor::div[@class='a-section a-spacing-small
		// a-spacing-top-small']//descendant::span[@class='a-icon-alt']
		WebElement name = driver
				.findElement(By.xpath("(//span[text()='Apple iPhone 13 Pro (128GB) - Sierra Blue'])[1]"));
		String string = name.getText();
		System.out.println(string);

		// getStar
		// WebElement star = driver.findElement(By.xpath("(//span[contains(text(),'out
		// of ')])[4]"));
		Actions actions = new Actions(driver);
		// actions.moveToElement(star).perform();
		// String text = star.getText();
		// System.out.println(text);
		driver.findElement(By.xpath("(//span[contains(text(),'(128GB) - Sierra Blue')])[1]")).click();
		TakesScreenshot ts1 = (TakesScreenshot) driver;
		File src1 = ts1.getScreenshotAs(OutputType.FILE);
		File des1 = new File("D:\\JavaClassProjectsEclipse\\Sample\\Screenshots\\Amazon1.png");
		FileUtils.copyFile(src1, des1);
		Thread.sleep(200);
		Set<String> handles = driver.getWindowHandles();
		List<String> li = new ArrayList(handles);
		//Switched to Window
		driver.switchTo().window(li.get(1));
		driver.findElement(By.id("add-to-cart-button")).click();
		Thread.sleep(200);
		TakesScreenshot ts2 = (TakesScreenshot) driver;
		File src2 = ts1.getScreenshotAs(OutputType.FILE);
		File des2 = new File("D:\\JavaClassProjectsEclipse\\Sample\\Screenshots\\Amazon2.png");
		FileUtils.copyFile(src2, des2);
		//Switched to Window
		driver.switchTo().window(li.get(0));
		WebElement txtxsearch1 = driver.findElement(By.id("twotabsearchtextbox"));
		txtxsearch1.clear();
		txtxsearch1.sendKeys("apple i watch series 7 pro", Keys.ENTER);
		Thread.sleep(200);

		JavascriptExecutor exe = (JavascriptExecutor) driver;

		WebElement endc = driver.findElement(By.xpath(
				"//div[@class='a-section']//child::span[@class='a-price']//following-sibling::span[text()='36,900']"));
		exe.executeScript("arguments[0].scrollIntoView(true);", endc);
		Thread.sleep(800);

		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("D:\\JavaClassProjectsEclipse\\Sample\\Screenshots\\Amazon3.png");

		FileUtils.copyFile(src, des);
		endc.click();

//		WebElement watch = driver.findElement(By.xpath("//span[contains(text(),'Blue Aluminium Case with Abyss Blue')]//parent::h1"));
//		System.out.println(watch.getText());
		//Switched to Window
		driver.switchTo().window(li.get(1));
		driver.findElement(By.xpath("//a[@class='a-link-normal close-button']")).click();
		Thread.sleep(500);

		TakesScreenshot ts3 = (TakesScreenshot) driver;
		File src3 = ts.getScreenshotAs(OutputType.FILE);
		File des3 = new File("D:\\JavaClassProjectsEclipse\\Sample\\Screenshots\\Amazon4.png");

		FileUtils.copyFile(src3, des3);
		driver.findElement(By.xpath("//a[@id='nav-cart']")).click();
		driver.findElement(By.xpath("//input[@value='Proceed to checkout']")).click();
		TakesScreenshot ts6 = (TakesScreenshot) driver;
		File src6 = ts.getScreenshotAs(OutputType.FILE);
		File des6 = new File("D:\\JavaClassProjectsEclipse\\Sample\\Screenshots\\Amazon5.png");

		FileUtils.copyFile(src6, des6);
		driver.findElement(By.id("createAccountSubmit")).click();
		Thread.sleep(500);

		TakesScreenshot ts4 = (TakesScreenshot) driver;
		File src4 = ts.getScreenshotAs(OutputType.FILE);
		File des4 = new File("D:\\JavaClassProjectsEclipse\\Sample\\Screenshots\\Amazon6.png");

		FileUtils.copyFile(src4, des4);
		driver.findElement(By.xpath(
				"(//div[@class='a-box a-spacing-extra-large']//child::div[@class='a-row']//following-sibling::a[@class='a-link-emphasis'])[1]"))
				.click();
		Thread.sleep(500);
		//Switched to Window
		driver.switchTo().window(li.get(0));
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(500);
		
	//	driver.findElement(By.id("add-to-cart-button")).click();

		TakesScreenshot ts5 = (TakesScreenshot) driver;
		File src5 = ts.getScreenshotAs(OutputType.FILE);
		File des5 = new File("D:\\JavaClassProjectsEclipse\\Sample\\Screenshots\\Amazon7.png");

		FileUtils.copyFile(src4, des4);

	}

}
