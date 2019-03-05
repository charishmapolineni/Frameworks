/**
 * 
 */
package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author bolle
 *
 */
public class LoginPage {
	public static  WebDriver driver;
	//public void setup(String browser,String url) {

		//String currDir = System.getProperty("user.dir");
		
	
	 By email = By.id("identifierId");
	By next = By.xpath("//*[@id='identifierNext']/content/span");
	By password=By.xpath("//input[@name='password']");
	By passcontent=By.xpath("//*[@id=\"passwordNext\"]content");
	By compose=By.xpath("//div[@class='aic']");
	By recipent=By.xpath("//textarea[@class=':vO']");
	By subject=By.xpath("//*[@id=':pj']");
	By send=By.xpath("//*[@id=\":p9\"]");
	
	

public void verifylogin()
{
}

public void email()
{
	driver.findElement(By.id("identifierId")).sendKeys("charishmaraopolineni@gmail.com");
}
public void next()
{
	driver.findElement(By.xpath("//*[@id='identifierNext']/content/span")).click();	
}
public void password()
{
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("cherryrao");	
}
public void passcontent()
{
	driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/content")).click();	
}
public void compose()
{
	driver.findElement(By.xpath("//div[@class='aic']")).click();
}
public void recipent()
{
	driver.findElement(By.xpath("//textarea[@class='vO']")).sendKeys("charishmaraopolineni@gmail.com");
}
public void subject()
{
	driver.findElement(By.xpath("//*[@id=':pj']")).sendKeys("edureka portal");	
}
public void send()
{
	driver.findElement(By.xpath("//*[@id=\":p9\"]")).click();	
}
}
