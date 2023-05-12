package Test;

import org.testng.annotations.Test;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import POJO.Browserc;
import POM.ZerodhaPinPage;
import POM.zerodhaLogin;
import Utility.Parametrization1;

public class zerodhaPinPageTest {
	WebDriver driver;
	@BeforeMethod
	public void launchBrowser() {
		driver = Browserc.openBrowser("https://kite.zerodha.com/");
	}
	@Test
	public void loginToZerodhaWithPinTest() throws EncryptedDocumentException, IOException, InterruptedException {
		zerodhaLogin zerodha= new zerodhaLogin(driver);
		String username =Parametrization1.getData(0, 1);
		String password= Parametrization1.getData(1, 1);
		zerodha.enterUserID(username);
		System.out.println(password);
		zerodha.enterPassword(password);
		zerodha.clickOnLogin();
		ZerodhaPinPage zerodhapinpage =new ZerodhaPinPage(driver);
		String pin = Parametrization1.getData(2, 1);
		System.out.println(pin);
		zerodhapinpage.enterPin(pin);
		zerodhapinpage.clickOncontinue();
	}
	

}
