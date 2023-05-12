package myPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// open chrome browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shoel\\Automation\\KiteZerodha\\src\\main\\resources\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// maximize chrome browser
		driver.manage().window().maximize();
		// open url
		driver.get("C:\\Users\\shoel\\Automation\\KiteZerodha\\src\\main\\resources\\sampleTable.html");
		//find second cell in web table and print second cell data
		
				
	}

}
