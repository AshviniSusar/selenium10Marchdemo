package demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {
	 public static void main(String[] args) throws InterruptedException {

		  WebDriver driver = new ChromeDriver();

		  driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		  WebElement a = driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']"));
		  Select s = new Select(a);
		  s.selectByIndex(2);
		  s.selectByValue("INR");
		  s.selectByVisibleText("Select");

		  driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		  
		  Thread.sleep(2000);

		  // 0 1 2 3
		  for (int i = 0; i < 4; i++) {
		   driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();

		  }

		 }

		}

