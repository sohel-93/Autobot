package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ZerodhaPinPage {
	@FindBy(xpath ="//input[@type='password']")private WebElement pin;
	@FindBy(xpath="//button[@type='submit']")private WebElement submit;
	@FindBy(xpath="//a[text()='Forgot 2FA?']")private WebElement forgot;
	@FindBy(xpath="//a[text()=\"Don't have an account? Signup now!\"]")private WebElement signup;
	
	public ZerodhaPinPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void enterPin(String pinnumber) {
		WebDriverWait wait = new WebDriverWait(driver,tim);
		pin.sendKeys(pinnumber);
	}
	public void clickOncontinue() {
		submit.click();
	}
	public void clickOnforgot() {
		forgot.click();
	}
	public void clickOnsignup() {
		signup.click();
	}

}
