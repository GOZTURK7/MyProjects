package day14_methodCreation;

import java.util.Scanner;

public class HomeWorkMethodCreatin_Q2_HocaCozumu {

	public static void main(String[] args) {
		/*
		 Kullanicidan bir sayi alin. Bu sayinin tek mi cift mi oldugunu, 
		 sifirdan buyuk mu kucuk mu oldugunu, 
		 ayrica ve 100’den buyukse birler,onlar ve yuzler basamagindaki rakamlarin toplamini,
		 100’den kucukse sadece 1’ler basamagini yazdiran 3 method olusturun.
		 
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen toplamak istediğiniz sayı adedini 2,3 veya 4'den biri olarak seçin. ");
		int tercih = scan.nextInt();
		
		if (tercih >4) {
			tercih = 5;
		}
		switch(tercih) {
		case 2:
			ikiSayiTopla();
			break;
		case 3:
			ucSayiTopla();
			break;
		case 4:
			dortSayiTopla();
			break;
		case 5:
			System.out.println("çok sayı girdiniz toplayamam.");
			break;
		default:
				System.out.println("geçersiz sayı");
				break;
		}
		scan.close();
		
		
		
		
	}

	public static void dortSayiTopla() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen 4 sayı giriniz \nHer sayıdan sonra enter'a basın:");
		double sayi1 = scan.nextDouble();
		double sayi2 = scan.nextDouble();
		double sayi3 = scan.nextDouble();
		double sayi4 = scan.nextDouble();
		System.out.println("girdiğiniz iki sayının toplamı: " + (sayi1 + sayi2 + sayi3 + sayi4));
		scan.close();		
	}

	public static void ucSayiTopla() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen 3 sayı giriniz \nHer sayıdan sonra enter'a basın:");
		double sayi1 = scan.nextDouble();
		double sayi2 = scan.nextDouble();
		double sayi3 = scan.nextDouble();
		System.out.println("girdiğiniz üç sayının toplamı: " + (sayi1 + sayi2 + sayi3));
		scan.close();		
	}

	public static void ikiSayiTopla() {

		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen 2 sayı giriniz \nHer sayıdan sonra enter'a basın:");
		double sayi1 = scan.nextDouble();
		double sayi2 = scan.nextDouble();
		System.out.println("girdiğiniz iki sayının toplamı: " + (sayi1 + sayi2));
		scan.close();

	}

}
