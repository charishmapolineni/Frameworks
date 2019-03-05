package testNG;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeMethod;

//import static org.testng.Assert.assertEquals;

//import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.TestNGException;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import o//rg.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;

public class TestNGCode {
  public static  WebDriver driver;
	
	//public void setupSelenium(String browserType,String url)  
	
		//String currDir=System.getProperty("user.dir");
		//if(browserType.equalsIgnoreCase("Chrome")) {
			//System.setProperty("webdriver.chrome.driver", currDir+"//driver//chromedriver.exe");
			//driver=new ChromeDriver();
			//setupSelenium("chrome","https://www.edureka.co/login");
		//}
	//}
	 
		  //setupSelenium("chrome","https://www.edureka.co/login");
  @BeforeMethod
  public void beforeMethod() {
  }
  
	  public void setupSelenium(String browserType,String url)  
		{
			String currDir=System.getProperty("user.dir");
			if(browserType.equalsIgnoreCase("Chrome")) {
				System.setProperty("webdriver.chrome.driver", currDir+"//driver//chromedriver.exe");
				driver=new ChromeDriver();
				setupSelenium("chrome","https://www.edureka.co/login");
			}
	  //setupSelenium("chrome","https://www.edureka.co/login");
	 
		  
	  
  }
 
  @Test
  public void verifyloginpage()  {
	 
	 
	  
	  driver.get("https://www.edureka.co/login"); //get edureka page//
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("#si_popup_email")).sendKeys("charishmaraopolineni@gmail.com");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("#si_popup_passwd")).sendKeys("cherry123");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='new_sign_up_mode']/div/div/div[2]/div[3]/form/button")).click();
		driver.findElement(By.id("dropdownMenu3")).sendKeys("From id");
		  driver.findElement(By.xpath("//*[@id='navbar']/ul/li[3]/div/ul/li[2]/a")).click();
		 driver.findElement(By.xpath("//*[@id='header-II']/section/nav/div/ul[2]/li[1]/a")).sendKeys("From xpath");
		 driver.findElement(By.xpath("//*[@id=\"header-II\"]/section/nav/div/ul[2]/li[1]/ul/li[7]/a")).sendKeys("From xpath");
		  driver.findElement(By.xpath("//*[@id=\"header-II\"]/section/nav/div/ul[2]/li[1]/ul/li[7]/a")).click();
  }
  
		  @Test
		  public void verifysignuppage()  {
		  driver.get("https://www.edureka.co/");
		  //driver.findElement(By.linkText("//a[contains(text(),'Sign Up']")).click();
		  driver.findElement(By.linkText("Sign Up")).click();
		  //driver.findElement(By.xpath("//*[@id=\"header-II\"]/section/nav/div/a[1]")).click();
		  WebDriverWait Wait=new WebDriverWait(driver,30); Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='signupmail']")));
		  driver.manage().timeouts().implicitlyWait(500,TimeUnit.SECONDS);
		  driver.findElement(By.xpath("//*[@id=\"signupname\"]")).sendKeys("charishma polineni");
		  //WebDriverWait Wait1=new WebDriverWait(driver,30); Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"signupmail\"]")));
		  //driver.findElement(By.xpath("//*[@id=\"signupmail\"]")).sendKeys("charishmaraopolineni@gmail.com");
		  driver.findElement(By.xpath("//*[@id=\"sg_popup_email\"]")).sendKeys("charishmaraopolineni@gmail.com");
		  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		  driver.findElement(By.xpath("//*[@id='sg_popup_phone_no']")).sendKeys("19039071909");
		  driver.findElement(By.xpath("//*[@id=\"pwd3\"]")).sendKeys("charishmaraopolineni@gmail.com");
		  driver.findElement(By.xpath("//*[@id=\"signupForm\"]/div[6]/button")).click();
		 
		 //driver.findElement(By.xpath("//[@id=\"signuptelno\"]")).sendKeys("19039071909"); 
		  
		  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		 //driver.findElement(By.xpath("//*[@id=\"pwd3\"]")).sendKeys("charishmaraopolineni@gmail.com");
		 //driver.findElement(By.xpath("//*[@id=\"signupForm\"]/div[6]/button")).click()

		 //String error=driver.findElement(By.xpath("//*[@id=\"signup_error_message\"]")).getText();
		  }
		 
		 
		 //System.out.println("error");
		 

		
  
  

  @AfterMethod
  public void afterMethod() {
	  System.out.println("HHH");
  }

}
