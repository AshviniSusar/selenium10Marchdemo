package MyPractise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumComponent {

	public static void main(String args[]) {
		WebDriver driver =new ChromeDriver();
	driver.get("https://naveenautomationlabs.com/");	
		
  // driver.switchTo().alert().accept();
  // driver.switchTo().alert().dismiss();
   driver.switchTo().alert().sendKeys(" hello");
	}
}
