package pageobjectfactory;

import org.apache.commons.logging.Log;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.Test;

public class LoginedurekaportalTest {
	public static	WebDriver driver;
	{
	this.driver=driver;

	}
	
	@FindBy(xpath="//*[@id=\"header-II\"]/section/nav/div/a[2]")
	@CacheLookup
	WebElement login;
	@FindBy(id="si_popup_email")
	WebElement username;
	@FindBy(css="#si_popup_passwd")
	WebElement password;
	@FindBy(how=How.XPATH,using=("//*[@id='new_sign_up_mode']/div/div/div[2]/div[3]/form/button"))
	WebElement clicksubmit;
	@FindBy(id="dropdownMenu3")
	WebElement opencoursesbrowser;
	@FindBy(xpath=("//*[@id='navbar']/ul/li[3]/div/ul/li[1]/a"))
	@CacheLookup
	WebElement openmyclassroompage;
	@FindBy(xpath=("//*[@id='header-II']/section/nav/div/ul[2]/li[1]/a"))
	WebElement myprofile;
	@FindBy(xpath=("//*[@id=\"header-II\"]/section/nav/div/ul[2]/li[1]/ul/li[7]/a"))
	WebElement clicklogout;
  @Test
  public void f() {
  }


public void login() {
	login.click();
	
	// TODO Auto-generated method stub
	
}
public void username(String string) {
	username.sendKeys("charishmaraopolineni@gmail.com");
	
	
}


public void password(String string) {
	password.sendKeys("cherry123");
	// TODO Auto-generated method stub
	
}


public void clicksubmit() {
	clicksubmit.click();
	// TODO Auto-generated method stub
	
}


public void opencoursesbrowser() {
	opencoursesbrowser.click();
	// TODO Auto-generated method stub
	
}


public void openmyclassroompage() {
	openmyclassroompage.click();
	// TODO Auto-generated method stub
	
}


public void myprofile() {
	myprofile.click();
	// TODO Auto-generated method stub
	
}


public void clicklogout() {
	clicklogout.click();
	// TODO Auto-generated method stub
	
}
}
