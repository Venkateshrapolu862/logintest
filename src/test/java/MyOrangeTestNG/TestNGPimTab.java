package MyOrangeTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGPimTab {
WebDriver driver;
	
	
	@BeforeMethod
	public void ngLogin() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().window().maximize();
	}
	
	
	@Test
	public void credentialAdmin() {
		WebElement username = driver.findElement(By.xpath("//input[@id='txtUsername']"));
		username.sendKeys("Admin");
		WebElement password = driver.findElement(By.xpath("//input[@id='txtPassword']"));
		password.sendKeys("admin123");
		WebElement logIn = driver.findElement(By.xpath("//input[@id='btnLogin']"));
		logIn.click();
		WebElement Pim = driver.findElement(By.id("menu_pim_viewPimModule"));
		Pim.click();
		WebElement Add = driver.findElement(By.id("btnAdd"));
		Add.click();
		WebElement fullFirstName = driver.findElement(By.xpath("//input[@id='firstName']"));
		fullFirstName.sendKeys("rapolu");
		WebElement fullMiddleName = driver.findElement(By.xpath("//input[@id='middleName']"));
		fullMiddleName.sendKeys("venkatesh");
		WebElement fulllastName = driver.findElement(By.xpath("//input[@id='lastName']"));
		fulllastName.sendKeys("kumar");
		WebElement empID = driver.findElement(By.xpath("//input[@class='formInputText valid']"));
		empID.clear();
		empID.sendKeys("8620");
		WebElement photo = driver.findElement(By.xpath("//input[@class='duplexBox']"));
		photo.sendKeys("C:/Users/EZ4tech1/Desktop/rapolu/my self/Screenshot_20190406-103807_Word.jpg");
		WebElement loginDetails = driver.findElement(By.xpath("//input[@type='checkbox']"));
		loginDetails.click();
		WebElement userName = driver.findElement(By.xpath("//input[@name='user_name']"));
		userName.sendKeys("venkatesh862");
		WebElement passWord = driver.findElement(By.xpath("//input[@name='user_password']"));
		passWord.sendKeys("Venkatesh@862");
		WebElement confirmpassWord = driver.findElement(By.xpath("//input[@name='re_password']"));
		confirmpassWord.sendKeys("Venkatesh@862");
		Select statuss = new Select(driver.findElement(By.xpath("//select[@name='status']")));
		statuss.selectByVisibleText("Enabled");
		WebElement save = driver.findElement(By.xpath("//input[@id='btnSave']"));
		save.click();
		
		

}
}
