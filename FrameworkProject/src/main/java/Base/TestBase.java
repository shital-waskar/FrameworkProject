package Base;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.LoginPage;
import Utility.ReadData;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	public static WebDriver driver;
	
	public void initalization() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(ReadData.readPropertyFile("Url"));
		driver.get("https://www.saucedemo.com/");
		
	}
	public void loginApp() throws Exception 
	{
		LoginPage login =new LoginPage();
		login.enterUsername();
		login.enterPassword();
		login.clickLoginButton();
	}
	
	
	
	

}
