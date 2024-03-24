package com.flyaway.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.flyaway.utils.HelperClass;

public class DashBoardPageLocators extends HelperClass {
	
	public static WebElement homeButton (WebDriver driver)
	{
		return driver.findElement(By.xpath("//a[normalize-space()='Home']"));
	}
}