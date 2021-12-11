package Projects_02_Market_Kendim;

import java.util.ArrayList;
import java.util.Scanner;

public class MarketSahibiUrunGir {

	Scanner scan = new Scanner(System.in);

	ArrayList<Urun> urunler = new ArrayList<>();

	public void urunListesiOlustur() {
		System.out.println(
				"Sayın Market Sahibi Ürün Listesi Oluşturmak için Lütfen Ürün No," + " Ürün ve Fiyatı giriniz;\n\n");
		boolean isFinish = false;

		while (isFinish == false) {

			System.out.println("Urun No:");

			String urunNo = scan.next();

			System.out.println("Urun Adı:");

			String urunAdı = scan.next();

			System.out.println("Urun Fiyatı:");

			int urunFiyatı = scan.nextInt();

			Urun mal = new Urun(urunNo, urunAdı, urunFiyatı);

			urunler.add(mal);

			System.out.println("Devam etmek istiyor musunuz? E/H");

			String devamMi = scan.next();

			if (devamMi.equalsIgnoreCase("H")) {
				isFinish = true;
				break;
			}

		}
	}
}
