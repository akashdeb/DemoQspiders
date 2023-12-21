package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToFetchDataFromExcelSheet {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\User\\Desktop\\Scripts\\eclipse-workspace_September2023_10AM\\SeleniumAutomation\\testData\\ExcelData.xlsx");

		
		Workbook workbook = WorkbookFactory.create(fis);
		
		Sheet sheet = workbook.getSheet("Sheet1");
		
		Row row = sheet.getRow(2);
		
		Cell cell = row.getCell(0);
		
		String customer1Name = cell.getStringCellValue();
		
		System.out.println(customer1Name);
		
		double salOfCustomer1 = row.getCell(2).getNumericCellValue();
		
		System.out.println(salOfCustomer1);
		
		boolean statusOfCustmer1 = row.getCell(3).getBooleanCellValue();
		
		System.out.println(statusOfCustmer1);
		
		String customer2Name = sheet.getRow(1).getCell(0).getStringCellValue();
		
		System.out.println(customer2Name);
		
		
	}

}
