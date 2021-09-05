package GmailTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GmailTest {
	WebDriver driver;
	
	@BeforeMethod
	public void gmailLogin() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://apps.rackspace.com/wmidentity/Account/Login?ReturnUrl=%2Fwmidentity%2Fconnect%2Fauthorize%2Fcallback%3Fresponse_mode%3Dform_post%26response_type%3Dcode%2520id_token%26redirect_uri%3Dhttps%253A%252F%252Fapps.rackspace.com%252Flogin.php%26client_id%3Dwebmail%26nonce%3D6f9256e95add9f8b8877b8afbfa27d0a%26state%3Def8766fc5cc4f951b7d5327b6018c59e%26scope%3Dopenid%2520profile%2520email%2520webmail%2520openid");
		driver.manage().window().maximize();
		
	}
	
	
	@Test
	public void login() {
	WebElement username = driver.findElement(By.xpath("//*[@id='user-input']"));
	username.sendKeys("Pramod@ez4tech.com");
	WebElement password = driver.findElement(By.xpath("//*[@id='pass-input']"));
	password.sendKeys("Pramo@2021");
	WebElement login = driver.findElement(By.xpath("//*[@id='login-btn']"));
	login.click();
	WebElement add = driver.findElement(By.xpath("//a[@href='javascript:void(0)']"));
	add.click();
	
	
}
	
	
}
