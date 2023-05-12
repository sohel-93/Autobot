package dataDrivenTestingDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderWithExcel {
	
	WebDriver driver;
	@BeforeMethod
	public void setup() {
		//launch Chrome browser
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		 driver = new ChromeDriver(options);
		

		//open url
		driver.get("https://www.google.com/");

		//maximize browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@Test(dataProvider = "searchDataProvider")
	public void searchKeyword(String keyword) {
		WebElement searchbox =driver.findElement(By.name("q"));
		searchbox.sendKeys(keyword);
		searchbox.sendKeys(Keys.ENTER);
	}
	@DataProvider(name="searchDataProvider")
	public Object[][] searchDataProviderMethod(){
		String filename ="C:\\Users\\shoel\\OneDrive\\Documents\\sheet2.xlsx";
		Object[][] searchData = getExcelData(filename,"sheet2");
//		Object[][] obj = new Object[2][1];//2 rows and 1 column
//		obj[0][0] = "Taj Mahal";//row =1 col=1
//		obj[1][0] = "India Gate";//row=2 col=1
		return searchData;	
	}
	@Test
	public String[][] getExcelData(String filename,String sheetname)
	{
		String[][] data = null;
		FileInputStream fis = null;
		XSSFWorkbook workbook = null;
		XSSFSheet excelsheet = null;
		//open file
		try {
			 fis = new FileInputStream(filename);
			 workbook = new XSSFWorkbook(fis);
			 excelsheet = workbook.getSheet(sheetname);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		//get total no of rows
		int ttlrows = excelsheet.getLastRowNum()+1;
		//get total no. of cells in a row
		int ttlcells = excelsheet.getRow(0).getLastCellNum();
		//initialize array
		data = new String[ttlrows-1][ttlcells];
		
		for(int currentrow=1; currentrow<ttlrows; currentrow++)
		{
			for(int currentcell=0;currentcell<ttlcells;currentcell++)
			{
				data[currentrow-1][currentcell] = excelsheet.getRow(currentrow).getCell(currentcell).getStringCellValue();

			}
		}
		try {
			workbook.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
