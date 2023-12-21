package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifySelectedOrNot {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demoapps.qspiders.com/button");
		
		WebElement question1Ref = driver.findElement(By.xpath("//p[text()='1. Are you satisfied with registration process?']/..//button[text()='Yes']"));
	
		question1Ref.click();
		
		Thread.sleep(3000);
		
		boolean question1SelecttionStatus = question1Ref.isSelected();
		
		if(question1SelecttionStatus) {
			System.out.println("In Question 1 YES is selected");
		}
		
		else
			System.out.println("In Question 1 YES is not selected");

	}

}
