package day03_SwapVariable_Scanner;

import java.util.Scanner;

public class C05_Scanner {

	public static void main(String[] args) {
		// Kullanıcıdan isim ve soyismini ayrı ayrı isteyip
		// girilen ismi aşağıdaki gibi yazdırınız.
		
		// girilen isim : Mehmet Bulutluöz
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("lütfen isminizi giriniz..: ");
		
		String isim = scan.next();
		
		System.out.println("Lütfen soyisminizi yazınız..:");
		
		String soyisim = scan.next();
		
		System.out.println("girilen isim : " + isim +" "+ soyisim);
		

	}

}
