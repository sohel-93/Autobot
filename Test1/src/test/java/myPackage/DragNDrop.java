package myPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragNDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//open chrome browser
				System.setProperty("webdriver.chrome.driver","C:\\Users\\shoel\\Automation\\KiteZerodha\\src\\main\\resources\\chromedriver_win32 (2)\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				//maximize chrome browser
				driver.manage().window().maximize();
				//open url
				driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
				//find source and target web elements
				WebElement source = driver.findElement(By.id("box3"));
				WebElement target = driver.findElement(By.id("box103"));
				
				Actions act = new Actions(driver);
				act.dragAndDrop(source, target);
				act.perform();
				

	}

}
