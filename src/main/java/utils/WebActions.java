package utils;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import io.cucumber.java.Scenario;

public class WebActions {
	
	public static WebDriver driver;	
	private static Logger log = Logger.getLogger("WebActions");
	public static WebDriver openBrowser(String machine, String platform, String browser, String browserVesrion) throws MalformedURLException
	{			
		log.info("inside openBrowser() method");
		
		if(machine.equals("local"))
		{
			log.info("Execution in local");			
					    
		if(browser.equals("firefox"))
		{			
			System.setProperty("webdriver.gecko.driver", Constants.geckoDriverPath);
			FirefoxOptions options = new FirefoxOptions();
			options.setCapability(CapabilityType.PLATFORM_NAME, platform); 
			options.setCapability(CapabilityType.BROWSER_VERSION, browserVesrion);
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability(FirefoxOptions.FIREFOX_OPTIONS, options);
			options.merge(capabilities);
			driver = new FirefoxDriver(options);			
			log.info("firefox browser initialized");
		}
		else 
		if(browser.equals("chrome"))
		{			
			System.setProperty("webdriver.chrome.driver", Constants.chromeDriverPath);
			ChromeOptions options = new ChromeOptions();
			options.setCapability(CapabilityType.PLATFORM_NAME, platform); 
			options.setCapability(CapabilityType.BROWSER_VERSION, browserVesrion);
			options.setPageLoadStrategy(PageLoadStrategy.EAGER);
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability(ChromeOptions.CAPABILITY, options);
			options.merge(capabilities);
			driver = new ChromeDriver(options);
			
			log.info("chrome browser initialized");
		}	
	}
		if(machine.equals("remote"))
		{	
			log.info("Execution in remote");
			
			DesiredCapabilities caps = null;
			if(browser.equals("chrome"))
			{
			   caps = DesiredCapabilities.chrome();				 
			}
			else
			if(browser.equals("firefox"))
			{
				 caps = DesiredCapabilities.firefox();				 
			}
						
		    caps.setCapability("platform", platform);
		    caps.setCapability("version", browserVesrion);			    
		     driver = new RemoteWebDriver(new URL(Constants.URL), caps);		
			
		}
		
		driver.manage().window().maximize();		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.get(Constants.HomePageURL);				
		return driver;
	}
	
	public static void closeBrowser(WebDriver driver)
	{
		log.info("inside closeBrowser() method");
		try 
		{			
			driver.close();
		}
		catch (Exception e) 
	    {			
		 log.error("browser not closed Exception = " +e.getMessage());	
		 throw(e);
		 
		}
	}
	
	public static void openPage(String url)
	{		
		log.info("inside openPage() method");
		try 
		{
		driver.get(url);
		}
	   catch (Exception e) 
       {			
	     log.error(url + "not opened .  Exception = " +e.getMessage());	
	    throw(e);	 
	   }
    
	}
	
	public static WebElement getElement(WebDriver driver, By by) 
	{
		log.info("inside getElement() method");
		WebElement ele = null;		 
		try {						
		    WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(by));							
			ele = driver.findElement(by);	
			log.info("Webelement founded = " +ele);	
			return ele;
			} 
		 catch (Exception e) 
		    {			
			log.error("Webelement not found = " +e.getMessage());	
			 throw(e);			 
			}
		
		
	}
	public static boolean isElementPresent(WebDriver driver , By ele)
	{
		log.info("inside isElementPresent() method");	
		try {
			
		    WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(ele));			
			driver.findElement(ele);		
			log.info(" isElementPresent() sucess");
			return true;
			} 
		 catch (Exception e) {
			 log.error(" isElementPresent() failed. Exception="+e.getMessage());
			 return false;
			}
			
	}
	
	public static WebElement waitForElementPresent(WebDriver driver , By ele)
	{			
		log.info("inside waitForElementPresent() method");	
		
		WebElement element=null;
		try {
		    WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(ele));			
			element =driver.findElement(ele);
			log.info("element present");	
		    }
		catch(Exception e)
		{
			log.error("element not present. Exception="+e.getMessage());
		    
		}
		
		return element;
					
	}
	
	public static boolean waitForElementClickable(WebDriver driver , WebElement ele)
	{			
	    	log.info("inside waitForElementClickable() method");	  	
	    	try {
		    WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.elementToBeClickable(ele));
			log.info(" waitForElementClickable() succes");			
			return true;
	    	}
	    	catch(Exception e)
	    	{	    		
	    		log.error(" waitForElementClickable() failed. Exception="+e.getMessage());	  
	    		return false;
	    		 
	    	}
			
	}
	public static boolean waitForElementClickable(WebDriver driver , By ele)
	{			
		  log.info("inside waitForElementClickable() method");	
		   try
		   {
		    WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.elementToBeClickable(ele));
			return true;
		   }
	       catch(Exception e)
	       {	    		
		    log.error(" waitForElementClickable() failed. Exception="+e.getMessage());	 
		    return false;
		    
	       }
			
	}
	
	public static void waitTime(int millisec) throws InterruptedException
	{
		Thread.sleep(millisec);
	}

	
    public static void getScreenshot(Scenario scenario, WebDriver driver)
    {	
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
		//scenario.write("this is my failure message……….");
		scenario.embed(screenshot, "image/png","");		
	}
}
