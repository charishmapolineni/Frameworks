package day2;




public class BasicSeleniumExample {
		
			
			public static  WebDriver driver;
			
			public void setupSelenium(String browserType,String url) throws InterruptedException 
			{
				String currDir=System.getProperty("user.dir");
				if(browserType.equalsIgnoreCase("Chrome")) {
					System.setProperty("webdriver.chrome.driver",currDir+"//driver//chromedriver.exe");
				 driver = new ChromeDriver();
				}
				driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);	
				driver.manage().timeouts().pageLoadTimeout(300,TimeUnit.SECONDS );
				driver.get("https://www.goindigo.in/?linkNav=home_header"); //get edureka page//
				driver.manage().window().maximize();
				driver.get("https://www.goindigo.in/?linkNav=home_header");
				driver.manage().window().maximize();
				driver.findElement(By.cssSelector("#bookFlightTab > form > div:nth-child(2) > span:nth-child(1) > label")).click();
				Thread.sleep(3000);
				driver.findElement(By.name("or-src")).sendKeys("Bengaluru\n");
				driver.findElement(By.name("or-dest")).sendKeys("Lucknow\n");
				driver.findElement(By.name("or-return")).click();
				//adult
		 driver.findElement(By.xpath("//div[@class='ig-input-group field-float']/following::input[@name='passenger']")).sendKeys("From xpath");
		 driver.findElement(By.xpath("//div[@class='passenger-dropdown pax-selection-row']/ul/li/div/button[2]")).sendKeys("From xpath"); //2
		 driver.findElement(By.xpath("//div[@class='passenger-dropdown pax-selection-row']/ul/li/div/button[2]")).sendKeys("From xpath"); //3
		 
		 //child
		 driver.findElement(By.xpath("//*[@id=\"bookFlightTab\"]/form/div[5]/div[1]/div[2]/ul/li[2]/div/button[2]")).sendKeys("From xpath"); //1
		 driver.findElement(By.xpath("//*[@id=\"bookFlightTab\"]/form/div[5]/div[1]/div[2]/ul/li[2]/div/button[2]")).sendKeys("From xpath"); //
		 driver.findElement(By.xpath("//button[contains(text(),'Done')]")).click();
		 driver.findElement(By.xpath("//*[@id='bookFlightTab']/form/div[7]/div[6]/button")).click();
				
				
			}
			
			
				
				{
					
				}
			
				
			
			public void locatorTest() {
				
						  
				  
			}	
				 
			
		 {
				
				
			}
			public static void main(String[] args) throws InterruptedException {
				BasicSeleniumExample sel = new BasicSeleniumExample();
			sel.setupSelenium("chrome","https://www.goindigo.in/?linkNav=home_header" );
				//sel.SearchMethod();
				//sel.getTitle();
				//sel.getURL();
				sel.locatorTest();
			}


			
					
				
			
	}


