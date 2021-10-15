package org.practice;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;

import javax.swing.plaf.FileChooserUI;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BaseClassAz {
	static WebDriver driver;

	public WebDriver launchBrowser() {
		try {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\AKSHARA PP\\eclipse-workspace\\MavenPractice\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();

		} 
		catch (Exception e) {
			System.out.println(e.getMessage());
		}return driver;
	}

	public void launchUrl(String url) {
		try {
		driver.get(url);
		driver.manage().window().maximize();
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}

	public String getTitle() {
		String title=null;
		try {
		  title = driver.getTitle();

	}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		return title;
	}

	public String getUrl() {
		String currentUrl=null;
		try {
		currentUrl = driver.getCurrentUrl();

	}catch(Exception e) {
		System.out.println(e.getMessage());
	}
		return currentUrl;
		}

	//------------------SENDKEYS-----------------
	public void type(WebElement element,String value) {
		try {
			element.sendKeys(value);
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
		//------------CLICK------------------
	public void click(WebElement element) {
		try {
			element.click();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		
		}
	}
	//-------------CLOSE BROWSER--------------
	
	public void closeBrowser() {
		try {
			driver.close();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}
	//------------QUIT BROWSER--------------
	
	public void quitBrowser() {
		try {
			driver.quit();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}
		//-----------GET TEXT------------------------
	public String getText(WebElement element) {
		String text=null;
		try {
		text = element.getText();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return text;
	}
	//----------GET ATTRIBUTE----------
	
	public String getAttribute(WebElement element) {
		String attribute=null;
		try {
			 attribute = element.getAttribute("value");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return attribute;
	}
	
	//--------------------ACTIONS-----------------
	
	public void actMove(WebElement element) {
		try {
			Actions act= new Actions(driver);
			act.moveToElement(element).perform();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public void actDragDrop(WebElement source,WebElement target) {
		try {
			Actions act= new Actions(driver);
			act.dragAndDrop(source, target).perform();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public void actDoubleclk(WebElement element) {
		try {
			Actions act= new Actions(driver);
			act.doubleClick(element).perform();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
		
	public void actContextclk(WebElement element) {
		try {
			Actions act= new Actions(driver);
			act.contextClick(element).perform();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
		
		
		/*private void roboPress() {
			try {
				Robot r= new Robot();
				r.keyPress(KeyEvent.);
				
			}

		}*/
	//-----------------ALERT------------------
		
	public void alertaccept() {
		try {
			Alert alert= driver.switchTo().alert();
			alert.accept();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		}
	public void alertdismiss() {
		try {
			Alert alert= driver.switchTo().alert();
			alert.dismiss();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		}
	//-----------sCREENsHOT------------
	
	public void screenShot(String file) {

		try {
			TakesScreenshot take=(TakesScreenshot)driver;
			File srcFile = take.getScreenshotAs(OutputType.FILE);
			System.out.println(srcFile);
			
			File destFile = new File(file);
			FileUtils.copyFile(srcFile, destFile);
			
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	//-------------FRAMES---------------
		
	public void framesindex(int index) {
		try {
			driver.switchTo().frame(index);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}

		}
	public void frames(WebElement element) {
		try {
			driver.switchTo().frame(element);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}

		}
	public void frameNameorId(String nameOrId) {
		try {
			driver.switchTo().frame(nameOrId);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}

		}
	public void parentFrame(String nameOrId) {
		try {
			driver.switchTo().parentFrame();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}

		}
	public void mainFrame(String nameOrId) {
		try {
			driver.switchTo().defaultContent();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}

		}
		
	
		

	}
	
	
	
	
	
	
	
	

