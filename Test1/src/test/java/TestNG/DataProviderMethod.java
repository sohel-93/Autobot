package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderMethod {
	@DataProvider(name = "SearchDataSet")
	public Object[][] searchData(){
		Object[][] searchKeyword = new Object[3][2];
		
		searchKeyword[0][0] = "India";
		searchKeyword[0][1] = "Qutub Minar";
		searchKeyword[1][0] = "Agra";
		searchKeyword[1][1] = "TajMahal";
		searchKeyword[2][0] = "Hyderabad";
		searchKeyword[2][1] = "CharMinar";
		
		return searchKeyword;	
	}
}
