package MyClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class ActionClassDemo {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();

	driver.get("https://rahulshettyacademy.com/AutomationPractice/");

	Actions a = new Actions(driver);
			
			WebElement  b = driver.findElement(By.xpath("//button[@id='openwindow']"));
		a.contextClick(b).build().perform(); //to right click
		
		
		//double click
		
		
}
}
