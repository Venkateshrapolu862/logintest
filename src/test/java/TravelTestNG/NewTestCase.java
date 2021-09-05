package TravelTestNG;

import java.awt.List;
import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTestCase {
	
	
	private static final WebDriver Rowtable = null;
	WebDriver driver;
	

	@BeforeMethod
	public void openBrowser() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.nyse.com/ipo-center/filings");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(5000);
	}

	@Test
	public void tripDetails() {
		
		//XSSFWorkbook workbook = new XSSFWorkbook(new File(""));
		//XSSFSheet sheet = workbook.getSheet(arg0)
	
	//Finding number of Rows

	WebElement rowsNumber = (WebElement) driver.findElements(By.xpath("//*[@id='content-8b4988b9-2ec9-4e77-9b4d-9c2994bd9e8a']/div/div/table[1]/tbody/tr[1]/td[1]"));
	Dimension rowCount = rowsNumber.getSize();
	System.out.println("No of rows in this table : " + rowCount);

	//Finding number of Columns

	WebElement columnsNumber = (WebElement) driver.findElements(By.xpath("//*[@id='content-8b4988b9-2ec9-4e77-9b4d-9c2994bd9e8a']/div/div/table[1]/thead/tr/th[1]"));
	Dimension columnCount = columnsNumber.getSize();
	System.out.println("No of columns in this table : " + columnCount);

	//Finding cell value at 4th row and 3rd column

	WebElement cellAddress = Rowtable.findElement(By.xpath("//*[@id='content-8b4988b9-2ec9-4e77-9b4d-9c2994bd9e8a']/div/div/table[1]/tbody/tr[4]/td[3]"));
	String value = cellAddress.getText();
	System.out.println("The Cell Value is : " +value);

	driver.quit();
	}
}

