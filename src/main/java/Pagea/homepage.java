package Pagea;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class homepage extends Base{
	private WebDriverWait wait;
	private WebDriver driver;

	public homepage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath ="//ul[@class=\"nav navbar-nav\"]//li[2]")
	WebElement productPageBtn;
	@FindBy(xpath ="//ul[@class=\"nav navbar-nav\"]//li[3]")
	WebElement CartPageBtn;
	@FindBy(xpath ="//ul[@class=\"nav navbar-nav\"]//li[4]")
	WebElement Sign_login_PageBtn;
	
	public void sign_login_page() {
		Sign_login_PageBtn.click();
	}
	public void clickingProdcutLink() {
		productPageBtn.click();
	}
	

}
