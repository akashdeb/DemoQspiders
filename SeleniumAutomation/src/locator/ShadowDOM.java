package locator;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDOM {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.htmlelements.com/demos/menu/shadow-dom/index.htm");
		
		driver.findElement(By.cssSelector("smart-ui-menu[class='smart-ui-component']")).getShadowRoot().findElement(By.xpath("//span[contains(text(), 'File')]")).click();
		

	}

}
