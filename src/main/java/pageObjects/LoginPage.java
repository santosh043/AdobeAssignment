package pageObjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.RespositoryParser;
import utils.WebActions;


public class LoginPage {

	   WebDriver driver;
	   private static Logger log = Logger.getLogger("LoginPage");
	  
	   public LoginPage(WebDriver driver)
	   {
		this.driver = driver;		
	   }
	   
		/*
		 * By txtboxLoginId = By.xpath("//input[@placeholder='Mobile Number']"); By
		 * txtboxPassword = By.xpath("//input[@type='password']"); By buttonLogin =
		 * By.xpath("//input[@type='submit']"); By errorMessageLogin = By.
		 * xpath("//div[@id='errorSectionContent']/p[contains(text(),'The User Id or Password entered is not valid.')]"
		 * ); By byLogin = By.xpath("//div[@class='heading-memberlogin']");
		 */
	   
	   By txtboxLoginId = RespositoryParser.getbjectLocator("txtboxLoginId");	   
	   By txtboxPassword = RespositoryParser.getbjectLocator("txtboxPassword");  
	   By buttonLogin = RespositoryParser.getbjectLocator("buttonLogin");
	   By errorMessageLogin = RespositoryParser.getbjectLocator("errorMessageLogin");
	   By byLogin = RespositoryParser.getbjectLocator("byLogin"); 
	   
	   public WebElement getTxtboxLoginId()
	   {
		   log.info("inside getTxtboxLoginId() method");
		   return  WebActions.getElement(driver, txtboxLoginId);
	   }
	   
	   public WebElement getTxtboxPassword()
	   {
		   log.info("inside getTxtboxPassword() method");
		   return  WebActions.getElement(driver, txtboxPassword);
	   }
	   
	   public WebElement getButtonLogin()
	   {
		   log.info("inside getButtonLogin() method");
		   return  WebActions.getElement(driver, buttonLogin);
	   }
	   
	   public WebElement getErrorMessageLogin()
	   {
		   log.info("inside getErrorMessageLogin() method");		   
		   return  WebActions.getElement(driver, errorMessageLogin);
	   }	    
	   
	   
	   public void verifyLoginPage()
	   {
		   log.info("inside verifyLoginPage() method");
		   WebActions.isElementPresent(driver,byLogin);
	   }
	   
	   public boolean enterUsername(String username)
	   {
		   log.info("inside enterUsername() method");
		   try 
		   {
		   getTxtboxLoginId().sendKeys(username);
		   return true;
		   }
		   catch(Exception e)
		   {
			   return false;
		   }
	   }
	   
	   public boolean enterPassword(String password)
	   {
		   log.info("inside enterPassword() method");
		   try {
		   getTxtboxPassword().sendKeys(password);
		   return true;
		   }
		   catch(Exception e)
		   {
			   return false;
		   }
	   }
	   
	   public boolean clickLoginButton() throws InterruptedException  
	   {
		   log.info("inside clickLoginButton() method");
		   try
		   {
		   WebActions.waitForElementClickable(driver, buttonLogin);
		   WebActions.waitTime(2000);		  
		   getButtonLogin().click();		  
		    return true;
	        }
	       catch(Exception e)
	       {
		   return false;
	       }
		  
		   
	   }
	   
	   public boolean verifyLoginErrorMessage() 
	   {
		   log.info("inside verifyLoginErrorMessage() method");
		 return  WebActions.isElementPresent(driver,errorMessageLogin );		   
	   }
	   
	   public void Login(String username, String password) throws InterruptedException
	   {
		   log.info("inside Login() method");
		   enterUsername(username);
		   enterPassword(password);
		   clickLoginButton();
		   
	   }
	   
}
