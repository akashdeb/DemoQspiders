package testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	//How to execute same test script multiple times with different data
	//data Provider
	//What is the return type of data provider
	//Two Dimension Object array
	@Test(dataProvider = "data")
	public void food(String city, String food) {
		System.out.println("Come to "+city+" and eat "+food+"");
	}
	
	@DataProvider
	public Object[][] data() {
		
		Object[][] arr = new Object[4][2];
		
		arr[0][0] = "Noida";
		arr[1][0] = "Delhi";
		arr[2][0] = "Gurgaon";
		arr[3][0] = "Bengaluru";
		
		arr[0][1] = "Chaap";
		arr[1][1] = "Parathe";
		arr[2][1] = "Lassi";
		arr[3][1] = "Coffee";
		
		
		return arr;
		

		
	}

}
