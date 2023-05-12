package myPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Launch Chrome Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shoel\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//open google webpage
		driver.get("https://www.google.co.in/");
		
		//capture the title of the google page and print
		String title = driver.getTitle();
		System.out.println("page title is:"+ title);
		
		//capture the current url 
		String url = driver.getCurrentUrl();
		System.out.println("current url is:"+url);

	}

}
