package pageObjectModelDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage2 {
	
	WebDriver driver;
	//constructor
	public LoginPage2(WebDriver d){
		driver = d;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="user-name")
	private WebElement username;
	@FindBy(id="password")
	private WebElement password;
	@FindBy(id="login-button")
	private WebElement loginbtn;
	
	public void enterUsername(String Uname)
	{
		username.sendKeys(Uname);
	}
	public void enterPassword(String pwd)
	{
		password.sendKeys(pwd);
	}
	public void clickOnLogin()
	{
		loginbtn.click();
	}

}
