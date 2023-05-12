package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class fbLoginPage {
	@FindBy(xpath="//input[@id='email']")private WebElement email;//all the data members are private
	@FindBy(xpath="//input[@id='pass']")private WebElement password;
	@FindBy(xpath="//button[@name='login']")private WebElement login;
	@FindBy(xpath="//a[text()='Forgotten password?']")private WebElement forgot;
	@FindBy(xpath="//a[@data-testid='open-registration-form-button']")private WebElement createaccount;
	
	public fbLoginPage(WebDriver driver) {//constructor is always public
		PageFactory.initElements(driver,this);//initelements find the element with the help of @FindBy annotation
	}
	public void enterEmail(String user) {//all the member functions are public
		email.sendKeys(user);
	}
	public void enterPassword(String pass) {
		password.sendKeys(pass);
	}
	public void clickOnLogin() {
		login.click();
	}
	public void clickOnForgotPass() {
		forgot.click();
	}
	public void clickOnCreateAcc() {
		createaccount.click();
	}
	

}
