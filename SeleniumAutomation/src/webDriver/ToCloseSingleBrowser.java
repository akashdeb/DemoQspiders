package webDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToCloseSingleBrowser {

	public static void main(String[] args) {
		// Test Data
		String expectedTitle = "Facebook";

		// Launch the browser
		ChromeDriver driver = new ChromeDriver();

		// Navigate to the URL
		driver.get("https://www.facebook.com/");

		// Fetch the title of the WebPage
		String actualTitle = driver.getTitle();

		// Verifying whether the title is correct or not
		if (actualTitle.contains(expectedTitle)) {
			System.out.println("Pass: the title is verified");
		}

		else
			System.out.println("Fail: the title is not verified");
		
		//Close the browser
		
		driver.quit();

	}

}
