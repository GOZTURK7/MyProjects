package RandomExercises;

import java.util.Scanner;

public class Ex_01_StringManupulation_HalukHoca {

	public static void main(String[] args) {

		/*
         * Kullanicidan bir isim isteyiniz ve isim sadece 3 harfli olmalidir ternary
         * kullanarak harflerin unique(farkli) olup olmadigina bakiniz e.g: ala => 3
         * Test data: ali eme all
         */
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir isim giriniz;");
		String isim = scan.nextLine();
		
		char c1 = isim.charAt(0);
		char c2 = isim.charAt(1);
		char c3 = isim.charAt(2);
		
		if (isim.length() == 3) {
			if (c1 != c2 && c1 != c3 && c3 != c2) {
				System.out.println("girilen isim 3 harfli ve unique");
		
			}else {
				System.out.println("girilen isim 3 harfli ve unique değil");
			}
		}else {
			System.out.println("girilen isim 3 harfli değil");
		}
		
		
		// BOOOLEAN ÖRNEK 
		
		
		String sonuc = (isim.length() == 3) ? ((c1 != c2 && c1 != c3 && c3 != c2) ? ("girilen isim 3 harfli ve unique") : ("girilen isim 3 harfli ve unique değil")) : ("girilen isim 3 harfli değil");
		System.out.println(sonuc);
		
	}

}
