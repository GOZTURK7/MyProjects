package kitapcı_Projesi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kitapcı_KitapEkle {

	public static int count = 1000;

	public static List<EklenenKitaplar> liste = new ArrayList();

	public static List<EklenenKitaplar> kitapEkle() {

		boolean flag=true;
		do {
			Scanner scan = new Scanner(System.in);

			System.out.println("Lütfen Kitap adını, yazarını fiyatını giriniz ve Stok Adedini girin:\n"
					+ "Kitap Ekleden Çıkmak için 0'a basınız:");
			System.out.println("kitap adını giriniz:");
			String kitapAd = scan.nextLine();
			if (kitapAd.equals("0")) {
				flag=false;
				break;
			}
			System.out.println("Yazar adını girin:");
			String yazarAd = scan.nextLine();
			System.out.println("Fiyatı girin:");
			int fiyat = scan.nextInt();
			System.out.println("Stok adedini girin:");
			int stok = scan.nextInt();

			EklenenKitaplar eklenenKitap = new EklenenKitaplar(count, kitapAd, yazarAd, fiyat, stok);
			liste.add(eklenenKitap);
			System.out.println("Kitap Başarıyla Eklendi");
			count++;

			
		}while(flag);
		return liste;


	}

	public static void kitapNoIleKitap() {

		boolean flag = true;
		do {
		Scanner scan = new Scanner(System.in);

		System.out.println("Lütfen Kitap No giriniz: \n\"Kitap No ile Sorgulamdan çıkmak için 0'a basınız: ");
		int kitapNu = scan.nextInt();

		if (kitapNu==0) {
			flag=false;
			break;				
		}
		//String a = scan.nextLine(); // DUMMY

		boolean kitapVarMi=false;
		for (EklenenKitaplar kitap : liste) {

			if (kitap.kitapNo == kitapNu) {
				System.out.println("Kitap No: " + kitap.kitapNo + ", Kitap Adı: " + kitap.kitapAdı + ", Yazar Adı: "
						+ kitap.yazar + ", Fiyatı: " + kitap.kitapFiyatı + "Stok Adedi: "+ kitap.stokAdedi);
				kitapVarMi=true;
			
			}
			
		}if (kitapVarMi==false) {
			System.out.println("Lütfen Geçerli Bir Kitap Numarası Girin: ");
		}
		
		}while(true);

	}

	public static void bilgiIleKitap() {

		Scanner scan = new Scanner(System.in);
		do {
		String yazar1 = " ";
		String kitap = " ";
		int fiyat = 0;
		boolean flag = true;
		while(flag==true){
			
			System.out.println(""+ 
					"Ne sorgulamk istiyorsunuz?\n" + 
					"Yazar Adı için		: 1\n"+ 
					"Kitap Adı için		: 2\n" + 
					"Kitap Fiyatı için	: 3'e basın: ");
			String sorgu = scan.nextLine();
			switch (sorgu) {
			case "1":
				System.out.print("Lütfen Yazar Adı Giriniz:");
				yazar1 = scan.nextLine();
				flag=false;
				break;
			case "2":
				System.out.print("Lütfen Kitap Adı Giriniz:");
				kitap = scan.nextLine();
				flag=false;
				break;
			case "3":
				System.out.print("Lütfen Kitap Fiyatını Giriniz:");
				fiyat = scan.nextInt();
				String a = scan.nextLine(); // DUMMY NEXTINT() DEN KURTULMAK İÇİN
				flag=false;
				break;
			default:
				System.out.println("Geçerli bir işlem giriniz:");		
			}
		}
			
			boolean gecerliMi=false;
			for (EklenenKitaplar kitap1 : liste) {

				if (
						kitap1.yazar.equalsIgnoreCase(yazar1) || 
						kitap1.kitapAdı.equalsIgnoreCase(kitap)|| 
						kitap1.kitapFiyatı == fiyat) {
					
					System.out.println(
							"Kitap No: " + kitap1.kitapNo + 
							", Kitap Adı: " + kitap1.kitapAdı
							+ ", Yazar Adı: " + kitap1.yazar + 
							", Fiyatı: " + kitap1.kitapFiyatı
							+ "Stok Adedi: "+ kitap1.stokAdedi);
					
					gecerliMi=true;
				} 
					
				
			}if(gecerliMi==false) {
				
				System.out.println("Geçerli bir veri giriniz:");
			}
	
			System.out.println("Başka Kitap Sorgulamak İster Misiniz? e/h");
			String isFinish = scan.next();
			String a = scan.nextLine(); // DUMMY KUKLA NEXT()'TEN KURTULMAK İÇİN

			if (isFinish.equalsIgnoreCase("h")) {
				break;
			}
		

		}while(true);
	}

	public static void numaraIleKitapSil() {

		boolean sil = false;

		while (sil == false) {
			
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Silmek istediğiniz Kitap Numarasını Giriniz.");

			int silinecekKitapNo = Integer.parseInt(scan.nextLine()); // dummy 

			for (int i = 0; i < liste.size(); i++) {

				if (silinecekKitapNo == liste.get(i).kitapNo) {
					liste.remove(liste.get(i));
					System.out.println("Silme İşlemi Başarılı.");
					sil = true;
					break;

				}
			}
			if (sil == false) {
				System.out.println("silmek için Geçerli bir veri girin");
				System.out.println("çıkmak için 0'a basın");
				String a = scan.nextLine();
				if(a.equals(a)) {
					sil=true;
					break;
				}
			}

		}
	}

	public static void tumKitaplariListele() {

		
		System.out.println("=============== GÜNCEL KİTAP LİSTESİ ===============");
		
		for (EklenenKitaplar kitap1 : liste) {
			
			System.out.println(
					"Kitap No: " + kitap1.kitapNo + 
					", Kitap Adı: " + kitap1.kitapAdı + 
					", Yazar Adı: "+ kitap1.yazar + 
					", Fiyatı: " + kitap1.kitapFiyatı
					+ "Stok Adedi: "+ kitap1.stokAdedi);
		}

	}
	
	public static void satıs() {
		boolean bittiMi=false;
		do {
		Scanner scan = new Scanner(System.in);
		System.out.println("Satılan Kitabın adını giriniz:");
		String kitapIsim = scan.nextLine();
		
		for (EklenenKitaplar kitap : liste) {
			
			if (kitap.kitapAdı.equalsIgnoreCase(kitapIsim)) {
				System.out.println("kaç adet satıldı:");
				int satılanAdet = Integer.parseInt(scan.nextLine());
				if (satılanAdet>kitap.stokAdedi) {
					System.out.println("Bu kadar kitapımız yok stok adediniz: " + kitap.stokAdedi);
				}else {
					kitap.stokAdedi-=satılanAdet;
					System.out.println(kitap.kitapAdı+" için Kalan stok adediniz: "+kitap.stokAdedi);
					
				}
			}
		}if (bittiMi == false) {
			System.out.println("devam etmek istiyor musunuz e/h");
			String a = scan.nextLine();
			if(a.equals("h")) {
				break;
			}
		}
		
	}while(bittiMi==false);
		}
}


