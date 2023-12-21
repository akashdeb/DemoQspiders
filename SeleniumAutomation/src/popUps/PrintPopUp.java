package popUps;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintPopUp {

	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///C:/Users/User/Desktop/print.html");
		
		driver.findElement(By.tagName("button")).click();
		
		driver.switchTo().alert().accept();
		
		Thread.sleep(2000);
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		Runtime.getRuntime().exec("C:\\Users\\User\\Desktop\\Scripts\\eclipse-workspace_September2023_10AM\\SeleniumAutomation\\print.exe");

	}

}
