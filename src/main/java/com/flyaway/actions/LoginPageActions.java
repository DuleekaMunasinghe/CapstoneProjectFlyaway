package com.flyaway.actions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.flyaway.locators.LoginPageLocators;
import com.flyaway.utils.HelperClass;

public class LoginPageActions extends HelperClass{
	

	
	public LoginPageActions(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}

	public static void enterEmailID (String email) throws InterruptedException {
		LoginPageLocators.emailBox(getDriver()).sendKeys(email);
		Thread.sleep(1000);
	}
	
	public static void enterPassword(String password) throws InterruptedException {
		LoginPageLocators.passwordBox(getDriver()).sendKeys(password);
		Thread.sleep(1000);
				
	}
	public static void clickLoginButton() throws InterruptedException {
		LoginPageLocators.loginButton(getDriver()).click();
		Thread.sleep(1000);
		
	}



}
