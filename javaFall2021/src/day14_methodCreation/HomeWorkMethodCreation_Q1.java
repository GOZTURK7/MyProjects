package day14_methodCreation;

import java.util.Scanner;

public class HomeWorkMethodCreation_Q1 {

	public static void main(String[] args) {
	
	/*
	 Kullanicidan bir sayi alin. Bu sayinin tek mi cift mi oldugunu, 
	 sifirdan buyuk mu kucuk mu oldugunu, 
	 ayrica ve 100’den buyukse birler,onlar ve yuzler basamagindaki rakamlarin toplamini,
	 100’den kucukse sadece 1’ler basamagini yazdiran 3 method olusturun.
	 
	 */
		
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Lütfen bir sayı giriniz: ");
	int num = scan.nextInt();
		
		
	tekCift(num);
	pozitifNegatif(num);
	yuzdenBuyukMu(num);
		
	scan.close();
		
	}

	public static void yuzdenBuyukMu(int num) {
		
		int birler = num%10;
		int onlar = (num%100)/10;
		int yüzler = (num/100);
		int rakamlarToplami= birler + onlar + yüzler;
		
		if (num >= 100) {
			System.out.println("Girdiğiniz sayı: "+ num + " yüzden büyük veya eşit"
					+ "\nRakamlar toplamı: "+ rakamlarToplami );
		}else {
			System.out.println("Girdiğiniz sayı: "+ num + " yüzden küçük"
					+ "\nBirler basamağı: "+ birler);
		}
	
	}

	public static void pozitifNegatif(int num) {
		if(num < 0) {
			System.out.println("Girdiğiniz sayı: "+ num + " negatif sayıdır.");
		}else if(num > 0) {
			System.out.println("Girdiğiniz sayı: "+ num + " pozitif sayıdır.");
		}else {
			System.out.println("Girdiğiniz sayı: "+ num + " sıfırdır ");
		}
		
	}

	public static void tekCift(int num) {
		if (num%2 == 0) {
			System.out.println("Girdiğiniz sayı: "+ num + " çift sayıdır.");
		}else {
			System.out.println("Girdiğiniz sayı: "+ num + " tek sayıdır.");

		}
	
		
	}

}
