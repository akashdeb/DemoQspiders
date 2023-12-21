package webDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToFetchTheDimension {

	public static void main(String[] args) {
		// Launch the browser
		ChromeDriver driver = new ChromeDriver();
		
		Dimension dim = driver.manage().window().getSize();
		//Dimension Class: 1. getWidth(), 2. getHeight()
		System.out.println(dim);
		
		int width = dim.getWidth();
		int height = dim.getHeight();
		
		System.out.println("The Width of the default browser is : "+width);
		System.out.println("The Height of the default browser is : "+height);
	}

}
