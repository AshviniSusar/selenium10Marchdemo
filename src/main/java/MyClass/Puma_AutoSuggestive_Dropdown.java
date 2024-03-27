package MyClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Puma_AutoSuggestive_Dropdown {
public static void main(String[] args) throws InterruptedException {

	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://in.puma.com/in/en");
	
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("(//button[@data-test-id='Search-button-nav']")).click();
	
	Thread.sleep(3000);
	
	
}
}
