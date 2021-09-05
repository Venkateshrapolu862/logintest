package FlipkartHomepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HomepageTitle {
	WebDriver driver;

	@Test(invocationCount=1, threadPoolSize=2, enabled=true, groups={"login"})
	public void homepagetitle()
	{
		String expectedtitle= "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		String actualtitle = driver.getTitle();
		Assert.assertEquals(actualtitle, expectedtitle);
		//Assert.fail(); 
	}
	
	
	@Test(groups={"submittimesheet"}, alwaysRun=true)
	public void submittimesheets() {
		System.out.println("bcsdjgfsjkhsdgb");
	}
	
	
	@AfterMethod
	public void quitdriver() {
		driver.quit();
	}
}
