package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifySpace {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demoapps.qspiders.com/");

		Rectangle nameRect = driver.findElement(By.name("name")).getRect();
		Rectangle emailRect = driver.findElement(By.name("email")).getRect();
		Rectangle passwordRect = driver.findElement(By.name("password")).getRect();
		
		int nameStartY = nameRect.getY();
		int nameHeight = nameRect.getHeight();
		
		int nameEndY = nameStartY + nameHeight; 
		
		int emailStartY = emailRect.getY();
		
		int spaceBetweenNameAndEmail = emailStartY - nameEndY;
		
		System.out.println("The space between name and email is : "+spaceBetweenNameAndEmail);
		
		int emailHeight = emailRect.getHeight();
		
		int emailEndY = emailStartY + emailHeight;
		
		int passwordStartY = passwordRect.getY();
		
		int spaceBetweenEmailAndPassword = passwordStartY - emailEndY;
		
		System.out.println("The space between email and password is : "+spaceBetweenEmailAndPassword);

		if(spaceBetweenNameAndEmail == spaceBetweenEmailAndPassword) {
			System.out.println("Pass: the space is verified");
		}
		
		else
			System.out.println("Fail: the space is not verified");


	}

}
