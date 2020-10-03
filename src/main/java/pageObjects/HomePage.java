package pageObjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.RespositoryParser;
import utils.WebActions;

public class HomePage {
	
	WebDriver driver;
	private static Logger log = Logger.getLogger("HomePage");

	   public HomePage(WebDriver driver)
	   {
		this.driver = driver;				
	   }

	   
		/*
		 * By menuLogin = By.xpath("//a[contains(text(),'Login / Signup')]"); 
		 * By menuElementSpiceClubMembers = By.xpath("//a[text()='SpiceClub Members']"); 
		 * By menuElementMemberLogin = By.xpath("//a[text()='SpiceClub Members']//parent::li/ul/li/a[text()='Member Login']");
		 */

	  
		  By menuLogin = RespositoryParser.getbjectLocator("menuLogin");
		  By menuElementSpiceClubMembers = RespositoryParser.getbjectLocator("menuElementSpiceClubMembers");
		  By menuElementMemberLogin = RespositoryParser.getbjectLocator("menuElementMemberLogin");
		
	   	   
	   public WebElement getMenuLogin()
	   {
		  
		   log.info("inside getMenuLogin()");
		   return  WebActions.getElement(driver, menuLogin);
	   }
	   public WebElement getMenuElementSpiceClubMembers()
	   {
		   log.info("inside getMenuElementSpiceClubMembers()");
		   return  WebActions.getElement(driver, menuElementSpiceClubMembers);
	   }
	   
	   public WebElement getMenuElementMemberLogin()
	   {
		   log.info("inside getMenuElementMemberLogin()");
		   return  WebActions.getElement(driver, menuElementMemberLogin);
	   }
	   
	   
	   public boolean verifyHomePage()
	  {
		   log.info("inside verifyHomePage()");
		 return  WebActions.isElementPresent(driver, menuLogin );
	  }
	   	   	   
	   
	   public boolean spiceClubMembersMemberLoginClick() throws InterruptedException
	   {
		   log.info("inside spiceClubMembersMemberLoginClick()");
		 if( WebActions.waitForElementClickable(driver, getMenuLogin())	)
		 {
		   WebActions.waitTime(2000);
		 try
		 {
		   Actions actions = new Actions(driver);
		   actions.moveToElement(getMenuLogin()).build().perform();	
		   
		   WebElement subMenu = getMenuElementSpiceClubMembers();
		  WebActions.waitForElementClickable(driver, subMenu);		  
		   actions.moveToElement(subMenu).perform();	
		   
		   WebElement subMenu2 = getMenuElementMemberLogin();
		   actions.click(subMenu2).perform();
		   return true;
		 }
		 catch(Exception e)
		 {
			 log.info(" spiceClubMembersMemberLoginClick() failed . Exception="+e.getMessage());
			 return false;
		 }
		 }
		 else 
		 {
			 return true;
		 }
	   }    
	   
}
