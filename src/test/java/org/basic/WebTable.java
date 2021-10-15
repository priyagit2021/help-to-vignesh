package org.basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AKSHARA PP\\eclipse-workspace\\MavenPractice\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(" http://demo.guru99.com/test/write-xpath-table.html");
		List<WebElement> rows = driver.findElements(By.tagName("tr"));
		
		for (int i = 0; i < rows.size(); i++) {
			WebElement rowdata = rows.get(i);
			String text = rowdata.getText();
			System.out.println(text);
		}
		List<WebElement> trows = driver.findElements(By.tagName("tr"));
		
		for (int i = 0; i < trows.size(); i++) {
			for (int j = 0; j < i; j++) {
				WebElement webElement = trows.get(j);
				String text = webElement.getText();
				System.out.println(text);
			}
		}
		
		System.out.println(trows.size());
	
	}
	

	
}
