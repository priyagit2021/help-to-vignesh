package org.jut;

import static org.junit.Assert.assertTrue;
import org.junit.Assert;
import org.junit.Test;
public class One {
	@Test
	public void bike1() {

		int a = 10;
		int b = 20;
		int c = a;
		a = b;
		b = c;
		System.out.println(a);
		System.out.println(b);
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
