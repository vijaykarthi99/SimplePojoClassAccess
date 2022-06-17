package com.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class windowshandle extends BaseClass {
	public static void main(String[] args) throws AWTException {

		BaseClass bs = new BaseClass();
		bs.launchURL("https://www.amazon.in/");

		WebElement locator = bs.findLocator("id", "twotabsearchtextbox");
		Actions actions = new Actions(driver);
		// Robot robot = new Robot();
		locator.sendKeys("iphone 13pro max", Keys.ENTER);
		WebElement locator2 = bs.findLocator("xpath",
				"(//span[text()='Apple iPhone 13 Pro Max (256GB) - Graphite'])[1]");
		locator2.click();
		bs.windowHandle();
		WebElement locator3 = bs.findLocator("xpath", "//input[@value='Add to Cart']");
		locator3.click();

	}
}
