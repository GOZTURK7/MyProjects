package replit_Questions;

import java.util.Scanner;

public class List_Q9_MaxOccuredCharacterInString {

	public static void main(String[] args) {


		/*
		 * Soru9:
			Write a Java program to get a String from user as input 
			and find the maximum occurring character in that string.(Ignore case sensitivity).
			Input : Learning java is easy
			Output: maximum occurring character is : a
		 */
				
		
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		
		int karakter []= new int [256];
		
		for (int i=0; i<input.length(); i++){
			karakter[input.charAt(i)]++;	
		}
		
		char result = ' ';
		int max = -1;
		
		for (int i = 0; i < input.length(); i++) {
			
			if (karakter[input.charAt(i)] >max) {
				result=input.charAt(i);
				max=karakter[input.charAt(i)];
			}
			
		}System.out.println("result : " + result + ",  max occurence: " + max);
		
		
	}

}
