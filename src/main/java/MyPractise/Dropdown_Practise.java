package MyPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Practise {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver =new ChromeDriver();
	driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		driver.findElement(By.xpath("//select[@id=\"course\"]")).click();
		 driver.findElement(By.xpath("//option[@value=\"java\"]")).click();
		 Thread.sleep(3000);
	 driver.findElement(By.xpath("//option[@value=\"python\"]"));
	

	}
}



