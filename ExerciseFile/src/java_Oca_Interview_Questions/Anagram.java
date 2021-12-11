package java_Oca_Interview_Questions;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		/*
		Ask user to enter  2 Srtrings.
		If the characters and the numbers of characters of the Strings are same then print "Anagram"
		otherwise, print "Not Anagram" on the console.
		Ignore cases
		For example : "Mary" and "army" and "RAMY" are Anagrams

		Kullanıcıdan 2 String girmesini isteyin. String'lerin buyuk-kucuk harf duyarliligi olmadan
		karakterleri ve karakter sayıları aynıysa "Anagram" yazdırın,   aksi takdirde konsolda "Anagram Değil" yazdırın.
		Ornek : "Pide" ve"EDİP" anagram ifadelerdir..
		 */
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen 1. stringi giriniz:");
		String str1[] = (scan.nextLine()).toLowerCase().split("");
		System.out.println("Lütfen2.Stringi giriniz:");
		String str2[]=(scan.nextLine()).toLowerCase().split("");
		Arrays.sort(str1);
		Arrays.sort(str2);
		
		if (str1.length==str2.length && Arrays.equals(str1, str2)) {
			System.out.println("Anagram");
		}else {
			System.out.println("Anagram Değil.");
		}
				
	}

}
