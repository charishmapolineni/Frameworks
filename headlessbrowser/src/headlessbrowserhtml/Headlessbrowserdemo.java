package headlessbrowserhtml;

import java.util.logging.Level;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;



public class Headlessbrowserdemo {
	

	public static void main (String[] args)  {
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\bolle\\Downloads\\chromedriver");
		//ChromeDriver WebDriver = new ChromeDriver();
		WebDriver driver = new HtmlUnitDriver();
		java.util.logging.Logger.getLogger("com.gargoylesoftware.htmlunit").setLevel(Level.OFF);
		driver.get("http://www.google.com");
		System.out.println("page title is:"+ driver.getTitle());
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("edureka");
		element.submit();
		System.out.println("page title is:" + driver.getTitle());
		
		//TakesScreenshot webdriver;
		//TakesScreenshot scrShot = ((TakesScreenshot)webdriver);
		driver.quit();
	}

}
