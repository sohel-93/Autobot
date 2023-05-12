package myPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// open chrome browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shoel\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// open sauce demo webpage
		driver.get("https://www.saucedemo.com");
		//locate username using single attribute 
		WebElement user = driver.findElement(By.xpath("//input[@id='user-name']"));
		user.sendKeys("standard_user");
		//locate password using multiple attribute
		WebElement pass = driver.findElement(By.xpath("//input[@id='password'][@name='password']"));
		pass.sendKeys("secret_sauce");
		//locate login button
		WebElement login = driver.findElement(By.xpath("//input[@id='login-button']"));
		login.click();
		//switch to product page
		String currentWindowHandle = driver.getWindowHandle();
		driver.switchTo().window(currentWindowHandle);
	

	}

}
