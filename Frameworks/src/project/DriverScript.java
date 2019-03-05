package project;

import java.lang.reflect.Method;

import utility.ReadExcelData;

public class DriverScript {

	public static actions actionkeywords;
	public static String sactions;
	public static Method method[];
	public static void main(String[] args) throws Exception
	{
		String spath = "C:\\Users\\bolle\\Documents\\TestExcel.xlsx";
		ReadExcelData.setExcelFile(spath, "Sheet2");
		for(int iRow=1;iRow<=17;iRow++)
		{
			sactions = ReadExcelData.getData(iRow, 1);
			execute_actions();
		}
	}
	private static void execute_actions() throws Exception
	{
		actionkeywords = new actions();
		method = actionkeywords.getClass().getMethods();
		for(int i=0;i<method.length;i++)
		{
			if(method[i].getName().equals(sactions))
			{
				method[i].invoke(actionkeywords);
				break;
			}
		}
		
		// TODO Auto-generated method stub
		
	}
}
