package AlertPopUp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert {
	
	WebDriver driver;
	
	@Test
	public void AlertNG() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		WebElement Custo = driver.findElement(By.xpath("//input[@type='text']"));
		Custo.sendKeys("venky862");
		WebElement sub = driver.findElement(By.xpath("//input[@type='submit']"));
		sub.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.switchTo().alert().accept();  
		
		}
	
	

}
