package MyOrangeTestNG;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyOrangeTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void orangeInstant() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	}
	
	@Test
	public void loginTest() {
		WebElement username = driver.findElement(By.id("txtUsername"));
		username.sendKeys("Admin");
		WebElement password = driver.findElement(By.id("txtPassword"));
		password.sendKeys("admin123");
		WebElement loginButton = driver.findElement(By.id("btnLogin"));
		loginButton.click();
		WebElement welcometextabcd = driver.findElement(By.id("welcome"));
		String test = welcometextabcd.getText();
		assertEquals(test, "Welcome");
		
		
	}
	
	
	@AfterMethod
	public void quitDriver() {
		driver.quit();
	}
	

}
