package MyPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	public static void main(String args[]) {
		WebDriver driver = new ChromeDriver();

		driver.get("https://login.salesforce.com/?locale=in");
		driver.findElement(By.xpath(" //input[@class=\"input r4 wide mb16 mt8 username\"]")).sendKeys("23454");
		
		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("swecure23");

        driver.findElement(By.xpath("//input[@name='Login']")).click();
        driver.findElement(By.xpath("" ));
		driver.close();

	}

	
	}

