package myPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//open chrome browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shoel\\Automation\\KiteZerodha\\src\\main\\resources\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//maximize chrome browser
		driver.manage().window().maximize();
		//open url
		driver.get("https://sellglobal.ebay.in/seller-center/");
		WebElement element = driver.findElement(By.linkText("Shipping & Payments"));
		
		Actions act = new Actions(driver);
		act.moveToElement(element);//moveToElement for mouse over action
		act.perform();

	}

}
