package dataDrivenTesting;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class TestScript {

	public static void main(String[] args) throws Throwable, IOException {
		
		FileUtility fUtils = new FileUtility();
		
		String BROWSER = fUtils.fetchDataFromPropertyFile("browser");
		 double CUSTOMER1SAL = fUtils.fetchNumericDataFromExcelFile("Sheet1", 1, 2);
		
		System.out.println(BROWSER);
		System.out.println(CUSTOMER1SAL);



	}

}
