package demo;


	import java.util.Iterator;
	import java.util.Set;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class TabHandlingexcerice {

	 public static void main(String[] args) throws InterruptedException {

	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.naukri.com/"); // 
	  
	     System.out.println(driver.getCurrentUrl());

	  driver.findElement(By.xpath("//div[@class='acceptance-btn']")).click();
	  driver.findElement(By.xpath("//span[@title=\"MNC\"]")).click();//
	  Thread.sleep(5000);
	  
	  

	  Set<String> obj = driver.getWindowHandles(); 

	  Iterator<String> it = obj.iterator();
	  
	  String parent=it.next();  //parent Tab
	  String childTab1=it.next(); //child tab1
	  
	  
	  driver.switchTo().window(childTab1); //This will switch control to child tab
	  
	  System.out.println(driver.getCurrentUrl());

	  Thread.sleep(2000);
	  driver.findElement(By.xpath("(//a[@class='title ellipsis'])[1]")).click(); 

	 
	  Set<String> obj1 = driver.getWindowHandles(); 
	  Iterator<String> it1 = obj1.iterator();
	  
	  String parentTab=it1.next(); //parent tab
	  String childTab=it1.next();  //child tab 1
	  String childTab2=it1.next();  //child tab2
	  
	  
	  driver.switchTo().window(childTab2);
	  
	  System.out.println(driver.getCurrentUrl());
	  
	  driver.switchTo().window(parentTab);
	  System.out.println(driver.getCurrentUrl());
	  
	  
	  
	 }

	}

