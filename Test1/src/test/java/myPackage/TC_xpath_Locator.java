package myPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_xpath_Locator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//open chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shoel\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//open sauce demo webpage
		driver.get("https://www.saucedemo.com");
		//locate username by id 
		WebElement user = driver.findElement(By.id("user-name"));
		user.sendKeys("standard_user");
		//locate password by name 
		WebElement pass = driver.findElement(By.name("password"));
		pass.sendKeys("secret_sauce");
		//locate login button
		WebElement login = driver.findElement(By.className("submit-button"));
		login.click();
		Thread.sleep(1000);
		//switch to product page
		String currWindowHandle = driver.getWindowHandle();
		driver.switchTo().window(currWindowHandle);
		Thread.sleep(5000);
		//locate sauce labs bolt t-shirt
		List<WebElement> elementList = driver.findElements(By.partialLinkText("sauce"));
		System.out.println("Element size:"+ elementList.size());
		
		

	}

}
