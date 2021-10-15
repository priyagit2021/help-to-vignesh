package org.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Class2 {
	@Test(priority=-18)
		 private void test() {
			// TODO Auto-generated method stub
			 System.out.println("priya");
		}
	@Test(priority=-19)
		 private void aftermethod() {
			// TODO Auto-generated method stub
		System.out.println("prakash");
		}

}
