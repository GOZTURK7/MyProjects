package day04;

import java.util.Scanner;

public class C02_Scanner {

	public static void main(String[] args) {
		
		// Soru 7) Kullanicidan ismini alip isminin bas harfini yazdirin.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen İsminizi Giriniz: ");
		
		char ilkHarf = scan.next().charAt(0);
		
		System.out.println("İsminizin İlk Harfi : " + ilkHarf);
		
		scan.close();
		
	}

}
