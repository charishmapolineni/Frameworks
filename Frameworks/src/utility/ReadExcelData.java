package utility;

import java.io.FileInputStream;


import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {
	private static XSSFSheet ExcelWSheet;
	private static XSSFWorkbook ExcelWBook;
	private static XSSFCell Cell;
	public static Object getRowData;
	public static void setExcelFile(String path,String SheetName) throws Exception
	{
		FileInputStream ExcelFile = new FileInputStream(path);
		ExcelWBook = new XSSFWorkbook(ExcelFile);
		ExcelWSheet = ExcelWBook.getSheet(SheetName);
		
	}
	public static String getCellData(int RowNum,int ColNum) throws Exception
	{
		//String Celldata = ExcelWSheet.getRow(RowNum).getCell(CellNum);
		Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);
		String CellData = Cell.getStringCellValue();
		return CellData;
		
	}
	{
	
		// TODO Auto-generated method stub
		
	}
	public static String[][] getData(String filename, String Sheetname) {
		return null;
		
		// TODO Auto-generated method stub
		
	}
	public static String getData(int iRow, int i) {
		// TODO Auto-generated method stub
		return null;
	}

	}
	


