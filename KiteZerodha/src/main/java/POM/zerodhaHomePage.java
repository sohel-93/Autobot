package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class zerodhaHomePage {
	@FindBy(xpath="//a[@href='/dashboard']")private WebElement dashboard;
	@FindBy(xpath="//a[@href='/orders']")private WebElement orders;
	@FindBy(xpath="//a[@href='/holdings']")private WebElement holdings;
	@FindBy(xpath="//a[@href='/positions']")private WebElement positions;
	@FindBy(xpath="//a[@href='/funds']")private WebElement funds;
	@FindBy(xpath="//a[@href='/apps']")private WebElement apps;
	@FindBy(xpath="//span[@class='user-id']")private WebElement profile;
	@FindBy(xpath="//input[@type='text']")private WebElement search;
	
	public zerodhaHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void clickOnDashboard() {
		dashboard.click();
	}
	public void clickOnOrders() {
		orders.click();
	}
	public void clickOnHoldings() {
		holdings.click();
	}
	public void clickOnPositions() {
		positions.click();
	}
	public void clickOnFunds() {
		funds.click();
	}
	public void clickOnApps() {
		apps.click();
	}
	public void clickOnProfile() {
		profile.click();
	}
	public void enterSearchField(String stockName) {
		search.sendKeys(stockName);
	}

}
