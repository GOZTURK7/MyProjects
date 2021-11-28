package day08_IfElseStatements;

import java.util.Scanner;

public class C04_IfElse {

	public static void main(String[] args) {

		// Soru 4) Kullanicidan bir ucgenin uc kenar uzunlugunu alin eger uc kenar uzunlugu 
		//birbirine esit ise ekrana “Eskenar ucgen” yazdirin. Diger durumlarda ekrana “Eskenar degil” yazdirin.

		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen Üçgenin Kenar Uzunluklarını giriniz.");
		
		System.out.println("Birinci Kenar: ");
		double kenar1 = scan.nextDouble();
		
		System.out.println("İkinci Kenar: ");
		double kenar2 = scan.nextDouble();
		
		System.out.println("Üçüncü Kenar: ");
		double kenar3 = scan.nextDouble();
		
		if (kenar1 == kenar2 && kenar1 == kenar3) {
			System.out.println("Eşkenar");

		} 
		else {
			System.out.println("eşkenar üçgen değil");


		}

		scan.close();
	}

}
