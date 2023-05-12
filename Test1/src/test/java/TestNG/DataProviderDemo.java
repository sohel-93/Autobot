package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderDemo {
//	1.India Qutub Minar
//	2.Agra TajMahal
//	3.Hyderabad charminar

	@Test(dataProvider = "SearchDataSet",dataProviderClass = DataProviderMethod.class)
	public void testGoogleSearch(String country, String monument) {
		// launch chrome browser
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
		//open url
		driver.get("https://www.google.com/");
		WebElement searchbox = driver.findElement(By.name("q"));
		searchbox.sendKeys(country +" "+ monument);
		driver.findElement(By.name("btnK")).submit();
	}

}
