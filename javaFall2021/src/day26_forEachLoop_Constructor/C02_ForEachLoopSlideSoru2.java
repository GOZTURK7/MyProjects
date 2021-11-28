package day26_forEachLoop_Constructor;

import java.util.ArrayList;
import java.util.List;

public class C02_ForEachLoopSlideSoru2 {

	public static void main(String[] args) {


		/*
		 * Soru 2:
			Bir integer list olusturunuz ve bu list’deki tum sayilarin karesinin toplamini 
			For-each loop kullanarak bulunuz. Sonucu ekrana yazdiriniz.
		 */
	
		
		List<Integer> liste = new ArrayList<>();
		liste.add(1);
		liste.add(2);
		liste.add(3);
		liste.add(4);
		
		int karelerToplami=0;
		
		for (Integer i : liste) {
			karelerToplami+=(i*i);
		}System.out.println(karelerToplami);
		
		
	}

}
