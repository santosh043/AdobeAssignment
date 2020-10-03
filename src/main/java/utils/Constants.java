package utils;

public class Constants {
	
	public static final String HomePageURL = "https://www.spicejet.com";
	public static final String chromeDriverPath = System.getProperty("user.dir")+"\\drivers\\chromedriver.exe";
	public static final String geckoDriverPath= System.getProperty("user.dir")+"\\drivers\\geckodriver.exe";
	public static final String log4jConfigPath= System.getProperty("user.dir")+"\\src\\test\\resources\\Log4j.xml";
	public static final String extentReportConfigPath= System.getProperty("user.dir")+"\\src\\test\\resources\\extent-config.xml";
	public static final String testDataFilePath= System.getProperty("user.dir")+"\\src\\test\\resources\\testdata\\testdata.xlsx";
	public static final String objectRepoPath= System.getProperty("user.dir")+"\\src\\test\\resources\\ObjectRepo.properties";
	
	public static final String USERNAME = "san043";
	public static final String ACCESS_KEY = "3dfd1c34-2850-483c-924c-82798db19dce";
	public static final String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.eu-central-1.saucelabs.com:443/wd/hub";
}
