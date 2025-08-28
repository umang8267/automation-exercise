package Pagea;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SiginLoginPage extends Base {

	public SiginLoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//form[@action=\"/signup\"]//input[@name=\"email\"]")
	WebElement SignUp_EmailField;
	@FindBy(name = "name")
	WebElement SignUp_NameField;
	@FindBy(name = "password")
	WebElement Login_PwdField;
	@FindBy(xpath = "//form[@action=\"/login\"]//input[@name=\"email\"]")
	WebElement Login_EmailField;
	@FindBy(xpath = "//button[normalize-space()='Login']")
	private WebElement Loginbtn;

	@FindBy(xpath = "//button[normalize-space()='Signup']")
	private WebElement signupbtn;

	public void SignUpUser(String name, String Email) {
		SignUp_NameField.sendKeys(name);
		SignUp_EmailField.sendKeys(Email);
		signupbtn.click();

	}

	public void LoginUser(String Email, String pwd) {
		Login_EmailField.sendKeys(Email);
		Login_PwdField.sendKeys(pwd);
		Loginbtn.click();
	}
}
