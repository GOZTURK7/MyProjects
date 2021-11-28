package replit_Questions;

import java.util.Scanner;

public class List_Q8_GuzelSoru_StringBuilder_CumlePalindromeMu {

	public static void main(String[] args) {

		/*
		 * Soru8: Write a java program which accept a sentence as parameter, than
		 * reverses sentence by using StringBuilder and checks if sentence is palindrome
		 * or not (without case sensitivity).Use StringBuilder. Input : I love Java.
		 * Output: Reversed sentence : avaJ evol I. It is not a palindrome"
		 * 
		 * 
		 */

		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();

		isPalindrome(input);

	}

	private static void isPalindrome(String input) {

		StringBuilder str = new StringBuilder(input);

		if (str.reverse().toString().equalsIgnoreCase(input)) {
			System.out.println("Reversed setnence '" + str.reverse().toString() + "' is palindrome");
		} else {
			System.out.println("Reversed setnence '" + str.reverse().toString() + "' is not palindrome");
		}
	}

}
