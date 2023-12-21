package popUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptPopUp {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/alert?sublist=2");
		
		driver.findElement(By.id("buttonAlert2")).click();
		
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();
		
		Thread.sleep(2000);

		driver.findElement(By.linkText("Confirm")).click();
		
		driver.findElement(By.id("buttonAlert5")).click();

		driver.switchTo().alert().dismiss();
		
		Thread.sleep(2000);

		driver.findElement(By.linkText("Prompt")).click();
		
		driver.findElement(By.id("buttonAlert1")).click();
		
		String qustion = driver.switchTo().alert().getText();
		driver.switchTo().alert().sendKeys("yes");
		driver.switchTo().alert().accept();
		
		System.out.println(qustion);
		
	}

}
