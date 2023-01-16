package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class CartPage extends TestBase {
	
	@FindBy(xpath="//button[@id='checkout']") private WebElement checkoutButton;
	@FindBy(xpath="//a[@class='shopping_cart_link']") private WebElement cartButton;
	
	public CartPage() throws Exception
	{
		PageFactory.initElements(driver, this);
		loginApp();
	}
	
	public WebElement verifycheckoutbutton()
	{
		return this.checkoutButton;
	}
	public void CartButtonClick()
	{
		cartButton.click();
	}
	

}
