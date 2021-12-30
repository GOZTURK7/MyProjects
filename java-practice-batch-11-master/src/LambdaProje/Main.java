package LambdaProje;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;

public class Main {
	
	
	static List<Ogrenci> ogListesi = new ArrayList<>();
	
	
	
	public static void main (String[] args) {
		
		ogrenciListesi();
		
		notaGoreSirala(90,100); // notları 90 ile 100 arasında olanları yazdır.
		
		yasaGoreSirala(25, 40); // yaşı 25 ile 40 arasında olanları.
			
		yasaCinsiyeteGore("erkek", 20,50);// cinsiyeti kadın yaşı 20 ve 50 arasında olanları yazdırın.
		
		ismeGoreSirala("Ahmet");
		
		soyIsmeGore("Can");
		
		ortHesapla();
		
		
		
		
	}



	private static void ortHesapla() {

		OptionalDouble sonuc = ogListesi.stream().mapToDouble(t->t.getDiplomaNotu()).average();	
		System.out.println(sonuc);
		System.out.println("**************************************************************************************");

	}



	private static void soyIsmeGore(String soyAd) {

		ogListesi.
		stream().filter(t->t.
				getSoyAd().
				equals(soyAd)).
		forEach(t->System.out.println(t));
		System.out.println("**************************************************************************************");

	}



	private static void ismeGoreSirala(String ad) {
		ogListesi.
		stream().
		filter(t->t.getAd().equals(ad)).
		forEach(t->System.out.println(t));
		System.out.println("**************************************************************************************");

		
	}



	private static void yasaCinsiyeteGore(String cinsiyet, int alt, int ust) {
		ogListesi.stream().filter(t->t.getYas()>alt && t.getYas()<ust && t.getCinsiyet().equals(cinsiyet)).forEach(t->System.out.println(t+" "));
		System.out.println("**************************************************************************************");
				
	}



	private static void yasaGoreSirala(int alt, int ust) {

		ogListesi.stream().filter(t->t.getYas()>alt && t.getYas()<ust).forEach(t->System.out.println(t+" "));
		System.out.println("**************************************************************************************");
		
	}



	private static void notaGoreSirala(int alt, int ust) {

		ogListesi.
		stream().
		sorted(Comparator.
				comparing(Ogrenci::getDiplomaNotu).
				reversed()).filter(t->t.getDiplomaNotu()>alt && t.getDiplomaNotu()<ust).forEach(t->System.out.println(t + " "));
		System.out.println("****************************************************************************************");

		
	}



	private static void ogrenciListesi() {

		ogListesi.add(new Ogrenci("Ahmet", "Can", 30, 95.5,"erkek" ));
		ogListesi.add(new Ogrenci("Ahmet", "Yarba", 25, 90,"erkek" ));
		ogListesi.add(new Ogrenci("Ayse", "Can", 21, 82.5,"kadin" ));
		ogListesi.add(new Ogrenci("Merve", "Aslan", 30, 98.8,"erkek" ));
		ogListesi.add(new Ogrenci("Veli", "Han", 80, 35.5,"erkek" ));
		ogListesi.add(new Ogrenci("Funda", "Funda", 24, 99.2,"kadin" ));

		
	}
	
	
}
