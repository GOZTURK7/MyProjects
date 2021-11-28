package day09_nestedIfElse;

import java.util.Scanner;

public class C04_HomeWorkTernary {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen Birinci Sayıyı Giriniz:");
		double sayi1 = scan.nextDouble();
		System.out.println("Lütfen İkinci Sayıyı Giriniz:");
		double sayi2 = scan.nextDouble();
		System.out.println(sayi1 > sayi2 ? sayi1 : sayi2);

		
		scan.close();
	
		
		
		
	}

}
