package utils;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
 
import org.openqa.selenium.By;
 
public class RespositoryParser {
 
 public static FileInputStream propertyFile;
 public String RepositoryFile;
 public static Properties properties = new Properties();
 
 public static void  getRespositoryParser(String fileName) throws IOException
 {
 //this.RepositoryFile = fileName;
  propertyFile = new FileInputStream(fileName);
  properties.load(propertyFile);
 
 }
 
 public static By getbjectLocator(String locatorName)
 {
 String locatorProperty = properties.getProperty(locatorName);
  String locatorType = locatorProperty.split(";")[0];
 String locatorValue = locatorProperty.split(";")[1];
 
 By locator = null;
 switch(locatorType)
 {
 case "Id":
 locator = By.id(locatorValue);
 break;
 case "Name":
 locator = By.name(locatorValue);
 break;
 case "CssSelector":
 locator = By.cssSelector(locatorValue);
 break;
 case "LinkText":
 locator = By.linkText(locatorValue);
 break;
 case "PartialLinkText":
 locator = By.partialLinkText(locatorValue);
 break;
 case "TagName":
 locator = By.tagName(locatorValue);
 break;
 case "Xpath":
 locator = By.xpath(locatorValue);
 break;
 }
 return locator;
 }
}