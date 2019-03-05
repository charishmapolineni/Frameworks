package project;

import org.openqa.selenium.support.PageFactory;

import KeywordDrivenTesting.Methods;
import utility.ReadExcel;
import utility.ReadExcelData;




public class HybridTest {

	public static void main(String[] args) throws Exception
	{
		
		String sPath="C:\\Users\\bolle\\Documents\\TestExcel.xlsx";
		ReadExcelData.setExcelFile(sPath, "Sheet2");
		for (int iRow=1;iRow<=17;iRow++)
			
				
		{
		
	       String sactions = ReadExcelData.getCellData(iRow,1);
		
		
			String[][] data = ReadExcelData.getData("TestExcel.xlsx", "Sheet2");
			
			if(sactions.equals("openBrowser"))
			{
			actions.openBrowser();
	        }
			else if(sactions.equals("navigateapplication"))
			{
				actions.navigateapplication(data[iRow][6]);
				
			}
			else if(sactions.equals("maximizeWindow"))
			{
				actions.maximizeWindow();
			}
			else if(sactions.equals("loginportal"))
			{
				
			actions.loginportal(data[iRow][4], data[iRow][5]);
			}
			else if(sactions.equals("enterinvalidusername"))
			{
			   actions.enterinvalidusername(data[iRow][4], data[iRow][5], data[iRow][6]);
			}
			else if(sactions.equals("enterinvalidpassword"))
			{
				actions.enterinvalidpassword(data[iRow][4], data[iRow][5], data[iRow][6]);
			}
			else if(sactions.equals("implimentWait"))
			{
				actions.implimentWait();
			}
			else if(sactions.equals("clickSubmit"))
			{
				actions.clickSubmit(data[iRow][4], data[iRow][5]);
			}
			else if(sactions.equals("verifyMessage"))
			{
				actions.verifyMessage(data[iRow][5], data[iRow][6]);
			}
			else if(sactions.equals("opencoursesbrowser"))
			{
				actions.opencoursesbrowser(data[iRow][4], data[iRow][5]);
			}
			else if(sactions.equals("openmyclassroompage"))
			{
				actions.openmyclassroompage(data[iRow][4], data[iRow][5]);
			}
			else if(sactions.equals("implimentWait"))
			{
				actions.implimentWait();
			}
			else if(sactions.equals("navigateapplication"))
			{
				actions.navigateapplication(data[iRow][6]);
			}
			else if(sactions.equals("myprofilepage"))
			{
				actions.myprofilepage(data[iRow][4], data[iRow][5]);
			}
			else if(sactions.equals("clicklogout"))
			{
				actions.clicklogout(data[iRow][4], data[iRow][5]);
			}
			else if(sactions.equals("closeBrowser"))
			{
				actions.closeBrowser();
			}
				
			
}
	}
}
