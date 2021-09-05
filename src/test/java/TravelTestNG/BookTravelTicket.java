package TravelTestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BookTravelTicket {
	
	WebDriver driver;
	
	
	@BeforeMethod
	public void BkTrTcwebpage() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.phptravels.net/login");
		driver.manage().window().maximize();
	}
	
	@Test
	public void BkTrlogin() {
		WebElement email = driver.findElement(By.xpath("//div[@class='form-group']//input[@class='form-control'][@name='email']"));
		email.sendKeys("user@phptravels.com");
		WebElement password = driver.findElement(By.xpath("//input[@class='form-control'][@name='password']"));
		password.sendKeys("demouser");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']//span[text()='Login']"));
		login.click();
		/*WebElement home = driver.findElement(By.xpath("//li//a[@href='https://www.phptravels.net/']"));
		home.click();
		WebElement flights = driver.findElement(By.xpath("//span[@class='d-none d-lg-block d-xl-block'][text()=' flights']"));
		flights.click();*/
		
	}
	

}
