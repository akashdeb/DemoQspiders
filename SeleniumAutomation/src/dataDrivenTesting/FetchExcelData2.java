package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchExcelData2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\User\\Desktop\\Scripts\\eclipse-workspace_September2023_10AM\\SeleniumAutomation\\testData\\DemoExcel.xlsx");
		
		Sheet sheet = WorkbookFactory.create(fis).getSheet("Sheet1");
		
		 String cn = sheet.getRow(2).getCell(0).getStringCellValue();
		 
		 System.out.println(cn);
		 
		  int pn =(int) sheet.getRow(2).getCell(1).getNumericCellValue();
		  
		  System.out.println(pn);


	}

}
