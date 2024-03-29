package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ToFetchDataFromPropertyFile {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream(
				"C:\\Users\\User\\Desktop\\Scripts\\eclipse-workspace_September2023_10AM\\SeleniumAutomation\\testData\\propertyData.properties");

		Properties prop = new Properties();
		prop.load(fis);
 
		String browserValue = prop.getProperty("customerName");

		System.out.println(browserValue);

		String urlValue = prop.getProperty("url");

		System.out.println(urlValue);
	}

}
