package com.flyaway.definitions;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.flyaway.actions.BookingConfirmationPageActions;
import com.flyaway.actions.BookingPageActions;
import com.flyaway.actions.DashBoardPageActions;
import com.flyaway.actions.HomePageActions;
import com.flyaway.actions.LoginPageActions;
import com.flyaway.actions.RegistrationPageActions;
import com.flyaway.locators.BookingConfirmationPageLocators;
import com.flyaway.locators.BookingPageLocators;
import com.flyaway.locators.HomePageLocators;
import com.flyaway.locators.LoginPageLocators;
import com.flyaway.locators.RegistrationPageLocators;
import com.flyaway.utils.HelperClass;
import com.github.javafaker.Faker;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class BookFlightFlyAwayDef extends HelperClass {
	public static String email;
	public static String password;
	public static String confirmpassword;
	public static String name;
	public static String address;
	public static String city;

	
	Faker faker = new Faker(); 

	@Before
	public void genarateuser_data() {
		email=faker.internet().emailAddress();
		password=faker.internet().password();
		confirmpassword=faker.internet().password();
		name=faker.name().name();
		address=faker.address().fullAddress();
		city=faker.address().city();
		
		System.out.println(email);
		System.out.println(password);
		System.out.println(name);
		System.out.println(address);
		System.out.println(city);
	} 
	@Given("Navigate to the landing page of Flyaway {string}")
	public void navigate_to_the_landing_page_of_swiggy(String url) {
		//Navigate to site
		HelperClass.openPage(url);
		//Verify the navigation
		Assert.assertTrue(getDriver().getTitle().equals("Fly Away - Register")); 
//		System.out.println(email);
	}
	
	
	@When("Enter Registration Details")
	public void enter_registration_Details() throws IOException, InterruptedException {
		
		RegistrationPageActions.enterRegisterDetails(email,password,confirmpassword,name,address,city);
		RegistrationPageActions.clickSignUpButton();
		
	}
	
	@Then("Validate Registration Page")
	public void validate_registration_page() throws InterruptedException, IOException {
		System.out.println("Redirecting to the Registration confirmation Page.......");
		//Validate Page Title
		Assert.assertTrue(getDriver().getTitle().equals("Fly Away - Registration Confirmation"));
		//validate the text of "Login to continue checking flights"
		Assert.assertEquals("Login to continue checking flights",RegistrationPageLocators.loginToContinueCheckingFlightsLink(getDriver()).getText());
	}
	
	@And("Direct Login Page")
	public void Direct_login_page() throws InterruptedException {
		
		RegistrationPageActions.clickloginButton();

	}
	
	@Then("Validate Login Page")
	public void validate_login_page() throws InterruptedException {
		Assert.assertTrue(getDriver().getTitle().equals("Fly Away - Login"));
		//validate the text of "Login to continue checking flights"
		Assert.assertEquals("FLYAWAY - MEMBER LOGIN",LoginPageLocators.textFlyawayMemberLogin(getDriver()).getText());
	}
	
	@And("Enter Login Details")
	public void search_resturant() throws InterruptedException {
		LoginPageActions.enterEmailID(email);
		LoginPageActions.enterPassword(password);
		LoginPageActions.clickLoginButton();

	}
	
	@And("Click on Home Button")
	public void Select_Pizza_Hut() throws InterruptedException {
		DashBoardPageActions.clickHomeButton();

	}
		
	@Then("Validate Home Page")
	public void validate_home_page() throws InterruptedException {
		Assert.assertTrue(getDriver().getTitle().equals("Fly Away"));
		Assert.assertEquals("FLYAWAY HOMEPAGE",HomePageLocators.homePageText(getDriver()).getText());
	}
	
	@And("Select Source and Destination")
	public void select_source_and_destination() throws InterruptedException {
		HomePageActions.selectSourse();
		HomePageActions.selectBangalore();
		HomePageActions.selectDestination();
		HomePageActions.selectChennai();
		HomePageActions.clickSubmitButton();
	}
	
	@And("Book Flight")
	public void book_flight() throws InterruptedException {
		HomePageActions.clickBookFlight();
	}
				
	@Then("Verify Booking Page")
	public void verify_booking_page() throws InterruptedException {
		Assert.assertTrue(getDriver().getTitle().equals("Fly Away - Make Flight Booking"));
		Assert.assertEquals("FLYAWAY - PAYMENT GATEWAY",BookingPageLocators.paymentGatewayText(getDriver()).getText());	 
		Assert.assertEquals("Click to complete booking",BookingPageLocators.ClickToCompleteBookingLink(getDriver()).getText());
	}
	
	@And("Click To Complete Booking Link")
	public void click_to_complte_booking_link() throws InterruptedException {
		BookingPageActions.clickCompleteBook();
	}
	
	@Then("Varify Booking Confirmation Page")
	public void varify_booking_confirmation_page() throws InterruptedException {
		Assert.assertTrue(getDriver().getTitle().equals("Fly Away - Booking Confirmation"));
		Assert.assertEquals("FLYAWAY - BOOKING CONFIRMATION",BookingConfirmationPageLocators.bookingConfirmationText(getDriver()).getText());
		Assert.assertEquals("See Your Bookings",BookingConfirmationPageLocators.seeYourBookingsLink(getDriver()).getText());
	}
	@And("Click on See Your Booking")
	public void click_on_see_your_booking() throws InterruptedException {
		BookingConfirmationPageActions.clickCompleteBook();
	}
}
