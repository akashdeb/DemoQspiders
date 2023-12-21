package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyToolTipText {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demoapps.qspiders.com/");
		
		driver.findElement(By.xpath("//li[text()='With ToolTip']")).click();
		
		Thread.sleep(2000);

		String nameTextboxToolTipText = driver.findElement(By.name("name")).getAttribute("title");
		
		System.out.println(nameTextboxToolTipText);
	}

}
