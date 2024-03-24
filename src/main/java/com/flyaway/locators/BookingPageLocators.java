package com.flyaway.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.flyaway.utils.HelperClass;

public class BookingPageLocators extends HelperClass {
	
	public static WebElement paymentGatewayText (WebDriver driver)
	{
		return driver.findElement(By.xpath("//h3[normalize-space()='FLYAWAY - PAYMENT GATEWAY']"));
	}
	
	public static WebElement ClickToCompleteBookingLink (WebDriver driver)
	{
		return driver.findElement(By.xpath("//a[normalize-space()='Click to complete booking']"));
	}
	
	
}