package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToClear {
	
	public static void loginAction(WebDriver driver, String username, String password) {
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys(username);
		
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.xpath("//button[text()='Login']")).click();

	}
	
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/login");
		
		ToClear.loginAction(driver, "akash@gmail.com", "qwerty");
		Thread.sleep(2000);
		ToClear.loginAction(driver, "vikas@gmail.com", "asdfgh");

	}

}
