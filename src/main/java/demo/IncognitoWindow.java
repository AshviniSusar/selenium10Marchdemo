package demo;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class IncognitoWindow {
public static void main(String[] args) {
	
	//create object of chrome options
	ChromeOptions options= new ChromeOptions();
	
	
	//add the incognito argument
	options.addArguments("incognito");
	
	//pass the options  parameter in the chrome driver declaration
	WebDriver driver = new ChromeDriver(options);

	
	//navigate to tools QA site url
	driver.get("https://demoqa.com/");
	System.out.println(driver.getTitle());
	
	
	
}
}
