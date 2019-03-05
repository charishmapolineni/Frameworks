package com.jenkins;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JenkinsExample {
	WebDriver driver;
	@BeforeMethod
	public void login() {
		System.setProperty("webdriver.chrome.driver","C:\\develop\\MavenJenkins\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		 //driver.get("https://www.edureka.co/");
		driver.manage().deleteAllCookies();
	}
  @Test
  public void getportal() throws InterruptedException {
  driver.get("https://www.edureka.co/");
  driver.manage().window().maximize();
  driver.findElement(By.xpath("//*[@id=\"header-II\"]/section/nav/div/a[2]")).click();
  Thread.sleep(10000);
  driver.findElement(By.id("si_popup_email")).sendKeys("charishmaraopolineni@gmail.com");
  driver.findElement(By.cssSelector("#si_popup_passwd")).sendKeys("cherry123");
  driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
  driver.findElement(By.xpath("//*[@id='new_sign_up_mode']/div/div/div[2]/div[3]/form/button")).click();
driver.findElement(By.xpath("//*[@id=\"header-II\"]/section/nav/div/ul[2]/li[1]/a")).click();
driver.findElement(By.xpath("//*[@id=\"header-II\"]/section/nav/div/ul[2]/li[1]/ul/li[1]/a")).click();
Thread.sleep(10000);
driver.findElement(By.id("personal_details")).click();
Thread.sleep(10000);
driver.findElement(By.className("icon-camera")).click();
Thread.sleep(10000);
driver.findElement(By.id("custom-input")).click();
Thread.sleep(100000);
driver.findElement(By.className("submitbtn")).click();

}
}
