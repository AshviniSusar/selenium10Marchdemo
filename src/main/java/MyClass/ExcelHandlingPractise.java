package MyClass;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import java.io.FileInputStream;  
public class ExcelHandlingPractise {
	public static void main(String[] args) {
		
		FileInputStream fs = new FileInputStream("");
		
		// to take the control of workbook
		XSSFWorkbook workbook = new XSSFWorkbook(fs);
		
		// to take the control of sheet
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		//this will take the control of row
		for(int i=1;i<9;i++) {
			Row row = sheet.getRow(0);
			Cell cell = row.getCell(0);
			System.out.println(cell);
		}
		
		
	}		
}
