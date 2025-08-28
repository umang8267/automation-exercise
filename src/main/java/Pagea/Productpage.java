package Pagea;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Productpage extends Base {

	public Productpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//h2[normalize-space()='All Products']")
	private WebElement allProductsText;
	
	public void chekingProductpage() {
		
	}

	  public String getErrorMessage() {
	        return allProductsText.getText();
	    }
}
