package datePicker;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePickerDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 01/08/2023
				String expectedDay = "8";
				String expectedMonthYear = "May 2023";
				
				
				
				//launch chrome browser
						WebDriverManager.chromedriver().setup();
						ChromeOptions options = new ChromeOptions();
						options.addArguments("--remote-allow-origins=*");
						WebDriver driver = new ChromeDriver(options);
						
						//maximize browser
						driver.manage().window().maximize();
						
						//open url
						driver.get("https://www.redbus.in/");
						
						//find datepicker web element 
						WebElement datepicker = driver.findElement(By.id("onward_cal"));
						datepicker.click();
						
						while(true)
						{
							String calendarMonthYear =driver.findElement(By.xpath("//td[@colspan='5']")).getText();
						
							
							if(calendarMonthYear.equals(expectedMonthYear))
							{
								List<WebElement> dayslist =driver.findElements(By.xpath("//table/tbody/tr[4]/td"));
								
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
								driver.findElement(By.xpath("//li[@class='rb-next active']")).click();
								
							}
							
						}
						
						

			}

	}


