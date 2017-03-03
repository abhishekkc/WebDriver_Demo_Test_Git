package appUtility;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

public class webPage {
	private static WebElement element = null;
	
	 public static void Nvg_Page(WebDriver driver,String URL){
		 
		    driver.get(URL);
		    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		    }
}
