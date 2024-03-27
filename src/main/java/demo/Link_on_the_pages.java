package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link_on_the_pages {
	
public static void main(String[] args) {
	
	WebDriver driver = new ChromeDriver();

	driver.get("https://login.salesforce.com/?locale=in");
	
	List<WebElement>a=driver.findElements(By.tagName("a"));
	
	System.out.println(a.size());
	
	//now print the link text-
	
	for(WebElement k:a) {
		
		System.out.println(k.getText());
		System.out.println(k.getAttribute("href"));
	}
}
}
