package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGReportEx2 {
	@Test
	public void googleSearch() {
		//launch chrome browser
				WebDriverManager.chromedriver().setup();
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--remote-allow-origins=*");
				WebDriver driver = new ChromeDriver(options);
				Reporter.log("chrome browser opened...");
				
				//open url
				driver.get("https://www.google.com/");
				Reporter.log("google url opened...");
				
				//find searchbox webelement
				WebElement searchbox = driver.findElement(By.name("q"));
				Reporter.log("WebElement located...");
				
				//enter search keyword
				searchbox.sendKeys("India Gate");
				Reporter.log("India Gate keyword entered...");
				//press enter key
				searchbox.sendKeys(Keys.ENTER);
				Reporter.log("Enter key pressed...");
				
				driver.quit();
				
	}
}
