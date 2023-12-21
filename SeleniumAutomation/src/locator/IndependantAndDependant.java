package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IndependantAndDependant {

	public static void main(String[] args) {
		
		String priceOfProduct = "65,999";
		String productName = "APPLE iPhone 14 Plus (Starlight, 128 GB)";
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/search?q=Iphone&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");
		
		WebElement elementRefOfIphone = driver.findElement(By.xpath("//div[text()='"+productName+"']/../..//div[text()='₹"+priceOfProduct+"']"));
	
		String priceOfIPhone = elementRefOfIphone.getText();
		
		System.out.println(priceOfIPhone);
	}

}
