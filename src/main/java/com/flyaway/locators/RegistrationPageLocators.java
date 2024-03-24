package com.flyaway.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.flyaway.utils.HelperClass;

public class RegistrationPageLocators extends HelperClass {


	public static WebElement emailBox(WebDriver driver)
	{
		return driver.findElement(By.name("email_id"));
	}


	public static WebElement passwordBox(WebDriver driver)
	{
		return driver.findElement(By.name("pwd"));
	}
	
	public static WebElement confirmpasswordBox(WebDriver driver)
	{
		return driver.findElement(By.name("pwd2"));
	}

	public static WebElement nameBox(WebDriver driver)
	{
		return driver.findElement(By.name("name"));
	}

	public static WebElement addressBox(WebDriver driver)
	{
		return driver.findElement(By.name("address"));
	}
	
	public static WebElement cityBox(WebDriver driver)
	{
		return driver.findElement(By.name("city"));
	}
	
	public static WebElement signUpButton(WebDriver driver)
	{
		return driver.findElement(By.xpath("//button[normalize-space()='Signup']"));
	}
	
	public static WebElement loginToContinueCheckingFlightsLink(WebDriver driver)
	{
		return driver.findElement(By.xpath("//a[normalize-space()='Login to continue checking flights']"));
	}
	
	public static WebElement loginButton(WebDriver driver)
	{
		return driver.findElement(By.xpath("//a[normalize-space()='Login/Signup']"));
	}
}
