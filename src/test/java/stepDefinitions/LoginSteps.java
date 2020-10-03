package stepDefinitions;

import static org.junit.Assert.assertTrue;

import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.UserHomePage;
import runners.TestRunner;
import utils.ExcelUtils;
import utils.WebActions;

public class LoginSteps {
	
	public WebDriver driver = TestRunner.driver;
	
	public HomePage homePage = TestRunner.homePage;
	public LoginPage loginPage = TestRunner.loginPage;
	public UserHomePage userHomePage  = TestRunner.userHomePage;
	
	private static Logger log = Logger.getLogger("LoginSteps");
	
	
	@Given("^user is on home page$")
	public void user_is_on_home_page() {	
		log.info("user is on home page step");
		assertTrue(homePage.verifyHomePage());	  
		
	}
	
	@When("^go to login page$")
	public void go_to_login_page() throws InterruptedException {	
	
		log.info("go to login page step");
		assertTrue(homePage.spiceClubMembersMemberLoginClick());	   
	}
	
	
	@When("^enter username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void logon_with_valid_username_and_valid_password(String usernameRow, String passwordRow) throws Exception {
	   		
		log.info("logon_with_valid_username_and_valid_password step");
		log.info("usernameRow= "+usernameRow +" passwordRow= "+passwordRow);
		String username = ExcelUtils.getCellData(Integer.parseInt(usernameRow), 1);
		String password = ExcelUtils.getCellData(Integer.parseInt(passwordRow), 2);
		log.info("username="+username +" password="+password );
		assertTrue(loginPage.enterUsername(username) && loginPage.enterPassword(password));
		
	}
	
	/*
	 * @When("^enter username \"([^\"]*)\" and password \"([^\"]*)\"$") public void
	 * logon_with_valid_username_and_valid_password(String username, String
	 * password) throws InterruptedException {
	 * 
	 * log.info("logon_with_valid_username_and_valid_password step");
	 * assertTrue(loginPage.enterUsername(username) &&
	 * loginPage.enterPassword(password));
	 * 
	 * }
	 */
	
	@When("^click login button$")
	public void click_login_button() throws InterruptedException    {	
		
		log.info("click login button step");			
		assertTrue(loginPage.clickLoginButton());	   
	}
 
	@When("^moves to login success page$")
	public void moves_to_loginsuccess_page() {
	 
		log.info("moves to login success page");
		userHomePage.verifyLoginSuccesPage();	    
	}
	
	@When("^user logout of the application$")
	public void user_logout_of_the_application() {
	 
		log.info("user logout of the application");
		userHomePage.logout();	    
	}
	
	@When("^user see login failure message$")
	public void user_see_login_failure_message() {
	 
		log.info("user see login failure message");
		assertTrue(loginPage.verifyLoginErrorMessage());	    
	}
	
	@AfterStep
	public void afterSite(Scenario scenario) {	
		if(scenario.isFailed())		
		WebActions.getScreenshot(scenario, driver);
	}
	
}
