package Seleniumframework;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utility.ReadExcel;


public class frameworkdemo {

WebDriver  driver;
 
 @BeforeTest
 public void openBrowser() {
	 System.setProperty("webdriver.chrome.driver", "C:\\develop\\Frameworks\\driver\\chromedriver.exe");
	 driver = new ChromeDriver();
	
	// driver.get("https://www.edureka.co/");
	 //driver.manage().deleteAllCookies();
	 //driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
 }
  @Test(dataProvider="TestExcel.xlsx")
  public void openedureka(String username, String password) throws InterruptedException
  {
	  System.setProperty("webdriver.chrome.driver","C:\\develop\\Frameworks\\driver\\Chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.edureka.co/");
	  driver.manage().window().maximize();
	
		  Thread.sleep(10000);
		  //WebDriverWait wait = new WebDriverWait(driver,40);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"header-II\"]/section/nav/div/a[2]")));
		  driver.findElement(By.xpath("//*[@id=\"header-II\"]/section/nav/div/a[2]")).click();
		  Thread.sleep(10000);
			driver.findElement(By.id("si_popup_email")).sendKeys(username);
			driver.findElement(By.cssSelector("#si_popup_passwd")).sendKeys(password);
			//driver.findElement(By.xpath("/html/body/div[11]/div/div/div[2]/div[3]/form/button")).click();
			driver.findElement(By.xpath("//*[@id='new_sign_up_mode']/div/div/div[2]/div[3]/form/button")).click();
			driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS); 
				WebDriverWait wait1 = new WebDriverWait(driver,40);wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("dropdownMenu4")));
			//Thread.sleep(10000);
				driver.findElement(By.id("dropdownMenu4")).click();
				WebDriverWait wait = new WebDriverWait(driver,40);wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='navbar']/ul/li[4]/div/ul/li[2]/a")));
				driver.findElement(By.xpath("//*[@id='navbar']/ul/li[4]/div/ul/li[2]/a")).click();
				ArrayList<String>tabs = new ArrayList<String>(driver.getWindowHandles());
				String handleName = tabs.get(1);
				driver.switchTo().window(handleName);
				driver.findElement(By.xpath("//input[@placeholder=\"Search edureka blogs\"]")).sendKeys("selenium ");
				driver.findElement(By.xpath("//input[@placeholder=\"Search edureka blogs\"]")).sendKeys(Keys.ENTER);
				String Search = driver.findElement(By.xpath("//*[@id=\"search-tag-name\"]")).getText();
				System.out.println(Search);
				if(Search.equals("selenium")) {
					System.out.println("The search is filtered for selenium");
					driver.findElement(By.xpath("//*[text()=\"Interview Questions\"]")).click();
					WebDriverWait Wait1=new WebDriverWait(driver,30); Wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()=\"Interview Questions\"]")));
					driver.findElement(By.xpath("//*[text()=\"Top Selenium Interview Questions And Answers You Must Prepare In 2019\"]")).click();
				}
  }
	  
		 @AfterMethod
		 void ProgramTermination()
		 {
			 driver.quit();
		 }
	  
@DataProvider(name= "TestExcel.xlsx")
public Object[][] TestDataFeed()
{
	ReadExcel config = new ReadExcel("C:\\Users\\bolle\\Documents\\TestExcel.xlsx");
	int rows = config.getRowCount(0);
	Object[][] Excel = new Object[rows][2];
	for(int i=0;i<rows;i++)
{
		Excel[i][0] = config.getData(0, i, 0);
		Excel[i][1] = config.getData(0, i, 1);
	
}
	return Excel;
}


	// TODO Auto-generated method stub
	

				//WebDriverWait Wait=new WebDriverWait(driver,30); Wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("//*[text()=\"interview Questions\"]")));
				
		  
	
	  
			
		
		  
		  
	  
  
  @AfterTest
  public void closeBrowser() {
	  driver.quit();
	  
  }

	  
	 
  }

