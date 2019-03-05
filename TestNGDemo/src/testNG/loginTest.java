package testNG;

import org.openqa.selenium.By;

//import org.openqa.selenium.By;

//import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.By;

//import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;//with page factory
import org.openqa.selenium.support.How;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class loginTest {
//private static final String cssSelector = null;
public static	WebDriver driver;
{
this.driver=driver;

}
@FindBy(id="identifierId")
@CacheLookup
WebElement email;
@FindBy(xpath="//*[@id='identifierNext']/content/span")
WebElement next;
@FindBy(xpath="//input[@name='password']")
WebElement password;
@FindBy(how=How.XPATH,using=("//*[@id=\"passwordNext\"]/content"))
WebElement passcontent;
@FindBy(xpath=(("//div[@class='aic']")))
WebElement compose;
@FindBy(xpath=("//textarea[@class='vO']"))
@CacheLookup
WebElement recipent;
@FindBy(xpath=("//*[@id=':pj']"))
WebElement subject;
@FindBy(xpath=("//*[@id=\":p9\"]"))
WebElement send;

public void login_google() {
}
	public void email(String string) {
	email.sendKeys("charishmaraopolineni@gmail.com");
	}
	public void next() {
	next.click();
	}
	public void password(String string) {	
	
	password.sendKeys("cherryrao");
	}
	public void passcontent() {
		
	passcontent.click();
	}
	
	public void compose() {
		// TODO Auto-generated method stub
		compose.click();
	}
	public void recipent(String string) {	
		recipent.sendKeys("charishmaraopolineni@gmai.com");
	}
	public void subject(String string) {
		// TODO Auto-generated method st
		// TODO Auto-generated method stub
		subject.sendKeys("edureka portal");
	}
	public void send() {
		// TODO Auto-generated method stub
		send.click();
	}
	//public void next() {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		
	}

		// TODO Auto-generated method stub

	
		
	
		


	


//public void email(String string) {
	// TODO Auto-generated method stub
	


//public void next() {
	// TODO Auto-generated method stub
	



	



	
	

	
