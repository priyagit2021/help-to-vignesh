package org.practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Sleeper;

public class SamplePom {
	public static void main(String[] args) throws IOException, InterruptedException {
		
		BaseClass b=new BaseClass();
		//WebDriver driver = b.launchBrowser();
		b.launchBrowser();
		b.launchUrl("https://www.adactinhotelapp.com");
		 
		Pom pm=new Pom();
		
		b.jsType(pm.getUsername(), b.excelDataAddactin("C:\\Users\\AKSHARA PP\\eclipse-workspace\\MavenPractice\\Excel Data\\Book1.xlsx", "Data", 0	, 0));
		b.jsType(pm.getPassword(), b.excelDataAddactin("C:\\Users\\AKSHARA PP\\eclipse-workspace\\MavenPractice\\Excel Data\\Book1.xlsx", "Data", 1, 0));
 		b.jsClick(pm.getBtnLogin());
		
		Pom1 pg1=new Pom1();
		
		b.selectOpt(pg1.getLocation(),b.excelDataAddactin("C:\\Users\\AKSHARA PP\\eclipse-workspace\\MavenPractice\\Excel Data\\Book1.xlsx", "Data", 2, 0));
		b.selectOpt(pg1.getHotels(), b.excelDataAddactin("C:\\Users\\AKSHARA PP\\eclipse-workspace\\MavenPractice\\Excel Data\\Book1.xlsx", "Data", 3, 0));
		b.selectOpt(pg1.getRoomtype(), b.excelDataAddactin("C:\\Users\\AKSHARA PP\\eclipse-workspace\\MavenPractice\\Excel Data\\Book1.xlsx", "Data", 4, 0));
		b.selectOpt(pg1.getRoomnos(), b.excelDataAddactin("C:\\Users\\AKSHARA PP\\eclipse-workspace\\MavenPractice\\Excel Data\\Book1.xlsx", "Data", 5, 0));
		b.jsType(pg1.getPickin(), b.excelDataAddactin("C:\\Users\\AKSHARA PP\\eclipse-workspace\\MavenPractice\\Excel Data\\Book1.xlsx", "Data", 6, 0));
		b.jsType(pg1.getPickout(), b.excelDataAddactin("C:\\Users\\AKSHARA PP\\eclipse-workspace\\MavenPractice\\Excel Data\\Book1.xlsx", "Data", 7, 0));
		b.selectOpt(pg1.getAdultroom(), b.excelDataAddactin("C:\\Users\\AKSHARA PP\\eclipse-workspace\\MavenPractice\\Excel Data\\Book1.xlsx", "Data", 8, 0));
		b.selectOpt(pg1.getChildroom(), b.excelDataAddactin("C:\\Users\\AKSHARA PP\\eclipse-workspace\\MavenPractice\\Excel Data\\Book1.xlsx", "Data", 9, 0));
		b.jsClick(pg1.getBtnsubmit());
		
		Pom2 pg2=new Pom2();
		b.jsClick(pg2.getRadiobtn());
		b.jsClick(pg2.getContinuebtn());
		
		Pom3 pg3= new Pom3();
		b.jsType(pg3.getFirstname(), b.excelDataAddactin("C:\\Users\\AKSHARA PP\\eclipse-workspace\\MavenPractice\\Excel Data\\Book1.xlsx", "Data", 0, 1));
		b.jsType(pg3.getLastname(),b.excelDataAddactin("C:\\Users\\AKSHARA PP\\eclipse-workspace\\MavenPractice\\Excel Data\\Book1.xlsx", "Data", 1, 1));
		b.jsTypeTextArea(pg3.getAddress(), b.excelDataAddactin("C:\\Users\\AKSHARA PP\\eclipse-workspace\\MavenPractice\\Excel Data\\Book1.xlsx", "Data", 2, 1));
		b.jsType(pg3.getCcnum(), b.excelDataAddactin("C:\\Users\\AKSHARA PP\\eclipse-workspace\\MavenPractice\\Excel Data\\Book1.xlsx", "Data", 3, 1));
	    b.selectOpt(pg3.getCctype(), b.excelDataAddactin("C:\\Users\\AKSHARA PP\\eclipse-workspace\\MavenPractice\\Excel Data\\Book1.xlsx", "Data", 4, 1));
	    b.selectOpt(pg3.getCcexpmonth(), b.excelDataAddactin("C:\\Users\\AKSHARA PP\\eclipse-workspace\\MavenPractice\\Excel Data\\Book1.xlsx", "Data", 5, 1));
	    b.selectOpt(pg3.getCcexpyear(), b.excelDataAddactin("C:\\Users\\AKSHARA PP\\eclipse-workspace\\MavenPractice\\Excel Data\\Book1.xlsx", "Data", 6, 1));
	    b.jsType(pg3.getCccvv(), b.excelDataAddactin("C:\\Users\\AKSHARA PP\\eclipse-workspace\\MavenPractice\\Excel Data\\Book1.xlsx", "Data", 7, 1));
	    b.jsClick(pg3.getBtnbooknow());
	    
	    Thread.sleep(20000);
	    System.out.println("order no---"+b.getpageText(pg3.getOrderno())); 
	   
	  //  b.quitBrowser();
	    
	}

}
