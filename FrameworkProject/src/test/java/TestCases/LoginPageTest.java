package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;

public class LoginPageTest extends TestBase {

	LoginPage loginPage;
	@BeforeMethod
	public void setup() throws Exception
	{
		initalization();
		 loginPage=new LoginPage();
		
	}
	@Test
	public void verifyTitleTest()
	{
		String actualTitle=loginPage.verifyTitle();
		String expectedTitle="Swag Labs";
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	@Test( groups="sanity")
	public void verifyUrlTest()
	{
		String actualUrl=loginPage.verifyUrl();
		String expectedUrl="https://www.saucedemo.com/";
		//String expectedUrl="Url";
	    Assert.assertEquals(actualUrl, expectedUrl);
	}
	@Test(groups= {"sanity","Regression"})
	public void verifyTitleLogoTest()
	{
		 boolean actual =loginPage.verifyTitleLogo();
		 Assert.assertEquals(actual, true);
	}
	@Test(groups= {"sanity","Regretion"})
	public void verifyBotLogotest()
	{
		boolean actual = loginPage.verifyBotLogo();
		Assert.assertEquals(actual, true);
	}
	@Test(groups="sanity")
	public void verifyInventoryUrl() throws Exception
	{
//		login.enterUsername();
//		login.enterPassword();
//		login.clickLoginButton();
		loginApp();
		String actualUrl=loginPage.verifyUrl();
		String expectedUrl="https://www.saucedemo.com/inventory.html";
		//String expectedUrl="Url";
		Assert.assertEquals(actualUrl, expectedUrl);
	}
	@Test
	public void verifyLoginTest() throws Exception
	{
		loginApp();
		Thread.sleep(5000);
		 boolean actual = loginPage.logoutBtn().isEnabled();
		 Assert.assertTrue(actual, "Login was not successful");
	}
	
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}
	

}
