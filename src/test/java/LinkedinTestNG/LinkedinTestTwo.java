package LinkedinTestNG;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinkedinTestTwo {
	
WebDriver driver;
	
	@BeforeMethod
	public void createLinkedInDriverInstant () {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.linkedin.com/checkpoint/lg/login");
	}
	
	
	@Test
	public void LinkedInLogIn() throws InterruptedException {
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("venkateshrapolu862@gmail.com");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Thelidhu8620");
		WebElement logInButton = driver.findElement(By.xpath("//button[@class='btn__primary--large from__button--floating']"));
		logInButton.click();
		driver.navigate().to("https://www.linkedin.com/mynetwork/");
		
	}
	
	/*@AfterMethod
	public void quitDriver() {
		driver.quit();
	}*/

}
