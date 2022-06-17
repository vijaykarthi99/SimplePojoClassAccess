package com.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class PojoClass extends BaseClass {
	
	public PojoClass() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="email")
	private WebElement txtUserName;
	@FindBy(id="pass")
	private WebElement txtUserPassword;
	@FindBy(name="login")
	private WebElement login;
	public WebElement getTxtUserName() {
		return txtUserName;
	}
	public WebElement getTxtUserPassword() {
		return txtUserPassword;
	}
	public WebElement getLogin() {
		return login;
	}
	
	public void loginpage(String name, String passw) {
		PojoClass l=new PojoClass();
		l.enterText(getTxtUserName(), name);
		l.enterText(getTxtUserPassword(), passw);
		l.btnLogin( login);
		
	}
	public void location() {
		driver.findElement(By.id("location"));

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
