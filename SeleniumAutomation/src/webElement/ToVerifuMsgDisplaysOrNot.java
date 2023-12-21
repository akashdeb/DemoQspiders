package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifuMsgDisplaysOrNot {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demoapps.qspiders.com/button");
		
		driver.findElement(By.xpath("//p[text()='1. Are you satisfied with registration process?']/..//button[text()='Yes']")).click();
		
		Thread.sleep(2000);
		
		boolean yesMsg = driver.findElement(By.xpath("//span[text()='You selected \"Yes\"']")).isDisplayed();
		
		
		if(yesMsg) {
			System.out.println("Pass: the message is displaying");
		}
		
		else
			System.out.println("Fail: the message is not displaying");

	}

}
