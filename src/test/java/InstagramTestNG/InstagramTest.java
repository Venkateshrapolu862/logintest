package InstagramTestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InstagramTest {
	WebDriver driver;
	
	
	@BeforeMethod
	public void instaLoginPage() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	
	@Test
	public void credentialLogin() {
		WebElement userName = driver.findElement(By.xpath("//input[@name='username']"));
		userName.sendKeys("venkatesh862@gmail.com");
		WebElement passWord = driver.findElement(By.xpath("//input[@aria-label='Password']"));
		passWord.sendKeys("Thelidhu8620");
		WebElement login = driver.findElement(By.xpath("//button[@class='sqdOP  L3NKy   y3zKF     ']"));
		login.click();
		//WebElement message = driver.findElement(By.xpath("//a[@href='/direct/inbox/']"));
		//message.click();
		//WebElement notnow = driver.findElement(By.xpath("//button[@class='aOOlW   HoLwm ']"));
		//notnow.click();
		//WebElement searchid = driver.findElement(By.xpath("//div[@class='_7UhW9   xLCgt      MMzan  KV-D4              fDxYl     ']"));
		//searchid.click();
		//WebElement entertext = driver.findElement(By.xpath("//div[@class='                     Igw0E     IwRSH      eGOV_        vwCYk                                        ItkAi                                                                       ']//textarea"));
		//entertext.sendKeys("Hi ra, How are you?");
		//WebElement send = driver.findElement(By.xpath("//div[@class='                     Igw0E     IwRSH      eGOV_         _4EzTm                                        JI_ht                                                                      ']//button"));
		//send.click();
		Wait E = new WebDriverWait(driver, 60);
		E.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='venkatesh']")));
		WebElement plus = driver.findElement(By.xpath("//div[@class='QBdPU ']"));
		plus.click();
		//WebElement bbt = driver.findElement(By.xpath("//div[@class='                     Igw0E     IwRSH      eGOV_         _4EzTm                                                                                zQLcH            XTCZH                  ']//button"));
		//bbt.sendKeys("C:/Users/EZ4tech1/Desktop/rapolu/my self/New folder/htl/1624892376973.jpg");
		
		
	}

}
