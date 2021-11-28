package day09_nestedIfElse;

import java.util.Scanner;

public class C07_HomeWorkTernary {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen Bir Tam Sayı Giriniz:");
		int sayi = scan.nextInt();
		System.out.println(sayi > 0 ? "Girdiğiniz Sayı: "+ sayi+" pozitiftir." : "Sayının Karesi:"+ (sayi*sayi));

		scan.close();
	}

}
