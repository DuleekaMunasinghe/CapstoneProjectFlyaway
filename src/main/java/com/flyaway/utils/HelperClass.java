package com.flyaway.utils;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.flyaway.locators.RegistrationPageLocators;

public class HelperClass {

	public static HelperClass helperClass;

	public static WebDriver driver;
	public static WebDriverWait wait;
	public final static int TIMEOUTIMP = 10;
	public int TIMEOUTEXP = 10;

	public static void openPage(String url) {
		driver.get(url);
	}

	public static WebDriver getDriver() {
		return driver;
	}
	// Initiate driver
	public static void setUpDriver() {

		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumDrivers\\geckodriver\\geckodriver.exe");
		driver = new FirefoxDriver(); // Assign to the class-level variable
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUTIMP));
	}

	// Wait until element visible
	public static void waitForVisibilityOfElement(By locator, Duration time) throws IOException {
		wait = new WebDriverWait(getDriver(), time);
		wait.until(ExpectedConditions.visibilityOf(RegistrationPageLocators.emailBox(getDriver())));
	}
	public static void tearDown() {

		if (driver != null) {
			driver.quit();
		}
		helperClass = null;
	}
}
