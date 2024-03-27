package MyClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Commands {
	public static void main(String[] args) {

		// to launch the browser
		WebDriver driver = new ChromeDriver();

		// to open the url on browser
		driver.get("https://www.amazon.in//");

		// this will give you the current url opened in the browser
		System.out.println(driver.getCurrentUrl());

         //this will give you page title
		System.out.println(driver.getTitle());

		// wait for some time
		// Thread.sleep(3000);

		// this will navigate back
		 driver.navigate().back();

		// this will navigate forward
		 driver.navigate().forward();

		// this will maximize the window
		 driver.manage().window().maximize();

		// this will refresh the page
		 driver.navigate().refresh();

	}
}
