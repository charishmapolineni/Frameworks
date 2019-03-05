package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.AfterSuite;

public class login {
	WebDriver driver;
	public void setup(String browser,String url) {
		String currDir = System.getProperty("user.dir");
		//if(browserType.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", currDir+"//driver//chromedriver.exe");
			driver=new ChromeDriver();
				
		driver.get(url);
	}
	
	public void quitBrowser() {
		driver.quit();
	}

  
  
  @BeforeSuite
  public void beforeSuite() {
	  setup("chrome","https://accounts.google.com");
  }

  @AfterSuite
  public void afterSuite() {
  }
  @Test
  public void logingmail
  ()
 {
	loginTest login_page=PageFactory.initElements(driver,loginTest.class);
	

	  login_page.email("charishmaraopolineni@gmail.com");
	  login_page.next();
	  
	  WebDriverWait Wait=new WebDriverWait(driver,30);Wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='password']")));
	  login_page.password("cherryrao");
	  login_page.passcontent();
	  WebDriverWait Wait1=new WebDriverWait(driver,30);Wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='aic']")));
	 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);	
	  login_page.compose();
	 
	 WebDriverWait Wait2=new WebDriverWait(driver,30);Wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//textarea[@class='vO']")));
	 //driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	  login_page.recipent("charishmaraopolineni@gmai.com");
	  login_page.subject("edureka portal");
	  login_page.send();
			  
	 
  }

}
