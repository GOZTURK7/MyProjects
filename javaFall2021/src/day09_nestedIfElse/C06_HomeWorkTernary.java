package day09_nestedIfElse;

import java.util.Scanner;

public class C06_HomeWorkTernary {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen Bir Tam Sayı Giriniz:");
		int sayi = scan.nextInt();
		System.out.println(sayi > 0 ? "Girdiğiniz Sayı: "+ sayi : "Sayının Mutlak Değeri :"+ (sayi*(-1)));

		scan.close();
	}

}
