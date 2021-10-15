package org.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Class1 {
	@BeforeClass
	private void beforeclass() {
System.out.println("launch");
	}

 @Test(enabled=false)
 private void test() {
	// TODO Auto-generated method stub
	 System.out.println("launc");
} 
 @Test(invocationCount=-1 )
 private void test1() {
	// TODO Auto-generated method stub
	 System.out.println("launchthen");
} 
 @Test
 private void aftermethod() {
	// TODO Auto-generated method stub
System.out.println("hai");
}

 @Test
 private void beforemethod() {
	// TODO Auto-generated method stub
System.out.println("hello");
}
 
	}

	

