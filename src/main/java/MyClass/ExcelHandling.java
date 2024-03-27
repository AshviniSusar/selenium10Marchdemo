package MyClass;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.IOException;  
public class ExcelHandling {
public static void main(String[] args) throws IOException {
	
	FileInputStream fs = new FileInputStream("");
	
	// to take the control of workbook
	XSSFWorkbook workbook = new XSSFWorkbook(fs);
	
	// to take the control of sheet
	XSSFSheet sheet = workbook.getSheetAt(0);
	
	//this will take the control of row
	Row row = sheet.getRow(1);
	
	Cell cell = row.getCell(0);
	
	String username = cell.toString();
	
	Cell cell1 = row.getCell(1);
	
	String password = cell1.toString();
	
	
	
	//use this fields in selenium code
	 WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");

	
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys();

		driver.findElement(By.xpath("//input[@id='password']")).sendKeys();

		driver.findElement(By.xpath("//input[@name='Login']")).click();

 
}
}
