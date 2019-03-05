package project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.log4testng.Logger;



public class actions {
	public static WebDriver driver;
	  static Logger log = Logger.getLogger(actions.class);
	public static void openBrowser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\develop\\Frameworks\\src\\project\\actions\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		 log.info("This message is to open Url ");
		 log.warn("This is a warning message");
		 log.fatal("This is a fatal error message");
		 log.debug("This is debug error");
	

	}
	public static void navigateapplication(String baseUrl) {
		driver.get(baseUrl);
	}
	
		
	
	public static void maximizeWindow() {
	driver.manage().window().maximize();
	}
	

	
	

	
	
	
	
	
			
	
		// TODO Auto-generated method stub
		
	
{
		
	}





	

public static void loginportal(String locators, String value) {
	if(locators.equals("xpath")) {
		driver.findElement(By.xpath(value)).click();
	}
	
}
public static void enterinvalidusername(String locators, String value, String param) {
if(locators.equals("id")) {
	driver.findElement(By.id(value)).sendKeys(param);
}
	
}
public static void enterinvalidpassword(String locators, String value, String param) {
	if(locators.equals("cssSelector")) {
		driver.findElement(By.cssSelector(value)).sendKeys(param);
	}
	
	
}
public static void implimentWait() {
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	
}


	

public static void clickSubmit(String locators, String value) {
	if(locators.equals("xpath")) {
		driver.findElement(By.xpath(value)).click();
	}
	
	
}
public static void verifyMessage(String value, String message) {
	String expectedMessage = message;
	String actualMessage = driver.findElement(By.id(value)).getText();
	Assert.assertEquals(actualMessage, expectedMessage);
	
	
}
public static void opencoursesbrowser(String locators, String value) {
	if(locators.equals("id")) {
		driver.findElement(By.id(value)).click();
	}
	// TODO Auto-generated method stub
	
}
public static void openmyclassroompage(String locators, String value) {
	if(locators.equals("xpath")) {
		driver.findElement(By.xpath(value)).click();
		
	}
	

	}
	// TODO Auto-generated method stub
public static void myprofilepage(String locators, String value) {
	if(locators.equals("xpath")) {
		driver.findElement(By.xpath(value)).click();
	}
	// TODO Auto-generated method stub
	
}
public static void clicklogout(String locators, String value) {
	if(locators.equals("xpath")) {
		driver.findElement(By.xpath(value)).click();
	}

	
}
public static void closeBrowser() {
	driver.quit();
	
}
	
}
	
			
		
		
	
	



