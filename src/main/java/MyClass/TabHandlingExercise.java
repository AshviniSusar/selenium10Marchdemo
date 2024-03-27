package MyClass;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabHandlingExercise {
	public static void main(String[] args) {
		  
		WebDriver driver = new ChromeDriver();
		  driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		  
		  
		  System.out.println(driver.getCurrentUrl());  //https://rahulshettyacademy.com/AutomationPractice/
		  
		  
		  driver.findElement(By.xpath("//a[@id='opentab']")).click();
		  
		    Set<String> obj=driver.getWindowHandles();
		          //windows id- parent and child
		          
		  
		  // Apply the iterator over the collection
		 iterator<String> it= obj.iterator();
		  
		  String parentTab=  it.next(); //parent window
		   String childTab= it.next();  //child window
		  
		   
		   driver.switchTo().window(childTab);
		   System.out.println(driver.getCurrentUrl());
		  
		   driver.switchTo().window(parentTab);
		  
	}	  
}
