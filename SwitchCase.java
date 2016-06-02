package org.umkc.basics;

import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number of month:");
		int month=s.nextInt();
		int numDays=0;
		switch(month)
		{
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			numDays=31;
			break;
		case 4: case 6: case 9: case 11:
			numDays=30;
			break;
		case 2:
			numDays=29;
			break;
			default:
				System.out.println("It's a invalid number");
			
		}
		System.out.println("number of days is"  +numDays);
		s.close();
		
	}

}
