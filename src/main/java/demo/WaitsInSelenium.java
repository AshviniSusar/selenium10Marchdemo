package demo;
import org.openqa.selenium.support.ui.FluentWait;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class WaitsInSelenium {
public static void main(String[] args) {
	
	WebDriver Driver = new ChromeDriver();
	
	Driver.manage().window().maximize();
	
	  Driver.get("https://rahulshettyacademy.com/AutomationPractice/");

	 
	 
	 //implicit wait --globally declare 
	 Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 
	 Driver.findElement(By.xpath("//input[@id='ct100_mainContent_dd1_originStation1_CTXT']"));
	 
	 Driver.findElement(By.xpath("//a[@value='BOM']")).click();
	 
	 
	 //explicit  wait
	 
	 WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(3));
	 
	 wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//a[@value='DEL'])[2])")));
	 
	 Driver.findElement(By.xpath("//a[value='DEL'])[2]")).click();
	 
	 Driver.findElement(By.xpath("(//a[@value='DEL'])[2]")).click();
	 
	 // 0 5 10 15 20 25 30
	 
	 //fluent wait
	 
	 FluentWait<WebDriver>wait2 = new FluentWait<WebDriver>(Driver);
	 
	 wait2.withTimeout(Duration.ofSeconds(30));
	 //specify the timeout of the wait
	 
	 wait2.pollingEvery(Duration.ofSeconds(5));
	 //specify the polling time
	 
	// This is how we specify the condition to wait on. 
	    wait2.until(ExpectedConditions.alertIsPresent());
	  
}
}
