package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class newTabUrlOpen {
public static void main(String args[]) {
	WebDriver driver= new ChromeDriver();
	
	driver.get("https://the-internet.herokuapp.com/nested_frames");
	
}
}
