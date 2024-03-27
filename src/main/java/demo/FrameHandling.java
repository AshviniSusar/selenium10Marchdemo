package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FrameHandling {
	public static void main(String args[]) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		// how to identify the frames-
		// right click and then see if its showing reload frame-
		// taganme should be iframe or frame-

		// how to take control of the frame-

		WebElement a = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));

		driver.switchTo().frame(a);
		// index
		// frame nameorid
		// frame webelement

		Actions b = new Actions(driver);

		WebElement source = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement target = driver.findElement(By.xpath("//div[@id='droppable']"));

		b.dragAndDrop(source, target).build().perform();

		// switch the control outside the frame

		driver.switchTo().defaultContent();

		// driver.switchTo().parentFrame();

		// https://the-internet.herokuapp.com/nested_frames
	}
}
