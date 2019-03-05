package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile {


	public static String[][] getData(String filename,String sheetName) throws IOException
	{
	File file = new File(filename);
	FileInputStream ips = new FileInputStream(file);
	Workbook Wb = new XSSFWorkbook(ips);
	Sheet sh = Wb.getSheet(sheetName);
	int rowNum = sh.getLastRowNum() +1;
	int colNum = sh.getRow(0).getLastCellNum();
	String[][] data = new String[rowNum][colNum];
	for(int i=0;i<rowNum;i++)
	{
		Row row = sh.getRow(i);
		for(int j=0;j<colNum;j++)
		{
			Cell cell = row.getCell(j);
			String value = new DataFormatter().formatCellValue(cell);
			data[i][j]=value;
		}}
	return data;



	
}

	public static void setExcelFile(String sPath, String string) {
		// TODO Auto-generated method stub
		
	}


}
		