package com.flyawayDriver;

import org.testng.annotations.Test;

import com.flyaway.actions.DashBoardPageActions;
import com.flyaway.actions.LoginPageActions;
import com.flyaway.actions.RegistrationPageActions;

import org.openqa.selenium.Platform;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.MalformedURLException;
import java.net.URL;

public class driver extends Tools {
	protected static DesiredCapabilities cap;
	protected static RegistrationPageActions landingPage;
	protected static LoginPageActions items;
//	protected static PlaceOrderActions placeOrder;
	protected static DashBoardPageActions checkOut;
  @Test
  public void init() throws MalformedURLException {
	  cap =  new DesiredCapabilities();
		
		cap.setBrowserName("firefox");
		cap.setPlatform(Platform.WIN11);
		//cap.chrome();
		driver = new RemoteWebDriver(new URL("http://192.168.1.6:4444/wd/hub"),cap);
		//driver = new ChromeDriver();
		landingPage = new RegistrationPageActions(driver);
		items = new LoginPageActions(driver);
//		placeOrder = new PlaceOrderActions(driver);
		checkOut = new DashBoardPageActions(driver);
  }
}
