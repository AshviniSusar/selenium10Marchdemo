package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLInks {

	public static void main (String []args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		List<WebElement>  links= driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		for ( WebElement p:links) {
			System.out.println(p.getText());
		}
		
		
		
	}
}
