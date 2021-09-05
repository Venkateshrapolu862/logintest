package JDataProvider;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderNG {
	
	WebDriver driver;
	
	@Test(dataProvider="America", invocationCount=2, threadPoolSize=2)
	public void MailTest(String name, String password) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
	}
	
	
	@DataProvider(name="America")
	public String[][] data() {
		return new String[][] {
			{
				"venkateshrapolu862@gmail.com", "Thelidhu8620"
			},
			{
				"venkateshss862@gmail.com", "Thelidhu8620"
			}
		};
		
	}

}
