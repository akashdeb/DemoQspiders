package frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSwitchToFrameUsingWebElement {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///C:/Users/User/Desktop/frame.html");
		
		WebElement thirdFrame = driver.findElement(By.xpath("//iframe[@src=\"https://demoapps.qspiders.com/\"]"));
		
		driver.switchTo().frame(thirdFrame);
		
		driver.findElement(By.xpath("//a[@href=\"https://www.qspiders.com/\"]")).click();
	}

}
