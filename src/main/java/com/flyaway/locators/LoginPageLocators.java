package com.flyaway.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.flyaway.utils.HelperClass;

public class LoginPageLocators extends HelperClass {
	
	public static WebElement textFlyawayMemberLogin (WebDriver driver)
	{
		return driver.findElement(By.xpath("//h3[normalize-space()='FLYAWAY - MEMBER LOGIN']"));
	}
	
	public static WebElement emailBox (WebDriver driver)
	{
		return driver.findElement(By.xpath("//input[@name='email_id']"));
	}
	
	public static WebElement passwordBox (WebDriver driver)
	{
		return driver.findElement(By.xpath("//input[@name='pwd']"));
	}
	
	public static WebElement loginButton (WebDriver driver)
	{
		return driver.findElement(By.xpath("//button[normalize-space()='Login']"));
	}
	
	
	
}
