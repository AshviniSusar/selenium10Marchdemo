package MyClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameHandling {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	
	Actions b = new Actions(driver);
	
	WebElement source = driver.findElement(By.xpath("//div[@id='draggable']"));
	WebElement target = driver.findElement(By.xpath("//div[@id='droppable']"));

	b.dragAndDrop(source, target).build().perform();
	
	//Switch the control outside the frame
	
	 driver.switchTo().defaultContent();
	 
	 //driver.SwitchTo().ParentFrame();
	 
    	 
}
}
