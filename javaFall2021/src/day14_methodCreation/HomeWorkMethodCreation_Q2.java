package day14_methodCreation;

import java.util.Scanner;

public class HomeWorkMethodCreation_Q2 {

	public static void main(String[] args) {
	/*
	 Kullaniciya kac sayi toplamak istedigini sorun. 
	 Kullanici 2,3 veya 4 degerini girerse,
	 kullanicidan bu sayilari girmesini isteyin ve sayilarin toplamini yazdirin. 
	 Kullanici toplamak istedigi sayi adedini 4’den buyuk girerse 
	 “Cok sayi girdiniz, ben toplayamam” yazdirin.
	 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("kaç adet sayıyı toplamak istediğinizi giriniz giriniz: ");
		int num = scan.nextInt();
		
		toplama(num);
		scan.close();
	
	}

	public static void toplama(int num) {
		if (num <= 4 && num>= 2) {
			System.out.println("Lütfen " +num + " sayı giriniz.");
			Scanner scan = new Scanner(System.in);
			switch(num) {
			case 2:
				int num1 = scan.nextInt();
				int num2 = scan.nextInt();
				System.out.println("girdiğiniz iki sayının toplamı " + (num1 + num2));
				break;
			case 3:
				int num3 = scan.nextInt();
				int num4 = scan.nextInt();
				int num5 = scan.nextInt();
				System.out.println("girdiğiniz üç sayının toplamı " + (num3 + num4 + num5));
				break;
			case 4:
				int num6 = scan.nextInt();
				int num7 = scan.nextInt();
				int num8 = scan.nextInt();
				int num9 = scan.nextInt();
				System.out.println("girdiğiniz dört sayının toplamı " + (num6 + num7 + num8 +num9));
				break;
			}scan.close();	
		} else {
			System.out.println("Cok sayi girdiniz, ben toplayamam");

		}
	}

}
