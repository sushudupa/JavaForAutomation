package dataDrivenExcelUtilities;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
	
	//Changing XSSFWorkbook workbook & XSSFSheet sheet to public and it changes to instance variable
	
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	static String excelPath ;
	static String sheetName ;
	
	
	// Parameterized constructor
	public ExcelUtility(String excelPath, String sheetName) {
		try {
			 workbook = new XSSFWorkbook(excelPath);
			 sheet = workbook.getSheet(sheetName);
		}
	catch(IOException e) {
		e.printStackTrace();
	 }
	}
	// Get the row count
	public int getRowCount() {
		int rowCount= 0;
		try {
			rowCount = sheet.getPhysicalNumberOfRows();
			//System.out.println(rowCount);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		return rowCount;
	}

	// Get the cell text value
	public String  getCellData(int rowNum, int colNum) {
		String cellData = null;
		try {
			cellData = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
			//System.out.println(cellData);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		return cellData;
	}
	
	/* public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creating the Object Instance for ExcelUtility
		ExcelUtility excel = new ExcelUtility(excelPath,sheetName );
		
		int rowCount = excel.getRowCount();
		for (int row = 1; row<rowCount; row++) {
			
			String url = excel.getCellData(row, 0);
			String firstName = excel.getCellData(row, 2);
			String country = excel.getCellData(row, 10);
			
			System.out.println(url);
			System.out.println(firstName);
			System.out.println(country);
			
		}
		
		

	}*/

}
