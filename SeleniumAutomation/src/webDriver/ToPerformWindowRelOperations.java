package webDriver;

import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPerformWindowRelOperations {

	public static void main(String[] args) {
		// Launch the browser
		ChromeDriver driver = new ChromeDriver();
		
		Options opn = driver.manage();
		
		Window win = opn.window();
		
		win.maximize();
		
		win.minimize();
		
		win.fullscreen();

	}

}
