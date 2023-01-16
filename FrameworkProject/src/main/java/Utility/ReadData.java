package Utility;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadData {

	

	public static String readPropertyFile(String value) throws Exception
	{
		Properties p = new Properties();
		String address="C:\\Users\\Yogesh\\eclipse-workspace\\FrameworkProject\\TestData\\config.Properties";
		FileInputStream file= new FileInputStream(address);
		p.load(file);
		return p.getProperty(value);
	}
	
	public static String readExcelFile(int row,int col) throws Exception 
	{
		String address="C:\\Users\\Yogesh\\eclipse-workspace\\Selenium\\InputData\\readExcelData.xlsx";
		FileInputStream file= new FileInputStream(address);
		Sheet excel = WorkbookFactory.create(file).getSheet("Sheet");
		return null;
		
	}

}
