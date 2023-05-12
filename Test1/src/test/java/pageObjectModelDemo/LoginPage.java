package pageObjectModelDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	//constructor
	public LoginPage(WebDriver d){
		driver = d;
	}
	
	By username = By.id("user-name");
	By password = By.id("password");
	By loginbtn = By.id("login-button");
	
	public void enterUsername(String Uname)
	{
		driver.findElement(username).sendKeys(Uname);
	}
	public void enterPassword(String pwd)
	{
		driver.findElement(password).sendKeys(pwd);
	}
	public void clickOnLogin()
	{
		driver.findElement(loginbtn).click();
	}
	}

