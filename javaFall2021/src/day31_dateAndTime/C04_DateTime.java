package day31_dateAndTime;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class C04_DateTime {

	public static void main(String[] args) {


		
		/* Bir String ve bir int variable oluşturalım
		 * bir loop içerisinde bu variabler'ları  1000 kere değiştirelim
		 * ve işlem sürelerini kıyaslayalım.
		 * 
		 */
		
		
		
		
		LocalTime saat = LocalTime.now();	// başlangıç;
		System.out.println("Başlangıc Saati: " + saat); // 23:03:20.582301
		
		int sayi =0;
		
		for (int i = 0; i < 100000; i++) {
			
			sayi++;
			
		}
		LocalTime saat1 = LocalTime.now();	 // bitiş;
		System.out.println("Bitiş Saati: " + saat1);
		
		
		
		
		double nano = saat.getNano();
		double nano1 = saat1.getNano();
		
		System.out.println("İnteger Loop " + (nano1 - nano) + " nano saniyede tamamlandı");

		
		
		
		
		LocalTime saat2 = LocalTime.now();	// başlangıç;
		System.out.println("Başlangıc Saati: " + saat2); // 23:03:20.582301
		
		
		String str = "Gökhan";
		
		for (int i = 0; i < 100000; i++) {
			str+=" ";
			
		}
		LocalTime saat3 = LocalTime.now();	 // bitiş;
		System.out.println("Bitiş Saati: " + saat3);
		
		
		
		
		double nano2 = saat2.getNano();
		double nano3 = saat3.getNano();
		
		System.out.println("String " + (nano3 - nano2) + " nano saniyede tamamlandı");

		

		
		
		
	}

}
