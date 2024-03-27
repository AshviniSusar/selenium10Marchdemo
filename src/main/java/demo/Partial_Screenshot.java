package demo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Partial_Screenshot {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		WebElement a =driver.findElement(By.xpath("//input[@id='username']"));
		
		File src1 = a.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(src1,new File("D:\\cfrbackup-MPYJCZJE\\Screnshot.png"));
	}
	
}
