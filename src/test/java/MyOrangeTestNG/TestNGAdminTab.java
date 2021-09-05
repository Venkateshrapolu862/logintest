package MyOrangeTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGAdminTab {
	WebDriver driver;
	
	
	@BeforeMethod
	public void ngLogin() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().window().maximize();
		
	}
	
	
	@Test
	public void credentialAdmin() throws InterruptedException {
		WebElement username = driver.findElement(By.xpath("//input[@id='txtUsername']"));
		username.sendKeys("Admin");
		WebElement password = driver.findElement(By.xpath("//input[@id='txtPassword']"));
		password.sendKeys("admin123");
		WebElement logIn = driver.findElement(By.xpath("//input[@id='btnLogin']"));
		logIn.click();
		WebElement Admin = driver.findElement(By.xpath("//a[@href='/index.php/admin/viewAdminModule']"));
		Admin.click();
		WebElement Add = driver.findElement(By.xpath("//input[@id='btnAdd']"));
		Add.click();
		Select userRole = new Select(driver.findElement(By.id("systemUser_userType")));
		userRole.selectByVisibleText("ESS");
		WebElement employeeName = driver.findElement(By.xpath("//input[@id='systemUser_employeeName_empName']"));
		employeeName.sendKeys("Dominic Chase");
		WebElement userName = driver.findElement(By.id("systemUser_userName"));
		userName.sendKeys("venkateshrapolu");
		Thread.sleep(5000);
		Select status = new Select(driver.findElement(By.id("systemUser_status")));
		status.selectByValue("1");
		WebElement Password = driver.findElement(By.xpath("//input[@id='systemUser_password']"));
		Password.sendKeys("Admin@123");
		WebElement conformPassword = driver.findElement(By.xpath("//input[@id='systemUser_confirmPassword']"));
		conformPassword.sendKeys("Admin@123");
		WebElement Save = driver.findElement(By.xpath("//input[@id='btnSave']"));
		Save.click();
		
		
		
		
	}
	

}
