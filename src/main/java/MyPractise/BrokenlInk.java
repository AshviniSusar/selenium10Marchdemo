package MyPractise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenlInk {
public static void main(String[] args) {
		
	WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		List<WebElement>links =driver.findElements(By.tagName("a"));
		//System.out.println(links.size());
		//System.out.println(links);
		
		// using for each loop
		for(WebElement p:links) {
		System.out.println(p.getText());
		
		}
		
		//using for loop
		for(int i=1;i<links.size();i++) {
			links.get(0).getText();
		}
}
}