package MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseRightClick {
	WebDriver driver;
	
	@Test
	public void mRC() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Actions ac = new Actions(driver);
		
		ac.contextClick(driver.findElement(By.xpath("//*[@id='forgotPasswordLink']//a[text()='Forgot your password?']"))).build().perform();
		
	}
	

}
