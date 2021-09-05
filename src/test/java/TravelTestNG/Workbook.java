package TravelTestNG;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;


public class Workbook {
	
	Logger log = (Logger) LogManager.getLogger(Workbook.class.getName());
	
	
	@Test
	public void workBook() throws Exception {
		DOMConfigurator.configure("log4j.xml");
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("First Sheet");
		log.info("Sheet name is first sheet");
		for(int i=0; i<2; i++)
		{
			Row row = sheet.createRow(i);
			Cell c = row.createCell(0);
			if(i==0)
			c.setCellValue("123");
			else
			c.setCellValue("1234");
			Cell c1 = row.createCell(1);
			if(i==0)
			c1.setCellValue("xxxxx");
			else
			c1.setCellValue("sgfs");
			
		}
		
		FileOutputStream out = new FileOutputStream(new File("E:/Selenium/JavaProjects/LoginTest/src/main/resources/textdata.xlsx"));
		workbook.write(out);
		out.close();
	}

}
