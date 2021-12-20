package Projects_07_AracKiralama_Kendim;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class KiralamaRunner {
	
	

	static String cıkıs="H";
	
	static Arac secim;
	
	static Scanner scan = new Scanner(System.in);
	
	static List<Arac> araclar = new ArrayList<>();
	
	static List<Kullanıcı> kullanıcılar = new ArrayList<>();
	

	public static void main(String[] args) {
		
		do {
		
		System.out.println("======== ARAÇ KİRALAMA SİSTEMİNE HOŞGELDİNİZ =======\n");
		System.out.print("Çıkış için Ç' ye, Devam Etmek için D'ye basınız: \n");
		cıkıs=scan.next();
		if (!cıkıs.equalsIgnoreCase("D")) {
			System.out.println("YİNE BEKLERİZ .....");
			break;
			
		}
		aracEkle(araclar);

		kampanyaliAracListele(araclar);
		
		tumAraclariListele(araclar);
		
		aracSecim();
		
		kullanıcıBilgileriEkle(kullanıcılar);
		
		}while(cıkıs.equalsIgnoreCase("D"));

	}

	private static void tumAraclariListele(List<Arac> araclar) {
		System.out.println("\n=====================TÜM ARAÇ LİSTESİ===========================\n");
		int counter =1;
		for (Arac arac : araclar) {
			
			System.out.println(counter+". "+arac.toString());
			counter++;
			
		}System.out.println();
		
	}

	private static void kullanıcıBilgileriEkle(List<Kullanıcı> kullanıcılar) {

		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("MMM/d/uuuu");
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("HH:mm");
		LocalDateTime dateTime = LocalDateTime.now();
				
		System.out.println("Bilgilerinizi Girin :");
		
		System.out.print("Adınız :");
		scan.nextLine();// DUMMY
		String adSoyad = scan.nextLine();
		//scan.nextLine();// DUMMY
		System.out.print("Yasınız: ");
		int yas = scan.nextInt();
		System.out.print("Kimlik No :");
		double kimlikNo=scan.nextDouble();
		System.out.print("KK Numaranız :");
		double kartNo = scan.nextDouble();
		
		
		System.out.print("Kaç Günlük Kiralayacaksınız:");
		int kacGun = scan.nextInt();
		System.out.print("Aracın Alınacağı Şehir");
		String sehir = scan.next();
		
		
		Kullanıcı kullanıcı = new Kullanıcı();
		kullanıcı.adıSoyadı=adSoyad;
		kullanıcı.yas=yas;
		kullanıcı.kimlikNo=kimlikNo;
		kullanıcı.kartNo=kartNo;
		kullanıcı.alinacakSehir=sehir;
		kullanıcı.alinacakGun=dtf1.format(dateTime);
		kullanıcı.alisSaati=dtf2.format(dateTime);
		kullanıcı.teslimGunu=dtf1.format(dateTime.plusDays(kacGun));
		kullanıcı.teslimSaati=dtf2.format(dateTime.plusDays(kacGun));
		
		kullanıcılar.add(kullanıcı);
		
		System.out.println(kullanıcılar.toString()+"\n");
		
		System.out.println("Ödenecek Tutar :"+ secim.gunlukUcret*kacGun+"TL\n");
			
		
	}

	public static void aracSecim() {

		
		System.out.println("Lütfen kiralamak istediğiniz araç bilgilerini giriniz:\n");
		System.out.print("Marka :");
		String marka=scan.next();
		System.out.print("Model :");
		String model=scan.next();
		System.out.print("Yakıt Tipi :");
		String yakitTipi=scan.next();
		System.out.print("Vites :");
		String vites=scan.next();
		
		
		for (Arac arac : araclar) {
			if (arac.marka.equalsIgnoreCase(marka) && 
					arac.yakitTipi.equalsIgnoreCase(yakitTipi) &&
					arac.vites.equalsIgnoreCase(vites)) {
					secim=arac;
				
			}
		}
		
		System.out.println("=========== SEÇİMİNİZ =========");
		System.out.println(secim.toString());
		
	}

	private static void kampanyaliAracListele(List<Arac> araclar) {
		int counter = 1;

		System.out.println("========= KAMPANYALI ARAÇ LİSTESİ ============\n");
		for (int i = 0; i < araclar.size(); i++) {
			if (araclar.get(i).marka.equalsIgnoreCase("Opel") || araclar.get(i).marka.equalsIgnoreCase("Toyota")
					|| araclar.get(i).marka.equalsIgnoreCase("Volvo")) {
				System.out.println(counter + ". " + araclar.get(i).toString());
				counter++;

			}
		}System.out.println();

	}

	public static void aracListele(List<Arac> araclar) {

		int counter = 1;
		System.out.println("=============== ARAÇ LİSTESİ =================");
		for (Arac each : araclar) {

			System.out.println(counter + ". " + each.toString());
			counter++;
		}

	}

	public static List<Arac> aracEkle(List<Arac> araclar) {

		for (int i = 0; i < 40; i++) {
			Arac arac = new Arac();
			araclar.add(arac);
		}
		int vites = 0;
		int k = 0;
		int araba = 0;

		for (int i = 0; i < araclar.size(); i++) {

			araclar.get(i).vites = AracVeriTabanı.vites.get(vites);
			vites++;
			if (vites == 2)
				vites = 0;

			araclar.get(i).yakitTipi = AracVeriTabanı.yakitTipi.get(k);
			k++;
			if (k == 4)
				k = 0;

			araclar.get(i).marka = AracVeriTabanı.marka.get(araba);
			araclar.get(i).model = AracVeriTabanı.model.get(araba);
			araclar.get(i).gunlukUcret = AracVeriTabanı.gunlukUcret.get(araba);
			araba++;
			if (araba == 5)
				araba = 0;
		}
		return araclar;

	}

}
