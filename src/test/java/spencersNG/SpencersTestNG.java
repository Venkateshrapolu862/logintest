package spencersNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SpencersTestNG {
	
	WebDriver driver;
	
	@BeforeMethod
	public void spenLogin() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.spencers.in/");
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void credentials() {
		WebElement cl = driver.findElement(By.xpath("//button[@type='button'][@class='action switch active']"));
		cl.click();
		driver.switchTo().alert().sendKeys("500071");
		//WebElement lgcl = driver.findElement(By.xpath("//a[@class='myAnchor social-login'][text()='Log In']"));
		//lgcl.click();
		/*driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement cllg = driver.findElement(By.xpath("//a[@class='action login']"));
		cllg.click();
		/*WebElement username = driver.findElement(By.xpath("//fieldset//div[@class='field email required']//input[@name='username']"));
		username.sendKeys("venkateshrapolu862@gmail.com");
		WebElement password = driver.findElement(By.xpath("//div[@class='field password required']//div[@class='control']//input[@type='password'][1]"));
		password.sendKeys("Thelidhu8620");
		WebElement sub = driver.findElement(By.xpath("//div[@class='login-btn primary']//button[@type='button']//span"));
		sub.click();*/
		
	}
	
	
	

}
