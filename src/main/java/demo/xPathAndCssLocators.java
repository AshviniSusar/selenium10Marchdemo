package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xPathAndCssLocators {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");

		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("test");

		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123");

		driver.findElement(By.xpath("//input[@name='Login']")).click();

	driver.findElement(By.xpath("//span[contains(text(),'Account & Lists')]")).click();

	}
}