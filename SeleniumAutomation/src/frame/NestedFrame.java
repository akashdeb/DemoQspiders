package frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class NestedFrame {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/frames/nested?sublist=1");
		
		WebElement outerFrame = driver.findElement(By.xpath("//iframe[@title=\"Parent iframe\"]"));
		
		driver.switchTo().frame(outerFrame);
		driver.switchTo().frame(0);
		
		driver.findElement(By.id("username")).sendKeys("admin");
		
		driver.switchTo().defaultContent();
		
		String text = driver.findElement(By.tagName("span")).getText();
		
		System.out.println(text);
	}

}
