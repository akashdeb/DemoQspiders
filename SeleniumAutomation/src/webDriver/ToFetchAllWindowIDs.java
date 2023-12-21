package webDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToFetchAllWindowIDs {

	public static void main(String[] args) {
		// Launch the browser
		ChromeDriver driver = new ChromeDriver();

		// Navigate to the URL
		driver.get("https://demo.actitime.com/login.do");

		// Click on the link
		driver.findElement(By.linkText("actiTIME Inc.")).click();

		String parentId = driver.getWindowHandle();

		System.out.println(parentId);

		Set<String> allIDs = driver.getWindowHandles();

		System.out.println(allIDs);
		
		

	}

}
