package datePicker;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePickerDemo {

	public static void main(String[] args) {
		
		// 01/08/2023
		String expectedDay = "8";
		String expectedMonth = "May";
		String expectedYear = "2022";
		
		
		//launch chrome browser
				WebDriverManager.chromedriver().setup();
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--remote-allow-origins=*");
				WebDriver driver = new ChromeDriver(options);
				
				//maximize browser
				driver.manage().window().maximize();
				
				//open url
				driver.get("https://jqueryui.com/datepicker/");
				
				//switch to iframe
				driver.switchTo().frame(0);
				
				//find datepicker web element 
				WebElement datepicker = driver.findElement(By.id("datepicker"));
				datepicker.click();
				
				while(true)
				{
					String calendarMonth =driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
					String calendarYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
					
					if(calendarMonth.equals(expectedMonth) && calendarYear.equals(expectedYear))
					{
						List<WebElement> dayslist =driver.findElements(By.xpath("//table/tbody/tr[2]/td"));
						
						for(WebElement e:dayslist)
						{
							String calendarDay = e.getText();
							if(calendarDay.equals(expectedDay))
							{
								e.click();
								break;
							}
						}
						break;
					}
					else
					{
						driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
						
					}
					
				}
				
				

	}

}
