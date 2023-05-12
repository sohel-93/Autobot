package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelTestDemo2 {
	WebDriver driver;
	@Test
	public void Login() {
		//launch chrome browser
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
	    driver = new ChromeDriver(options);

		//open url
		driver.get("https://www.saucedemo.com/");
        //enter user name
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		//enter password
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		//click on login
		driver.findElement(By.id("login-button")).click();
		
		
		driver.quit();
	}
}
