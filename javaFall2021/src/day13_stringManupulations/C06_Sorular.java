package day13_stringManupulations;

import java.util.Scanner;

public class C06_Sorular {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen İsminizi"
				+ "\nSoyisminizi"
				+ "\nKredi kartı numaranızı sırasıyla girin.");
			
		String isim = scan.next();
		String soyisim = scan.next();
		String kartno = scan.next();
		
		String isimFormatli = isim.substring(0,1).toUpperCase() + isim.substring(1).replaceAll("\\w", "*");
		
		String soyisimFormatli = soyisim.substring(0,1).toUpperCase() + soyisim.substring(1).replaceAll("\\w", "*");

		String kartnoFormatli = "**** **** ****" + kartno.substring(12);
		
		System.out.println("isim-soyisim : " + isimFormatli +  " " + soyisimFormatli );
		System.out.println("Kart no: " + kartnoFormatli);

		scan.close();
		
		
	}

}
