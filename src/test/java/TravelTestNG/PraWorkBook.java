package TravelTestNG;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class PraWorkBook {
	
	
	@Test
	public void workBookSheet() throws Exception {
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("first shett");
		for(int i=0; i<=4; i++)
		{
			Row row = sheet.createRow(i);
			Cell c = row.createCell(0);
			if(i==0)
			c.setCellValue("Telugu");
			if(i==1)
				c.setCellValue("Telugu");
			if(i==2)
				c.setCellValue("Telugu");
			if(i==3)
				c.setCellValue("Telugu");
			Cell c1 = row.createCell(1);
			if(i==0)
			c1.setCellValue("Telugu");
			if(i==1)
				c1.setCellValue("Telugu");
			if(i==2)
				c1.setCellValue("Telugu");
			if(i==3)
				c1.setCellValue("Telugu");
			Cell c2 = row.createCell(2);
			if(i==0)
			c2.setCellValue("Telugu");
			if(i==1)
				c2.setCellValue("Telugu");
			if(i==2)
				c2.setCellValue("Telugu");
			if(i==3)
				c2.setCellValue("Telugu");
			Cell c3 = row.createCell(3);
			if(i==0)
			c3.setCellValue("Telugu");
			if(i==1)
				c3.setCellValue("Telugu");
			if(i==2)
				c3.setCellValue("Telugu");
			if(i==3)
				c3.setCellValue("Telugu");
			
		}
		
		FileOutputStream abc = new FileOutputStream(new File("E:/Selenium/JavaProjects/LoginTest/src/main/resources/prowork.xlsx"));
		workbook.write(abc);
		abc.close();
	}
	

}
