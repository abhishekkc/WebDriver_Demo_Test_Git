package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import pageObjectModel.Cars;
//Import the POM class
import pageObjectModel.Home_Page;
import pageObjectModel.Hotels;
//Import the Utility class
import appUtility.webPage;

public class Home_Page_HotelsLinkVerification_POM {
	private static WebDriver driver = null;	
	public static void main(String a[]){
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Drivers\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String url="http://hotwire.com";
		//navigate to google homepage
		driver.get(url);
		driver.manage().window().maximize();
		//Call the pom method to click on hotels link
		Home_Page.lnk_Hotels(driver).click();
		//verify the location by calling the pom method for destinations
		Assert.assertTrue(Hotels.edit_Destination(driver).isDisplayed());
		//navigate back to home page using the apputility
		webPage.Nvg_Page(driver,"http://hotwire.com");
	}
	
}