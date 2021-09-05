package LinkandParitalLink;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinktextTestNG {
	WebDriver driver;
	
	@BeforeMethod
	public void loginPage() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
	}
	
	@Test
	public void instaSignUP() {
		WebElement sign = driver.findElement(By.linkText("Forgot password?"));
		sign.click();
	}
	
	

}
