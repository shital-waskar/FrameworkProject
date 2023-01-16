package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.CartPage;

public class CartPageTest extends TestBase {
	CartPage cart;
	@BeforeMethod
	public void setup() throws Exception
	{
		initalization();
		cart=new CartPage();
	}
	
	@Test
	public void verifyCheckoutButton()
	{
	     cart.CartButtonClick();
		//cart.verifycheckoutbutton().click();
		boolean actual = cart.verifycheckoutbutton().isDisplayed();
		//String expectedUrl = "https://www.saucedemo.com/checkout-step-one.html";
		Assert.assertTrue(actual);
	}
	
	@AfterMethod
	public void closeBrowser() 
	{
		driver.close();
	}
	

}
