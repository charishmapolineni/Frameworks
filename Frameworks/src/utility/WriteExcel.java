package utility;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {
	public static void main(String[] args)throws Exception {
		File src=new File("C:\\Users\\bolle\\Documents\\TestExcel.xlsx");
		FileInputStream fis=new FileInputStream(src);
		 Workbook Wb = new XSSFWorkbook(fis);
	    Sheet sheet1=Wb.getSheetAt(0);
	    sheet1.getRow(1).createCell(3).setCellValue("fail");
	    sheet1.getRow(2).createCell(3).setCellValue("fail");
	    sheet1.getRow(3).createCell(3).setCellValue("fail");
	    sheet1.getRow(4).createCell(3).setCellValue("fail");
	    sheet1.getRow(5).createCell(3).setCellValue("fail");
	    sheet1.getRow(6).createCell(3).setCellValue("fail");
	    sheet1.getRow(7).createCell(3).setCellValue("fail");
	    sheet1.getRow(8).createCell(3).setCellValue("pass");
	    FileOutputStream fout=new FileOutputStream(src);
	    Wb.write(fout);
	    
	}

}
