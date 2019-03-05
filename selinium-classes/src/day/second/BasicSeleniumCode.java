package day.second;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.htmlunit.HtmlUnitDriver;
public class BasicSeleniumCode {
	public static WebDriver driver;

	public void setupSelenium(String browserTpe, String url) {
		String currDir = System.getProperty("user.dir");
		
		if(browserTpe.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", currDir+"//driver//chromedriver.exe");
			driver = new ChromeDriver();
		
		}
		
		//if(browserTpe.equalsIgnoreCase("firefox")) {
			//System.setProperty("webdriver.gecko.driver", currDir+"//driver//geckodriver.exe");
			//driver = new FirefoxDriver();
		//}
		
		//if(browserTpe.equalsIgnoreCase("htmlunitdriver")) {
			//driver = new HtmlUnitDriver();
		//}
				
		driver.manage().window().maximize();
		//open up a page
	}
	
	public void loginMethod() {
		driver.findElement(By.id("email")).sendKeys("ramesh");
	}
	public String getTitle() {
		return driver.getTitle();
	}
	
	public void getURL() {
		System.out.println(driver.getCurrentUrl());
	}
	
	public void getSource() {
		System.out.println(driver.getPageSource());
	}
	
	public void quitBrowser() {
		driver.quit();
	}

	public void closeBrowser() {
		driver.close();
	}

	public void locatorTest() {
		/*
		 * //id ==> give first preference to this
		 * driver.findElement(By.id("email")).sendKeys("ramesh@gmail.com");
		 */
		
		/*
		 * //name driver.findElement(By.name("email")).sendKeys("From name");
		 */
		
		/*
		 * //className
		 * driver.findElement(By.className("inputtext")).sendKeys("From className");
		 */
		
		/*
		 * //tagName driver.findElement(By.tagName("input")).sendKeys("From TagName");
		 */
		
		/*
		 * //linkText driver.findElement(By.linkText("Forgotten account?")).click();
		 */
		
/*		//PartialLinkText
		driver.findElement(By.partialLinkText("tten")).click();
		*/
		/*
		 * //css selector
		 * driver.findElement(By.cssSelector("#email")).sendKeys("From CSS selector");
		 */
		
		//xpath
//		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("From xpath");
		//driver.findElement(By.xpath("//input[@id='email']")).sendKeys("From xpath==>with tagname");
		
		
	}
	
	public static void main(String[] args) {

		BasicSeleniumCode sel = new BasicSeleniumCode();
		sel.setupSelenium("chrome", "\"https://www.edureka.co/\"");
		
		sel.locatorTest();
		
		
		
		
		
		
		/*
		 * String title = sel.getTitle(); System.out.println(title);
		 * if(title.equals("Facebook – log in or sign")) {
		 * System.out.println("Test case passed"); } else {
		 * System.err.println("Test case failed"); }
		 */
//		sel.quitBrowser();

	}

	//driver.navigate().to("https://www.edureka.co/"); //get edureka page//
	//driver.manage().window().maximize();
	//driver.findElement(By.cssSelector("#si_popup_email")).sendKeys("charishmaraopolineni@gmail.com");
	//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	//driver.findElement(By.cssSelector("#si_popup_passwd")).sendKeys("cherry123");
	//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	//driver.findElement(By.cssSelector("#new_sign_up_mode > div > div > div.modal-body > div.login_video_frm.login-vd-box.sigin-new-division > form > button")).click();
	
	//driver.close();
	//driver.quit();
	//WebDriverWait waitExplicit = new WebDriverWait(driver,30);
	//WebElement
	//WebDriverWait wait =new WebDriverWait(drver, 10);
	 //WebElement "user_v1[query]"=wait.until(ExpectedConditions.presenceofElementLocated(By.id())))
	//driver.manage().timeouts().setScriptTimeout(400,TimeUnit.SECONDS);
	//String title = driver.getTitle();
	//if(title.equals("Login"));
	//System.out.println("pass");
	//System.out.println(driver.getTitle());
	//System.out.println(driver.getCurrentUrl());
	//driver.findElement(By.className("browsebtn ga-top-cat-browse-courses trackButton")).sendKeys("Selenium Certification Training");
	 
   
	//result=compare.validateURL(driver,"https://www.edureka.co/");
	//driver.quit();
	//if(browserType.equalsIgnoreCase("FirefoxDriver")) {
	//System.setProperty("webdriver.gecko.driver",currDir+"//driver//geckodriver.exe");
	//driver=new FirefoxDriver();
//}
//if(browserType.equalsIgnoreCase("HtmlUnitdriver")) {
	
	//driver= new HtmlUnitDriver();
	//driver.findElement(By.id("search-inp")).sendKeys("Selenium Certification Training");
			//driver.findElement(By.cssSelector("#remote > div > ul > li.typeahead__item.typeahead__group-relevant-courses > a")).click();
			//System.out.println("driver.getTitle");
			  //String actualTitle=driver.getTitle();
			  //String expectedTitle="Selenium 3.0 WebDriver Online Taining";
			  //assertEquals(expectedTitle,actualTitle);
			  //driver.navigate().back();
			  //driver.findElement(By.cssSelector("#navbar > ul > li.ga-allcourses > a")).click();
			 // driver.findElement(By.cssSelector("#dropdownMenu3")).sendKeys("From cssSelector");
			 // driver.findElement(By.xpath("//*[@id="navbar"]/ul/li[3]/div/ul/li[2]/a"));
			 // WebDriverWait wait = new WebDriverWait(driver,10);
			
//}



//public void	SearchMethod() //{
//System.out.println(driver.findElement(By.id("search-inp")).getAttribute("Python certification training"));
//System.out.println(driver.findElement(By.name("user_v1[query]")).getAttribute("name"));
//System.out.println(driver.findElement(By.className("trackButton")).getAttribute("data-button-location"));
//System.out.println(driver.findElement(By.xpath("//*[@id= 'search-inp']")).getAttribute("name"));
//System.out.println(driver.findElement(By.cssSelector("color")).getAttribute("value"));	
//}



//public void getTitle() {


//System.out.println(driver.getTitle()

//public void getURL() {
//System.out.println(driver.getCurrentUrl());
//}
//public void pageSource() {
//System.out.println(driver.getPageSource());


//public void getCssValue() {
//System.out.println(driver.getCssValue());

//public void quitBrowser() {
//driver.quit();

//public void closeBrowser() {

//}
	 //driver.findElement(By.name("user_v1[query]")).sendKeys("From name");
	 
	
	
	 
	 //driver.findElement(By.className("trackButton")).sendKeys("From className");
	 
	
	
	 //driver.findElement(By.tagName("input")).sendKeys("From TagName");


	 
	
		//driver.findElement(By.linkText("Log In")).click();

	//driver.findElement(By.partialLinkText("In")).click();
	
	
	 
	  //driver.findElement(By.cssSelector("#search-inp")).sendKeys("From CSS selector");

	

//driver.findElement(By.xpath("//*[@id= 'search-inp']")).sendKeys("From xpath");
	//private void assertEquals(String expectedTitle, String actualTitle2) {
	// TODO Auto-generated method stub
	



//private void assertEquals(String expectedTitle, String actualTitle2) {
	// TODO Auto-generated method stub
	



//private void assertTrue(boolean contains) {
	// TODO Auto-generated method stub
	

	}


