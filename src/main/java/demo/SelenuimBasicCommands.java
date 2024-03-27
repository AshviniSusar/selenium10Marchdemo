package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelenuimBasicCommands {

	public static void main(String[] args) throws InterruptedException {
		/// webdriver is interface
		// chrome driver is class

		// to launch the browser
		WebDriver driver = new ChromeDriver(); // 123

		// to open the url on browser
		driver.get("https://www.amazon.in/"); // 123

		// This will maximize the window
		driver.manage().window().maximize(); // 123

		// This will give you the currently url opened in browser
		System.out.println(driver.getCurrentUrl()); // 123

		// This will give you the page title
		System.out.println(driver.getTitle()); // 123

		// This will navigate back
		driver.navigate().back(); // 123

		Thread.sleep(3000);

		// This will navigate forward
		driver.navigate().forward(); // 123

		// This will refreshg the page
		driver.navigate().refresh(); // 123

		// diffrence between driver.quit and driver.close

		// close -- will close only current window
		// quit --- will close all open windows
		// driver.close(); //123

		// WebDriver driver1=new ChromeDriver(); //456

		// driver1.get("https://www.google.com/"); //Session will active but invalid
		// session id --123

		driver.quit(); // 123

		// WebDriver driver1 = new ChromeDriver();

		// driver1.get("https://www.google.com/");
		// driver.get("https://www.amazon.in/"); //session will end and Session ID is
		// null

		// Difference between navigate and get() -- i will tell you later-

	}

}
