package webDriver;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSwitchToAParticularWindow {

	public static void main(String[] args) {
		// Launch the browser
		ChromeDriver driver = new ChromeDriver();

		// Maximizing
		driver.manage().window().maximize();

		// Navigate to the URL
		driver.get("https://www.google.co.in/");

		// Fetching the ID of Google
		String googleWindowID = driver.getWindowHandle();

		// Opening a new Tab and switching the control
		driver.switchTo().newWindow(WindowType.TAB);

		// Navigating to facebook
		driver.navigate().to("https://www.facebook.com/");

		driver.switchTo().newWindow(WindowType.TAB);

		// Opening a new Tab and switching the control
		driver.navigate().to("https://www.instagram.com/");

		// fetching the title of the current window i.e. Instagram
		String currentWindowTitle = driver.getTitle();

		// Printing the title of the Current window
		System.out.println("The Title of the current window is : " + currentWindowTitle);

		// Switching the control back to Google
		driver.switchTo().window(googleWindowID);

		driver.quit();

		// Fetching the title of Google
		String googleWindowTitle = driver.getTitle();

		// Printint the title of Google
		System.out.println("The title is the Google Window is : " + googleWindowTitle);

	}

}
