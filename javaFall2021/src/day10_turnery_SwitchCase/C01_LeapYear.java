package day10_turnery_SwitchCase;

import java.util.Scanner;

public class C01_LeapYear {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter a year");
		int year = scan.nextInt();
		
		if (year < 0) {
			System.out.println("Enter a valid value ");
		}else if ((year % 100 == 0) && (year % 400 == 0)) {
			System.out.println(year + " is a leap year");
		}else if((year % 100 != 0) && (year % 4 == 0)) {
			System.out.println(year + " is a leap year");
		}else {
			System.out.println(year + " is not a leap year");
		}
		scan.close();
				
	}

}
