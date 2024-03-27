package MyClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderHandling {
	public static void main(String args[]) {
	WebDriver driver = new ChromeDriver ();
      driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
     driver.findElement(By.xpath("//input[@id=\"ctl00_mainContent_view_date1\"]")).click();
     List<WebElement>obj= driver.findElements(By.xpath("//td[@data-month='7']"));
    System.out.println( obj.size());
}
}