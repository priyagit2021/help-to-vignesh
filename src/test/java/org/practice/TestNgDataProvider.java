package org.practice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNgDataProvider {
	@Test(dataProvider="addactin")
	private void method(String s1,String s2,String s3,String s4,String s5,String s6,String s7,String s8,String s9,String s10,String s11,String s12,String s13,String s14,String s15,String s16,String s17,String s18) throws InterruptedException {
		BaseClass bc= new BaseClass();
		bc.launchBrowser();
		bc.launchUrl("https://www.adactinhotelapp.com");
		 
		 Pom p=new Pom();
		 bc.type(p.getUsername(),s1);
		 bc.type(p.getPassword(),s2);
		 bc.btnClick(p.getBtnLogin());
		 
		 Pom1 p1= new Pom1();
		 bc.selectOpt(p1.getLocation(), s3);
		 bc.selectOpt(p1.getHotels(), s4);
		 bc.selectOpt(p1.getRoomtype(), s5);
		 bc.selectOpt(p1.getRoomnos(), s6);
		 bc.type(p1.getPickin(), s7);
		 bc.type(p1.getPickout(), s8);
		 bc.selectOpt(p1.getAdultroom(), s9);
		 bc.selectOpt(p1.getChildroom(), s10);
		 bc.btnClick(p1.getBtnsubmit());
		 
		 Pom2 p2 = new Pom2();
		 bc.btnClick(p2.getRadiobtn());
		 bc.btnClick(p2.getContinuebtn());
		 
		 Pom3 p3 = new Pom3();
		 bc.type(p3.getFirstname(), s11);
		 bc.type(p3.getLastname(), s12);
		 bc.type(p3.getAddress(), s13);
		 bc.type(p3.getCcnum(), s14);
		 bc.selectOpt(p3.getCctype(), s15);
		 bc.selectOpt(p3.getCcexpmonth(), s16);
		 bc.selectOpt(p3.getCcexpyear(), s17);
		 bc.type(p3.getCccvv(), s18);
		 bc.btnClick(p3.getBtnbooknow());

		 Thread.sleep(20000);
		    System.out.println("order no---"+bc.getpageText(p3.getOrderno())); 
	
	}
	
	@DataProvider(name="addactin")
	private Object[][] data() {
		return new Object[][]{{"9600943393","9600943393","Melbourne","Hotel Creek","Standard","1 - One","09/10/2021","10/10/2021","1 - One","1 - One","priya","prakash","Tiruchengode","1234123412341234","VISA","February","2022","456"}};
	

	}
		

	

}
