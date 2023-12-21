package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyEnabledOrNot {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demoapps.qspiders.com/");
		
		driver.findElement(By.name("name")).sendKeys("Akash");
		
		driver.findElement(By.name("email")).sendKeys("akashdeb@gmail.com");
		
		driver.findElement(By.name("password")).sendKeys("qwerty");
		
		boolean registerButtonStatus = driver.findElement(By.xpath("//button[text()='Register']")).isEnabled();
		
		if(registerButtonStatus) {
			System.out.println("Pass: the the button is enabled");
		}
		else
			System.out.println("Fail: the the button is not enabled");

	}

}
