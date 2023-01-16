package Pages;

import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;
import Base.UtilityMethod;

public class InventoryPage extends TestBase {
	
	private static final WebElement dropDown = null;
	private static final String name = null;
	private static final String VisibleValue = null;
	@FindBy(xpath=("//div[@class='peek']")) private WebElement peeklogo;
	@FindBy(xpath="//span[@class='title']") private WebElement product;
	@FindBy(xpath="//a[text()='Twitter']") private WebElement twitterLogo;
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']") private WebElement addToCartBuuton;
	@FindBy(xpath="//div[text()='Sauce Labs Backpack']") private WebElement backpack;
	@FindBy(xpath="//a[@class='shopping_cart_link']") private WebElement cart;
	@FindBy(xpath="//div[text()='Sauce Labs Bike Light']") private WebElement sauceLabeBagePack;
	//@ FindBy(xpath="//button[@id='add-to-cart-sauce-labs-bike-light']")private WebElement addToCartButton2;
	@FindBy(xpath="//div[text()='Sauce Labs Bolt T-Shirt']")private WebElement TShirt;
	//@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']")private WebElement addToCartButton3;
	@FindBy(xpath="//div[text()='Sauce Labs Fleece Jacket']")private WebElement fleeceJacket;
	//@FindBy(id="//button[@id='add-to-cart-sauce-labs-fleece-jacket']")private WebElement addToCartButton4;
	@FindBy(xpath="//div[text()='Sauce Labs Onesie']") private WebElement onesie;
	//@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-onesie']")private WebElement addToCartButton5;
	@FindBy(xpath="//select[@class='product_sort_container']") private WebElement dropDownBox;
	@FindBy(className="inventory_item_price")private WebElement prices;
	
	
	public InventoryPage() throws Exception
	{
		PageFactory.initElements(driver, this);
//		LoginPage login =new LoginPage();
//		login.enterUsername()
//		login.enterPassword();
//		login.clickLoginButton();
		loginApp();
	}
	public WebElement verifyPeekLogo() 
	{
		return this.peeklogo;
	}
	public WebElement verifyProduct()
	{
		return this.product;
	}
	public WebElement verifyTwitterLogo()
	{
		return this.twitterLogo;
	}
	public WebElement verifyAddToCartButton()
	{
		return this.addToCartBuuton;
	}
	public WebElement verifybackpack()
	{
		return this.backpack;
	}
	public WebElement verifyCart()
	{
		return this.cart;
	}
	
	public List<Double> asendingOrderPriceList()
	// To get all product prices from webpage
	{
		List<Double>list=UtilityMethod.sortingInteger(prices);
	    Collections.sort(list);
		return list;
	}
	public List<Double>actualPriceListAccordingToDropdownOptionSelected(List<WebElement> price)
	{
	    UtilityMethod.selectClass(dropDown, VisibleValue);
	    List<Double>list=UtilityMethod.sortingInteger(price);
	    return list;
	}
	public List<String>alphabeticalOrderProductName()
	{
		List<String>list=UtilityMethod.sortingInteger(name);
		Collections.sort(list);
		return list;
	}
	public List<String>actualNameAccordingToDropdownOptionSelected(String visibleValue)
	{
		UtilityMethod.selectClass(dropDown, visibleValue);
		List<String>list=UtilityMethod.sortingInteger(name);
		Collections.sort(list);
		return list;
		
	}
}
