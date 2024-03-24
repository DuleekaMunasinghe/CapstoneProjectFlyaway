package com.flyaway.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.flyaway.utils.HelperClass;

public class BookingConfirmationPageLocators extends HelperClass {
	
	public static WebElement bookingConfirmationText (WebDriver driver)
	{
		return driver.findElement(By.xpath("//h3[normalize-space()='FLYAWAY - BOOKING CONFIRMATION']"));
	}
	
	public static WebElement seeYourBookingsLink (WebDriver driver)
	{
		return driver.findElement(By.xpath("//a[normalize-space()='See Your Bookings']"));
	}
	
	
}