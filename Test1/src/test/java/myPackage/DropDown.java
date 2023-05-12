package myPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		//open browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shoel\\Automation\\KiteZerodha\\src\\main\\resources\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//open url
		driver.get("https://www.opencart.com/index.php?route=account/register");
		WebElement dropdown = driver.findElement(By.id("input-country"));
		Select select = new Select(dropdown);
		//select.selectByVisibleText("Japan");
		//select.selectByValue("98");
		select.selectByIndex(10);
		
		if(select.isMultiple()) {
			System.out.println("dropdown is multiple");
		}
		else {
			System.out.println("dropdown is not multiple");
		}
		List<WebElement> allDropdownOptions = select.getOptions();
		System.out.println("Total options:"+ allDropdownOptions.size());
		for(WebElement el : allDropdownOptions) {
			System.out.println(el.getText());
		}
		driver.close();
		

	}

}
