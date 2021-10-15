 package org.jut;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class SampleJunit {
	static WebDriver driver;
	@BeforeClass
	public static void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AKSHARA PP\\eclipse-workspace\\MavenPractice\\Drivers\\chromedriver.exe");
		 driver= new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		String currentUrl = driver.getCurrentUrl();
		boolean contains = currentUrl.contains("facebook");
		System.out.println(contains);
		Assert.assertTrue("verify title", contains);
		

	}
	@Before
	public void before() {
		Date d=new Date();
		System.out.println(d);
	}
	@Test
	public void tc1() {
		WebElement findElement = driver.findElement(By.id("email"));
		findElement.sendKeys("greens");
		WebElement findElement2 = driver.findElement(By.id("pass"));
		findElement2.sendKeys("pass");
		Assert.assertEquals("verify passwrod", "pas", "pass");
		WebElement findElement3 = driver.findElement(By.name("login"));
		findElement3.click();
	}
	@After
	public void after() {
		Date d=new Date();
		System.out.println(d);

	}
	@AfterClass
	public static void afterClass() {
		driver.quit();
	

	}

}
