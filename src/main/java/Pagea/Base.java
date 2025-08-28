package Pagea;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {
	protected WebDriver driver;
	protected WebDriverWait wt ;
	protected Actions actions;
	public Base(WebDriver driver) {
		this.driver=driver;
		this.actions =new Actions(driver);
		PageFactory.initElements(driver, this);
	}
//	new WebDriverWait(driver, Duration.ofSeconds(20));
	 public void scrollToElement(WebElement element) {
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].scrollIntoView();", element);
	    }

	 
	
	

}
