package replit_Questions;

import java.util.Scanner;

public class For_While_Loop_Replit_Q9 {

	public static void main(String[] args) {


		/*
		 SORU9:
			Kullanıcının girdiği sayıyı tersine çeviren bir java programı yazınız. (Mulakat Sorusu)
			Input :1238
			Output :Girilen Numananin Tersi: 8321
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("lütfen bir sayı giriniz:");
		String num= scan.next();
		int sonidx=num.length()-1;
		
		String container="";
		
		for (int i = sonidx; i >= 0; i--) {
			container+=num.substring(i, i+1);
			
		}System.out.println(container);
		
		
	}

}
