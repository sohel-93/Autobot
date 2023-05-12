package Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import POJO.Browserc;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = Browserc.openBrowser("https://demo.guru99.com/test/web-table-element.php");
		//WebElement stock = driver.findElement(By.xpath("//table/tbody/tr[14]/td[4]"));
		//String name = stock.getText();
		//System.out.println(name);
		
		List<WebElement> column = driver.findElements(By.xpath("//table/thead/tr/th"));
		int columnsize = column.size();
		
		List<WebElement> row = driver.findElements(By.xpath("//table/tbody/tr"));
		int rowsize = row.size();
		
		List<WebElement> currentprice =driver.findElements(By.xpath("//table/tbody/tr/td[4]"));
		double max =0;
		for(int i=0;i<currentprice.size();i++) {
			WebElement price = currentprice.get(i);
			String currentpricevalue =price.getText();
			System.out.println(currentpricevalue);	
			double value = Double.parseDouble(currentpricevalue);
			if(value>max) {
				max= value;
			}
		}
		System.out.println(max);

	}

}
