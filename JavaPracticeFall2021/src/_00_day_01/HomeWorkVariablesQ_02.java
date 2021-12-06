package _00_day_01;

import java.util.Scanner;

public class HomeWorkVariablesQ_02 {

	public static void main(String[] args) {

		
		/*
		 * Kullanicidan uc basamakli bir sayi alin 
		 * ve sayinin rakamlarini birler,onlar ve yuzler basamagi olarak yazdirin
		 * 
		 * 
		 * Ornek : Inputs : 853 
		 * Output : Girdiginiz sayinin birler basamagi : 3
		 *          Girdiginiz sayinin onlar basamagi : 5 
		 *          Girdiginiz sayinin yuzler basamagi : 8
		 * 
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
			
		System.out.print("Lütfen 3 Basamaklı Bir Sayı Girniz:");
		
		int sayi = scan.nextInt();
		
		int birler = sayi%10;
		int onlar = (sayi/10)%10;
		int yüzler = (sayi/100)%10;
		
		System.out.println("Girdiğiniz sayının birler basamağı: "+birler 
				+"\nGirdiğiniz sayının onlar basamağı: "+onlar
				+"\nGirdiğiniz sayının yüzler basamağı: "+yüzler);
		
		scan.close();
		
	}

}
