package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
@Listeners(TestNG.ListenerClass.class)
public class ListenerDemo {
	@Test
	public void login() {
		//launch chrome browser
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		//open url
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        
		//locate and enter username
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		//locate and enter password
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		//locate and enter login
		driver.findElement(By.xpath("//button[@type='submit']")).submit();

		driver.quit();
	}
	@Test
	public void testFail() {
		System.out.println("Test Failed");
		Assert.assertTrue(false);
	}
	@Test
	public void testSkipped() {
		System.out.println("Test Skipped");
		throw new SkipException("Skip Exception Thrown....");
	}
}
