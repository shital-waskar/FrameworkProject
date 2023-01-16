package TestCases;

import java.util.Collections;
import java.util.List;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.InventoryPage;

public class InventoryPageTest extends TestBase {
 
	InventoryPage inventory;
	@BeforeMethod
	public void setup() throws Exception
	{
       initalization();
       inventory=new InventoryPage();
	}
	@Test
	public void verifyPeekLogo() throws Exception
	{
		 boolean actual = inventory.verifyPeekLogo().isDisplayed();
		 Assert.assertTrue(actual);
		 Thread.sleep(5000);
	}
	@Test
	public void verifyProduct()
	{
		boolean actual = inventory.verifyProduct().isDisplayed();
		Assert.assertTrue(actual);
	}
	@Test
	public void verifyTwitterLogo() 
	{
		boolean actual = inventory.verifyTwitterLogo().isDisplayed();
		Assert.assertTrue(actual);
	}
	
	@Test
	public void verifyBackpack()
	{
	    inventory.verifybackpack().click();
		boolean actual = inventory.verifybackpack().isDisplayed();
		Assert.assertTrue(actual);
	}
	@Test
	public void verifyCart()
	{
		  
		  inventory.verifyCart().click();
		  boolean actual = inventory.verifyCart().isDisplayed();
		  String expectedUrl = "https://www.saucedemo.com/cart.html";
		  Assert.assertEquals(actual, expectedUrl);
	}
	@Test
	public void verifyAtoZsortOption()
	{
		List<String>actual=inventory.actualNameAccordingToDropdownOptionSelected("az");
		List<String>expected=inventory.alphabeticalOrderProductName();
		Assert.assertEquals(actual, expected);
		Reporter.log("order of item:"+ actual);
	}
	@Test
	public void verifyZtoAsortingOption()
	{
		List<String>actual=inventory.actualNameAccordingToDropdownOptionSelected("za");
		List<String>expected=inventory.alphabeticalOrderProductName();
		Assert.assertEquals(actual, expected);
		Reporter.log("order of item:"+actual);
	}
	@Test
	public void verifyLowToHighPriceSortOption()
	{
		List<Double>actual=inventory.actualPriceListAccordingToDropdownOptionSelected("lohi");
		List<Double>expected=inventory.asendingOrderPriceList();
		Assert.assertEquals(actual, expected);
		Reporter.log("order of item:"+actual);
	}
	@Test
	public void verifyHighToLowPriceSortOption()
	{
		List<Double>actual=inventory.actualPriceListAccordingToDropdownOptionSelected("hilo");
		List<Double>expected=inventory.asendingOrderPriceList();
		Collections.reverse(expected);
		Assert.assertEquals(actual, expected);
		Reporter.log("order of item"+actual);
	}
	@AfterMethod
	public void closeBrower()
	{
		driver.close();
	}
	
	
}
