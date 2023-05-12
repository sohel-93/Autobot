package myPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CaptureImageSourceUrl {

	public static void main(String[] args) {
		//launch chrome browser
				WebDriverManager.chromedriver().setup();
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--remote-allow-origins=*");
				WebDriver driver = new ChromeDriver(options);
				
				//open url
				driver.get("https://www.facebook.com/");
				
				//maximize browser
				driver.manage().window().maximize();
				
				//find webelement of imagelogo
				WebElement imagelogo = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));
				
				//get source atttribute of imagelogo
				String srcurl = imagelogo.getAttribute("src");
				System.out.println(srcurl);
				
				driver.quit();
				

	}

}
