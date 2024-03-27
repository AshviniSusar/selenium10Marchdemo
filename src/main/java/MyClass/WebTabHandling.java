package MyClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTabHandling {
	WebDriver driver = new ChromeDriver();
	 Driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	
	List<WebElement> amount = driver.findElements(By.xpath("//table[@id='product'])[2]//[4]"));
	System.out.print(amount.size());

}
