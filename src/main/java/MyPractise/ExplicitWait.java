package MyPractise;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
public static void main(String args[]) throws InterruptedException {
	
WebDriver driver = new ChromeDriver();
	

	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	driver.get("https://www.facebook.com/");
    WebElement firstname =driver.findElement(By.name("firstname"));
    WebElement lastname=driver.findElement(By.name("lastname"));
    
    sendKeys(driver,firstname,10,"ashvini");
    sendKeys(driver,lastname,20,"youtube");
}



     public static void sendKeys(WebDriver driver1, WebElement element,Duration timeout, String value) {
    	 new WebDriverWait(driver1, timeout).until(ExpectedConditions,visibilityof(element));
     	element.sendKeys(value);
	}
    
    


}
