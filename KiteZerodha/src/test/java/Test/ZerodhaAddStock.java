package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POJO.Browserc;
import POM.ZerodhaAddStockPom;
import POM.ZerodhaPinPage;
import POM.zerodhaLogin;
import Utility.Parametrization1;

public class ZerodhaAddStock {
	WebDriver driver;
	@BeforeMethod
	public void LaunchBrowser() {
		driver = Browserc.openBrowser("https://kite.zerodha.com/");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

	}
	@Test
	public void addAnyStockInWatchList() throws EncryptedDocumentException, IOException, InterruptedException {
		
		zerodhaLogin zerodha= new zerodhaLogin(driver);
		String username =Parametrization1.getData(0, 1);
		String password= Parametrization1.getData(1, 1);
		zerodha.enterUserID(username);
		System.out.println(password);
		zerodha.enterPassword(password);
		zerodha.clickOnLogin();
		

		
		String pin = Parametrization1.getData(2, 1);
		System.out.println(pin);
		
		ZerodhaPinPage zerodhapinpage =new ZerodhaPinPage(driver);
		zerodhapinpage.enterPin(pin);
		zerodhapinpage.clickOncontinue();
		
		
		ZerodhaAddStockPom addStock = new ZerodhaAddStockPom(driver);
		String stockname =Parametrization1.getData(3, 1);
		System.out.println(stockname);
		addStock.SearchStocks(stockname);
		addStock.clickOnAnyStock();
	}

}
