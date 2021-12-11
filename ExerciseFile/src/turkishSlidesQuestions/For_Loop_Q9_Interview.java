package turkishSlidesQuestions;

import java.util.Scanner;

public class For_Loop_Q9_Interview {

	public static void main(String[] args) {


		/*
		 Soru 9 ) Interview Question:
		  Kullanicidan bir String isteyin. 
		 Kullanicinin girdigi String’in palindrome olup olmadigini kontrol eden bir program yazin.
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir string giriniz");
		String str = scan.nextLine();
		
		
		if(str.equals(reverse(str))) {
			System.out.println("girdiğiniz string palindrome");
		}else {
			System.out.println("girdiğiniz String palindrome değil");
		}
		
		scan.close();
		
		
	}

	public static String reverse(String str) {
		String reverseStr= "";
		
		for (int i1=str.length()-1; i1>=0; i1--) {
			reverseStr+= str.substring(i1, i1+1);
		}return reverseStr;		
		
		
		
	}

}
