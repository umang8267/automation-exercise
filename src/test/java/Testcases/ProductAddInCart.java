package Testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import Basew.BaseTest;
import Pagea.Productpage;
import Pagea.homepage;

public class ProductAddInCart extends BaseTest {
	homepage homepage;
	Productpage productpage;

	@Test(groups = "Smoke")
	public void ProductPagehasAllProduct() {
		homepage = new homepage(driver);
		productpage = new Productpage(driver);
		homepage.clickingProdcutLink();

		String actualText = productpage.getErrorMessage();

		Assert.assertEquals(actualText, "ALL PRODUCTS");

	}

}
