package POJO;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browserc {
		
      public static WebDriver openBrowser (String url) {
    	  System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\shoel\\\\Downloads\\\\chromedriver_win32 (2)\\\\chromedriver.exe");
    	  WebDriver driver = new ChromeDriver();
    	  driver.get(url);
    	  driver.manage().window().maximize();
    	  driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
    	  return driver;
      }

	

}
