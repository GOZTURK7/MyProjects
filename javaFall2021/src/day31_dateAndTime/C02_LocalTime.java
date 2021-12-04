package day31_dateAndTime;

import java.time.LocalTime;
import java.time.ZoneId;

public class C02_LocalTime {

	public static void main(String[] args) {


		LocalTime saat = LocalTime.now();	// başlangıç;
		System.out.println("Başlangıc Saati: " + saat); // 23:03:20.582301
		
		
		int sayi = 10;
		
		for (int i = 0; i < 100000; i++) {
			
			sayi++;
			
		}
		LocalTime saat1 = LocalTime.now();	 // bitiş;
											// for loop'un ne kadar sürede tamamlanğını öğrenmek için ikinci bir LocalTime objesini
											// burada oluşturmamız lazım yoksa bu işlemin kaç saniyede yapıldığını göremeyiz
											// çünkü saat objesini oluşturduğumuzda sistem saati aldı ve saat1 objesi aldığımızda
									// da for looptan sonra yeniden o objeye özgü saati yeniden aldı aradaki fark for loop'un çalıştığı süreyi veriyor.
		System.out.println("Bitiş Saati: " + saat1);
		
		
		
		
		double nano = saat.getNano();
		double nano1 = saat1.getNano();
		
		System.out.println("For Loop " + (nano1 - nano) + "nano saniyede tamamlandı");
		
		
		
		System.out.println(saat.getMinute()); // 29
		
		System.out.println(saat.plusMinutes(10000));
		
		System.out.println(saat.minusHours(20)); // 03:31:57.142879 yirmi saat önce neydi.
		
		
		
		
		
		

		

		
	}

}
