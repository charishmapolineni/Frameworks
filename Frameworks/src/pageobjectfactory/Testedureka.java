package pageobjectfactory;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class Testedureka {
	private static Logger Log = Logger.getLogger(Testedureka.class);
	WebDriver  driver;
	@BeforeTest
	 public void openBrowser() {
		 System.setProperty("webdriver.chrome.driver", "C:\\develop\\Frameworks\\driver\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://www.edureka.co/");
	}
	

  @Test
  public void loginedureka() throws InterruptedException {
	  LoginedurekaportalTest login_test=PageFactory.initElements(driver,LoginedurekaportalTest.class);
	  driver.manage().window().maximize();
	  login_test.login();
	  Log.info("login edureka portal");
	  Thread.sleep(10000);
	  login_test.username("charishmaraopolineni@gmail.com");
	  Log.info("enter valid username");
	  login_test.password("cherry123");
	  driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	  login_test.clicksubmit();
	  Log.info("sucessfully submit the page");
	  Thread.sleep(100000);
	  login_test.opencoursesbrowser();
	  Log.info("opened coursesbrowser");
	  login_test.openmyclassroompage();
	  Log.info("sucessfully open myclassroompage");
	  driver.navigate().back();
	  Thread.sleep(10000);
	  login_test.myprofile();
	  Log.info("openmyprofile");
	  login_test.clicklogout();
	  
  }


	// TODO Auto-generated method stub
	
}

