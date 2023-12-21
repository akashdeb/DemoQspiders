package webDriver;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSetThePosition {

	public static void main(String[] args) throws InterruptedException {
		// Launch the browser
		ChromeDriver driver = new ChromeDriver();
		
		Thread.sleep(2000);
		
		Point pos = new Point(100, 200);
		driver.manage().window().setPosition(pos);
	}

}
