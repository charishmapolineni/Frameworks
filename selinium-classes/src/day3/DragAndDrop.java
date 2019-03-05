package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import day.first.BasicSeleniumExample;

public class DragAndDrop {
	
public static void main(String[] args) {
		
		BasicSeleniumExample sel = new BasicSeleniumExample();
		sel.setupSelenium("chrome","http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
}
public static  WebDriver driver;
	
	public void setupSelenium(String browserType,String url) 
	{
		String currDir=System.getProperty("user.dir");
		if(browserType.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver",currDir+"//driver//chromedriver.exe");
		ChromeDriver Webdriver = new ChromeDriver();
		}
	//	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);	
//		driver.manage().timeouts().pageLoadTimeout(300,TimeUnit.SECONDS );
		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html"); //get edureka page//
		driver.manage().window().maximize();
		
	}
	WebElement From = driver.findElement(By.id("box1"));
	WebElement To  =  driver.findElement(By.id("box101"));
	Actions builder = new Actions(driver);
	Action dragAndDrop = builder.clickAndHold(From).moveToElement(To).release(To).build(); 
	dragAndDrop.perform();


}



	
	


