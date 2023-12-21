package webDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToNavigateTotheURL {
/**
 * WebDriver: It is an Interface which has 11+ abstract methods to handle the Web Browser.
 * WebDriver interface is used to either perform action on the Web Browser or to retrieve 
 * some information from the Web Browser
 * 
 * The Different methods of WebDriver are:
 * 1. get(String url): 1. This method is used to navigate to the main URL
 *           2. To the get method u have to always pass the fully qualified URL
 *           3. get() will always wait for the page to get loaded
 *           4. The return type of get() is void
 *           5. It takes String type of argument
 *           
 *    Main URL: the URL accessed by the get method is called as main URL
 *    
 *    Sub URL : the URL accessed by after the main URL is called as sub URL
 *           
 *    Fully Qualified URL : The URL along with the protocol is known as Fully Qualified URL
 *                          Protocol means HTTP or HTTPS 
 *           
 *    InvalidArgumentException: It is an unchecked exception of selenium which occurs 
 *    when the protocol is not present in the URL passed in the get method
 *  
 *  2. getCurrentURL(): 1. This method is used to fetch the URL of the current WebPage
 *                      2. This method returns String value
 *                      3. This method doesn't take any argument
 *     
 *     Current WebPage: The Webpage in which the drivers control is present
 *                      
 * 3. getTitle(): 1. This method is used to fetch the title of the current Webpage
 *                2. It returns String value
 *                3. It takes no argument
 *
 * 4. getPageSource: 1. This method is used to fetch the source code of the WebPage
 *                      We can fetch 3 types of source code :
 *                      1. HTML : It will provide the structural information of the webpage
 *                      2. CSS : It will provide the styling information to the WebPage
 *                      3. Java Script : It will provide client side verificstion to the WebPage
 *                   2. It returns String value
 *                   3. It does not take any argument
 *                   
 * 5. Close(): 1. This method will close the current/Parent Browser
 *             2. This method returns void
 *             3. It takes no argument
 *   
 *  Difference between close and quit method
 *  
 *  NoSuchWindowException: This is an unchecked exception of Selenium which will be thrown when we try
 *  to perform some actions after we had used close method
 * 
 * 6. quit(): 1. This method will close  all the Windows
 *             2. This method returns void
 *             3. It takes no argument
 * 
 * NoSuchSessionException : This is an unchecked exception of Selenium which will be thrown when we try
 *  to perform some actions after we had used quit method
 * 
 * 7. navigate(): 1. This method is used to perform browser history navigation and is used to navigate 
 * to the subURL and also refresh the webpage
 * 
 * for eg : back, forward, refresh, nav to the subURL 
 * 
 *                2. This method returns Navigation interface
 *                3. This method doesnt take any argument
 *                
 *8. manage(): 1. THis method is used to perform 3 things:
 *              a. window rel operations such as maximize, minimize, fullscreen, Dimension etc
 *              b. Timeout rel Operations
 *              3. Cookie Rel operation
 *              
 *              
 * 			2. This method returns Options interface
 *          3. It takes no argument
 *          
 * 9. getWindowHandle(): 1. This method is used to fetch the window ID of the current WebPage
 *                       2. This method returns String value
 *                       3. This method doesnt take any argument
 *                       
 * 10. getWindowHandles(): 1. This method is used to fetch all the window IDs of the selenium session
 *                       2. This method returns Set<String>
 *                       3. This method doesnt take any argument
 * 11. switchTo(): 1. This method used to switch the driver control to 
 *                     a. either a window or TAB
 *                     b. either an ALert
 *                     c. either a frame
 *                     d either any active Element
 *                 2. This method will return Target Locator interface
 *                 3. This method takes no argument
 * 
 */
	public static void main(String[] args) {
		//1. Launching an Empty Chrome Browser
		ChromeDriver driver = new ChromeDriver();
		
		// 2. Navigating to the main URL
		driver.get("https://www.selenium.dev/");
		
		System.out.println(driver);
		
		

	}

}

