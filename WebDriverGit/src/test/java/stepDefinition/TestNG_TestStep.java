package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjectModel.Cars;
import pageObjectModel.Home_Page;
import pageObjectModel.Hotels;
public class TestNG_TestStep {

	private static WebDriver driver = null;
	@Given("^Home page has cars link$")
	public void home_page_has_cars_link() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Drivers\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String url="http://hotwire.com";
		//navigate to google homepage
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	    
	}

	@When("^Cars Link is clicked$")
	public void cars_Link_is_clicked() throws Throwable {
		//Call the pom method to click on cars link
		Home_Page.lnk_Cars(driver).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   
	}

	@Then("^Verify if we land on cars page$")
	public void verify_if_we_land_on_cars_page() throws Throwable {
		//verify the location by calling the pom method for start locations
		Assert.assertTrue(Cars.edit_StartLocations (driver).isDisplayed());
		Reporter.log("Successfully Verified the Cars page");
	}
	@And("^Exit the browser$")
	public void exit_the_browser() throws Throwable {
		//close the browser
		driver.quit();
	 }
	
	@When("^Hotels Link is clicked$")
	public void hotels_Link_is_clicked() throws Throwable {
		//Call the pom method to click on hotels link
		Home_Page.lnk_Hotels(driver).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   
	}
	
	@Then("^Verify if we land on Hotels page$")
	public void verify_if_we_land_on_Hotels_page() throws Throwable {
		Thread.sleep(10000);
		//verify the location by calling the pom method for destinations
		Assert.assertTrue(Hotels.edit_Destination(driver).isDisplayed());
		Reporter.log("Successfully Verified the hotels page");
	}

}
