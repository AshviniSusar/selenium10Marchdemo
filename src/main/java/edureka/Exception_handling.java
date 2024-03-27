package edureka;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exception_handling {
public static void main(String[] args) {
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	
	
	try {
		driver.findElement(By.xpath("fake")).click();
	}
	catch(Exception e){
		System.out.println(" element not found");
		System.out.println(" hello");
			
	}
	System.out.println(" ashvini");
}
}
