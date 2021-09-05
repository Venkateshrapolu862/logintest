package orangeTestNG;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeTest {
	WebDriver driver;
	
	@BeforeMethod
	public void createDriveInstant() {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	
	@Test
	public void leaveapply() {
		WebElement username = driver.findElement(By.id("txtUsername"));
		username.sendKeys("Admin");
		WebElement password = driver.findElement(By.id("txtPassword"));
		password.sendKeys("admin123");
		WebElement loginbutton = driver.findElement(By.id("btnLogin"));
		loginbutton.click();
		WebElement welcomeText = driver.findElement(By.id("welcome"));
		String test = welcomeText.getText();
		assertEquals(test, "Welcome Mayur");
		WebElement leavebutton = driver.findElement(By.id("menu_leave_viewLeaveModule"));
		leavebutton.click();
		WebElement leavetext = driver.findElement(By.className("toggle tiptip"));
		assertTrue(leavetext.isDisplayed());
		WebElement from = driver.findElement(By.id("leaveList_txtEmployee_empName"));
		from.sendKeys("venkatesh");
		//WebElement twentytwo  = driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[4]/td[4]/a"));
		//twentytwo.click();
		
		
		/*WebElement to = driver.findElement(By.xpath("//input[@id=calToDate]"));
		to.sendKeys("2021-07-23");
		WebElement ShowLeavewith = driver.findElement(By.id("leaveList_chkSearchFilter_checkboxgroup_allcheck"));
		ShowLeavewith.click();
		WebElement Employee = driver.findElement(By.id("leaveList_txtEmployee_empName"));
		Employee.sendKeys("Employee");
		WebElement SubUnit = driver.findElement(By.id("leaveList_cmbSubunit"));
		SubUnit.sendKeys("Sub Unit");
		WebElement SelectOne = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div[2]/form/fieldset/ol/li[5]/select/option[2]"));
		SelectOne.click();
		WebElement IncludePastEmployee = driver.findElement(By.id("leaveList_cmbWithTerminated"));
		IncludePastEmployee.click();
		WebElement Search = driver.findElement(By.id("btnSearch"));
		Search.click();
	*/
		
		
		
		
		
		
	}
	
	/*@Test
	public void login() {
		
		WebElement username = driver.findElement(By.id("txtUsername"));
		username.sendKeys("Admin");
		WebElement password = driver.findElement(By.id("txtPassword"));
		password.sendKeys("admin123");
		WebElement loginbutton = driver.findElement(By.id("btnLogin"));
		loginbutton.click();
		WebElement welcomeText = driver.findElement(By.id("welcome"));
		String test = welcomeText.getText();
		assertEquals(test, "Welcome Paul");
	}*/
	
	
	
	/*@AfterMethod
	public void quitDriver() {
		driver.quit();
	}*/

}
