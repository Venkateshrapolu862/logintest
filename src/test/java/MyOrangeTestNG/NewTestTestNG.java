package MyOrangeTestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTestTestNG {
	WebDriver driver;
	
	
	@BeforeTest
	public void hrmHomePage() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
	}
	
	@Test
	public void hrmLoginPanel() {
		WebElement username = driver.findElement(By.xpath("//input[@id='txtUsername']"));
		username.sendKeys("Admin");
		WebElement password = driver.findElement(By.xpath("//input[@id='txtPassword']"));
		password.sendKeys("admin123");
		WebElement submit = driver.findElement(By.xpath("//input[@id='btnLogin']"));
		submit.click();
		WebElement leave = driver.findElement(By.xpath("//a[@href='/index.php/leave/viewLeaveModule']"));
		leave.click();
		Select dropDown = new Select(driver.findElement(By.id("leaveList_cmbSubunit")));
		dropDown.selectByVisibleText("Engineering");
		WebElement employee = driver.findElement(By.xpath("//input[@id='leaveList_txtEmployee_empName']"));
		employee.sendKeys("xxxxxx");
		WebElement shoeLeave = driver.findElement(By.xpath("//label[@for='leaveList_chkSearchFilter_3']"));
		shoeLeave.click();
		WebElement leavelist = driver.findElement(By.xpath("//label[@for='leaveList_cmbWithTerminated']"));
		leavelist.click();
		
		
		WebElement from = driver.findElement(By.id("calFromDate"));
		from.click();
		List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
		for(WebElement ele:allDates)
		{
			String date=ele.getText();
			if(date.equalsIgnoreCase("28"))
			{
				ele.click();
				break;
			}
	
		}
		
		WebElement to = driver.findElement(By.id("calToDate"));
		to.click();
		List<WebElement> allDatess = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
		for(WebElement ele:allDatess)
		{
			String date=ele.getText();
			if(date.equalsIgnoreCase("29"))
			{
				ele.click();
				break;
			}
	
		}	
		
		
		
	}
}		
		
	
	
