package MyClass;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleTabsExample {
	
	public static void main(String args[]) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://naukri.com");
		
	
		<String> obj = driver.getWindowHandle();
	Iterator<String>it = obj.iterator();
	
	
	String parent=it.next();
	String childTab1 = it.next();
	
	driver.switchTo().window(childTab1);
	
	System.out.println(driver.getCurrentUrl());
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@class='title ellipsis'])[1]")).click();
	
	Set<String>obj1;
	
	
	
}
}
