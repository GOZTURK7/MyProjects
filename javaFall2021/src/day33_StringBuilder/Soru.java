package day33_StringBuilder;

import java.util.Iterator;

public class Soru {

	public static void main(String[] args) {

		/*
		 * Soru : For loop ile 1000 defa bir islem yapalim. 
		 * Oncesinde ve sonrasinda zamani kontrol edip StringBuilder ve 
		 * String class’larinin performanslarini karsilastiralim.   
			Ipucu: long TimeSb = System.nanoTime(); kullanalim.	
		 */
		
		String str = "Merhaba";
		
		StringBuilder sb = new StringBuilder("Merhaba");
		
		sb.trimToSize(); // capacity'i length boyutuna indirir.
		
		
		long time1 = System.nanoTime();
		
		for (int i = 0; i < 1000; i++) {
			
			str+=" ";
			
		}
		
		long time2 = System.nanoTime();
		
		for (int i = 0; i < 1000; i++) {
			
			sb.append(" ");
			
		}
		
		
		
		
		
	}

}
