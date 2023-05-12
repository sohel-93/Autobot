package myPackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UploadFile {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		//open chrome browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shoel\\Automation\\KiteZerodha\\src\\main\\resources\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//maximize chrome browser
		driver.manage().window().maximize();
		//open url
		driver.get("https://demoqa.com/upload-download");
		//find web element choose file 
		//WebElement choose = driver.findElement(By.xpath("//input[@id='uploadFile']"));
		//choose.sendKeys("C:\\Users\\shoel\\Downloads\\Selenium 8.pdf");
		WebElement button = driver.findElement(By.xpath("//input[@id='uploadFile']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(button);
		act.click().perform();
		
		Robot rb = new Robot();
		rb.delay(2000);
		
		//copy file to clipboard
		StringSelection ss = new StringSelection("C:\\Users\\shoel\\Downloads\\Selenium 8.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		//perform control + V action to paste files
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		

	}

}
