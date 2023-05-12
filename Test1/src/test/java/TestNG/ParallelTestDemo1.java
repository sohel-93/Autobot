package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelTestDemo1 {
	WebDriver driver;
	@Test
	public void verifyTitle() {
		//launch chrome browser
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		 driver = new ChromeDriver(options);

		//open url
		driver.get("https://www.saucedemo.com/");

		Assert.assertEquals(driver.getTitle(), "Swag Labs");

		driver.quit();
	}
	@Test
	public void verifyLogo() {
		//launch chrome browser
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);

		//open url
		driver.get("https://www.saucedemo.com/");

		WebElement logo = driver.findElement(By.xpath("//div[@class='login_logo']"));

		Assert.assertTrue(logo.isDisplayed());
		driver.quit();
	}
}
