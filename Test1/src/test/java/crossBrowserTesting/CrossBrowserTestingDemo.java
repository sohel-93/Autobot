package crossBrowserTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserTestingDemo {
	WebDriver driver;
	@BeforeMethod
	@Parameters("browser")
	public void launchBrowser(String browser) {
		switch(browser.toLowerCase()) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(options);
			break;

		case "msedge":
			WebDriverManager.edgedriver().setup();
			EdgeOptions options1 = new EdgeOptions();
			options1.addArguments("--remote-allow-origins=*");
			driver = new EdgeDriver(options1);
			break;

		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			FirefoxOptions options2 = new FirefoxOptions();
			options2.addArguments("--remote-allow-origins=*");
			driver = new FirefoxDriver();
			break;

		default:
			driver = null;
			break;


		}
	}
	@Test
	public void verifyTitle() {
		driver.get("https://www.google.com/");

		String ExpectedTitle = "Google";
		String actualTitle = driver.getTitle();

		Assert.assertEquals(actualTitle,ExpectedTitle);
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
