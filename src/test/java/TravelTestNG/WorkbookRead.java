package TravelTestNG;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class WorkbookRead {
	
	@Test
	public void workBookRead() throws Exception, Exception {
		
		XSSFWorkbook workbook = new XSSFWorkbook(new File("E:/Selenium/JavaProjects/LoginTest/src/main/resources/seconddata.xlsx"));
		XSSFSheet sheet = workbook.getSheet("seconf sheet");
		int rowcount = sheet.getLastRowNum();
		for(int i=0; i<=rowcount; i++)
		{
			Row row = sheet.getRow(i);
			System.out.println(row.getCell(0)+ "  " +row.getCell(1)+ "  " +row.getCell(2));
		}
		
				
	}

}
