package org.umkc.basics;

import java.util.Scanner;

public class KeyboardInput {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*Scanner scanner=new Scanner(System.in);
		System.out.println("enter a message");
		String message=scanner.next();
		System.out.println("Your message is " +message);*/
		
		Scanner scanner1=new Scanner(System.in);
		System.out.println("enter a number");
		int a=scanner1.nextInt();
		int b=a/10+20;
		int c=b+10;
		System.out.println(b);
		System.out.println(c);
	}

}
