package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POJO.Browserc;
import POM.zerodhaLogin;
import Utility.Parametrization1;

public class zerodhaLoginPageTest {
	WebDriver driver;
	@BeforeMethod
	public void Browser() {
		driver= Browserc.openBrowser("https://kite.zerodha.com/");
	}
	@Test
	public void loginWithValidCredentialsTest() throws EncryptedDocumentException, IOException, InterruptedException {
		zerodhaLogin zerodha= new zerodhaLogin(driver);
		String username =Parametrization1.getData(0, 1);
		System.out.println(username);
		String password= Parametrization1.getData(1, 1);
		System.out.println(password);
		zerodha.enterUserID(username);
		Thread.sleep(1000);
		zerodha.enterPassword(password);
		Thread.sleep(1000);
		zerodha.clickOnLogin();
	}
	@Test
	public void forgotPasswordLinkTest() {
		zerodhaLogin zerodha= new zerodhaLogin(driver);
		zerodha.clickOnForgot();
	}
	@Test
	public void signUpLinkTest() {
		zerodhaLogin zerodha= new zerodhaLogin(driver);
		zerodha.clickOnSignup();
	}
	

}
