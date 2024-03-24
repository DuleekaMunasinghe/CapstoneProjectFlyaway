package com.flyaway.actions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.flyaway.locators.DashBoardPageLocators;
import com.flyaway.locators.HomePageLocators;
import com.flyaway.utils.HelperClass;

public class HomePageActions extends HelperClass {
	
	
	
	public HomePageActions(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}

		
	public static void selectSourse() throws InterruptedException {
		HomePageLocators.selectSourseBox(getDriver()).click();
		Thread.sleep(1000);
	}
	public static void selectBangalore() throws InterruptedException {
		HomePageLocators.locationBangalore(getDriver()).click();
		Thread.sleep(1000);
	}
	public static void selectDestination() throws InterruptedException {
		HomePageLocators.selectDestinationBox(getDriver()).click();
		Thread.sleep(1000);
	}
	public static void selectChennai() throws InterruptedException {
		HomePageLocators.locationChennai(getDriver()).click();
		Thread.sleep(1000);
	}
	
	public static void clickSubmitButton() throws InterruptedException {
		HomePageLocators.submitButton(getDriver()).click();
		Thread.sleep(1000);
	}
	
	public static void clickBookFlight() throws InterruptedException {
		HomePageLocators.bookFlightLink(getDriver()).click();
		Thread.sleep(2000);
	}

}