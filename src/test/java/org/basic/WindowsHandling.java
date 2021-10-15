package org.basic;

import java.awt.AWTException;
import java.awt.List;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowsHandling {
public static void main(String[] args) throws AWTException, InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\AKSHARA PP\\eclipse-workspace\\MavenPractice\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://www.greenstechnologys.com/");
	
	//WebElement element = driver.findElement(By.id("twotabsearchtextbox"));
	//element.sendKeys("iphone x",Keys.ENTER);
	
	Actions a = new Actions(driver);
	WebElement element2 = driver.findElement(By.xpath("//a[text()='CONTACT US']"));
	
	a.contextClick(element2).perform();
	
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_DOWN);
	//r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_DOWN);
	//r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_ENTER);
	
	
	
	//System.out.println(driver.getWindowHandle());
	
	Thread.sleep(5000);
	Set<String> windowHandles = driver.getWindowHandles();
	System.out.println(windowHandles);
	System.out.println(windowHandles.size());
	
	
	
	java.util.List<String>  l= new ArrayList<String>();
	l.addAll(windowHandles);
	driver.switchTo().window(l.get(1));
	
	driver.findElement(By.xpath("(//a[text()='Blog'])[1]")).click();
	
	
	
	
	
	
}
}
