package autoSuggestions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToClickOnAnySuggestion {

	public static void main(String[] args) {
		
		String suggestionToClick = "hadh kar di aapne song";
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.com/");
		
		
		driver.findElement(By.name("q")).sendKeys("hadh kar di apne");
		
		List<WebElement> allSuggestions = driver.findElements(By.xpath("//div[contains(@aria-label, 'hadh kar di aapne')]"));

		for(WebElement sugg:allSuggestions) {
			
			if(sugg.getText().contains(suggestionToClick)) {
				
				sugg.click();
				break;
			}
			
			
		}
		
		driver.findElement(By.xpath("//span[@class=\"hDVnsf z1asCe\"]")).click();

		

	}

}
