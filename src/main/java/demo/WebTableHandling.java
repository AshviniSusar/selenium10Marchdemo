package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class WebTableHandling {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

	
		List<WebElement> amounts = driver.findElements(By.xpath("(//table[@id='product'])[2]//td[4]"));
		
		  int sum=0;
		  
		  for (int i = 0; i < amounts.size(); i++) {

		   String amountValuesString = amounts.get(i).getText();

		   // converted string values to integer
		   int amountValuesInt = Integer.parseInt(amountValuesString);
		 
		   sum=sum+amountValuesInt;
		   // sum=    0+28= 28 //1st iteratiom
		    // sum = 28+23= 51 //2nd iteration
		   
		  }
		  
		  System.out.println(sum); //integer
		  
		  //Converted sum to String
		  String sumConversion = Integer.toString(sum);
		  
		  WebElement expectedText=driver.findElement(By.xpath("//div[@class='totalAmount']"));
		  
		  String exp=expectedText.getText().substring(24);
		  
		  System.out.println(exp); //String
		  
		      if(sumConversion.equalsIgnoreCase(exp)) {
		       
		       System.out.println("tets cases is passed");
		      }
		  
	}
}