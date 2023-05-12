package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertionDemo {
	@Test
    public void applyAssertions() {
    	//launch chrome browser
    			WebDriverManager.chromedriver().setup();
    			ChromeOptions options = new ChromeOptions();
    			options.addArguments("--remote-allow-origins=*");
    			WebDriver driver = new ChromeDriver(options);
    			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    			//open url
    			driver.get("https://testautomationpractice.blogspot.com/");
    			SoftAssert sa = new SoftAssert();
    			
    			System.out.println("Verifying Title....");
    			String expectedTitle = "Automation Testing Practice";
    			String actualTitle = driver.getTitle();
    			sa.assertEquals(actualTitle, expectedTitle, "Title Verified");
    			
    			System.out.println("Verifying presence of wikipedia-icon");
    			WebElement icon =driver.findElement(By.xpath("//img[@class='wikipedia-icon']"));
    			sa.assertTrue(icon.isDisplayed());
    			
    			System.out.println("Verifying presence of wikipedia search button");
    			WebElement searchbtn = driver.findElement(By.xpath("//input[@class='wikipedia-search-button']"));
    			sa.assertTrue(searchbtn.isDisplayed());
    			driver.quit();
    			//report all failure messages
    			sa.assertAll();
    			
    }
}
