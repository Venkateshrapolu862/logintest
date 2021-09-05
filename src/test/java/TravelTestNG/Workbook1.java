package TravelTestNG;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Workbook1 {
	
	@Test
	public void workBookSheet() throws Exception {
		
		XSSFWorkbook workBookSheet = new XSSFWorkbook();
		XSSFSheet sheet = workBookSheet.createSheet("Seconf sheet");
		for(int i=0; i<4; i++)
		{
			Row row = sheet.createRow(i);
			Cell c = row.createCell(0);
			if(i==0)
				c.setCellValue("S No");
			if(i==1)
			c.setCellValue(1);
			if(i==2)
			c.setCellValue(2);
			if(i==3)
			c.setCellValue(3);
			if(i==4)
			c.setCellValue(4);
			Cell c1 = row.createCell(1);
			if(i==0)
				c1.setCellValue("Name of Student");
			if(i==1)
			c1.setCellValue("venky");
			if(i==2)
				c1.setCellValue("venkatesh");
			if(i==3)
				c1.setCellValue("Gundu");
			if(i==4)
				c1.setCellValue("gundutahlli");
			Cell c2 = row.createCell(2);
			if(i==0)
				c2.setCellValue("English");
			if(i==1)
			c2.setCellValue(96);
			if(i==2)
				c2.setCellValue(89);
			if(i==3)
				c2.setCellValue(97);
			if(i==4)
				c2.setCellValue(86);
			
					
		}
		
		FileOutputStream out = new FileOutputStream(new File("E:/Selenium/JavaProjects/LoginTest/src/main/resources/seconddata.xlsx"));
		workBookSheet.write(out);
		out.close();
		
	}

}
