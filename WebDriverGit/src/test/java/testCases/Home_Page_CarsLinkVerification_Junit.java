package testCases;

import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//Import the POM class
import pageObjectModel.Home_Page;
import pageObjectModel.Hotels;
import pageObjectModel.Cars;
//Import the Utility class
import appUtility.webPage;


public class Home_Page_CarsLinkVerification_Junit {
	private static WebDriver driver = null;
	 
	 @Before
		public void startBrowser() throws Exception {
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Drivers\\chromedriver\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			String url="http://hotwire.com";
			//navigate to google homepage
			driver.get(url);
			driver.manage().window().maximize();
		}
	 
	 @After
		public void closeBrowser() throws Exception {
		driver.quit();
		}
		@Test
		public void test() {
			//Call the pom method to click on cars link
			Home_Page.lnk_Cars(driver).click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			//verify the location by calling the pom method for locations
			Assert.assertTrue(Cars.edit_StartLocations(driver).isDisplayed());
	
			//navigate back to home page using the apputility
			webPage.Nvg_Page(driver,"http://hotwire.com");
		}
}
