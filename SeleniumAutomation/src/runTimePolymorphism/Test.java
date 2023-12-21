package runTimePolymorphism;

import org.openqa.selenium.WebDriver;

public class Test {

	public static void verifyGoogleTitle(WebDriver driver) {

		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");

		String title = driver.getTitle();

		if (title.contains("Google")) {
			System.out.println("Pass: the title is verified");
		}

		else
			System.out.println("Fail: the title is not verified");

		driver.quit();

	}

	public static void verifyGoogleURL(WebDriver driver) {
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");

		String url = driver.getCurrentUrl();

		if (url.contains("google")) {
			System.out.println("Pass: the URL is verified");
		}

		else
			System.out.println("Fail: the URL is not verified");

		driver.quit();

	}

	public static void verifyGooglePageContent(WebDriver driver, String content) {
		
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");

		String sourceCode = driver.getPageSource();

		if (sourceCode.contains(content)) {
			System.out.println("Pass: the Content is verified");
		}

		else
			System.out.println("Fail: the Content is not verified");

		driver.quit();

	}

}
