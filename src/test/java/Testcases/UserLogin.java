package Testcases;

import org.testng.annotations.Test;

import Basew.BaseTest;
import Pagea.SiginLoginPage;
import Pagea.homepage;

public class UserLogin extends BaseTest{
	homepage homepage;
	SiginLoginPage SignIn;
	@Test(groups = "Smoke")
	public void userAtLogin() {
		homepage.sign_login_page();
		SignIn.LoginUser(prop.getProperty("Email"),prop.getProperty("pass"));
		
		
	}
}
