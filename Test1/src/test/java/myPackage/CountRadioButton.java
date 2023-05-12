package myPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountRadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//open chrome browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shoel\\Automation\\KiteZerodha\\src\\main\\resources\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//open url
		driver.get("https://udyamregistration.gov.in/Udyam_Login.aspx");
		//find radio button webelements on webpage
		List <WebElement> radiobuttonlist = driver.findElements(By.xpath("//input[@type='radio']"));
		//print total no. of radio button on radiobuttonlist
		System.out.println("Total no. of radio buttons on webpage"+ radiobuttonlist.size());
		//close current browser
		driver.close();

	}

}
