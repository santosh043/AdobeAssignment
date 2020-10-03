package pageObjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.RespositoryParser;
import utils.WebActions;

public class UserHomePage {
	
	WebDriver driver;
	private static Logger log = Logger.getLogger("UserHomePage");
	
	   public UserHomePage(WebDriver driver)
	   {
		this.driver = driver;			
	   }	 
	   
		/*
		 * By menuLogout = By.xpath("//ul[@id='top-header']/li/a[@id='Login']"); By
		 * menuBook = By.xpath("//li[@id='header-book']/a");
		 */
	   
	   By menuLogout = RespositoryParser.getbjectLocator("menuLogout");  
	   By menuBook = RespositoryParser.getbjectLocator("menuBook");
	   By txtHeaderUserHome = RespositoryParser.getbjectLocator("txtHeaderUserHome");
	   
	   public WebElement getMenuLogout()
	   {
		   log.info("Inside getMenuLogout()");
		   return  WebActions.getElement(driver, menuLogout);
	   }
	   
	   public WebElement getMenuBook()
	   {
		   log.info("Inside getMenuBook()");
		   return  WebActions.getElement(driver, menuBook);
	   }
	   
	   
	   public boolean verifyLoginSuccesPage()
	   {
		   log.info("Inside verifyLoginSuccesPage()");
		   return  WebActions.isElementPresent(driver, txtHeaderUserHome);
	
	   }
	   
	 	   
	   public void bookClick()
	   {
		   log.info("Inside bookClick()");
		   getMenuBook().click();
	   }
	   
	   public void logout()
	   {
		   log.info("Inside logout()");
		   getMenuLogout().click();
	   }

}
