package java_Oca_Interview_Questions;

import java.util.Scanner;

public class Interview_Questions_12 {

	public static void main(String[] args) {
		/*
		Crteate a program checks if a String is PALINDROME or not.
		If a word, phrase, or sequence that reads the same backword as forward then it is called "palindrome",
		For Example : "madam" or "nurses run" .


		Kuulanıcının girdiği bir  String'in PALINDROME olup olmadığını kontrol eden bir method create ediniz
		polindrome :Palindrom, tersten okunuşu da aynı olan cümle
		ornek : Ey edip Adana`da pide ye,  Traş niçin şart
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir string girin:");
		String str = scan.nextLine();
			
		ters(str);
		
		if(ters(str).equalsIgnoreCase(str)){
			System.out.println("Palindrome");
		}else {
			System.out.println("Palindrome Değil");
		}
		
		
		System.out.println(ters(str));
	}

	private static String ters(String str) {

		if(str.isEmpty()) return str;

		return ters(str.substring(1)) + str.charAt(0);
	}

}
