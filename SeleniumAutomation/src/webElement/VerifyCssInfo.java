package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyCssInfo {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/button");
		
		 WebElement yesButton = driver.findElement(By.xpath("//button"));
				
		 String yesButtonColorBeforeClick = yesButton.getCssValue("background-color");
	
		System.out.println(yesButtonColorBeforeClick);
		
		yesButton.click();
		
		String yesButtonColorAfterClick = yesButton.getCssValue("background-color");
		
		System.out.println(yesButtonColorAfterClick);
		
		if(!yesButtonColorBeforeClick.equals(yesButtonColorAfterClick)) {
			System.out.println("Pass: the button was clicked");
		}
		
		else
			System.out.println("Fail: the button was not clicked");

	}

}
