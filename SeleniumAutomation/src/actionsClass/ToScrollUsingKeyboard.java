package actionsClass;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToScrollUsingKeyboard {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.selenium.dev/");
		
		Actions action=new Actions(driver);
		action.sendKeys(Keys.TAB).perform();
		action.sendKeys(Keys.TAB).perform();		
		action.sendKeys(Keys.ENTER).perform();

		
		
		
	}

}
