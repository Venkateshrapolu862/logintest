package Rocksapce;

import java.awt.Component;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RockspaceTest {
	WebDriver driver;
	
	@BeforeMethod
	public void gpage() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
	}
	
	
	@Test
	public void gsearch() {
		WebElement search = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		search.sendKeys("Rockspace Webmail login");
		WebElement searchclick = driver.findElement(By.xpath("//input[@name='btnK']"));
		searchclick.click();
		WebElement clickOnRack = driver.findElement(By.xpath("//a[@href='https://apps.rackspace.com/']"));
		clickOnRack.click();
		Wait b = new WebDriverWait(driver, 30);
		b.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='user-input']")));
		WebElement username = driver.findElement(By.xpath("//input[@id='user-input']"));
		Wait c = new WebDriverWait(driver, 30);
		c.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='pass-input']")));
		username.sendKeys("Pramod@ez4tech.com");
		WebElement password = driver.findElement(By.xpath("//input[@id='pass-input']"));
		password.sendKeys("Pramo@2021");
		WebElement login = driver.findElement(By.xpath("//button[@id='login-btn']"));
		login.click();
		Wait a = new WebDriverWait(driver, 30);
		a.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='toolbar_content'][text()='Compose']")));
		WebElement com = driver.findElement(By.xpath("//div[@class='toolbar_content'][text()='Compose']"));
		com.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement Compo = driver.findElement(By.xpath("//textarea[@style='height: 13px; width: 534px;']"));
		Compo.sendKeys("venkateshrapolu862@gmail.com");
		WebElement sub = driver.findElement(By.xpath("//td[@_ref='subject_cell']//textarea"));
		sub.sendKeys("Updated HotList");
		//Actions f = new Actions(driver);
		//f.doubleClick(driver.findElement(By.xpath("//td[@_ref='subject_cell']//textarea"))).build().perform();
		//Wait e = new WebDriverWait(driver, 30);
		//e.until(ExpectedConditions.elementToBeClickable(By.xpath("//body[@id='tinymce']//p[@style='font-family: 'times new roman'; font-size: 12pt; overflow-wrap: break-word;']")));
		//WebElement text = driver.findElement(By.xpath("//body[@id='tinymce']//p[@style='font-family: 'times new roman'; font-size: 12pt; overflow-wrap: break-word;']"));
		//text.sendKeys("nvkvfbjh ht v fyktc ");
		//f.doubleClick(target)
	}
	
	
	/*@AfterMethod
	public void quit() {
		driver.quit();
	}*/
	

}
