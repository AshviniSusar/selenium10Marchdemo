package MyPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameHandling {
public static void main(String[] args) {
	
	WebDriver driver =new ChromeDriver();
driver.get(" https://jqueryui.com/droppable/");
	
	WebElement a =driver.findElement(By.xpath(" //iframe[@class=\"demo-frame\"]" ));
	driver.switchTo().frame(a);
	
	Actions b = new Actions(driver);
	
	WebElement source= driver.findElement(By.xpath("//div[@id='droppable'] "));
	WebElement target= driver.findElement(By.xpath(" //div[@id='draggable']"));
	b.dragAndDrop(source, target).build().perform();
	driver.switchTo().defaultContent();
}
}
