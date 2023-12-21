package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAxes {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/s?k=samsung&crid=1AB52TA3X7BB1&sprefix=samsung%2Caps%2C366&ref=nb_sb_noss_1");
		
		WebElement priceElement = driver.findElement(By.xpath("//img[@alt=\"Sponsored Ad - Samsung Galaxy M34 5G (Prism Silver,8GB,128GB)|120Hz sAMOLED Display|50MP Triple No Shake Cam|6000 mAh Batt...\"]/ancestor::div[@class=\"puisg-row\"]/descendant::span[text()='17,999']"));
		
		
		String price = priceElement.getText();
		
		System.out.println(price);
	}

}
