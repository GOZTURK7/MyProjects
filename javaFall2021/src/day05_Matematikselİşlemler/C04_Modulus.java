package day05_Matematikselİşlemler;

import java.util.Scanner;

public class C04_Modulus {

	public static void main(String[] args) {

		// kullanıcıdan 4 basamaklı bir sayı alıp rakamlar toplamını yazdırın.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen 4 basamaklı bir sayı giriniz: "); 
		int sayi = scan.nextInt();
		
		int rakamlarToplami = 0;
		int rakam = sayi%10;  // bana birler basamağını verir rakam=3	
		rakamlarToplami += rakam; // rakamlar toplamı 3 oldu.
		sayi /=10;	
		
		rakam = sayi%10;  // bana birler basamağını verir rakam=3	
		rakamlarToplami += rakam; // rakamlar toplamı 3 oldu.
		sayi /=10;	
		
		rakam = sayi%10;  // bana birler basamağını verir rakam=3	
		rakamlarToplami += rakam; // rakamlar toplamı 3 oldu.
		sayi /=10;	
		
		rakam = sayi%10;  // bana birler basamağını verir rakam=3	
		rakamlarToplami += rakam; // rakamlar toplamı 3 oldu.
		sayi /=10;	
		
		System.out.println("Girdiğiniz sayının rakamlar toplamı: " + rakamlarToplami);

		
	}
	
}
