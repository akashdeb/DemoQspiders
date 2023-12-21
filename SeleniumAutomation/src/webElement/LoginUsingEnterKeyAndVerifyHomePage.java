package webElement;

import java.awt.Container;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginUsingEnterKeyAndVerifyHomePage {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		
		WebElement username = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.name("pwd"));
		
		username.sendKeys("admin");
		password.sendKeys("manager");
		
		password.sendKeys(Keys.ENTER);
		
		Thread.sleep(3000);
		
		String homePageTitle = driver.getTitle();
		
		if(homePageTitle.contains("Enter")) {
			System.out.println("Pass: the title is verified");
		}
		
		else
			System.out.println("Fail: the title is not verified");


	}

}
