package day22_arrays;

import java.util.Arrays;

public class C02_Split {

	public static void main(String[] args) {

		// "Java ogrenmek cok guzel" cumlesinin kelimlerini ters sırada yazdırın.
		
		
		String cumle = "Java ogrenmek cok guzel";
		
		String[] kelimeler = cumle.split(" ");
		
		for(int i=kelimeler.length-1; i>=0; i--) {
			System.out.print(kelimeler[i]+" ");
		}
		
		
		
		
		
		
	}

}
