package MyPractise;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialScreenshot {
public static void main(String args[]) throws IOException {
	WebDriver driver =new ChromeDriver();
	driver.get("https://naveenautomationlabs.com/");
	WebElement  a= driver.findElement(By.xpath("//*[@id=\"bannerB\"]/div[2]/a[2]/div ")) ;

	File src1 = a.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src1,new File
}
}
