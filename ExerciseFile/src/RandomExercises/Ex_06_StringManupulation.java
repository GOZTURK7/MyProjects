package RandomExercises;

import java.util.Scanner;

public class Ex_06_StringManupulation {

	public static void main(String[] args) {

		/*
		 * Soru 1 ) Kullanicidan bir sayi alin. 
		 * Bu sayinin tek mi cift mi oldugunu,
		 * sifirdan buyuk mu kucuk mu oldugunu, 
		 * ayrica ve 100’den buyukse birler,onlar
		 * ve yuzler basamagindaki rakamlarin toplamini,1
		 * 00’den kucukse sadece 1’ler
		 * basamagini yazdiran 3 method olusturun.
		 */
		
		Scanner scan = new Scanner(System.in); 
		System.out.println("lütfen bir tam sayı giriniz");
		int sayi = scan.nextInt();

		tekMi (sayi);
		pozitifMi(sayi);
		yuzegore (sayi);
		
	}

	private static void yuzegore(int sayi) {
		if (sayi >= 100) {
				System.out.println((sayi >= 100 && sayi<= 999) ? (sayi%10 + (sayi/10)%10) + (sayi/100) :(sayi%10));
		}
		
	}

	private static void pozitifMi(int sayi) {
		System.out.println((sayi < 0) ? ("sayi negatif") : ((sayi == 0) ? ("sıfır negatif olmaz"): ("sayi pozitif")));
		
	}

	public static void tekMi(int sayi) {
		System.out.println((sayi%2==0) ? ("sayi çift" ) : ("sayi tek"));
		
	}

}
