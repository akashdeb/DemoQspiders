package pomRepo;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleHomePage {
	//1. Constructor
	public GoogleHomePage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	//2. Element Identification
	@FindBy(name = "q")
	private WebElement searchbox;

	//3. Getter methods
	public WebElement getSearchbox() {
		return searchbox;
	}
	
	//4. Business Logic
	public void searchQuerry(String querry) {
		
		searchbox.clear();
		searchbox.sendKeys(querry);
		searchbox.sendKeys(Keys.ENTER);
		
	}
	
	
	

}
