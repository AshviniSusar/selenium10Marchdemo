package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		/*
		 * driver.findElement(By.xpath("//input[@id='confirmbtn']")).click();
		 * 
		 * driver.switchTo().alert().dismiss();
		 * 
		 * driver.findElement(By.xpath("//input[@id='confirmbtn']")).click();
		 * 
		 * driver.switchTo().alert().accept(); //accept the alert
		 * 
		 * Thread.sleep(3000);
		 * 
		 * driver.findElement(By.xpath("//input[@id='confirmbtn']")).click();
		 * 
		 * driver.switchTo().alert().dismiss(); //dismiss the alert
		 * 
		 */
		// if you want to print alert text-
		driver.findElement(By.xpath("//input[@id='alertbtn']")).click();

		String alertText = driver.switchTo().alert().getText();
		System.out.println(alertText);

		// if you want type something on alert box
		// driver.switchTo().alert().sendKeys("hiiii");

	}
}
