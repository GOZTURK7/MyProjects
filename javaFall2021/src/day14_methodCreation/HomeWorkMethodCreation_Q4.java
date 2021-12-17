package day14_methodCreation;

import java.util.Scanner;

public class HomeWorkMethodCreation_Q4 {

	public static void main(String[] args) {

		/*
		 Kullanicidan ismini, soyismini ve bosluk birakmadan 16 hane olarak kredi karti numarasini alin.
		 Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak sekilde, 
		 KK numarasini ise 4 rakamlik 4 blok ve aralarinda bosluk olacak sekilde duzelten 2 method yazin, 
		 ve programda kullanabilmek icin duzenlenmis hallerini geri dondurun.
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen isminizi giriniz: ");
		String isim = scan.next();
		System.out.println("Lütfen soyisminizi giriniz: ");
		String soyIsim = scan.next();

		System.out.println("lütfen 16 haneli kredi kartı numaranızı boşluk bırakmadan giriniz:");
		String kkno = scan.next();
	
		
		adSoyad(isim, soyIsim);
		kartNo(kkno);
		scan.close();
	}

	public static String kartNo(String kkno) {
		String kknoFormatted = kkno.substring(0,4) 
				+" "+ kkno.substring(4,8) 
				+" "+ kkno.substring(8, 12)
				+" "+ kkno.substring(12);
		return kknoFormatted;
	}
	public static String adSoyad(String isim, String soyIsim) {
		String isimIlkHarf = isim.substring(0,1).toUpperCase();
		String isimFormatted = isimIlkHarf + isim.substring(1);
		
		String soyIsimIlkHarf = soyIsim.substring(0,1).toUpperCase();
		String soyIsimFormatted = soyIsimIlkHarf + soyIsim.substring(1);
		
		return (isimFormatted + " " + soyIsimFormatted);
		
	}
}
