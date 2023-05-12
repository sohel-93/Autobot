package myPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountHyperLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//open browser
				System.setProperty("webdriver.chrome.driver","C:\\Users\\shoel\\Automation\\KiteZerodha\\src\\main\\resources\\chromedriver_win32 (2)\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
		//open url
				driver.get("https://www.calculator.net/");
				List<WebElement> linklist = driver.findElements(By.tagName("a"));
				System.out.println("Total Hyperlink :"+ linklist.size());
				for(WebElement el : linklist) {
					System.out.println(el.getText());
				}
				driver.close();

	}

}
