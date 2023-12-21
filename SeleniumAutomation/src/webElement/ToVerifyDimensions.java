package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyDimensions {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demoapps.qspiders.com/");
		
		Dimension nameDimension = driver.findElement(By.name("name")).getSize();
		Dimension emailDimension = driver.findElement(By.name("email")).getSize();
		Dimension passwordDimension = driver.findElement(By.name("password")).getSize();
		
		int nameHeight = nameDimension.getHeight();
		int nameWidth = nameDimension.getWidth();
		
		int emailHeight = emailDimension.getHeight();
		int emailWidth = emailDimension.getWidth();

		int passwordHeight = passwordDimension.getHeight();
		int passwordWidth = passwordDimension.getWidth();
		
		if(nameHeight == emailHeight && emailHeight == passwordHeight && nameWidth == emailWidth && emailWidth == passwordWidth) {
			System.out.println("Pass: the dimension is verified");
		}
		
		else
			System.out.println("Fail: the dimension is not verified");




		
	}

}
