package Testcases;

import org.testng.annotations.Test;

import Basew.BaseTest;
import Pagea.SiginLoginPage;
//import Pagea.Base;
import Pagea.homepage;
import Pagea.signuppage;


public class UserSignUP extends BaseTest{
homepage homepage;
signuppage signUpPage;
SiginLoginPage signLoginpage;

@Test(groups = "reset")
public void userSignup() {
	homepage = new homepage(driver);
	signLoginpage = new SiginLoginPage(driver);
	signUpPage = new signuppage(driver);
	
	homepage.sign_login_page();
	
	signLoginpage.SignUpUser(prop.getProperty("name"), "tes223t@gmail.com");
	signUpPage.filling_Pwd("100200");
	signUpPage.SelectDay();
	signUpPage.SelectMonth();
	signUpPage.SelectYear();
	signUpPage.fillingAddressinfo();
	
}
}
