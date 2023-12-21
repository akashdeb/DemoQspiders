package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyBoardSimulation {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement username = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.name("pwd"));
		
		username.sendKeys("trainee");
		Thread.sleep(2000);
		username.sendKeys(Keys.CONTROL, "a");
		Thread.sleep(2000);
		username.sendKeys(Keys.CONTROL, "c");
		Thread.sleep(2000);
		
		password.sendKeys(Keys.CONTROL, "v");
		Thread.sleep(2000);
		password.sendKeys(Keys.ENTER);



	}

}
