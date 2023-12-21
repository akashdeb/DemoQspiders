package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FetchDataProp2 {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\User\\Desktop\\Scripts\\eclipse-workspace_September2023_10AM\\SeleniumAutomation\\testData\\demoFile.properties");
		
		Properties prop = new Properties();
		prop.load(fis);
		
		String browser = prop.getProperty("browser");
		
		System.out.println(browser);

	}

}
