package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;
import Utility.ReadData;

public class LoginPage extends TestBase {
	
	@FindBy(xpath="//div[@class='login_logo']") private WebElement titleLogo;  //xpath for title
	@FindBy(xpath="//div[@class='bot_column']") private WebElement botLogo;     //xpath for bot logo
	@FindBy(xpath="//input[@name='user-name']") private WebElement userNameTextbox;
	@FindBy(xpath="//input[@name='password']")  private WebElement passwordTextBox;
	@FindBy(xpath="//input[@name='login-button']") private WebElement loginButton;
	@FindBy(xpath = ("//a[@id='logout_sidebar_link']"))private WebElement logoutButton;

	public void enterUsername() throws Exception
	{
		//userNameTextbox.sendKeys("standard_user");
		userNameTextbox.sendKeys(ReadData.readPropertyFile("userName"));
		
	}
	public void enterPassword() throws Exception
	{
		//passwordTextBox.sendKeys("secret_sauce");
		passwordTextBox.sendKeys(ReadData.readPropertyFile("password"));
	}
	public void clickLoginButton()
	{
		loginButton.click();
	}
	public WebElement logoutBtn()
	{
		return this.logoutButton;
	}
	public boolean verifyLoginTest()
	{
		return logoutBtn().isEnabled();
	}
	
	
    public LoginPage()       // Constructor
   {
	   PageFactory.initElements(driver, this);
   }
	public String verifyTitle()
	{
		return driver.getTitle();
		
	}
	
	public String verifyUrl()
	{
		return driver.getCurrentUrl();
	}
	public boolean verifyTitleLogo()
	{
		 return titleLogo.isDisplayed();
	}
	public boolean verifyBotLogo()
	{
		return botLogo.isDisplayed();
	}
}
