package demo;

	import java.util.List;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class CheckBoxHandling {

	 public static void main(String[] args) {

	  WebDriver driver = new ChromeDriver();

	  driver.get("https://rahulshettyacademy.com/AutomationPractice/");

	  WebElement a = driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));

	  a.click();
	  
	  System.out.println(a.isDisplayed()); //true
	  System.out.println(a.isEnabled()); //true
	  System.out.println(a.isSelected()); //true
	  
	  
	  
	  List<WebElement> b = driver.findElements(By.xpath("//input[@type='checkbox']"));
	  // System.out.println(b.size());

	  // using for each
	  for (WebElement k : b) {

	   k.click();
	  }

	  /*
	   * for(int i=0;i<b.size();i++) 
	   * { 
	   * b.get(i).click();
	   * 
	   * }
	   */

	  // i want first two checkbox selected-
	  // i want first and third

	  // i want to select fist two
	  for (int i = 0; i < b.size() - 1; i++) {
	   b.get(i).click();
	  }

	// i want to select first and third
	  for (int i = 0; i < b.size(); i = i + 2) {
	   b.get(i).click();
	  }

	  // random checkbox selection
	 /* for (int i = 0; i < b.size(); i++) {

	   Random rand = new Random();

	   // Will work for [0 - 9].
	   int n = rand.nextInt(10);

	   System.out.println(n);
	   b.get(n).click();

	  }*/
	  
	  
	  
	  
	  
	 }
}
