package _10_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QManav {
	static List<String> urunListesi =new ArrayList<>();
	static List<Double> urunFiyatlari =new ArrayList<>();
	static double toplanOdenecekTutar;

	public static void main(String[] args) {
		/*
		 * Basit bir 5 ürünlü manav alisveris programi yaziniz.
		 *
		 * 1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
		 * 2. Adim : Baska bir urun almak isteyip istemedigini sor.
		 * 			 istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
		 * 			 Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
		 * 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
		 * 4. Adim : Alisveris bitince toplam odemesi gereken tutari goster.
		 *
		 * */

		Scanner scan = new Scanner(System.in);
		
		
		double toplamFiyat=0
;
		urunListesi = List.of("Domates", "Biber", "Patlıcan", "Salatalık", "Havuc");
		urunFiyatlari=List.of(3.0, 5.0, 2.0, 4.0, 1.0);
		System.out.println(urunListesi);
		
		while(true) {
			
			System.out.print("Ürün Listesinden bir ürün seçin: ");
			String urun = scan.next();
			
			System.out.println("Kaç Kilogram " + urun + " aldınız: ");
			int kg = scan.nextInt();
			System.out.println(urunListesi.indexOf(urun));
			
			toplamFiyat += (urunFiyatlari.get(urunListesi.indexOf(urun))*kg);
			
			System.out.print("Alışverişe devam etmek istiyor musunuz 'E/H': ");
			String devam = scan.next().toLowerCase();
			if (devam.equals("h")) {
				break;
			}
		}System.out.println("Toplam fiyat: "+ toplamFiyat);
	
		
	
		

	}
}
