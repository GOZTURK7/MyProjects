package day19_WhileLoop_doWhileLoop;

import java.util.Scanner;

public class C06_Slide_Q5_BenimCozumum {

	public static void main(String[] args) {


		/*
		 Soru 5 ) Kullanicidan bir sifre girmesini isteyin. 
		 Girilen sifreyi asagidaki sartlara gore kontrol edin 
		 ve sifredeki hatalari yazdirin.
		 Kullanici gecerli bir sifre girinceye kadar bu islemi tekrar edin 
		 ve gecerli sifre girdiginde “Sifreniz Kabul edilmistir” yazdirin.
		 - Sifre kucuk harf icermelidir
		 - Sifre buyuk harf icermelidir
		 - Sifre ozel karakter icermelidir
		 - Sifre en az 8 karakter olmalidir.
				 */
		Scanner scan = new Scanner(System.in);
		String sifre="";
		
		boolean khk = true;
		boolean bhk =true;
		boolean okk =true;
		boolean uk = true;
		
		do {
			System.out.println("Lütfen Şifrenizi Giriniz.");
			sifre= scan.nextLine();
			
			khk = kucukHarfKontrol(sifre);
			bhk =buyukHarfKontrol(sifre);
			okk =ozelKarakterKontrol(sifre);
			uk = uzunlukKontrol(sifre);
						

		}while(khk || bhk || okk || uk);
		
		System.out.println("Şifreniz başarılı bir şekilde kaydedildi.");
		
		
		
		
	}

	private static boolean uzunlukKontrol(String sifre) {
		boolean uk=false;
		int uzunluk=sifre.length();
		if(uzunluk > 8) {
			uk=true;
		}else {
			System.out.println("Sifre en az 8 karakter olmalidir.");
			uk=false;	
		}
		return uk;
		
	}

	private static boolean ozelKarakterKontrol(String sifre) {
		boolean okk=false;
		String harfler="!@#$%^&*()_-+=/?<,>.|";
		for(int i=0; i<sifre.length(); i++) {
			if(harfler.contains(sifre.substring(i, i+1))) {
				okk=true;
				break;
			}	
		}if(okk==false) {
			System.out.println("Şifre özel karakter içermelidir.");
		}return okk;
		
		
		
	}

	private static boolean buyukHarfKontrol(String sifre) {
		boolean bhk=false;
		String harfler="ABCDEFGHIJKLMNOQRSTUVWXYZ";
		for(int i=0; i<sifre.length(); i++) {
			if(harfler.contains(sifre.substring(i, i+1))) {
				bhk=true;
				break;
			}
		}if(bhk==false) {
			System.out.println("Şifre büyük harf içermelidir.");
		}return bhk;
		
		
	}

	private static boolean kucukHarfKontrol(String sifre) {
		boolean khk=false;
		String harfler="abcdefghijklmnoprstuvyzxqw";
		for(int i=0; i<sifre.length(); i++) {
			if(harfler.contains(sifre.substring(i, i+1))) {
				khk=true;
				break;
			}
		}if (khk==false) {
			System.out.println("Şifre küçük harf içermelidir.");
		}return khk;
		
	}

}
