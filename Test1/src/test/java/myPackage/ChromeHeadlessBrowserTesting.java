package myPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeHeadlessBrowserTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//launch chrome browser
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.setHeadless(true);
		WebDriver driver = new ChromeDriver(options);
		
		//open url
		driver.get("https://www.google.com/");
		
		//print title of webpage
		System.out.println("Before search:" +driver.getTitle());
		
		//find searchbox webelement
		WebElement searchbox = driver.findElement(By.name("q"));
		
		//enter search keyword
		searchbox.sendKeys("India Gate");
		searchbox.sendKeys(Keys.ENTER);
		
		//after search title
		System.out.println("After search:"+ driver.getTitle());
		
		//pause of 3 seconds
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.quit();
	}

}
