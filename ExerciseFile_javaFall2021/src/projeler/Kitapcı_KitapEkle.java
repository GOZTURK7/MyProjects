package projeler;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kitapcı_KitapEkle {

	public static int count = 1000;

	public static List<EklenenKitaplar> liste = new ArrayList();

	public static List<EklenenKitaplar> kitapEkle() {

		Scanner scan = new Scanner(System.in);

		boolean isFinish = false;
		do {

			// Scanner scan = new Scanner(System.in);
			System.out.println("Lütfen Kitap adını, yazarını ve fiyatını giriniz:");
			String kitapAd = scan.nextLine();
			String yazarAd = scan.nextLine();
			int fiyat = scan.nextInt();

			EklenenKitaplar eklenenKitap = new EklenenKitaplar(count, kitapAd, yazarAd, fiyat);
			liste.add(eklenenKitap);
			count++;
			// System.out.println(kitapEkle(liste));
			System.out.println("Devam etmek istiyor musunuz? Bitirmek için 0' a basın:");
			String a = scan.nextLine(); // dummy
			String str = scan.nextLine();
			if (str.equals("0")) {
				isFinish = true;
			} else {
				isFinish = false;
			}

		} while (isFinish == false);

		for (EklenenKitaplar w : liste) {
			System.out.println("Kitap No: " + w.kitapNo + ", Kitap Adı: " + w.kitapAdı + ", Yazar Adı: " + w.yazar
					+ ", Fiyatı: " + w.kitapFiyatı + "\n");
		}

		return liste;

	}

	public static void kitapNoIleKitap() {

		Scanner scan = new Scanner(System.in);
		boolean flag=true;
		do {
			System.out.println("Lütfen Kitap No giriniz: ");
			int kitapNu = scan.nextInt();
			String a = scan.nextLine(); // DUMMY

			for (EklenenKitaplar kitap : liste) {

				if (kitap.kitapNo == kitapNu) {
					System.out.println("Kitap No: " + kitap.kitapNo + ", Kitap Adı: " + kitap.kitapAdı + ", Yazar Adı: "
							+ kitap.yazar + ", Fiyatı: " + kitap.kitapFiyatı);
					
				} else if (kitapNu < 1000 || kitapNu > 2000) {
					System.out.println("Lütfen Geçerli Bir Kitap Numarası Girin: ");
				}
			}
			System.out.println("Başka Kitap Sorgulamak İster Misiniz? e/h");
			String isFinish = scan.next();
			if (isFinish.equalsIgnoreCase("h")) {
				System.out.println("GÜLE GÜLE....");
				flag=false;
			}
		} while (flag);

	}
	
	public static void bilgiIleKitap() {

		Scanner scan = new Scanner(System.in);
		String yazar1 = "";
		String kitap = "";
		int fiyat = 0;
		boolean flag=true;
		do {
			System.out.println("Lütfen sorugulamak için\nYazar Adı için 1 / Kitap Adı için 2 / Kitap Fiyatı için 3'e basın: ");
			String sorgu = scan.next();
			switch(sorgu) {
				case "1":
					System.out.println("Lütfen Yazar Adı Giriniz:");
					yazar1 = scan.nextLine();
					break;
				case "2":
					System.out.println("Lütfen Kitap Adı Giriniz:");
					kitap = scan.nextLine();
					break;	
				case "3":
					System.out.println("Lütfen Kitap Fiyatını Giriniz:");
					fiyat = scan.nextInt();
					break;	
			}
			String a = scan.nextLine(); // DUMMY
			
			

			for (EklenenKitaplar kitap1 : liste) {

				if (kitap1.yazar.equalsIgnoreCase(yazar1) || kitap1.kitapAdı.equalsIgnoreCase(kitap) || kitap1.kitapFiyatı==fiyat) {
					System.out.println("Kitap No: " + kitap1.kitapNo + ", Kitap Adı: " + kitap1.kitapAdı + ", Yazar Adı: "
							+ kitap1.yazar + ", Fiyatı: " + kitap1.kitapFiyatı);			
				} 
			}
			System.out.println("Başka Kitap Sorgulamak İster Misiniz? e/h");
			String isFinish = scan.next();
			if (isFinish.equalsIgnoreCase("h")) {
				System.out.println("GÜLE GÜLE....");
				flag=false;
			}
		} while (flag);

	}
	
	public static void numaraIleKitapSil() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Silmek istediğiniz Kitap Numarasını Giriniz.");
		
		
		
	}
}
