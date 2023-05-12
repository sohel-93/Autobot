package myPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		//launch chrome browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shoel\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//open webpage
		driver.get("https://www.saucedemo.com/");
		
		//locate username tag#id
		driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
		
		//locate password tag[attribute = value]
		driver.findElement(By.cssSelector("input[id=password]")).sendKeys("secret_sauce");
		
		//locate login button using tag.value of class name
		driver.findElement(By.cssSelector("input.submit-button")).click();
		
		//switch to product page
		String currWindowHandle = driver.getWindowHandle();
		driver.switchTo().window(currWindowHandle);
		
		//tag.valueclass[attribute = value]
		driver.findElement(By.cssSelector("button.btn[name=add-to-cart-sauce-labs-backpack]")).click();
		
		//tag[attribute$=substring]
		driver.findElement(By.cssSelector("button[name$=light]")).click();
		

	}

}
