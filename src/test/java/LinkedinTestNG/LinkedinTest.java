package LinkedinTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinkedinTest {
	
	WebDriver driver;
	
	@Test
	public void createLinkedInDriverInstant () {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.linkedin.com/checkpoint/lg/login");
	}
	
	@AfterMethod
	public void quitDriver() {
		driver.quit();
	}

}
