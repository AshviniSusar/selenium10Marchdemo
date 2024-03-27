package edureka;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class toolsQA {
public static void main(String args[]) throws InterruptedException {
	
	WebDriver driver = new ChromeDriver();
	 driver.get("http://toolsqa.com/automation-practice-switch-windows/");
	WebElement clickElement = driver.findElement(By.id("button1"));
	
	for(int i=0;i<3;i++) {
		clickElement.click();
		Thread.sleep(2000);
		
		
	}
	
}
}
// may this link not work
