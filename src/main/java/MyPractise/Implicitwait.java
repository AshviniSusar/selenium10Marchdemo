package MyPractise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicitwait {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver = new ChromeDriver();
	

	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	driver.get("https://login.yahoo.com");
	driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("ashvinisusar@gmail.com");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@id='login-signin']")).click();
	
	
	
}
}
