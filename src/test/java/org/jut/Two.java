package org.jut;

import org.junit.Assert;
import org.junit.Test;

public class Two {
	@Test
	public void bike1() {
		Assert.assertTrue(false);
		 System.out.println("a");
		 Assert.assertTrue(true);
		 System.out.println("b");
	}
	@Test
	public void bike2() {
		Assert.assertTrue(false);
		System.out.println("bike2");
	}
	@Test
	public void bike3() {
		System.out.println("bike 3");
	}
	
}
