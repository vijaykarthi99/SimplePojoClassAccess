package com.base;

import org.openqa.selenium.WebElement;

public class AccessClass extends BaseClass {
	public static void main(String[] args) {
		
	
	BaseClass b=new BaseClass();
	b.launchURL("https://www.facebook.com/");
//	WebElement userName = b.findLocator("id", "email");
//	b.userName(userName, "Vijaymani");
//	WebElement userPass = b.findLocator("id", "pass");
//	b.userPass(userPass, "123345");
//	WebElement btnLogin = b.findLocator("name", "login");
//	b.btnLogin(btnLogin);
//	b.driver.navigate().back();
	WebElement createNew = b.findLocator("xpath", "//a[text()='Create New Account']");
	
	b.btnLogin(createNew);
	
	
	
	
		
		
		
		
		
		
		
		
		
		
	}

}
