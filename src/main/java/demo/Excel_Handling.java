package demo;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.IOException;

public class Excel_Handling {
	public static void main(String[] args) throws IOException {

		// XSSFWorkbook workbook = new XSSFWorkbook(fs);
		FileInputStream fs = new FileInputStream("C:\\Users\\ASHVINI\\Desktop\\Excel_Using_Selenium.xlsx");

		// To take the control of workbook
		XSSFWorkbook workbook = new XSSFWorkbook(fs);

		// To take the control of sheet
		XSSFSheet sheet = workbook.getSheetAt(1);

		// This will take the control of row-
		Row row = sheet.getRow(3);

		
		 Cell cell=row.getCell(0);
		  
		  String username=cell.toString();
		  
		  

		  Cell cell1=row.getCell(1);
		  
		    String password= cell1.toString();
		  
		
		
		System.out.println(cell);

		// use this fields in selenium code

		WebDriver driver = new ChromeDriver();

		driver.get("https://login.salesforce.com/");

		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(username);

		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);

	}
}