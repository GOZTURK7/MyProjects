package day13_stringManupulations;

import java.util.Scanner;

public class HomeWorkStringManupulation4 {

	public static void main(String[] args) {
		/* soru4)	Kullanicidan isim ve soyismini girmesini isteyin 
		 ve hangisinin daha uzun oldugunu yazdirin.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen isminizi ve soy isminizi giriniz: ");
		
		String isimSoyisim = scan.nextLine();
		
		int isimLength = isimSoyisim.indexOf(" ");
		int soyIsimLength = isimSoyisim.length() - (isimLength + 1); // +1 aradaki space tuşu
		
		if (isimLength > soyIsimLength) {
			System.out.println("isminiz:  " + isimLength + " uzunluğunda, "
					+ "\nSoyisiminiz: " + soyIsimLength + " uzunluğunda, "+
					"isminiz soy isminizden uzun.");

		}else if (isimLength < soyIsimLength) {
			System.out.println("isminiz:  " + isimLength + " uzunluğunda, "
					+ "\nSoyisiminiz: " + soyIsimLength + " uzunluğunda, "+
					"soy isminiz isminizden uzun.");
		}else {
			System.out.println("isminiz:  " + isimLength + " uzunluğunda, "
					+ "\nSoyisiminiz: " + soyIsimLength + " uzunluğunda, "
					+"isminiz ve soy isminiz eşit uzunlukta");

		}
		scan.close();
	}

}
