package com.flyaway.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.flyaway.utils.HelperClass;

public class HomePageLocators extends HelperClass {
	
	public static WebElement homeButton (WebDriver driver)
	{
		return driver.findElement(By.xpath("//a[normalize-space()='Home']"));
	}
	
	public static WebElement homePageText (WebDriver driver)
	{
		return driver.findElement(By.xpath("//h3[normalize-space()='FLYAWAY HOMEPAGE']"));
	}
	
	public static WebElement selectSourseBox (WebDriver driver)
	{
		return driver.findElement(By.xpath("//select[@name='source']"));
	}
	
	public static WebElement locationBangalore (WebDriver driver)
	{
		return driver.findElement(By.xpath("//select[@name='source']//option[@value='1'][normalize-space()='Bangalore']"));
		
	}
	
	public static WebElement selectDestinationBox (WebDriver driver)
	{
		return driver.findElement(By.xpath("//select[@name='source']"));
	}
	
	public static WebElement locationChennai (WebDriver driver)
	{
		return driver.findElement(By.xpath("//select[@name='destination']//option[@value='4'][normalize-space()='Chennai']"));
		
	}
	
	public static WebElement submitButton (WebDriver driver)
	{
		return driver.findElement(By.xpath("//button[normalize-space()='Submit']"));
		
	}
	
	public static WebElement bookFlightLink (WebDriver driver)
	{
		return driver.findElement(By.xpath("//a[normalize-space()='Book Flight']"));
		
	}
	
	
}