package pageObjectModel;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;


public class Hotels {
	private static WebElement element = null;
//destination
		public static WebElement edit_Destination(WebDriver driver){
		 
	    element = driver.findElement(By.name("destination"));
	 
	    return element;
	 
	    }
	
}
