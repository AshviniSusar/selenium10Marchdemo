package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StateElementReferenceException {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://login.salesforce.com/");

		WebElement a = driver.findElement(By.id("username"));
		a.sendKeys("test1");

		WebElement b = driver.findElement(By.name("pw"));

		b.sendKeys("test123");

		driver.navigate().refresh();
		Thread.sleep(3000);

		// a.sendkesys("test1");
		// driver.findElement(By.id("username")).sendKeys("test1");

		try {
			a.sendKeys("test1");
		} catch (Exception e) {
			driver.findElement(By.id("username")).sendKeys("test1");

		}
	}
}
