package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
		 *  dort islemden biri ile isleme koyup sonucun yazdiriniz
		 */
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen 1. Sayıyı giriniz:");
		double sayi1 = scan.nextDouble();
		System.out.println("Lütfen 2. Sayıyı giriniz:");
		double sayi2 = scan.nextDouble();
		System.out.println("Lütfen bir işlem seçiniz; \nToplama için: '+\nÇıkarma için: '-' \nÇarpma için: '*' \nBölme için: '/'");
		char islem = scan.next().charAt(0);
		
		double toplam = sayi1 + sayi2;
		double cıkarma = sayi1 - sayi2;
		double carpma = sayi1 * sayi2;
		double bolme = sayi1 / sayi2;
		
		if (islem == '+') {
			System.out.println(toplam);
		}else if (islem == '-') {
			System.out.println(cıkarma);
		}else if (islem == '*') {
			System.out.println(carpma);
		}else if (islem == '/') {
			System.out.println(bolme);
		}else {
			System.out.println("Lütfen Geçerli Bir İşlem Giriniz.");
		}
		scan.close();
		
		
	}

}
