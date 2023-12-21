package webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCloseAllBrowsers {

	public static void main(String[] args) throws InterruptedException {
		// Launch the browser
		ChromeDriver driver = new ChromeDriver();

		// Navigate to the URL
		driver.get("https://demo.actitime.com/login.do");
		
		//Click on the link
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		
		Thread.sleep(3000);
		
		//Closing the parent browser
		driver.quit();

}
}