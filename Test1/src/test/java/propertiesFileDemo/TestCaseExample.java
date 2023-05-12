package propertiesFileDemo;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCaseExample {

	public static void main(String[] args) throws Exception {
		//launch chrome browser
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		ReadConfigFile configFile = new ReadConfigFile();
		//open url
		driver.get(configFile.getUrl());
		
		//find username 
		driver.findElement(By.name("username")).sendKeys(configFile.getUserName());
		
		//find and enter password
		driver.findElement(By.name("password")).sendKeys(configFile.getPassword());
		
		//find and click on loginbtn
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	

	}

}
