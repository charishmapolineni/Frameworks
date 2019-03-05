package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;

public class login2 {
	public static  WebDriver driver;


public void setupSelenium(String browserType,String url) throws InterruptedException  
{
	String currDir=System.getProperty("user.dir");
	if(browserType.equalsIgnoreCase("Chrome")) {
		System.setProperty("webdriver.chrome.driver", currDir+"//driver//chromedriver.exe");
		driver=new ChromeDriver();
	}
//	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);	
//	driver.manage().timeouts().pageLoadTimeout(300,TimeUnit.SECONDS );
	driver.get("https://accounts.google.com/signin"); //get edureka page//
	driver.manage().window().maximize();
	driver.findElement(By.id("identifierId")).sendKeys("charishmaraopolineni@gmail.com");
	driver.findElement(By.xpath("//*[@id='identifierNext']/content/span")).click();
	 WebDriverWait Wait=new WebDriverWait(driver,30); Wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='password']")));
	 //Object password;
	//((Object) password)).sendkeys("cherryrao");
	  driver.manage().timeouts().implicitlyWait(500,TimeUnit.SECONDS);
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("cherryrao");
	driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/content")).click();
	driver.findElement(By.xpath("//div[@class='aic']")).click();
	driver.findElement(By.xpath("//*[@id=':q1']")).sendKeys("charishmaraopolineni@gmail.com");
	driver.findElement(By.xpath("//*[@id=':pj']")).sendKeys("edureka portal");
	driver.findElement(By.xpath("//*[@id=\":p9\"]")).click();
}
}

	

		
	

