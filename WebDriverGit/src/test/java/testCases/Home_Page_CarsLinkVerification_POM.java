package testCases;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;

//Import the POM class
import pageObjectModel.Home_Page;
import pageObjectModel.Cars;
//Import the Utility class
import appUtility.webPage;

public class Home_Page_CarsLinkVerification_POM {
	private static WebDriver driver=null;
	public static void main(String a[]){
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Drivers\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String url="http://hotwire.com";
		//navigate to google homepage
		driver.get(url);
		driver.manage().window().maximize();
		//Call the pom method to click on cars link
		Home_Page.lnk_Cars(driver).click();
		//verify the location by calling the pom method for start locations
		Assert.assertTrue(Cars.edit_StartLocations (driver).isDisplayed());
		//navigate back to home page using the apputility
		webPage.Nvg_Page(driver,"http://hotwire.com");
		
		
		
	}
}
