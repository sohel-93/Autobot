package Utility;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parametrization1 {

	public static String getData(int Row,int Cell) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\shoel\\Automation\\KiteZerodha\\src\\test\\resources\\KiteZerodhalogin.xlsx");
		String value = WorkbookFactory.create(file).getSheet("zerodha").getRow(Row).getCell(Cell).getStringCellValue();
		return value;
		
		

	}

}
