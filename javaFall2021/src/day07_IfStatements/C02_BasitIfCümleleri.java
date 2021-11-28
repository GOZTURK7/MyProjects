package day07_IfStatements;

import java.util.Scanner;

public class C02_BasitIfCümleleri {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir tam sayı girin: ");
		int sayi = scan.nextInt();
	
		if (sayi % 2 == 0) {
		System.out.println("Girdiğiniz sayı çift sayı");
		}
		
	
		if (sayi%2 == 1) {
		System.out.println("Girdiğiniz sayı tek sayı");
	
		}
		scan.close();
	
	
	}

}
