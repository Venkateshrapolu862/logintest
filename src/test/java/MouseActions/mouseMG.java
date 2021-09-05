package MouseActions;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mouseMG {
	WebDriver driver;
	
	
	@Test
	public void mouseOverMB() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://mrbool.com/");
		driver.manage().window().maximize();
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//*[@class='menulink']"))).build().perform();
		WebElement ws = driver.findElement(By.xpath("//*[@class='submenu']//li//a[text()='Articles']"));
		ws.click();
		//Implecity
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//Explicity
		//Wait ab = new WebDriverWait(driver, 3000);
		//ab.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Arrow Functions")));
		WebElement li = driver.findElement(By.partialLinkText("Arrow Functions"));
		li.click();
	}

}
