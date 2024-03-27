package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrame {
public static void main(String args[]) {
	 WebDriver driver = new ChromeDriver();
	 driver.get("https:the-internet.herokuapp.com/nested_frames");
	 WebElement frameTop=driver.findElement(By.xpath("//frame[@name='frame-top']"));
	 
	 driver.switchTo().frame(frameTop);
	 WebElement frameLeft=driver.findElement(By.xpath("//frame[@name='frame-left']"));
 
	driver.switchTo().frame(frameLeft);  //left frame
	WebElement leftFrameText=driver.findElement(By.xpath("//body[contains(text(),'LEFT')"));
	System.out.println(leftFrameText);
	
	driver.switchTo().parentFrame(); //top frame 
	  
	  WebElement frameMiddle=driver.findElement(By.xpath("//frame[@name='frame-middle']"));

	  driver.switchTo().frame(frameMiddle);  //middle frame
	  
	

	  String middleFrameText=driver.findElement(By.xpath("//div[contains(text(),'MIDDLE')]")).getText();
	  System.out.println(middleFrameText);
	  
	  
	  
	  
	  //Add the right frame code here
	  
	  
	  driver.switchTo().defaultContent();
	  
	  
	  
	  WebElement frameBottom=driver.findElement(By.xpath("//frame[@name='frame-bottom']"));
	  driver.switchTo().frame(frameBottom); //top frame
	  
	  
	  WebElement bottomText=driver.findElement(By.xpath("//body[contains(text(),'BOTTOM')]"));

	   System.out.println(bottomText.getText());
	 
	  
}
}
