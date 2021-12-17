package day15_methodCreation;

import java.util.Scanner;

public class C01_MethodCreation {

	public static void main(String[] args) {

		/*
		 Kullanıcıdan ismini ve soy ismini isteyin,
		 iki farklı method oluşturun, 
		
		 methodlardan biri girilen kelimeleri ilk harf büyük
		 diğerleri küçük olacak şekilde birleştirsin.
		 
		 ikinci method isim ve soy ismin ilk harfleri büyük harf kalan
		 harfler * olacak şekilde birleştirsin.
		 
		 kullanıcıya isminin açık olarak yazılması ve ya gizlenmesi 
		 tercihini sorun ve programın kalan kısmında isim ve soyismi
		 kullanıcının istediği şekilde kullanın.
		 
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen İsminizi giriniz:");
		String isim = scan.next();
		
		System.out.println("Lütfen İsminizi giriniz:");
		String soyIsim = scan.next();
		
		System.out.println("isminiz açık yazılsın mı 'evet' veya 'hayır'");
		String tercih = scan.next().toLowerCase();
		
		String connectedName=null; //Emrah Sağlam , E**** S*****
		
		switch(tercih) {
		case "evet":
			connectedName = method1(isim, soyIsim);
			break;
		case "hayır":
			connectedName = method2(isim, soyIsim);
			break;
		default:
			System.out.println("evet yada hayır yazın lütfen....");
			break;
			/*
			 Bu satırdan itibaren kullanıcının isim ve soyismi kullanıcı
			 tercihine bağlı olarak kaydedildi.
			 */			
		}
		System.out.println("Kullanıcının tercihi: " + connectedName);
		
		scan.close();
	}
	public static String method2(String isim, String soyIsim) {

		String isimIlkHarf = isim.substring(0,1).toUpperCase();
		String isimFormatted = isimIlkHarf + isim.substring(1).replaceAll("\\w", "*");
		
		String soyIsimIlkHarf = soyIsim.substring(0,1).toUpperCase();
		String soyIsimFormatted = soyIsimIlkHarf + soyIsim.substring(1).replaceAll("\\w", "*");
		
		return isimFormatted + " " + soyIsimFormatted;
		
		
	}
	public static String method1(String isim, String soyIsim) {
		String isimIlkHarf = isim.substring(0,1).toUpperCase();
		String isimFormatted = isimIlkHarf + isim.substring(1);
		
		String soyIsimIlkHarf = soyIsim.substring(0,1).toUpperCase();
		String soyIsimFormatted = soyIsimIlkHarf + soyIsim.substring(1);
		
		return isimFormatted + " " + soyIsimFormatted;
	}

}
