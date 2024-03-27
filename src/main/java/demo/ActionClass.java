package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {
public static void main(String args[]) {
			WebDriver Driver = new ChromeDriver();
	  Driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	 Actions a=new Actions(Driver);
	 WebElement b=Driver.findElement(By.xpath("//button[@id='openwindow']"));
	 //a.contextClick(b).build().perform(); //To right click-
	  
	  
	  //double click-
	  
	  //a.doubleClick(b).build().perform();
	  
	  
	  //Mousehover on the element-
	  
	 WebElement c=Driver.findElement(By.xpath("//button[@id='mouseover']"));
	 a.moveToElement(c).build().perform();
	 Driver.findElement(By.xpath("//a[@href='#top']")).click();
}
}
