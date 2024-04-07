package Day15;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
// Reading data--fileInputStream
//Excel file--Workbook--Sheets--ROws--Cells

public class ReadingExcel {

	public static void main(String[] args) throws IOException {
		FileInputStream file= new FileInputStream(System.getProperty("user.dir") + "\\ExcelFiles\\DAILY WORKSHEET.xlsx");
		
		XSSFWorkbook workbook= new XSSFWorkbook(file); //apache poi, to get the file
		
	//two ways to accessing the sheet -- by name	
		XSSFSheet sheet= workbook.getSheet("Sheet2");

//second way is index	
		//XSSFSheet sheet= workbook.getSheetAt(1);	
		
		int row= sheet.getLastRowNum();  //return row number
		int col= sheet.getRow(2).getLastCellNum();  //return column number
		
		System.out.println("The no. of rows are : " + row);
		System.out.println("The no. of columns are : " + col);
		
		
	//first for loop is to read the rows	
		for(int r=0; r<=row; r++)
		{
			XSSFRow currentRow=sheet.getRow(r);
			
			for (int c=0; c<col; c++)  // to read the column
			{
				//XSSFCell cellValue = cellValue=cuurentRow.getCell(c);
				//String cell= cellValue.toString();
				
				String cellValue=currentRow.getCell(c).toString();
				System.out.print(cellValue+ " ");
			}
			
			System.out.println();  //formatting
		}
		
		workbook.close();
		file.close();
		
	}

}
