package webDriver;

import java.util.Set;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToTargetAParticularWindow {

	public static void main(String[] args) throws InterruptedException {
		
		String windowToSwitch = "Instagram";
		
		// Launch the browser
		ChromeDriver driver = new ChromeDriver();
		// Maximizing
		driver.manage().window().maximize();
		// Navigate to the URL
		driver.get("https://www.google.co.in/");
		// Opening a new Tab and switching the control
		driver.switchTo().newWindow(WindowType.WINDOW);
		// Navigating to facebook
		driver.navigate().to("https://www.facebook.com/");
		driver.switchTo().newWindow(WindowType.WINDOW);
		// Opening a new Tab and switching the control
		driver.navigate().to("https://www.instagram.com/");
		driver.switchTo().newWindow(WindowType.WINDOW);
		// Opening a new Tab and switching the control
		driver.navigate().to("https://www.selenium.dev/");
		
		Set<String> allWindow = driver.getWindowHandles();
		
		System.out.println(allWindow);
		
		for(String id:allWindow) {
			Thread.sleep(1000);
			driver.switchTo().window(id);
			String currentWindowTitle = driver.getTitle();
			
			if(currentWindowTitle.contains(windowToSwitch)) {
				
				System.out.println(driver.getTitle());
				break;
			}
			
		}
		
	}

}
