package com.flyaway.actions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.flyaway.locators.BookingConfirmationPageLocators;
import com.flyaway.locators.BookingPageLocators;
import com.flyaway.locators.DashBoardPageLocators;
import com.flyaway.locators.HomePageLocators;
import com.flyaway.utils.HelperClass;

public class BookingConfirmationPageActions extends HelperClass {
	
	
	
	public BookingConfirmationPageActions(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}

		
	public static void clickCompleteBook() throws InterruptedException {
		BookingConfirmationPageLocators.seeYourBookingsLink(getDriver()).click();
		Thread.sleep(1000);
	}

}