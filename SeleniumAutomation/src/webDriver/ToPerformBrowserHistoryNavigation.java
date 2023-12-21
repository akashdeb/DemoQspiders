package webDriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;
//WAS To navigate to Google then facebook then Instagram and then back to facebook and then 
//forward to Instagram and then refresh
public class ToPerformBrowserHistoryNavigation {

	public static void main(String[] args) throws MalformedURLException {
		// Launch the browser
		ChromeDriver driver = new ChromeDriver();

		// Navigate to the URL
		driver.get("https://www.google.com/");
		
		Navigation nav = driver.navigate();
		
		URL url = new URL("https://www.facebook.com/");
		nav.to(url);
		
		nav.to("https://www.instagram.com/");
		
		nav.back();
		
		nav.forward();
		
		nav.refresh();
	}

}
