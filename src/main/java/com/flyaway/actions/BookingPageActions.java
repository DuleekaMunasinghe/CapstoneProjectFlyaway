package com.flyaway.actions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.flyaway.locators.BookingPageLocators;
import com.flyaway.locators.DashBoardPageLocators;
import com.flyaway.locators.HomePageLocators;
import com.flyaway.utils.HelperClass;

public class BookingPageActions extends HelperClass {
	
	
	
	public BookingPageActions(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}

		
	public static void clickCompleteBook() throws InterruptedException {
		BookingPageLocators.ClickToCompleteBookingLink(getDriver()).click();
		Thread.sleep(1000);
	}

}