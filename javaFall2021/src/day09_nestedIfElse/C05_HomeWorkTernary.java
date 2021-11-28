package day09_nestedIfElse;

import java.util.Scanner;

public class C05_HomeWorkTernary {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen Bir Tam Sayı Giriniz:");
		int sayi = scan.nextInt();
		System.out.println(sayi%2 == 0 ? sayi + " Çift Sayı" : sayi + " Tek Sayı");

		scan.close();
	}

}
