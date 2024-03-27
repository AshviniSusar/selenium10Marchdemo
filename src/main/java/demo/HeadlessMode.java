 package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessMode {
	public static void main(String[] args) {
		
	
	//create object of chrome options
	ChromeOptions options= new ChromeOptions();
	
	
	//add the incognito argument
	options.addArguments("headless");
	
	//pass the options  parameter in the chrome driver declaration
	WebDriver driver = new ChromeDriver(options);

	
	//navigate to tools QA site url
	driver.get("https://demoqa.com/");
	System.out.println(driver.getTitle());
}
}
