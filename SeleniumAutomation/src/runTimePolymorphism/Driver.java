package runTimePolymorphism;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {

	public static void main(String[] args) {
		
		Test.verifyGoogleTitle(new ChromeDriver());
		System.out.println("The Google title has been verified on Chrome");
		
		Test.verifyGoogleTitle(new FirefoxDriver());
		System.out.println("The Google title has been verified on Firefox");
		
		Test.verifyGoogleTitle(new EdgeDriver());
		System.out.println("The Google title has been verified on Edge");
		
		
		Test.verifyGoogleURL(new ChromeDriver());
		System.out.println("The Google URL has been verified on Chrome");
		
		Test.verifyGoogleURL(new FirefoxDriver());
		System.out.println("The Google URL has been verified on Firefox");
		
		Test.verifyGoogleURL(new EdgeDriver());
		System.out.println("The Google URL has been verified on Edge");
		
		
		Test.verifyGooglePageContent(new ChromeDriver(), "India");
		System.out.println("The Google Content has been verified on Chrome");
		
		Test.verifyGooglePageContent(new FirefoxDriver(), "India");
		System.out.println("The Google Content has been verified on Firefox");
		
		Test.verifyGooglePageContent(new EdgeDriver(), "India");
		System.out.println("The Google Content has been verified on Edge");
		
		
		
		

	}

}
