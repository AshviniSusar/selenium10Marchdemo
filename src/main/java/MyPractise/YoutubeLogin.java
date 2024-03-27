package MyPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YoutubeLogin {
public static void main(String[] args) {
	
	WebDriver driver = new ChromeDriver();
		
   driver.get("https://www.youtube.com/");
	
   driver.manage().window().maximize();
   
   driver.findElement(By.xpath("//input[@id=\"search\"]")).sendKeys("vitalworld");
 driver.findElement(By.xpath(" //button[@id=\"search-icon-legacy\"]")).click();
  driver.findElement(By.xpath("//*[@id=\"subscribe-button\"]/ytd-button-renderer/a")).click();	
 
 
 //WebElement SubscribeButton =driver.findElement(By.xpath("//*[@id=\"subscribe-button\"]/ytd-button-renderer/a"));
 // WebElement SubscribeButton = driver.findElement(By.name("subscribe-button"));
  // SubscribeButton.click();
  Actions a= new Actions(driver);
  WebElement b=driver.findElement(By.xpath("//*[@id=\"subscribe-button\"]/ytd-button-renderer/a"));
a.contextClick(b).build().perform();




   String title =driver.getTitle();
  System.out.println("Title:" + title);
	
  String url = driver.getCurrentUrl();
  System.out.println("url:" + url);
	
}
}
