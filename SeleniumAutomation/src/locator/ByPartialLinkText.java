package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByPartialLinkText {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/User/Desktop/LoginPage.html");
		
		WebElement link = driver.findElement(By.partialLinkText("Go to Selenium 2024"));
		
		//When to go for partial link text??
		//1. the text is dynamic
		//2. If the text contains unbreakable spaces
		//3. If the text is too long
		
		link.click();
	}

}
