package KeywordDrivenTesting;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import utility.ReadExcelFile;


@Test
public class application {
public void applicationTest() throws IOException, InterruptedException{
	String [][] data = ReadExcelFile.getData("TestExcel.xlsx", "Sheet2");
	String[][] data1 = ReadExcelFile.getData("TestExcel.xlsx", "Sheet1");
	for(int j=1;j<data1.length;j++) {
	for(int i=1;i<data.length;i++) {
		
		switch(data[i][3])  {
		case "openBrowser":
		Methods.openBrowser();
		System.out.println("****** openBrowser ******");
		System.out.println(data[i][3]);
		break;
		case "navigate":
		Methods.navigate(data[i][6]);
		System.out.println("****** navigate ********");
		System.out.println(data[i][6]);
		break;
		case "maximizeWindow":
		Methods.maximizeWindow();
		System.out.println("****** maximizeWindow ********");
		break;
		case "enterInvalidUsername":
		Methods.enterInvalidUsername(data[i][4], data[i][5], data[i][6]);
		System.out.println("****** enterInvalidUsername ********");
		System.out.println(data[i][4]);
		System.out.println(data[i][5]);
		System.out.println(data[i][6]);
		break;
		case "enterInvalidPassword":
		Methods.enterInvalidPassword(data[i][4], data[i][5], data[i][6]);
		System.out.println("****** enterInvalidPassword ********");
		System.out.println(data[i][4]);
		System.out.println(data[i][5]);
		System.out.println(data[i][6]);
		break;
		case "implimentWait":
		Methods.implimentWait();
		System.out.println("****** navigate ********");
		break;
		case "clickSubmit":
		Methods.clickSubmit(data[i][4], data[i][5]);
		System.out.println("****** clickSubmit ********");
		System.out.println(data[i][4]);
		System.out.println(data[i][5]);
		break;
		case "verifyMessage":
		Methods.verifyMessage(data[i][5], data[i][6]);
		System.out.println("****** verifyMessage ********");
		System.out.println(data[i][5]);
		System.out.println(data[i][6]);
		break;
		case "opencoursesbrowser":
		Methods.opencoursesbrowser(data[i][4], data[i][5]);
		System.out.println("****** openmycoursesbrowser ********");
		System.out.println(data[i][4]);
		System.out.println(data[i][5]);
		break;
		case "openmyclassroompage":
		Methods.openmyclassroompage(data[i][4], data[i][5]);
		System.out.println("****** openmyclassroompage ********");
		System.out.println(data[i][4]);
		System.out.println(data[i][5]);
		break;
		case "implimentWait1":
		Methods.implimentWait1();
		System.out.println("****** implimentWait1 ********");
		break;
		case "navigateapplication":
	    Methods.navigate(data[i][6]);
	    System.out.println("****** navigate ********");
		
	    break;
		case "myprofilepage":
		Methods.myprofilepage(data[i][4],data[i][5]);
		System.out.println("****** myprofilepage ********");
		System.out.println(data[i][4]);
		System.out.println(data[i][5]);
		break;
		
		}
	}
	}
}
}
	
			
		
	
	


  

		 
			  
			 
			  
			  
			
		  		
		  		
		  
  

  

