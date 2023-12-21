package webDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class toVerifyURL {

	/**
	 * 1. Launch the browser
	 * 2. Navigate to google.com
	 * 3. Verify whether the URL is Correct
	 * 
	 */
	public static void main(String[] args) {
		String expectedURL = "www.google.com";
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		String actualURL = driver.getCurrentUrl();
		
		System.out.println(actualURL);
		
		if(actualURL.contains(expectedURL)) {
			System.out.println("Pass: the URL is verified");
		}
		
		else
			System.out.println("Fail: the URL is not verified");


	}

}
