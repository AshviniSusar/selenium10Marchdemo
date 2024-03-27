package demo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabsHandling {


	public static void main(String args[]) {

		WebDriver Driver = new ChromeDriver();
		Driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
	System.out.println(Driver.getCurrentUrl());
	Driver.findElement(By.xpath("//button[@id='openTab']")).click();
	Set<String> obj=Driver.getWindowHandles();
	//windows id-parent and child

	//apply the iterator over the collection
	Iterator<String>it=obj.iterator();

	String parentTab = it.next(); //parent window
	String childTab = it.next(); //child window

	 Driver.switchTo().window(childTab);
	System.out.println(Driver.getCurrentUrl());

	Driver.switchTo().window(parentTab);

	}
}

