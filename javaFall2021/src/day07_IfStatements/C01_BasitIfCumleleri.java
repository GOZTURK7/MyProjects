package day07_IfStatements;

import java.util.Scanner;

public class C01_BasitIfCumleleri {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen gün isimlerinden birinin ilk harfini yazınız");
		
		// kullanıcının girdiği verinin tamamını küçük harf veya büyük harf yapabiliriz.
		char ilkHarf = scan.next().toUpperCase().charAt(0);
	
		if (ilkHarf == 'P') {
			System.out.println("Pazar, Pazartesi veya Perşembe");
		}
		
		if (ilkHarf == 'S') {
			System.out.println("Sali");
		}
		
		if (ilkHarf == 'C') {
			System.out.println("Carsamba, Cuma veya Cumartesi");
		}
		
		if (ilkHarf != 'C' || ilkHarf != 'P' || ilkHarf!='S') {
			System.out.println("Geçersiz harf girdiniz, lütfen gün isimlerinden birini başharfini girin");
		}
		scan.close();
	}

}
