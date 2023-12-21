package webDriver;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class toGetThePosition {

	public static void main(String[] args) {
		// Launch the browser
		ChromeDriver driver = new ChromeDriver();
		
		Point pos = driver.manage().window().getPosition();
		
		System.out.println(pos);
		
		int xCoordinate = pos.getX(); 
		int yCoordinate = pos.getY();
		
		System.out.println("The X coordinate is : "+xCoordinate);
		System.out.println("The Y coordinate is : "+yCoordinate);

	}

}
