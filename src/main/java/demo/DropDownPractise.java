package demo;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class DropDownPractise {
	 
	 public static void main(String[] args) throws InterruptedException {
	  
	  
	  WebDriver driver = new ChromeDriver();

	  driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	  
	  driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
	  
	  driver.findElement(By.xpath("//a[@value='BOM']")).click();
	  
	  
	  Thread.sleep(3000);
	  
	  driver.findElement(By.xpath("(//a[@value='DEL'])[2]")).click();
	  
	  
	  
	  
	   
	 }

	}
