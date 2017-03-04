package pageObjectModel;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;


public class Home_Page {
	private static WebElement element = null;
	
	 public static WebElement lnk_Hotels(WebDriver driver){
		 
		    element = driver.findElement(By.linkText("Hotels"));
		 
		    return element;
		 
		    }
		 
		 public static WebElement lnk_Cars(WebDriver driver){
		 
		    element = driver.findElement(By.linkText("Cars"));
		 
		 return element;
		 
		    }
		 public static WebElement lnk_Flights(WebDriver driver){
			 
			    element = driver.findElement(By.linkText("Flights"));
			 
			 return element;
			 
			    }
		 public static WebElement lnk_Vacations(WebDriver driver){
			 
			    element = driver.findElement(By.linkText("Vacations"));
			 
			 return element;
			 
			    }
}
