package day05_Matematikselİşlemler;

import java.util.Scanner;

public class C03_Modulus {

	public static void main(String[] args) {

		
		// kullanıcıdan üç basamaklı bir sayı alıp rakamlar toplamını yazdıran bir program yazınız.
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen 3 basamaklı bir sayı giriniz: "); 
		
		int sayi = scan.nextInt();
		
		
		// sayi 573 olsun
		
		int rakamlarToplami = 0;
		
		int rakam = sayi%10;  // bana birler basamağını verir rakam=3
		
		rakamlarToplami += rakam; // rakamlar toplamı 3 oldu.
				
		// sayımız hala 573
		// 3 ten kurtulmak istiyorum
		// çünkü 3 ile işim bitti
		// sayıyı 57 haline getirin
		
		sayi /=10;		
		// sayım artık 57
		// şimdi 7' yi alalım
		rakam = sayi%10;
		rakamlarToplami += rakam;
		
		
		// sayı hala 57 şimdi 
		// 7'den kurtulmamız lazım
		// sayıyı 5 haline getirmeliyim.
		sayi/=10;
		rakam = sayi%10;
		rakamlarToplami+=rakam;
		
		
		System.out.println("Girdiğiniz sayının rakamlar toplamı: " + rakamlarToplami);

		
		
		
		
		
		
		
		
		
	}

}
