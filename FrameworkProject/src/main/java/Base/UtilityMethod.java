package Base;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UtilityMethod {
	
	
	// Utility methods edited at frameworkbranch

	
	private static final int WebElement = 0;
	private static final int List = 0;
	
	public static void selectClass(WebElement dropDown,String visibleValue)
	{
		Select dropdown = new Select(dropDown);
		dropdown.deselectByValue(visibleValue);
		
	}
	public static List<Double> sortingInteger(List<WebElement> prices)
	
	{
		List<WebElement>listOfAllPrices=prices;
		List<Double>listOfDoubleTypePrices=new ArrayList<Double>();
		for(WebElement ele:listOfAllPrices)
			
		{
			listOfDoubleTypePrices.add(Double.valueOf(ele.getText().replace("$", "")));
	
		}
		return listOfDoubleTypePrices;
	}
		public static List<String> sortingInteger1(List<WebElement> allTexts)
		{
			List<WebElement> listOfAllStringTexts=allTexts;
			List<String>list=new ArrayList<String>();
			for(org.openqa.selenium.WebElement ele:listOfAllStringTexts)
				list.add(ele.getText());
			 return list;

		}
		
		
		public static void expliciteWait(WebDriver driver,WebElement ele)
		{
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
			wait.until(ExpectedConditions.visibilityOf(ele));
			
		}
		
	}

	

