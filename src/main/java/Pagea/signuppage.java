package Pagea;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class signuppage extends Base {

	public signuppage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(id = "id_gender1")
	private WebElement selectgender;
	@FindBy(id = "password")
	private WebElement passwordField;
	@FindBy(xpath = "//select[@id='days']")
	private WebElement day;
	@FindBy(xpath = "//select[@id='months']")
	private WebElement month;
	@FindBy(xpath = "//select[@id='years']")
	private WebElement year;
	@FindBy(xpath = "//input[@id='newsletter']")
	private WebElement signUpForOurNewsletter;
	@FindBy(xpath = "//input[@id='optin']")
	private WebElement receiveSpecialOffersFrom;
	@FindBy(xpath = "//input[@id='first_name']")
	private WebElement firstName;
	@FindBy(xpath = "//input[@id='last_name']")
	private WebElement lastName;
	@FindBy(xpath = "//input[@id='address1']")
	private WebElement address;
	@FindBy(xpath = "//input[@id='state']")
	private WebElement stateField;
	@FindBy(xpath = "//input[@id='city']")
	private WebElement city;
	@FindBy(xpath = "//input[@id='zipcode']")
	private WebElement zipcode;
	@FindBy(xpath = "//input[@id='mobile_number']")
	private WebElement mobileNumber;
	@FindBy(xpath = "//button[normalize-space()='Create Account']")
	private WebElement createAccount;

	public void filling_Pwd(String pwd) {
		selectgender.click();
		passwordField.sendKeys(pwd);
	}

	public void SelectDay() {
		Select drop = new Select(day);
		drop.selectByVisibleText("31");
	}

	public void SelectMonth() {
		Select drop = new Select(month);
		drop.selectByVisibleText("August");
	}

	public void SelectYear() {
		scrollToElement(year);
		Select drop = new Select(year);
		drop.selectByVisibleText("2000");
	}


	public void fillingAddressinfo() {
		signUpForOurNewsletter.click();
		receiveSpecialOffersFrom.click();
		firstName.sendKeys("Fname");
		lastName.sendKeys("Fname");
		actions.moveToElement(city);
		address.sendKeys("Fname");
		stateField.sendKeys("State");
		city.sendKeys("city");
		mobileNumber.sendKeys("mobile");
		createAccount.click();
	}


}
