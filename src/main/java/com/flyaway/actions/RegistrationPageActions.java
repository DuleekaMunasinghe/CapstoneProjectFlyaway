package com.flyaway.actions;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.flyaway.locators.RegistrationPageLocators;
import com.flyaway.utils.HelperClass;
import com.github.javafaker.Faker;

public class RegistrationPageActions extends HelperClass {

	public RegistrationPageActions(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}


	
	public static void enterRegisterDetails(String email,String password,String confirmpassword,String name,String address,String city) throws IOException, InterruptedException {
		//Wait until location box visible
	 
		RegistrationPageLocators.emailBox(getDriver()).sendKeys(email);
		Thread.sleep(1000);
		RegistrationPageLocators.passwordBox(getDriver()).sendKeys(password);
		Thread.sleep(1000);
		RegistrationPageLocators.confirmpasswordBox(getDriver()).sendKeys(password);
		Thread.sleep(1000);
		RegistrationPageLocators.nameBox(getDriver()).sendKeys(name);
		Thread.sleep(1000);
		RegistrationPageLocators.addressBox(getDriver()).sendKeys(address);
		Thread.sleep(1000);
		RegistrationPageLocators.cityBox(getDriver()).sendKeys(city);
		Thread.sleep(1000);

	}


	public static void clickSignUpButton() throws InterruptedException {
		RegistrationPageLocators.signUpButton(getDriver()).click();;
		Thread.sleep(1000);
		
	}
	
	public static void clickloginButton() throws InterruptedException {
		RegistrationPageLocators.loginButton(getDriver()).click();;
		Thread.sleep(2000);
		
	}

}
