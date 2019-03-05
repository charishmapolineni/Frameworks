package com.TestNGDemo.src.TestNGConcepts;




import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ProjectSelenium {
	

	WebDriver driver;
@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver","C:\\develop\\TestNGDemo\\driver\\Chromedriver.exe");
		driver=new ChromeDriver();
		 driver.get("https://www.edureka.co/");
		driver.manage().deleteAllCookies();
		 	
}
//@Test(priority=0)
//public void verifylogin() {
//driver.get("https://www.edureka.co/login");
	//driver.manage().window().maximize();
	//driver.findElement(By.id("si_popup_email")).sendKeys("charishmaraopolineni@gmail.com");
	//driver.findElement(By.cssSelector("#si_popup_passwd")).sendKeys("cherry123");
	//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	//driver.findElement(By.xpath("//*[@id='new_sign_up_mode']/div/div/div[2]/div[3]/form/button")).click();
	//driver.findElement(By.id("dropdownMenu3")).sendKeys("From xpath");
	//driver.findElement(By.xpath("//*[@id='navbar']/ul/li[3]/div/ul/li[2]/a")).click();
	//driver.findElement(By.xpath("//*[@id='navbar']/ul/li[3]/div/ul/li[1]/a")).sendKeys("From xpath");
	//driver.findElement(By.xpath("//*[@id='navbar']/ul/li[3]/div/ul/li[1]/a")).click();
	//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	//driver.findElement(By.className("icon-Home-page-close")).click();
	//driver.navigate().back();
	//driver.findElement(By.xpath("//*[@id=\"header-II\"]/section/nav/div/ul[2]/li[1]/a")).click();
	//driver.findElement(By.xpath("//*[@id=\"header-II\"]/section/nav/div/ul[2]/li[1]/ul/li[7]/a")).click();
	
//driver.findElement(By.id("search-inp")).sendKeys("Selenium certification training");
//WebDriverWait Wait=new WebDriverWait(driver,30); Wait.until(ExpectedConditions.elementToBeClickable(By.id("search-button-top")));
//driver.findElement(By.xpath("//*[@id=\"add-training-courses\"]/a[6]/div[1]/div[2]/div[2]/div[3]")).click();
//driver.findElement(By.xpath("//*[@id=\"add-training-courses\"]/a[6]/div[1]/div[2]/div[2]/div[3]/span[2]")).click();
//driver.findElement(By.xpath("//*[@id=\"batches\"]/div/div[2]/div/div/div[2]/div/a/button")).click();
//WebDriverWait Wait1=new WebDriverWait(driver,30); Wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"remote\"]/div/ul/li[2]/a")));

//driver.findElement(By.xpath("//*[@id='add-training-courses']/a/div[1]/div[2]/div[2]/div[3]/span[2]")).click();
//WebDriverWait Wait=new WebDriverWait(driver,30); Wait.until(ExpectedConditions.elementToBeClickable(By.tagName("startLearning")));
//WebDriverWait Wait=new WebDriverWait(driver,30); Wait.until(ExpectedConditions.elementToBeClickable(By.id("personal_details")));
//driver.findElement(By.name("start Learning")).click();
    
    

@Test(priority=1)
public void verifyBlogs() throws InterruptedException {
driver.get("https://www.edureka.co/");
driver.manage().window().maximize();
driver.findElement(By.xpath("//*[@id=\"header-II\"]/section/nav/div/a[2]")).click();
Thread.sleep(10000);
driver.findElement(By.id("si_popup_email")).sendKeys("charishmaraopolineni@gmail.com");
driver.findElement(By.cssSelector("#si_popup_passwd")).sendKeys("cherry123");
driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
driver.findElement(By.xpath("//*[@id='new_sign_up_mode']/div/div/div[2]/div[3]/form/button")).click();
//driver.findElement(By.xpath("//*[@id='new_sign_up_mode']/div/div/div[2]/div[3]/form/button")).click();
Thread.sleep(10000);
WebDriverWait Wait=new WebDriverWait(driver,30); Wait.until(ExpectedConditions.elementToBeClickable(By.id("dropdownMenu4")));
driver.findElement(By.id("dropdownMenu4")).sendKeys("From id");
driver.findElement(By.xpath("//*[@id='navbar']/ul/li[4]/div/ul/li[2]/a")).click();
driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
ArrayList<String>tabs = new ArrayList<String>(driver.getWindowHandles());
String handleName = tabs.get(1);
driver.switchTo().window(handleName);
driver.findElement(By.xpath("//input[@placeholder=\"Search edureka blogs\"]")).sendKeys("selenium ");
driver.findElement(By.xpath("//input[@placeholder=\"Search edureka blogs\"]")).sendKeys(Keys.ENTER);
//driver.findElement(By.xpath("//*[@id=\"content1\"]/div[1]/div/article/h2/a")).click();
String Search = driver.findElement(By.xpath("//*[@id=\"search-tag-name\"]")).getText();
System.out.println(Search);
if(Search.equals("selenium")) {
	System.out.println("The search is filtered for selenium");
	//WebDriverWait Wait=new WebDriverWait(driver,30); Wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Software Testing Blogs']")));
//driver.findElement(By.xpath("//*[text()='Software Testing Blogs']")).click();
	Thread.sleep(100000);
	driver.findElement(By.xpath("//*[text()=\"Interview Questions\"]")).click();
	WebDriverWait Wait1=new WebDriverWait(driver,30); Wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()=\"Interview Questions\"]")));
	driver.findElement(By.xpath("//*[text()=\"Top Selenium Interview Questions And Answers You Must Prepare In 2019\"]")).click();

//WebDriverWait Wait=new WebDriverWait(driver,30); Wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Software Testing")));
}
}
}


//@Test
//public void verifyMyclassroom() {
//driver.get("https://www.edureka.co/login");
//driver.manage().window().maximize();
//driver.findElement(By.id("si_popup_email")).sendKeys("charishmaraopolineni@gmail.com");
//driver.findElement(By.cssSelector("#si_popup_passwd")).sendKeys("cherry123");
//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
//driver.findElement(By.xpath("//*[@id='new_sign_up_mode']/div/div/div[2]/div[3]/form/button")).click();
//driver.findElement(By.id("passwdError")).sendKeys("From id");
	//driver.findElement(By.name("Courses dropdown")).sendKeys("From name");
//driver.findElement(By.id("dropdownMenu3")).click();	
//driver.findElement(By.xpath("//*[@id='navbar']/ul/li[3]/div/ul/li[1]/a")).sendKeys("From xpath");
//driver.findElement(By.xpath("//*[@id='navbar']/ul/li[3]/div/ul/li[1]/a")).click();
//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
//driver.findElement(By.className("icon-Home-page-close")).click();
//driver.findElement(By.className("dropdown-toggle")).click();

//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
//driver.findElement(By.xpath("//*[@id=\"header-II\"]/section/nav/div/ul[2]/li[1]/a")).click();
//driver.findElement(By.xpath("//*[@id=\"header-II\"]/section/nav/div/ul[2]/li[1]/ul/li[7]/a")).click();
//driver.findElement(By.xpath("//*[@id=\"header-II\"]/section/nav/div/ul[2]/li[1]/ul/li[1]/a")).click();
//driver.findElement(By.xpath("//*[@id=\"footauto\"]/app-root/app-mycourse-main/section/app-header/header/nav/div/div[3]/ul/li[8]/div/ul/li[12]/a")).click();
//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);








//WebDriverWait Wait=new WebDriverWait(driver,30); Wait.until(ExpectedConditions.elementToBeClickable(By.id("personal_details")));


//WebDriverWait Wait1=new WebDriverWait(driver,30); Wait.until(ExpectedConditions.elementToBeClickable(By.className("user-number")));
//String Pagetitle=driver.getTitle();
//Select dropdown=new
//Select(driver.findElement(By.name("Career Interests"))))
//driver.findElement(By.className("dropdown-toggle")).click();
//driver.findElement(By.linkText("my-profile")).click();


//driver.findElement(By.xpath("//*[@href=\"/my-profile\"]")).click();
//WebDriverWait Wait=new WebDriverWait(driver,30); Wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("career_interest")));




