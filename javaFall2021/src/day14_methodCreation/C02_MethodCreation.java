package day14_methodCreation;

import java.util.Scanner;

public class C02_MethodCreation {

	public static void main(String[] args) {

		
		
		/*
		 Kullanıcıdan iki sayı isteyin
		 sayıların karelerini ve küplerini toplayıp yazdıran iki ayrı method yazın
		 kullanıcıya üs sorun 
		 2 yazarsa kareleri toplamını yapan method, 3 yazarsa küpler toplamını yapan method çalışsın
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen birinci sayıyı giriniz: ");
		int sayi1 = scan.nextInt();
		
		System.out.println("Lütfen ikinci sayıyı giriniz: ");
		int sayi2 = scan.nextInt();
		
		System.out.println("üssü seçin küp için: 3 , kare için: 2 ");
		int us = scan.nextInt();
		
		switch (us) {
		case 2:
			karelerToplamı(sayi1, sayi2);
			break;
		case 3:
			kuplerToplamı(sayi1, sayi2);
			break;
		default:
			System.out.println("Lütfen geçerli bir üs seçin....");	
		}
		scan.close();
		}

		

	public static void kuplerToplamı(int sayi1, int sayi2) { // arguman ve parametre isimleri aynı olmak zorunda değil java isimlere değil değerlere bakar arguman isimlerini num1 num2 olarak parametreden farlı olarak yazılabilir
		System.out.println("Küpler toplamı: " 
	+ (sayi1*sayi1*sayi1 + sayi2*sayi2*sayi2));

	}

	public static void karelerToplamı(int sayi1, int sayi2) {
		System.out.println("Kareleri toplamı: " 
	+ (sayi1*sayi1 + sayi2*sayi2));
	}
	

}
