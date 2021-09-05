package FlipkartHomepage;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider {
	
	
	@Test(dataProvider="venkatesh")
	public void Mailtest(String name, String password) 
	{
		System.out.println(name+ "  " +password);

	}
	
	@DataProvider(name="venkatesh")
	public String[][] data() 
	{
		return new String[][] 
		{ 
			
			{
				"venkatesh862@gmail.com","12345"
			},
			{
				"venkatesh","12345"
			},
			{
				"venkatesh","12345"
			}
		};
	}

}
