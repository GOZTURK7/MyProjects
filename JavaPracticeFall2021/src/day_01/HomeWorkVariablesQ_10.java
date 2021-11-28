package day_01;

import java.util.Scanner;

public class HomeWorkVariablesQ_10 {

	public static void main(String[] args) {
		// Write a Java program to convert temperature from Fahrenheit to Celsius degree.

		// formula
		    
		    // c = (f-32)*5/9
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("lütfen Sıcaklığı Fahrenheit Cinsinden Giriniz; ");
		int f = scan.nextInt();
		
		double c = (double) (f-32)*5/9;
		System.out.print("Sounç: " + c);
		
		scan.close();
		
		
	}

}
