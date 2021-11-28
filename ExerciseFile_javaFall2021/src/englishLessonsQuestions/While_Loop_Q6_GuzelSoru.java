package englishLessonsQuestions;

import java.util.Scanner;

public class While_Loop_Q6_GuzelSoru {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);

		/*
		 * QUESTİON 6
		 Get string from the user and print just vowels inside string on the consol;
		 
		 */
		
		//// 1. WAY /////
		
		System.out.println("Please enter a string");
		String input = scan.nextLine();
		String vowels = "";
		
		int i = 0;
		while(i<input.length()) {
			char c = input.charAt(i);
			if (c=='a' ||  c=='e' || c=='i' || c=='o' || c=='u') {
				vowels+=c;	
			}
	
			i++;
		}System.out.println(vowels);
		
		
		//// 2.WAY ////
		System.out.println("Please enter a string1");
		String input1 = scan.nextLine();
		
		String vowels1 = input1.replaceAll("[^aeiou]", "");
		System.out.println(vowels);
		
		
		scan.close();
		
		
		
	}

}
