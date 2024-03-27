package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderHandling {
public static void main(String[] args) {
	
	WebDriver Driver = new ChromeDriver();
	
	//Driver.get("https://rahulshettyacademy.com/AutomationPractice/");
    Driver.get("https://rahulshettyacademy.com/dropdownPractise/#");
	//Driver.get("https://rahulshettyacademy.com/");  ----this was add by me
	
	Driver.findElement(By.xpath("//input[@id='ct100_mainContent_view_date1']")).click();
	
	//to select future month
	//month
	String t =" ";
	while(!t.equals("September 2023")) {
		Driver.findElement(By.xpath("//a[@data-handler='next']")).click();
	
	
	//this will click on next button
	WebElement month = Driver.findElement(By.xpath("//div[@class='ui-datepicker=title'])[2]"));
	
	t= month.getText(); //august--second iteration -september
	}
	

	//to select specific date
	List<WebElement>obj=Driver.findElements(By.xpath("//td[@data-month='8']"));
	
	System.out.println(obj.size());
	
	for(WebElement k: obj) {
		
	if (k.getText().equalsIgnoreCase("1")){
		k.click();
		break;
	}
		
		
	}
}
}
