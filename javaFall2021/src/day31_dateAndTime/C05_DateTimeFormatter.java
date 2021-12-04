package day31_dateAndTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C05_DateTimeFormatter {

	public static void main(String[] args) {


		LocalDateTime  tarihSaat = LocalDateTime.now();
		
		System.out.println(tarihSaat); // 2021-12-02T23:45:32.835490

		
		
		
		// eğer tarih ve saati kendi istediğğimiz biçimde yazdırmak istersek
		// gun / ay / yıl  saat:dakika 
//		 * yy:   Yilin son iki rakamini
//		 * y:    Yilin tamamini
//		 * M:    Ay sirasini verir
//		 * MM:   Ay sirasini verir
//		 * MMM:  Ay isminin ilk uc harfini verir
//		 * MMMM: Ay isminin tamamini verir
//		 *
//		 *  Ay buyuk M ile belirtilmeli dakika( minute) ile
//		 *  cakismamasi icin.
		
		DateTimeFormatter duzenle = DateTimeFormatter.ofPattern("dd/MMMM/YYYY EEE : HH:mm" );
		System.out.println(duzenle.format(tarihSaat));
		/* 
		 * Format oluştururken;
		 * 
		 * GUN:
		 * 
		 * d : Başta 0 varsa onu yazmadan gün numarasını yazar.
		 * dd: Tek haneli günleri 01 gibi başına 01 yazarak yazar (gün numarası).
		 * DDD: Yılın kaçıncı günü olduğunu yazar
		 * E, EE, EEE: Gün isminin ilk üç harfi 'Mon'
		 * EEEE: Gün isminin tamamını 'Monday'
		 * 
		 * 
		 * 
		 * AY (AY için M, dakika için m kullanılır):
		 * 
		 * M : BAŞTA 0 VARSA ONU YAZMADAN AY NUMARASI.
		 * MM :Tek haneli ayları 01 gibi başına 01 yazarak yazar (Ay numarası).
		 * MMM : Ay isminin ilk üç harfi
		 * MMMM : Ay isminin tamamı
		 * 
		 * 
		 * YIL:
		 * 
		 * YY : Yılın son iki rakamını;
		 * YYYY: yılın tamamanı, yazdırır.
		 * 
		 * 
		 * SAAT: (24 saat üzerinden istiyorsak H, 12 saat düzeninde istiyorsak h)
		 * 
		 * HH : Saatin tamamını. tek rakamlı saat olursa 02 gibi.
		 * H : TEK RAKAMLI SAAT OLURSA SADECE SAATİ YAZDIRIR, 
		 * a yazarsak AM veya PM değeri
		 * P yazarsak
		 *
		 * 
		 */
		
		
		
		
	}

}
