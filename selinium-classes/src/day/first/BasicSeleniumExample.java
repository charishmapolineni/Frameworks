package day.first;



import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.Alert;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

//import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.By;

//import java.util.concurrent.Time







import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;








//import org.openqa.selenium.support.ui.Select;

//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class BasicSeleniumExample {
	
	public static  WebDriver driver;
	
	public void setupSelenium(String browserType,String url) throws InterruptedException  
	{
		String currDir=System.getProperty("user.dir");
		if(browserType.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", currDir+"//driver//chromedriver.exe");
			driver=new ChromeDriver();
		}
	//	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);	
//		driver.manage().timeouts().pageLoadTimeout(300,TimeUnit.SECONDS );
		driver.get("https://www.flipkart.com/"); //get edureka page//
	
		//driver.findElement(By.id("identifierId")).sendKeys("charishmaraopolineni@gmail.com");
		//driver.findElement(By.xpath("//*[@id='identifierNext']/content/span")).click();
		 //WebDriverWait Wait=new WebDriverWait(driver,30); Wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='password']")));
		 //Object password;
		//((Object) password)).sendkeys("cherryrao");
		  driver.manage().timeouts().implicitlyWait(500,TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//input[@name='password']")).sendKeys("cherryrao");
		//driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/content")).click();
		//driver.findElement(By.xpath("//div[@class='aic']")).click();
		//driver.findElement(By.xpath("//*[@id=':q1']")).sendKeys("charishmaraopolineni@gmail.com");
		//driver.findElement(By.xpath("//*[@id=':pj']")).sendKeys("edureka portal");
		//driver.findElement(By.xpath("//*[@id=\":p9\"]")).click();
		//driver.findElement(By.xpath("//div[@class='vT']")).sendKeys("charishmaraopolineni@gmail.com");
	
		//driver.findElement(By.xpath("//*[@id=\"gbwa\"]/div/a/svg/path")).click();
	
		
	
		  
		  
			  
			 
			  
			  
		  
		  driver.manage().window().maximize();
		  
				
	 

		  driver.findElement(By.xpath("//*[@id='container']/div/header/div[1]/div/div[2]/form/div/div[1]/div/input")).sendKeys("Selenium Book");
		

		  driver.manage().timeouts().implicitlyWait(500,TimeUnit.SECONDS);
		  
		  
			//WebDriverWait Wait=new WebDriverWait(driver,30); Wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='container']/div/div[1]/div[2]/div/div[1]/div[2]/div[2]/div/div[4]/div/a[2]")));	
		driver.quit();
			//driver.findElement(By.tagName("button")).sendKeys("From tagname");
			   
		  //driver.findElement(By.xpath("/*[@id=\"container\"]/div/div[1]/div[2]/div/div[1]/div[2]/div[2]/div/div[1]/div/a[2")).sendKeys("Selenium WebDriver 1st Edition");
		  //driver.findElement(By.xpath("/*[@id="\container\"]/div/div[1]/div[2]/div/div[1]/div[2]/div[2]/div/div[1]/div/a[2")).click();
		//driver.findElement(By.xpath("//*[@id='container']/div/header/div[1]/div/div[2]/form/div/div[1]/div/input")).click();
		
	
		//Actions actions=new Actions(driver);
		//actions.moveToElement(driver.findElement(By.linkText("Selenium WebDriver 1st Edition"))).sendKeys("From linktext");
		//WebDriverWait Wait=new WebDriverWait(driver,30); Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*@href=\"/Selenium WebDriver 1st Edition\"]")));
	  //driver.findElement(By.linkText("Selenium WebDriver 1st Edition")).click();

		//driver.findElement(By.xpath("//*[@id='container']/div/header/div[1]/div/div[2]/form/div/div[1]/div/input")).click();
		//Actions act=new Actions(driver);
	    //act.moveToElement(driver.findElement(By.xpath("//button[@class='vh79eN']"))).click().build().perform();
	   // driver.findElement(By.xpath("//*[@id='container']/div/div[1]/div[2]/div/div[1]/div[2]/div[2]/div/div[4]/div/a[2]")).sendKeys("From xpath");
	  //WebDriverWait Wait=new WebDriverWait(driver,30); Wait.until(ExpectedConditions.elementToBeClickable(By.tagName("button"))).click();
	
	    //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    //driver.quit();
	
		//(driver.getPageSource().contains("Selenium WebDriver 1st Edition")) {
			//System.out.println("Text is present");
		//}else {
			//System.out.println("Text is absent");
		//}
		//driver.findElement(By.xpath("/*[@id='popover-search']/div/div/ul/li[1]/a/span[contains(text(),('Selenium WebDriver 1st Edition')]"));
		//driver.findElement(By.xpath("//a[contains(@class,'Zhf2z']")).click();
		
		 //Actions act=new Actions(driver);
	      //act.moveToElement(driver.findElement(By.xpath("//button[@class='vh79eN']"))).click().build().perform();
		
	    
	    
	    //driver.findElement(By.linkText("Selenium WebDriver 1st  Edition")).click();
	      //driver.findElement(By.xpath("//*[@id='container']/div/div[1]/div[2]/div/div[1]/div[2]/div[2]/div/div[4]/div/a[2]")).sendKeys("From xpath");
	    

		//WebDriverWait Wait=new WebDriverWait(driver,30); Wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='container']/div/div[1]/div[2]/div/div[1]/div[2]/div[2]/div/div[4]/div/a[2]")));
	//driver.findElement(By.cssSelector("#container > div > div.t-0M7P._2doH3V > div._3e7xtJ > div > div._1HmYoV.hCUpcT > div:nth-child(2) > div:nth-child(2) > div > div:nth-child(1) > div > a._2cLu-l")).click();
		//driver.findElement(By.xpath("//*[@id='container']/div/div[1]/div[2]/div/div[1]/div[2]/div[2]/div/div[1]/div")).click();
	//driver.findElement(By.tagName("button")).sendKeys("From tagname");
	//driver.findElement(By.tagName("button")).click();
	//driver.findElement(By.tagName("button")).sendKeys("From tagname");
	   
	 
	
		//driver.findElement(By.xpath("/*[@id='container']/div/header/div[1]/div/div[2]/form/div/div[1]/div/input")).click();
		//driver.findElement(By.xpath("//*[@id='header-II']/section/nav/div/a[2]")).click();
		//driver.findElement(By.cssSelector("#si_popup_email")).sendKeys("charishmaraopolineni@gmail.com");
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		//driver.findElement(By.cssSelector("#si_popup_passwd")).sendKeys("cherry123");
		//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//*[@id='new_sign_up_mode']/div/div/div[2]/div[3]/form/button")).click();
		//driver.findElement(By.id("dropdownMenu3")).sendKeys("From id");
		  //driver.findElement(By.xpath("//*[@id='navbar']/ul/li[3]/div/ul/li[2]/a")).click();
		  //driver.findElement(By.xpath("//*[@id='header-II']/section/nav/div/ul[2]/li[1]/a")).sendKeys("From xpath");
		  //driver.findElement(By.xpath("//*[@id='header-II']/section/nav/div/ul[2]/li[1]/ul/li[7]/a")).click();
		  //driver.findElement(By.cssSelector("a[onclick^=javascript: confirmSignin')]")).click();
		 // driver.findElement(By.linkText("sign")).click();
		 
		  //driver.findElement(By.xpath("//*[@id='SignUp']/section/nav/div/a[1]")).click();//
		  //driver.navigate().to("\"https://www.edureka.co/signUp");
		  //river.findElement(By.xpath("//button[text()=Sign Up']")).click();
		 // driver.findElement(By.className("signin top-signup register-user giTrackElementHeader" )).click();
		  //driver.findElement(By.cssSelector("#header-II > section > nav > div > a.signin.top-signup.register-user.giTrackElementHeader")).click();
		  //driver.findElement(By.id("sg_popup_email")).sendKeys("From id");
		  //driver.findElement(By.id("sg_popup_phone_no")).sendKeys("19039071909");
		  //driver.findElement(By.xpath("//*[@id='new_sign_up_mode']/div/div/div[2]/div[1]/form/button")).click();
		 
	{
		
	}
	
		
		
			
		}
	
		
	
	
		private Function visibilityOfElementLocated(Object closeElementLocator) {
		// TODO Auto-generated method stub
		return null;
	}




		private boolean isDisplayed() {
		// TODO Auto-generated method stub
		return false;
	}




		// TODO Auto-generated method stub
	
	



	public void locatorTest() {
		
				  
		  
	}	
		 
	
 {
		
		
	}
	public static void main(String[] args) throws InterruptedException {
		BasicSeleniumExample sel = new BasicSeleniumExample();
		sel.setupSelenium("Chrome","https://www.flipkart.com/");
	

	
		
	
	}


	
			
		}
	
		
	
		
	
		

	
	

	


	

	
	
	

		
	
	


