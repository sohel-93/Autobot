package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGDemo {
	@Test
	public void verifyTitle() {
      //launch chrome browser
	WebDriverManager.chromedriver().setup();
	
	
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	
	WebDriver driver = new ChromeDriver(options);
	
	 // open url
	driver.get("https://www.google.com/");
	String ExpectedTitle = "Google";
	String ActualTitle = driver.getTitle();
	
	Assert.assertEquals(ExpectedTitle,ActualTitle);
	
	driver.quit();
	}
}
