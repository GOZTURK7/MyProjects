package turkishSlidesQuestions;

import java.util.Scanner;

public class For_Loop_Q07_Q08_Interview {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir string giriniz");
		String str = scan.next();
		
		/*
		 QUESTİON 7:
		 
		 Kullanicidan bir String isteyin ve Stringi tersine ceviren bir program yazin.
		 */
		
		//for (int i=str.length()-1; i>=0; i--) {
		//	System.out.print(str.charAt(i));
		//}
		
		
		//QUESTİON 8; 
		/*
		 Kullanicidan bir String isteyin ve Stringi tersine ceviren bir program yazin.
		 */
		
		
		
		System.out.println(reverse(str));
		
		scan.close();
		
		
	}

	public static String reverse(String str) {
		String reverseStr= "";
		
		for (int i1=str.length()-1; i1>=0; i1--) {
			reverseStr+= str.substring(i1, i1+1);
		}return reverseStr;		
	}

}
