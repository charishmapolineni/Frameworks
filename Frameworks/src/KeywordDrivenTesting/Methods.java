package KeywordDrivenTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;





public class Methods {
	 static WebDriver  driver;
	  //static Logger log = Logger.getLogger(Methods.class);
	 public static void openBrowser() {
		 System.setProperty("webdriver.chrome.driver","C:\\develop\\Frameworks\\driver\\chromedriver.exe");
			driver=new ChromeDriver();
	 }
	public static void navigate(String baseUrl) {
		driver.get(baseUrl);
		
	}	
		
public static void maximizeWindow() {
	driver.manage().window().maximize();
	
}

public static void enterInvalidUsername(String locators, String value, String param) {
	if(locators.equals("id")) {
		driver.findElement(By.id(value)).sendKeys(param);
	
	
}

	// TODO Auto-generated method stub
	
}
public static void enterInvalidPassword(String locators, String value, String param) {
	if(locators.equals("cssSelector")) {
		driver.findElement(By.cssSelector(value)).sendKeys(param);
	}	
}
public static void implimentWait() {
	driver.manage().window().maximize();
	
}
public static void clickSubmit(String locators, String value) {
	if(locators.equals("xpath")) {
		driver.findElement(By.xpath(value)).click();
	// TODO Auto-generated method stub
	
}

	
	// TODO Auto-generated method stub
	
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
	// TODO Auto-generated method stub
	
}
public static void implimentWait1() {
	driver.manage().window().maximize();
	
}
public static void navigateTo(String baseUrl) {
	driver.get(baseUrl);
	// TODO Auto-generated method stub
	
}
public static void openmyprofile(String locators, String value) {
	if(locators.equals("xpath")) {
		driver.findElement(By.xpath(value)).click();
	// TODO Auto-generated method stub
	
}
;
	// TODO Auto-generated method
	// TODO Auto-generated method stub
	
}
public static void navigate1(String baseUrl) {
	driver.get(baseUrl);
	// TODO Auto-generated method stub
	
}
public static void myprofilepage(String locators, String value) {
	if(locators.equals("xpath")) {
		driver.findElement(By.xpath(value)).click();
	// TODO Auto-generated method stub
	
}

	// TODO Auto-generated method stub
	


	
}
public static void clicklogout(String locators, String value) {
	if(locators.equals("xpath")) {
		driver.findElement(By.xpath(value)).click();
	// TODO Auto-generated method stub
	
}

	// TODO Auto-generated method stub
	
}
{
	
}


	
{
	// TODO Auto-generated method stub
	
}





	
	// TODO Auto-generated method stub
	
}

	
	



	

	


		
	


	




	// TODO Auto-generated metho
	// TODO Auto-generated method stub
	




