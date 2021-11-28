package _07_ForLoop;

import java.util.Scanner;

public class Q13_GirilenHarfCümledeKacKere {
	
	
	public static void main(String[] args) {
		
		/*
         * Kullanicidan bir cumle ve bir harf alin,
         * Cumlede harfin kac kere
         * kullanildigini bulup, yazdirin
         *
         * ORNEK:
         *
         * INPUT : Cumle: Java ogrenmek cok guzel. Harf :e
         *
         * OUTPUT : Girdiginiz cumlede "e" harfi 3 kere kullanilmis.
         */

		
		Scanner scan = new Scanner(System.in);
		System.out.println("lütfen bir cümle girin enter'a basın ve bir harf girin;");
		String cumle = scan.nextLine();
		char karakter = scan.next().charAt(0);
		
		
		int counter=0;
		for(int i=0; i<cumle.length(); i++) {
			if(cumle.charAt(i) == karakter) {
				counter+=1;
			}
		}System.out.println("Girdiğiniz cümlede'" + karakter+"' harfi " + counter + " kere kullanılmış");
		
		
		
		
		
		
		
		
		
		
		
	}

}
