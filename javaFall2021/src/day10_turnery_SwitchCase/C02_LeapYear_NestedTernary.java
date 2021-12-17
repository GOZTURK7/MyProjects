package day10_turnery_SwitchCase;

import java.util.Scanner;

public class C02_LeapYear_NestedTernary {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter a year");
		int year = scan.nextInt();
		
		String sonuc = (year < 0 ? ("Enter a valid year") : 
					((year % 100 == 0 && year % 400 == 0) ? "Leap Year" :
						(((year % 100 != 0 && year % 4 == 0) ? "Leap year" :
							("Not Leap Year")))));
		
		System.out.println(sonuc);
		scan.close();
	}

}
