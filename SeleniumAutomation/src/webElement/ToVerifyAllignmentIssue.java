package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyAllignmentIssue {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demoapps.qspiders.com/");
		
		 Point namePosition = driver.findElement(By.xpath("//span[text()='How to Click On Link Text ?']")).getLocation();
		 Point emailPosition = driver.findElement(By.name("email")).getLocation();
		 Point passwordPosition = driver.findElement(By.name("password")).getLocation();
		 
		 int nameStartX = namePosition.getX();
		 int emailStartX = emailPosition.getX();
		 int passwordStartX = passwordPosition.getX();
		 
		 if(nameStartX == emailStartX && emailStartX == passwordStartX) {
			 System.out.println("Pass: the textboxes are alligned");
		 }
		 
		 else
			 System.out.println("Fail: the textboxes are not alligned");


	}

}
