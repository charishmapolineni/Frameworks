package day.first;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class projectonedureka {


		WebDriver driver;
	@BeforeMethod
		public void setup() {
			System.setProperty("webdriver.chrome.driver","C:\\develop\\TestNGDemo\\driver\\chromedriver.exe");
			driver=new ChromeDriver();
			 driver.get("https://www.edureka.co/");
			driver.manage().deleteAllCookies();		 	
	}
	
	@Test
	public void verifyMyclassroom() {
	driver.get("https://www.edureka.co/login");
	driver.manage().window().maximize();
	driver.findElement(By.id("si_popup_email")).sendKeys("charishmaraopolineni@gmail.com");
	driver.findElement(By.cssSelector("#si_popup_passwd")).sendKeys("cherry123");
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//*[@id='new_sign_up_mode']/div/div/div[2]/div[3]/form/button")).click();
	driver.findElement(By.id("dropdownMenu3")).click();	
	driver.findElement(By.xpath("//*[@id='navbar']/ul/li[3]/div/ul/li[1]/a")).sendKeys("From xpath");
	driver.findElement(By.xpath("//*[@id='navbar']/ul/li[3]/div/ul/li[1]/a")).click();
	driver.findElement(By.className("icon-Home-page-close")).click();
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	driver.navigate().back();
	//driver.findElement(By.xpath("//*[@id=\"modalbanner\"]/div/div/button")).click();
	driver.findElement(By.xpath("//*[@id=\"header-II\"]/section/nav/div/ul[2]/li[1]/a")).click();
	driver.findElement(By.xpath("//*[@id=\"header-II\"]/section/nav/div/ul[2]/li[1]/ul/li[7]/a")).click();
	//driver.findElement(By.xpath("//*[@id=\"header-II\"]/section/nav/div/ul[2]/li[1]/ul/li[1]/a")).click();
	//WebDriverWait waitElement = new WebDriverWait(driver,20);waitElement.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"myprofile\"]/div[2]/div[1]/div/div[1]/h4[2]/span")));
	//driver.findElement(By.xpath("//*[@id=\"myprofile\"]/div[2]/div[1]/div/div[1]/h4[2]/span")).click();
	//String Pagetitle = driver.getTitle();
	//driver.findElement(By.cssSelector("#professional_details")).click();
	 //driver.findElement(By.xpath("//*[@id=\"professional_details\"]"));
	 //WebDriverWait Wait=new WebDriverWait(driver,30); Wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("currentIndustry")));
	 //Select dropdown = new Select(driver.findElement(By.name("currentIndustry")));
	//dropdown.selectByValue("IT-Software/Software Services");
	//Select dropdown2 = new Select(driver.findElement(By.xpath("//*[@id=\"onboarding\"]/div/div[1]/div[2]/div[2]/app-onboarding-professional-details/accordion/accordion-group/div/div[2]/div/form/div[3]/select")));
	 //dropdown2.selectByValue("IT-Software/Software Services");
	 //driver.findElement(By.xpath("//option[contains(text(),'IT-Software/Software Services']")).click();
	//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

	}
}

