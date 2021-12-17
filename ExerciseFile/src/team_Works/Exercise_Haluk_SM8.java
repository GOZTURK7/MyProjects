package team_Works;

import java.util.Scanner;

public class Exercise_Haluk_SM8 {

	public static void main(String[] args) {


		 /*
         * Kulanicidan bir kelime isteyin eger kelime 3 ve daha fazla harfden olusuyorsa son
         * iki harfini 3 kere yan yana yazdirin. degil ise girilen kelimeyi yazdirin
         *
         * ornek
         * input = Ali
         * output = lilili
         *
         * input = el
         * output = el
         */
		
		
		/*
		 1- kullanıcıdan bir kelime alıcaz
		 
		 2- kelimenin uzunluğunun 3 ve daha fazla olup olmadığını kontrol et
		 
		 3- eğer uzunsa son iki harfini alarak 3 kere yan yana yazdıracğız.
		 
		 4- yoksa kelime 3 harfden kısaysa kelimenin kendisini yazdıracağız.
		 
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir kelime giriniz: ");
		String kelime = scan.next();
		String a = kelime.substring(kelime.length()-2);

		if (kelime.length() > 2) {
			System.out.println(a + a + a);
		}else {
			System.out.println(kelime);
		}
		
		
		
		
		
		System.out.println("2. YOL");
		System.out.println((kelime.length() > 2) ? (a + a + a) : (kelime));
		
	}

}
