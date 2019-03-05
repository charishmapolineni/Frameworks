package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class login2 {
public static WebDriver driver;
By email=By.id("identifierId");
 By next=By.xpath("//*[@id='identifierNext']/content/span");
 By password=By.xpath("//input[@name='password']");
 By passcontent=By.xpath("//*[@id=\"passwordNext\"]/content");
 By compose=By.xpath("//div[@class='aic']");
By recipent=By.xpath("//*[@id=':pu']");
 By subect=By.xpath("//*[@id=':pu']");
By send=By.xpath("//*[@id=\":p9\"]");

public void login_google() {
}
	public void email(String string) {
	email.sendKeys("charishmaraopolineni@gmail.com");
	}
	public void next() {
	next.click();
	}
	public void password(String string) {	
	
	password.sendKeys("cherryrao");
	}
	public void passcontent() {
		
	passcontent.click();
	}
	
	public void compose() {
		// TODO Auto-generated method stub
		compose.click();
	}
	public void recipent(String string) {	
		recipent.sendKeys("charishmaraopolineni@gmai.com");
	}
	public void subject(String string) {
		// TODO Auto-generated method st
		// TODO Auto-generated method stub
		subject.sendKeys("edureka portal");
	}
	public void send() {
		// TODO Auto-generated method stub
		send.click();