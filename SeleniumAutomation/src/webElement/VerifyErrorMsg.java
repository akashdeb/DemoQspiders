package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyErrorMsg {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");	
		
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
		Thread.sleep(3000);
		
		String errorMsg = driver.findElement(By.xpath("(//span[@class=\"errormsg\"])[1]")).getText();

		
		if(errorMsg.contains("Username or Password is invalid")) {
			System.out.println("Pass: the error msg is verified");
		}
		
		else
			System.out.println("Fail: the error msg is not verified");

	}
	

}
