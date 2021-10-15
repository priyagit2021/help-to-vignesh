package org.basic;

public class PrimeNos {
	public static void main(String[] args) {

		for (int i = 2; i < 100; i++) {
			int count = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					
					count++;
					//System.out.println(i + "is not prime");
					//break;
				}
			}
			
			if(count==0) {
				System.out.println(i );
		}
	}
}
}                                       