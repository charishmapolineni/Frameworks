package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class pageobjectmodelwithoutfactory
{
	


@Test
public void verifylogin()
{
	
}
	public void setup(String browser,String url) {
		String currDir = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", "C:\\develop\\TestNGDemo\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://accounts.google.com");
	
	pageobjectmodelwithoutfactory login =new pageobjectmodelwithoutfactory();
login.typeEmail();
login.clickonnextbutton();
WebDriverWait Wait=new WebDriverWait(driver,30);Wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='password']")));
login.typepassword();
login.clickonnextbutton();
WebDriverWait Wait1=new WebDriverWait(driver,30);Wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='aic']")));
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);	
login.clickcompose();
WebDriverWait Wait2=new WebDriverWait(driver,30);Wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//textarea[@class='vO']")));
login.typerecipent();
login.typesubject();
login.send();

}

private void send() {
	// TODO Auto-generated method stub
	
}

private void typesubject() {
	// TODO Auto-generated method stub
	
}

private void typerecipent() {
	// TODO Auto-generated method stub
	
}

private void clickcompose() {
	// TODO Auto-generated method stub
	
}

private void typepassword() {
	// TODO Auto-generated method stub
	
}

private void clickonnextbutton() {
	// TODO Auto-generated method stub
	
}

private void typeEmail() {
	// TODO Auto-generated method stub
	
}

	
}






