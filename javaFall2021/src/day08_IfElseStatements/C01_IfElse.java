package day08_IfElseStatements;

import java.util.Scanner;

public class C01_IfElse {

	public static void main(String[] args) {
		//Soru 1) Kullanicidan dikdortgenin kenar uzunluklarini isteyin ve dikdortgenin kare olup olmadigini yazdirin
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen 1. kenar uzunluğunu girin; ");
		double kenar1 = scan.nextDouble();
		
		System.out.println("Lütfen 2. kenar uzunluğunu girin; ");
		double kenar2 = scan.nextDouble();
		
		if (kenar1 == kenar2) {
			System.out.println("Girilen dörtken kare");
		}			
		else {
			System.out.println("Girilen dikdörtgen dikdörtgen");
		}
		
		scan.close();
		
		
		
	}
	

}
