package com.TestNGDemo.src.TestNGConcepts;

import org.testng.annotations.Test;
//import org.testng.AssertJUnit;
//import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;



public class PriorityDemo {
	
	WebDriver driver;
@BeforeMethod
public void setup() {
	System.setProperty("webdriver.chrome.driver","C:\\develop\\TestNGDemo\\driver\\chromedriver.exe");
	driver=new ChromeDriver();
	 driver.get("https://www.edureka.co/");
	driver.manage().deleteAllCookies();
	 	
}

@Test(priority=0)
public void verifylogin() {
	driver.get("https://www.edureka.co/login");
	driver.manage().window().maximize();
	driver.findElement(By.id("si_popup_email")).sendKeys("charishmaraopolineni@gmail.com");
	driver.findElement(By.cssSelector("#si_popup_passwd")).sendKeys("cherry123");
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//*[@id='new_sign_up_mode']/div/div/div[2]/div[3]/form/button")).click();
	driver.findElement(By.id("dropdownMenu3")).sendKeys("From xpath");
	driver.findElement(By.xpath("//*[@id='navbar']/ul/li[3]/div/ul/li[2]/a")).click();
	driver.findElement(By.xpath("//*[@id='header-II']/section/nav/div/ul[2]/li[1]/a")).sendKeys("From xpath");
	driver.findElement(By.xpath("//*[@id=\"header-II\"]/section/nav/div/ul[2]/li[1]/ul/li[7]/a")).sendKeys("From xpath");
	driver.findElement(By.xpath("//*[@id=\"header-II\"]/section/nav/div/ul[2]/li[1]/ul/li[7]/a")).click();
	
}

@Test(dependsOnMethods= {"verifylogin"}, alwaysRun=true)
public void verifysignup()  {
	driver.manage().window().maximize();
	  driver.findElement(By.linkText("Sign Up")).click();
      driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);  
    WebDriverWait Wait=new WebDriverWait(driver,30); Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"sg_popup_email\"]")));
      driver.findElement(By.xpath("//*[@id=\"sg_popup_email\"]")).sendKeys("charishmaraopolineni@gamil.com");
      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
      driver.findElement(By.xpath("//*[@id=\"sg_popup_phone_no\"]")).sendKeys("19356875483");
      driver.findElement(By.xpath("//*[@id=\"sg_popup_phone_no\"]")).click();
      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
      Actions act=new Actions(driver);
      act.moveToElement(driver.findElement(By.xpath("//*[@id=\"signupForm\"]/div[6]/button"))).click().build().perform();
      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		e.printStackTrace();
		 driver.findElement(By.xpath("//*[@id=\"pwd3\"]")).sendKeys("charishmaraopolineni@gmail.com");
		String error=driver.findElement(By.xpath("//*[@id=\"signup_error_message\"]")).getText();
	    System.out.println("error");
	 
		
		
	}
} 
	
@AfterMethod() 
	public void Usage() {
	System.out.println("perform validation");
	driver.quit();
	
}
}