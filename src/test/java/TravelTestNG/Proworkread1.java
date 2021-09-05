package TravelTestNG;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Proworkread1 {
	
	@Test
	public void prowork1() throws Exception, Exception {
		
		XSSFWorkbook workbook = new XSSFWorkbook(new File("E:/Selenium/JavaProjects/LoginTest/src/main/resources/textdata.xlsx"));
		XSSFSheet sheet = workbook.getSheet("First Sheet");
		int rowcount = sheet.getLastRowNum();
		for(int i=0; i<=rowcount; i++)
		{
			Row row = sheet.getRow(i);
			System.out.println(row.getCell(0)+ "  "+row.getCell(1));

			
		}
		
	}

}
