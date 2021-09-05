package TravelTestNG;

import java.io.File;
import java.io.IOException;

import org.apache.batik.dom.GenericCDATASection;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class PraWorkRead {
	
	@Test
	public void praworkread() throws Exception, Exception {
		
		XSSFWorkbook workbook = new XSSFWorkbook(new File("E:/Selenium/JavaProjects/LoginTest/src/main/resources/prowork.xlsx"));
		XSSFSheet sheet = workbook.getSheet("first shett");
		int getrow = sheet.getLastRowNum();
		for(int i=0; i<=getrow; i++)
		{
			Row row = sheet.getRow(i);
			int cellcount =  row.getLastCellNum();
			
			System.out.println(cellcount );
			
		}
		
	}

}
