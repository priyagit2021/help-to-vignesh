package org.practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.extensions.XSSFCellBorder;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	 static WebDriver driver;

	public WebDriver launchBrowser() {
		try {
			//System.setProperty("webdriver.chrome.driver",
					//"C:\\Users\\AKSHARA PP\\eclipse-workspace\\MavenPractice\\Drivers\\chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return driver;
	}

	public void launchUrl(String url) {
		try {
			driver.get(url);
			driver.manage().window().maximize();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
	
	public void type(WebElement element, String value) {
		try {
			element.sendKeys(value);
		}

		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void btnClick(WebElement element) {
		try {
			element.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());

		}
	}

	public void selectOpt(WebElement element, String value) {
		try {
			Select s = new Select(element);
			s.selectByVisibleText(value);
		} catch (Exception e) {
			System.out.println(e.getMessage());

		}

	}

	public String getpageText(WebElement element) {
		String text = null;
		try {
			text = element.getAttribute("value");

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return text;

	}

	public void jsType(WebElement element, String data) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('value','" + data + "')", element);
		}

		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void jsTypeTextArea(WebElement element, String data) {
		try {			
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].value='" + data + "'", element);
		}

		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void jsClick(WebElement element) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;

			js.executeScript("arguments[0].click()", element);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public String jsTypeget(WebElement element) {
		String name1 = null;

		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			name1 = (String) js.executeScript("return arguments[0].getAttribute('value')", element);

		}

		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return name1;
	}

	public void quitBrowser() {
		try {
			driver.quit();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public String excelDataAddactin(String excelLoc,String sName,int rNo, int cNo ) throws IOException {
		String value=null;
		File f = new File(excelLoc);
		FileInputStream fin = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fin);
		Sheet s = w.getSheet(sName);
		Row r = s.getRow(rNo);
		Cell c = r.getCell(cNo);
		int type = c.getCellType();
		if(type==1){
			 value = c.getStringCellValue();
			
		}
		else if(type==0)
		{
			if(DateUtil.isCellDateFormatted(c))
			{
				Date date = c.getDateCellValue();
				SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-YYYY");
				 value = sdf.format(date);
			
			}
			else
			{
				double d = c.getNumericCellValue();
				long l=(long)d;
				 value = String.valueOf(l);
			}
		}
		return value;
		
		
		 
		
		
		
		

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
