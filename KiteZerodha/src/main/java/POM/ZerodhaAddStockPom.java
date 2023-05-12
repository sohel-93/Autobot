package POM;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaAddStockPom {
	@FindBy(xpath="//input[@placeholder='Search eg: infy bse, nifty fut, nifty weekly, gold mcx']") private WebElement Searchstock;
	@FindBy(xpath="//span[@class='tradingsymbol']")  private List<WebElement> anystock;
	@FindBy(xpath="//button[@data-balloon=\"Buy\"]") private WebElement togglebuy;
	@FindBy(xpath="//button[@data-balloon=\"Sell\"]") private WebElement togglesell;
	WebDriver driver;
	public ZerodhaAddStockPom(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void SearchStocks(String stockname) {
		Searchstock.sendKeys(stockname);
	}
	public void clickOnAnyStock() {
		int count = anystock.size();
		for(int i=0;i<count;i++) {
			WebElement stockName = anystock.get(i);
			String text = stockName.getText();
			System.out.println(text);
			if(text.equals("TATAMOTORS AUG FUT")) {
				Actions act = new Actions(driver);
				act.moveToElement(stockName);
				act.build().perform();
				stockName.click();
				break;
				
			}
		}
		
	}
	

}
