package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyRadioButtonIsSelectedOrNot {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demoapps.qspiders.com/radio");
		
		WebElement radioButton = driver.findElement(By.name("Attended"));
		
		radioButton.click();
		
		
		
		boolean statusOfRadioButton = radioButton.isSelected();
		
		System.out.println(statusOfRadioButton);
		
		if(statusOfRadioButton) {
			System.out.println("Pass: the radio is selected");
		}
		
		else
			System.out.println("Fail: the radio is not selected");

		
		
		
	}

}
