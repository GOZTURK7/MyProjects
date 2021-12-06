package _13_stringBuilder;

import java.util.Scanner;

public class Q01_Palindrome {
    public static void main(String[] args) {
		/*
		Bir cümleyi parametre olarak kabul eden, StringBuilder kullanarak cümleyi ters çeviren ve cümlenin palindrom
	        olup olmadığını kontrol eden (büyük/küçük harf duyarlılığı olmadan) bir Java programı yazın.
	     (without case sensitivity)
	     Eg : input : I love Java
	     Output: "Reversed sentence : avaJ evol I 
	        It is not a palindrome"

		 */
    	
    	Scanner scan = new Scanner(System.in);
    	System.out.println("bir metin giriniz: ");
    	String metin = scan.nextLine();
    	StringBuilder sb = new StringBuilder(metin);
    	
    	
    	if (sb.reverse().toString().equalsIgnoreCase(metin)){
			System.out.println("sb : " + sb + " is palindrome");
    		
		} else {
			System.out.println("sb : " + sb + " is not palindrome");
		}
    	
    	
    	
    	
    	
    }

}
