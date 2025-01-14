package MyClass;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import java.io.FileInputStream;
import java.io.IOException;

public class Reading_Excel {

	private static final String STRING = null;
	private static final String NUMERIC = null;

	public static void main(String[] args) throws IOException {

	//String excelFilePath = "C:\\Users\\ASHVINI\\Desktop\\Reading Excel.xlsx";
		FileInputStream inputstream = new FileInputStream(excelFilePath);
		XSSFWorkbook workbook = new XSSFWorkbook(inputstream);
		XSSFSheet sheet = workbook.getSheetAt(0); // XSSFSheeet sheet = workbook.getSheet("Sheet1");

		//// using for loop

		int rows = sheet.getLastRowNum();
		int cols = sheet.getRow(1).getLastCellNum();

		for (int r = 0; r <= rows; r++) {
			XSSFRow row = sheet.getRow(r);

			for (int c = 0; c < cols; c++) {
				XSSFCell cell = row.getCell(c);

				switch (cell.getCellType()) {
				case STRING:
					System.out.print(cell.getStringCellValue());
					break;
				case NUMERIC:
					System.out.print(cell.getNumericCellValue());
					break;
				case BOOLEAN:
					System.out.print(cell.getBooleanCellValue());
					break;

				}
				System.out.print("  |  ");
			}
			System.out.println();
		}
		
		///////iterator/////
		/* Iterator iterator = sheet.iterator();
		 while (iterator.hasNext())
		 {
			 XSSFRow row= (XSSFRow) iterator.next();
			 Iterator cellIterator= row.cellIterator();
		 
			  while (cellIterator.hasNext())
			  {
				 XSSFCell cell =(XSSFCell)cellIterator.next();
				 switch (cell.getCellType())
				 {
					case STRING:
						System.out.print(cell.getStringCellValue());
						break;
					case NUMERIC:
						System.out.print(cell.getNumericCellValue());
						break;
					case BOOLEAN:
						System.out.print(cell.getBooleanCellValue());
						break;
			  }
				 System.out.println("   |  ");
				 
		 }
			 System.out.println();
		 
		 
		
	}*/
	}
}
