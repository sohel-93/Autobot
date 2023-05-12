package pageObjectModelDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

	public static void main(String[] args) {
		//launch chrome browser
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
	    WebDriver driver = new ChromeDriver(options);
	    
	    //create object of LoginPage
	    LoginPage2 loginpg = new LoginPage2(driver);

		//open url
		driver.get("https://www.saucedemo.com/");
		loginpg.enterUsername("standard_user");
		loginpg.enterPassword("secret_sauce");
		loginpg.clickOnLogin();
		

	}

}
