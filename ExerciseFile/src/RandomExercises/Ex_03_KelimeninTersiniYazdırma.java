package RandomExercises;

import java.util.Scanner;

public class Ex_03_KelimeninTersiniYazdırma {

	public static void main(String[] args) {

		/*
		  Ask user to enter a word which has 4 letters and output will be inverse of the word. 
		  For example; if user enters “MARK” output will be “KRAM”
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a four-letter word ");
		String word= scan.next();
		
		int uzunluk = word.length();
		
		String firstChar = word.substring(0, 1);
		String secondChar = word.substring(1, 2);
		String thirdChar = word.substring(2, 3);
		String fourthChar = word.substring(3, 4);
		
		if (uzunluk == 4) {
			System.out.println(fourthChar + thirdChar + secondChar + firstChar);
		}else {
			System.out.println("Please enter four-letter word");
		}
		scan.close();

		
		
		
	}

}
