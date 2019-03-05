package com.Phantomjs;
import java.io.File;

import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;


public class Phantomjsdemo {
	public static void main(String args[]) throws IOException {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setJavascriptEnabled(true);
		caps.setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY,"C:\\Program Files\\Phantomjs\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");
		//System.setProperty("phantomjs.binary.path", file.getAbsolutePath());
		WebDriver driver = new PhantomJSDriver();
		driver.get("http://www.google.com");
		System.out.println("page title is:"+ driver.getTitle());
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("edureka");
		element.submit();
		System.out.println("page title is:" + driver.getTitle());
		File scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
       	FileUtils.copyFile(scrFile,new File ("C:\\sample.jpg"));

}
}
