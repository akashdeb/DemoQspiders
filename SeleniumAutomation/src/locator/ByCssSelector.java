package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByCssSelector {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.co.in/");
		
		
		WebElement languages = driver.findElement(By.cssSelector("div[id='SIvCob2']"));
		
		String googleLanguage = languages.getText(); 
		
		System.out.println(googleLanguage);
	}

}
