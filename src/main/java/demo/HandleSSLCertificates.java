package demo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebDriver;

public class HandleSSLCertificates {
	
public static void main(String[] args) {
	 
	//create object of chrome options
	ChromeOptions options =  new ChromeOptions();
	//add the argument
	options.setAcceptInsecureCerts(true);
	
	
	//pass the options parameter in the chrome driver declarations
	
	WebDriver driver= new ChromeDriver(options);
	
	//navigate to toolsQA site Url
	driver.get("https://expired.badssl.com/");
	System.out.println(driver.getTitle());
	
	
	
	
}
}
