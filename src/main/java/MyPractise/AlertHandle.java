package MyPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

import org.openqa.selenium.Alert;

public class AlertHandle {
	public static void main(String[] args) throws InterruptedException, AWTException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		Thread.sleep(3000);
		
		// for handling alert
		Alert alert = driver.switchTo().alert();
		String alertMessage = driver.switchTo().alert().getText();
		System.out.println(alertMessage);
		Thread.sleep(3000);
		alert.accept();
		Thread.sleep(1000);
		
		// for handling popup
		driver.findElement(By.id("Pop-Up")).click();
		Robot robot= new Robot();
		robot.mouseMove(400, 5);
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		Thread.sleep(2000);
		robot.mouseRelease(InputEvent.BUTTON2_DOWN_MASK);
		Thread.sleep(2000);
		driver.quit();
		
		
	}
}
