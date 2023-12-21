package webDriver;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToModifyTheDimension {

	public static void main(String[] args) throws InterruptedException {

		// Launch the browser
		ChromeDriver driver = new ChromeDriver();
		
		Thread.sleep(2000);
		
		Dimension dim = new Dimension(500, 200);
		driver.manage().window().setSize(dim);

	}

}
