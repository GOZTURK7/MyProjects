package RandomExercises;

import java.util.Scanner;

public class Ex_05_StringManupulation {

	public static void main(String[] args) {

		/*
		 Ask user to enter a String and output will be the number of the characters in the String.
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a string");
		String word= scan.next();
		int uzunluk = word.length();
		
		System.out.println(uzunluk);
		
	}

}
