package MyClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrames {
public static void main(String args[]) {
	 WebDriver Driver  = new ChromeDriver();
	Driver.get("https://the-internet.herokuapp.com/nested_frames");
	
	WebElement frameTop  = Driver.findElement(By.xpath("//frame[@name='frame-top']"));
	Driver.switchTo().frame(frameTop); //top frame
	
	WebElement frameLeft = Driver.findElement(By.xpath("//frame[@name='frame-left']"));
	Driver.switchTo().frame(frameLeft); //left frame
	
	String LeftFrameText=Driver.findElement(By.xpath("//body[contains(text(),'LEFT')]")).getText();
	System.out.println(LeftFrameText);
	
	
	Driver.switchTo().parentFrame();  //top frame
	
	WebElement frameMiddele = Driver.findElement(By.xpath("//frame[@name='frame-middle']"));
	Driver.switchTo().frame(frameMiddele); //Middele frame
	
	String MiddleFrameText=Driver.findElement(By.xpath("//DIV[contains(text(),'MIDDLE')]")).getText();
	System.out.println(MiddleFrameText);
	
	//add the right frame code here
	Driver.switchTo().defaultContent();
	
	WebElement frameBottom  = Driver.findElement(By.xpath("//frame[@name='frame-BOTTOM']"));
	Driver.switchTo().frame(frameBottom); //bottom frame

	WebElement bottomText = Driver.findElement(By.xpath("//body[@name='frame-BOTTOM']"));
	System.out.println(bottomText.getText());
	}
}
