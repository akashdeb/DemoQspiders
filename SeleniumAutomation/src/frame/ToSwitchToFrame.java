package frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSwitchToFrame {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///C:/Users/User/Desktop/frame.html");
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//span[text()='Downloads']")).click();
		
		Options man = driver.manage();
		
	}

}
