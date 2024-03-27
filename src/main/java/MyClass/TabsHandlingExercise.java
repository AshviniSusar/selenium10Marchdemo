package MyClass;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabsHandlingExercise {
public static void main(String args[]) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.naukri.com/"); 
	
	System.out.println("driver.getCurrentUrl()");
	driver.findElement(By.xpath("//div[@class='acceptance-btn']")).click();
	
	driver.findElement(By.xpath("//span[@class='title=\"MNC\"]")).click();
	
	Thread.sleep(5000);
	
	Set<String>obj=driver.getWindowHandles();
	
	Iterator<String>it=obj.iterator();
	
	String parent = it.next();
	String childTab1 = it.next();
	
	driver.switchTo().window(childTab1);
	
	System.out.println(driver.getCurrentUrl());
	 
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@class='title ellips'])[1]")).click();
	
	Set<String>obj1=driver.getWindowHandles();
	Iterator<String>it1=obj1.iterator();
	
	String ParentTab=it1.next();
	String childTab=it1.next();
	String ChildTab=it1.next();
	
	Object childTab2;
	
	driver.switchTo().window(childTab2);
	System.out.println(driver.getCurrentUrl());
	
	driver.switchTo().window(ParentTab);
	System.out.println(driver.getCurrentUrl());
	
	
}
}
