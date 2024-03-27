package SeleniumExercises;

import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoCart {

	public static void main (String args[]) {
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://naveenautomationlabs.com/opencart/");
		
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("iphone");
		driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();
		
		String iphonePrice = driver.findElement(By.xpath("//p[@class='price']")).getText();
		System.out.println(iphonePrice);
		
		String [] spl = iphonePrice.split("\\s+");
		
		System.out.println(Arrays.toString(spl));
		//System.out.println(spl[0]);
		// int foo = Integer.parseInt(spl[0]);
		
		String iphonePriceWithDollar=spl[0];
		
		String iphonePriceWithoutDollar = iphonePriceWithDollar.replaceAll("[$,]","");
		System.out.println(iphonePriceWithoutDollar);
		
		
		//click on add to cart
		
		
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("samsung");
		driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();
		
		String samsungPrice = driver.findElement(By.xpath("//p[@class='price']")).getText();
		System.out.println(samsungPrice);
		
		String [] spl2 = samsungPrice.split("\\s+");
		
		System.out.println(Arrays.toString(spl));
		//System.out.println(spl[0]);
		// int foo = Integer.parseInt(spl[0]);
		
		String samsungPriceWithDollar=spl[0];
		
		String iphonePriceInDouble = iphonePriceWithDollar.replaceAll("[$,]","");
		System.out.println(samsungPriceWithDollar);
		
		
		
		driver.findElement(By.xpath("//input[@placeholder='Search']")).clear();
		
		double samsungPriceInDouble=Double.parseDouble(iphonePriceWithoutDollar);
		System.out.println(samsungPriceInDouble);
		
		String totalCount = iphonePriceInDouble+samsungPriceInDouble;
		String t= ("$"+totalCount); 
	}
}
