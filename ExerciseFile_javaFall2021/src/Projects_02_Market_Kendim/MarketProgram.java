package Projects_02_Market_Kendim;

import java.util.ArrayList;
import java.util.Scanner;

public class MarketProgram {

	/*
	 * Basarili Market alış-veriş programı.
	 *
	 * 1. Adım: Ürünler ve fiyatları içeren listeleri oluşturunuz. No Ürün Fiyat
	 * ==== ======= ========= 
	 * 00 Domates 2.10 TL 
	 * 01 Patates 3.20 TL 
	 * 02 Biber 1.50 TL
	 * 03 Soğan 2.30 TL 
	 * 04 Havuç 3.10 TL 
	 * 05 Elma 1.20 TL 
	 * 06 Muz 1.90 TL 
	 * 07 Çilek 6.10 TL 
	 * 08 Kavun 4.30 TL 
	 * 09 Üzüm 2.70 TL 
	 * 10 Limon 0.50 TL
	 * 
	 * 2. Adım: Kullanıcının ürün nosuna göre listeden ürün seçmesini isteyiniz. 
	 * 3. Adım: Kaç kg satın almak istediğini sorunuz. 
	 * 4. Adım: Alınacak bu ürünü sepete ekleyiniz ve Sepeti yazdırınız. 
	 * 5. Başka bir ürün alıp almak istemediğini sorunuz. 
	 * 6. Eğer devam etmek istiyorsa yeniden ürün seçme kısmına yönlendiriniz. 
	 * 7. Eğer bitirmek istiyorsa ödemeyi kontrol edip para ustu hesaplayarak programı bitirinzi.
	 */
	

	MarketSahibiUrunGir obj = new MarketSahibiUrunGir();
	
	public void menu () {
		
		System.out.println("=========== URUNLER VE FİYATLARI ===========");
		System.out.println(""
				+ "00 Domates    2.10 TL\n"
				+ "01 Patates    3.20 TL\n"
				+ "02 Biber      1.50 TL\n"
				+ "03 Soğan      2.30 TL\n"
				+ "04 Havuç      3.10 TL\n"
				+ "05 Elma       1.20 TL\n"
				+ "06 Muz        1.90 TL\n"
				+ "07 Çilek      6.10 TL\n"
				+ "08 Kavun      4.30 TL\n"
				+ "09 Üzüm       2.70 TL\n"
				+ "10 Limon      0.50 TL");
		
		
	}
	
	public void urunListe (ArrayList<Urun> liste) {
		
	}
	
	

//	public void urunListele() {
//		System.out.println("======= URUNLER =========");
//		for (Urun urun : obj.urunler) {
//			System.out.println("Urun Numarası: "+ urun.urunNo + ", Ürün :" + urun.urun + ", Fiyatı: "+urun.fiyat+"\n" );
//		}
//	}
	
}
