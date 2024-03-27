package demo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {
public static void main(String args[]) {
	WebDriver Driver = new ChromeDriver();
	Driver.get("https://rahulshetty.com/AutomationPractice/");
	
System.out.println(Driver.getCurrentUrl());
Driver.findElement(By.xpath("//button[@id='openwindow']")).click();
Set<String> obj=Driver.getWindowHandles();
//windows id-parent and child

//apply the iterator over the collection
Iterator<String>it=obj.iterator();

String parentWindow = it.next(); //parent window
String childWindow = it.next(); //child window

 Driver.switchTo().window(childWindow);
System.out.println(Driver.getCurrentUrl());

Driver.switchTo().window(parentWindow);

}
}
