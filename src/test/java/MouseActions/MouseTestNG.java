package MouseActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseTestNG {
	WebDriver driver;
	
	
	@Test
	public void action() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//Actions a = new Actions(driver);
		//a.moveToElement(driver.findElement(By.xpath("//a[@href='reservation.php']") )).build().perform();
		//Thread.sleep(3000);
		WebElement wbs = driver.findElement(By.xpath("//a[@href='reservation.php']"));
		wbs.click();
		
	}

}
