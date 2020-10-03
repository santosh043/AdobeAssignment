package stepDefinitions;

import static org.junit.Assert.assertTrue;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.UserHomePage;
import runners.TestRunner;

public class EndToEndSteps {
	
	public WebDriver driver = TestRunner.driver;
	public HomePage homePage = TestRunner.homePage;
	public LoginPage loginPage = TestRunner.loginPage;
	public UserHomePage userHomePage  = TestRunner.userHomePage;

	private static Logger log = Logger.getLogger("EndToEndSteps");

	@When("^logon with valid user name \"([^\"]*)\" and valid password \"([^\"]*)\"$")
	public void logon_with_valid_user_name_and_valid_password(String username, String password) throws InterruptedException {
	   
		log.info("logon_with_valid_user_name_and_valid_password");
		assertTrue(true);	
	}


	@When("^go to Flight Booking page$")
	public void go_to_Flight_Booking_page() {
	    
		log.info("go_to_Flight_Booking_page()");
	
		assertTrue(true);	
		
	}

	@When("^he search for Round Trip booking$")
	public void he_search_for_Round_Trip_booking() {
		
		log.info("he_search_for_Round_Trip_booking()");

		assertTrue(true);	
	}

	@When("^moves to Flight details page$")
	public void moves_to_Flight_details_page() {
		
		log.info("moves_to_Flight_details_page");
		assertTrue(true);	
	   
	}

	@When("^choose departure flight and return flight$")
	public void choose_departure_flight_and_return_flight() {
	   
		log.info("choose_departure_flight_and_return_flight");
		assertTrue(true);	
	}

	@When("^moves to Traveller details page$")
	public void moves_to_Traveller_details_page() {
		
		log.info("moves_to_Traveller_details_page");
		assertTrue(true);	
	    
	}

	@When("^enters travellers details$")
	public void enters_travellers_details() {
		
		log.info("enters_travellers_details");
		assertTrue(true);	
	   
	}

	@When("^moves to AddOns page$")
	public void moves_to_AddOns_page() {
		
		log.info("moves_to_AddOns_page");
		assertTrue(true);	
	    
	}
	@When("^select addons$")
	public void select_addons() {
		
		log.info("select_addons");
		assertTrue(true);	
	    
	}

	@When("^moves to Seat assignments page$")
	public void moves_to_Seat_assignments_page() {
		
		log.info("moves_to_Seat_assignments_page");
		assertTrue(true);	
	    
	}

	@When("^select seat assignments$")
	public void select_seat_assignments() {
		
		log.info("select_seat_assignments");
		assertTrue(true);	
	    
	}

	@When("^moves to payment details page$")
	public void moves_to_payment_details_page() {
		
		log.info("moves_to_payment_details_page");
		assertTrue(true);	
	   
	}

	@When("^enter payments details$")
	public void enter_payments_details() {
		
		log.info("enter_payments_details");
		assertTrue(true);	
	   
	}

	@Then("^moves to order success page$")
	public void moves_to_order_success_page() {
		
		log.info("moves_to_order_success_page");
		assertTrue(true);	
	   
	}

}
