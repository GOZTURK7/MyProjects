package _10_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class QMarket {
	/*
	 * Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program
	 * yazınız. Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir
	 * method yazınız. Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını
	 * gösteren bir method yazınız. Ayrıca bakkalın hangi günler ortalamanın altında
	 * kazandığını gösteren bir method yazınız.
	 *
	 * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler) 2. Adım :
	 * Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun.
	 * (gunlukKazanclar) 3. Adım : While döngüsü ile kullanıcıdan 7 günlük
	 * kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle. 4. Adım :
	 * getOrtalamaKazanc() adlı method ile ortalama kazancı alın. 5. Adım :
	 * getOrtalamaninUstundeKazancGünleri() adlı method oluşturun. for döngüsü ile
	 * tüm günleri ortalama kazanç ile karşılaştır ortalama kazançtan yüksekse o
	 * günleri return yap. 6. Adım : getOrtalamaninAltindaKazancGünleri() adlı
	 * method oluşturun. for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
	 * ortalama kazançtan aşağıysa o günleri return yap.
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		List<String> gunler = List.of("Pazartesi", "Salı", "Carsamba", "Persembe", "Cuma", "Cumartesi", "Pazar");

		List<Integer> gunlukKazanclar = new ArrayList<>();

		int idx = 0;
		while (idx < 7) {
			System.out.println("Lütfen " + gunler.get(idx) + " gününün kazancını girin: ");
			int kazanc = scan.nextInt();
			gunlukKazanclar.add(kazanc);
			idx++;
		}

		getOrtalamaninUstundeKazancGünleri(gunlukKazanclar, gunler);

		getOrtalamaninAltindaKazancGünleri(gunlukKazanclar, gunler);
		
		scan.close();

	}

	private static void getOrtalamaninAltindaKazancGünleri(List<Integer> gunlukKazanclar, List<String> gunler) {
		System.out.println("*********** ORTALAMANIN ALTINDA KAZANILAN GÜNLER ************");
		for (int w : gunlukKazanclar) {
			if (w <= getOrtalamaKazanc(gunlukKazanclar)) {
				System.out.println((gunler.get(gunlukKazanclar.indexOf(w))) + " " + w + "$");
			}
		}

	}

	public static void getOrtalamaninUstundeKazancGünleri(List<Integer> gunlukKazanclar, List<String> gunler) {

		System.out.println("*********** ORTALAMANIN ÜSTÜNDE KAZANILAN GÜNLER ************");
		System.out.println("****************** ORTALAMA KAZANC: " + getOrtalamaKazanc(gunlukKazanclar)+"$ *********************");
		for (int w : gunlukKazanclar) {
			if (w > getOrtalamaKazanc(gunlukKazanclar)) {
				System.out.println((gunler.get(gunlukKazanclar.indexOf(w))) + " " + w + "$");
			}
		}

	}

	public static int getOrtalamaKazanc(List<Integer> gunlukKazanclar) {
		int toplamKazanc = 0;
		for (int kazanc : gunlukKazanclar) {
			toplamKazanc += kazanc;
		}

		return (toplamKazanc / 7);
	}
}