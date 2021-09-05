package MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseDoubleClick {
WebDriver driver;
	
	@Test
	public void mRC() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		Actions ac = new Actions(driver);
		ac.doubleClick(driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"))).build().perform();
		

}
}