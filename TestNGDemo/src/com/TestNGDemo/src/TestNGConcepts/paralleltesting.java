package com.TestNGDemo.src.TestNGConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class paralleltesting {
	public WebDriver driver;
  @Test
  public void test1() {
	  System.out.println("from test1");
  }
  @BeforeClass
  @Parameters("browser")
  
  public void BeforeMethod(String browser) {
	  System.out.println("browser="+browser);
	  openBrowser(browser,"https://www.edureka.co/login");
  }
@AfterClass
public void afterMethod() {
	closeBrowser();
	// TODO Auto-generated method stub
	
}

public void openBrowser(String browserType,String url) {
	
	String currentDir= System.getProperty("user.dir");
	if(browserType.equalsIgnoreCase("Chrome")) {
		System.setProperty("webdriver.chrome.driver",currentDir+"\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	else if (browserType.equalsIgnoreCase("Firefox")) {
		System.setProperty("webdriver.gecko.driver",currentDir+"\\driver\\geckodriver.exe");
		driver=new FirefoxDriver();
	}
if(url.isEmpty()) {
	url="about:blank";
}
driver.manage().window().maximize();
driver.get(url);
}
public void closeBrowser() {
	if(driver !=null) {
		driver.quit();
	}
}
}