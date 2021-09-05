package HeroTestNG;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;


import io.github.bonigarcia.wdm.WebDriverManager;

public class HeroTest {
	
	WebDriver driver;
	
	@AfterMethod
	public void googleDriveCheck() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	}
	

	
	

	
	@AfterMethod
	public void quitDriver() {
		
	driver.quit();
	}
	

}
