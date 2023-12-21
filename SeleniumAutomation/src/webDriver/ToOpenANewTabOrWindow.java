package webDriver;

import java.util.Set;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToOpenANewTabOrWindow {

	public static void main(String[] args) {
		// Launch the browser
		ChromeDriver driver = new ChromeDriver();

		// Navigate to the URL
		driver.get("https://www.google.co.in/");
		
		//This will open a new Tab
		//driver.switchTo().newWindow(WindowType.TAB);

		//This will open a new Window
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		driver.navigate().to("https://www.facebook.com/");
		
		Set<String> allIDs = driver.getWindowHandles();
		
		System.out.println(allIDs);
	}

}
