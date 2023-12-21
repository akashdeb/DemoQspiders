package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByIDandClass {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/User/Desktop/LoginPage.html");
		
		WebElement username = driver.findElement(By.id("abc"));
		
		//System.out.println(username);
		
		username.sendKeys("Kuch value pass karta hoon");
		
		WebElement password = driver.findElement(By.className("password"));
		
		password.sendKeys("password pass kar sakta hoon");
		
	}

}
