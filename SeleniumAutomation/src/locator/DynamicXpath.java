package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpath {

	public static void main(String[] args) {
		String nameOfPlayer = "Rahmanullah Gurbaz";
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.icc-cricket.com/rankings/mens/player-rankings/t20i/batting");
		
		String rankingOfAnyPlayer = driver.findElement(By.xpath("//a[text()='"+nameOfPlayer+"']/../..//td[4]")).getText();
		
		
		System.out.println(rankingOfAnyPlayer);
	}

}
