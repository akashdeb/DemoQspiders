package webDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToFetchWindowHandle {
//Window IDs for different Browsers must be different
	public static void main(String[] args) {
		// Launch the first browser
		ChromeDriver driver1 = new ChromeDriver();
		// Fetch the ID of the first browser
		String windowID1 = driver1.getWindowHandle();
		// Print the ID of the first Browser
		System.out.println(windowID1);

		// Launch the second browser
		ChromeDriver driver2 = new ChromeDriver();
		// Fetch the ID of the second browser
		String windowID2 = driver2.getWindowHandle();
		// Print the ID of the second Browser
		System.out.println(windowID2);

	}

}
