package MyClass;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//workbook-->sheet-->rows-->cells
public class WritingExcelDemo1 {
	
public static void main(String[] args) {

	XSSFWorkbook workbook = new XSSFWorkbook();
	
	XSSFSheet sheet = workbook.createSheet("Emp Info");
	
	Object empdata [][]={ {"EmpID","Name","job"},
		              	{ 101,"David","Engineer"},
		              	{102,"Smith","Analyst"},
		              	{103,"Scott","Analyst"}
	
                       };
	
	//ussing for loop
	int rows = empdata.length;
	int cols = empdata.length;
	
System.out.println(rows); //4
System.out.println(cols);  //3

for(int r=0; r<rows;r++);
{
	XSSFRow row =sheet.createRow(r);
	
	for(int c= 0;c<cols;c++)
	{
		XSSFCell cell =row.createCell(c);
		Object value =empdata[r][c];
		
		if(value instanceof String)
			cell.setCellValue(String)value);
		if(value instanceof Integer)
			cell.setCellValue(Integer)value);
		if(value instanceof Boolean)
			cell.setCellValue(Boolean)value);
	}
}

}
}
