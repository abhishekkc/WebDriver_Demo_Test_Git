package pageObjectModel;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;


public class Cars {
	private static WebElement element = null;
//destination
		public static WebElement edit_StartLocations(WebDriver driver){
		 
	    element = driver.findElement(By.name("startLocation"));
	 
	    return element;
	 
	    }
		
	
}
