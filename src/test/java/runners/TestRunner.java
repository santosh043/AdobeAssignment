package runners;


import org.apache.log4j.xml.DOMConfigurator;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.UserHomePage;
import utils.Constants;
import utils.ExcelUtils;
import utils.RespositoryParser;
import utils.WebActions;

@RunWith(Cucumber.class)
@CucumberOptions(
		strict = true,
        features = "src/test/resources/functionalTests",
        glue = {"stepDefinitions"},   
        plugin = {"pretty", "json:target/cucumber-reports/Cucumber.json",
       		 "junit:target/cucumber-reports/Cucumber.xml",
       		 "html:target/cucumber-reports" ,
       		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
       		}

)
public class TestRunner {

	public static WebDriver  driver;
	public static HomePage homePage;
	public static LoginPage loginPage;
	public static UserHomePage userHomePage;	
	
	@BeforeClass
    public static void setup() throws Exception {		
						
		DOMConfigurator.configure(Constants.log4jConfigPath);
		RespositoryParser.getRespositoryParser(Constants.objectRepoPath);
		ExcelUtils.setExcelFile(Constants.testDataFilePath, "Sheet1");
		driver = WebActions.openBrowser("remote","windows 10","firefox","80.0");
		 homePage = new HomePage(driver);
		 loginPage = new LoginPage(driver);
		 userHomePage = new UserHomePage(driver);  
		 
    }

    @AfterClass
    public static void teardown() {    	
    	  
    	WebActions.closeBrowser(driver);
        
    }

	

}