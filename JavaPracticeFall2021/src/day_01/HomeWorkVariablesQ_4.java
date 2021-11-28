package day_01;

import java.util.Scanner;

public class HomeWorkVariablesQ_4 {

	public static void main(String[] args) {

		/*
		 *  Kullanicidanalacaginiz 5 basamakli sayinin ilk 2 ve son iki basamagindaki rakamlari toplamini bulunuz
		 *  
		 *   Ex :
		 *   input  : 12345
		 *   output : 12
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Lütfen 5 Basamaklı Bir Sayı Giriniz: ");
		
		int sayi = scan.nextInt();
		
		int ilk = (sayi/1000);
		int son = (sayi%100);
		int toplam = ilk + son;
		System.out.println(toplam);
		
		scan.close();
		
	}

}
