package day44_iterators_Collections;

import java.util.ArrayList;
import java.util.List;

public class C01_Iterator {

	public static void main(String[] args) {


		List<Integer> liste = List.of(5,3,7,1,9,8,2);
		
		System.out.println(liste);
		
		// İNDEX KULLANMADAN tüm elemanları 3 eklenmiş olarak yazdırın.
		
		for (Integer each : liste) {
			each+=3;
			
			System.out.print(each+3 + " ");
		}
		System.out.println();
		System.out.println(liste);
		// for each loop ile index kullanmadan tüm elementlere ulaşabiliyoruz ama 
		// kalıcı değişiklik yapamıyoruz.
		
		
		
		
		
	}

}
