package dataDrivenTestingDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataDrivenTestingExample {
     public static void main(String[] args) {
		XSSFWorkbook excelWbook = null;
		XSSFSheet excelWsheet;
		XSSFRow row;
		XSSFCell cell;
		
		//create a object of file class and open file
		File excelFile = new File("C:\\Users\\shoel\\OneDrive\\Documents\\TestInputData.xlsx");
		FileInputStream fis = null;
		//create an object of fileinputStream Class to read data from file
		
		try {
			fis = new FileInputStream(excelFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Excel->workbook->sheet->row->cell
		//create XSSFWorkbook object to handle xlsx file
		
		try {
			excelWbook = new XSSFWorkbook(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// to access workbook sheet
		excelWsheet = excelWbook.getSheetAt(0);
		
		//to get total no. of rows
		int ttlrows = excelWsheet.getLastRowNum()+1;
		
		// get total no. of cells in a row
		int ttlcells = excelWsheet.getRow(0).getLastCellNum();
		
		for(int currentrow=1; currentrow<ttlrows; currentrow++)
		{
			//launch chrome browser
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			WebDriver driver = new ChromeDriver(options);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			//open url
			driver.get("https://www.saucedemo.com/");
			//locate and enter username
			driver.findElement(By.id("user-name")).sendKeys(excelWsheet.getRow(currentrow).getCell(0).getStringCellValue());
			//locate and enter password
			driver.findElement(By.id("password")).sendKeys(excelWsheet.getRow(currentrow).getCell(1).getStringCellValue());
			//locate and click on loginbtn
			driver.findElement(By.id("login-button")).click();
//			for(int currentcell = 0; currentcell<ttlcells; currentcell++)
//			{
//				System.out.print(excelWsheet.getRow(currentrow).getCell(currentcell).getStringCellValue());
//				System.out.print("\t");
//			}
//			System.out.println();
		}
		try {
			excelWbook.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
