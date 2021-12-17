package day07_IfStatements;

import java.util.Scanner;

public class C04_BasitIfCumleleri {

	public static void main(String[] args) {

		
		// Kullanicidan bir dikdortgenin en ve boyunu alin.
		// En ve boy esit ise ekrana "Bu bir karedir" yazdirin
		// En ve boy farkli ise ekrana "Bu bir dikdortgendir" yazdirin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen 1. kenar uzunluğunu girin; ");
		double kenar1 = scan.nextDouble();
		
		System.out.println("Lütfen 2. kenar uzunluğunu girin; ");
		double kenar2 = scan.nextDouble();
		
		if (kenar1 == kenar2) {
			System.out.println("Girilen dörtken kare");
		}
		
		
		if (kenar1 != kenar2) {
			System.out.println("Girilen dikdörtgen dikdörtgen");			
		}
		scan.close();
		
	}

}
