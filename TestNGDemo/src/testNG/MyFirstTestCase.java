package testNG;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyFirstTestCase extends TestNGCode{
	MyFirstTestCase a=new MyFirstTestCase();
	public void EnterText(String Identifier,String Idtype,String value,ChromeDriver driver) {
		WebElement a=a; 
				((Object) driver).findElementBy(Idtype,Identifier,driver);
		try {
			a.sendKeys(value);
		}
		catch(Exception e) {
			System.out.println(e);
			System.out.println("Issue while findelement");
		}
	}

  }

