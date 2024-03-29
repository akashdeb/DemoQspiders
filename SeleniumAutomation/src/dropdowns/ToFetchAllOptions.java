package dropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToFetchAllOptions {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/dropdown");
		
		
		WebElement countryDropdown = driver.findElement(By.id("select3"));
		
		Select select=new Select(countryDropdown);
		List<WebElement> allOptions = select.getOptions();
		
		int noOfOptions = allOptions.size();
		
		System.out.println("The no of options in country dropdown are : "+noOfOptions);
		
		for(WebElement option:allOptions) {
			System.out.println(option.getText());
		}
	}

}
