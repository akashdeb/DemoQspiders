package webTable;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTable {

	public static void main(String[] args) {
		
		String productName = "SAMSUNG Galaxy";
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demoapps.qspiders.com/table/dynamic-table");
				
		String discount = driver.findElement(By.xpath("//th[text()='"+productName+"']/parent::tr/descendant::td[3]")).getText();
		
		
		System.out.println(discount);
	}

}
