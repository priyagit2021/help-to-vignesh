package org.basic;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		
		/*Scanner s= new Scanner(System.in);
		System.out.println("Get the String");
		String s1= s.next();
		//String s1="priya";
		//System.out.println(s1);
		int j = s1.length();
		
		for (int i = j-1; i >= 0; i--) {
			System.out.print(s1.charAt(i));
			
		}*/
		try {
		String s3="priya";
		char charAt = s3.charAt(5);
		System.out.println(charAt);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("hello");
		}
		
	}
	

}
