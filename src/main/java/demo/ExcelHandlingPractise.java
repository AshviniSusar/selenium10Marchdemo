package demo;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelHandlingPractise {
	public static void main(String[] args) throws IOException {

		// XSSFWorkbook workbook = new XSSFWorkbook(fs);
		FileInputStream fs = new FileInputStream("C:\\Users\\ASHVINI\\Desktop\\Excel_Using_Selenium.xlsx");

		// To take the control of workbook
		XSSFWorkbook workbook = new XSSFWorkbook(fs);

		// To take the control of sheet
		XSSFSheet sheet = workbook.getSheetAt(0);

		
		
		// This will take the control of row-
		System.out.println(sheet.getLastRowNum());
		
		
		for(int i=1; i<=sheet.getLastRowNum() ; i++) {
		Row row  = sheet.getRow(i);
		Cell cell=row.getCell(0);
		  
		System.out.println(cell);
		
		String username=cell.toString();
		
		 WebDriver driver = new ChromeDriver();
			driver.get("https://login.salesforce.com/");

		
			driver.findElement(By.xpath("//input[@type='email']")).sendKeys(username);

			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("dfg");

			driver.findElement(By.xpath("//input[@name='Login']")).click();


		}
		  
		
	}
}
