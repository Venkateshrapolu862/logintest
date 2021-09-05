package MyOrangeTestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertHandling {
	WebDriver driver;
	
	
	@Test
	public void alertHandling() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		WebElement userid = driver.findElement(By.xpath("//input[@name='cusid']"));
		userid.sendKeys("12345");
		WebElement submit = driver.findElement(By.xpath("//input[@name='submit']"));
		submit.click();
		Alert xxx = driver.switchTo().alert();
		xxx.accept();
		Alert xxx1 = driver.switchTo().alert();
		xxx1.accept();
	}

}
