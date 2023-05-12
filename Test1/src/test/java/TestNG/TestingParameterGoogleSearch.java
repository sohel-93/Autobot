package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestingParameterGoogleSearch {
	@Test
	@Parameters("Keyword")
	public void googleSearch(String SearchData) {
		//launch chrome browser
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);

		//open url
		driver.get("http://www.google.com/");

		WebElement SearchBox = driver.findElement(By.name("q"));
		SearchBox.sendKeys(SearchData);
		
		Assert.assertEquals(SearchBox.getAttribute("value"), SearchData);
	}
}
