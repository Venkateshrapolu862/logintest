package MyOrangeTestNG;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyInfoTestNG {
	
	WebDriver driver;
	
	@BeforeMethod
	public void LoginURL()  {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().window().maximize();
		
	}
	
	
	@Test
	public void myInfo() {
		WebElement username = driver.findElement(By.id("txtUsername"));
		username.sendKeys("Admin");
		WebElement password = driver.findElement(By.id("txtPassword"));
		password.sendKeys("admin123");
		WebElement loginbutton = driver.findElement(By.id("btnLogin"));
		loginbutton.click();
		WebElement dashboard = driver.findElement(By.xpath("//a[@href='/index.php/pim/viewMyDetails']"));
		dashboard.click();
		WebElement edit = driver.findElement(By.xpath("//input[@id='btnSave']"));
		edit.click();
		WebElement fullname = driver.findElement(By.xpath("//input[@id='personal_txtEmpFirstName']"));
		fullname.clear();
		fullname.sendKeys("venkatesh");
		WebElement middlename = driver.findElement(By.xpath("//input[@id='personal_txtEmpMiddleName']"));
		middlename.clear();
		middlename.sendKeys("Netha");
		WebElement lastname = driver.findElement(By.xpath("//input[@id='personal_txtEmpLastName']"));
		lastname.clear();
		lastname.sendKeys("rapolu");
		WebElement empid = driver.findElement(By.xpath("//input[@id='personal_txtEmployeeId']"));
		empid.clear();
		empid.sendKeys("8620");
		WebElement otherid = driver.findElement(By.xpath("//input[@id='personal_txtOtherID']"));
		otherid.sendKeys("1234");
		WebElement licnum = driver.findElement(By.xpath("//input[@id='personal_txtLicenNo']"));
		licnum.sendKeys("bvfds253964sa");
		WebElement licexp = driver.findElement(By.xpath("//input[@id='personal_txtLicExpDate']"));
		licexp.click();
		List<WebElement> licexptable = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']"));
		for(WebElement let:licexptable)
		{
		String date=let.getText();
		if(date.equalsIgnoreCase("26"))
		{
			let.click();
			break;
		
		}	
	    }
		
		

}
}
