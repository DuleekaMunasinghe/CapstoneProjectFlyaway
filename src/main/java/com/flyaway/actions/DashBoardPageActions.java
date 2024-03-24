package com.flyaway.actions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.flyaway.locators.DashBoardPageLocators;
import com.flyaway.utils.HelperClass;

public class DashBoardPageActions extends HelperClass {
	
	
	
	public DashBoardPageActions(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}

	public static void clickHomeButton() throws InterruptedException {
		DashBoardPageLocators.homeButton(getDriver()).click();
		Thread.sleep(1000);
	}
	


}