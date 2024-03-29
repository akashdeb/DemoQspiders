package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToDragAndDrop {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/dragDrop");
		
		WebElement source = driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
		WebElement target = driver.findElement(By.xpath("(//div[@class=\"drop-column min-h-[200px] bg-slate-100\"])[1]"));
	
		
		Actions action=new Actions(driver);
		action.dragAndDrop(source, target).perform();
		
	}
	
	

}
