package utility;
import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadExcel {
	XSSFWorkbook wb;
	XSSFSheet sheet;
	public ReadExcel(String excelpath)
	{
		try
		{
			File src = new File(excelpath);
			FileInputStream fis = new FileInputStream(src);
			wb = new XSSFWorkbook(fis);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	public String getData(int sheetnumber, int row, int column)
					{
		sheet = wb.getSheetAt(sheetnumber);
		String data = sheet.getRow(row).getCell(column).getStringCellValue();
		return data;
				
					}
	public int getRowCount(int sheetIndex)
	{
		int row = wb.getSheetAt(sheetIndex).getLastRowNum();
		row = row + 1;
		return row;
		}
	public static String getData(int iRow, int i) {
		// TODO Auto-generated method stub
		return null;
	}
	public static String getCellData(int iRow, int i) {
		// TODO Auto-generated method stub
		return null;
	}
	public static void setExcelFile(String sPath, String string) {
		// TODO Auto-generated method stub
		
	}

	}
	


