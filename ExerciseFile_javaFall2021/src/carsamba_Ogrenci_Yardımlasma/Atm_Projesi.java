package carsamba_Ogrenci_Yardımlasma;

import java.util.List;
import java.util.Scanner;

/*
 * ATM 
	Kullaniciya giriş için kart numarasi ve şifresini isteyin, 
	eger herhangi birini yanlis girerse tekrar isteyin.
	Kart numarasi aralarda boşluk ile girerse de eger doğruysa kabul edin.
	Kart numarasi ve sifre dogrulanirsa kullanicinin yapabileceği işlemleri ekrana yazdirin,
	Bakiye sorgula, para yatirma, para çekme, para gönderme, sifre değiştirme ve cikis.
	Para çekme ve para gonderme işleminde mevcut bakiyeden buyuk para çekilemez,
	Para gönderme işleminde istenen iban TR ile baslamali ve toplam 26 karakterli olmali, 
	eger değilse menü ekranina geri donsun.
	Sifre değiştirme işleminde mevcut şifreyi teyit ettikten sonra, sifre değişiklik işlemini yapmali,
 */
public class Atm_Projesi {
	static String cardNo = "1";
	static String password = "1";
	static int bakiye = 2000;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Lütfen Kart Numaranızı Giriniz: ");
		String kartNumarası = scan.nextLine().replaceAll("\s", ""); // !!! burada güzel birşey yaptım int variable da
																	// newtline ile string aldım sonra onu parse int ile
																	// ıntegere'a çevirip int variable a tek satırda
																	// atadım
		System.out.println("Lütfen Şifrenizi Giriniz: ");
		String sifre = scan.next();	
		int sayac = 3;
		do {
			
			if (kartNumarası.equals(cardNo) && sifre.equals(password)) {
				islemler();
				System.out.println("Lütfen işlem seçiniz: ");
				int islem = scan.nextInt();
				switch (islem) {
				case 1:
					System.out.println("Mevcut Bakiyeniz: " + bakiyeSorgula());
					break;
				case 2:
					System.out.println("İşlem başarılı Yeni Bakiyeniz: " + paraYatırma());
					break;
				case 3:
					paraCekme();
					break;
				case 4:
					paraGonderme();
					break;
				case 5:
					sifreDegistir();
					break;
				case 6:
					cıkıs();
					break;
				default:
					System.out.println("Lütfen geçerli bir işlem giriniz:");
				}
			}else {
				sayac-=1;
				if (sayac>0) {
					System.out.println("Hatalı Giriş Yaptınız");		
				}else {
					System.out.println("Giriş Hakkınız kalmadı Sistemden Çıkılıyor..");
				}
			}
			//devamMi();
			//

		}while (sayac != 0);
	}

	private static boolean devamMi() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Devam etmek istiyor musunuz. E/H");
		String devam = scan.next().toUpperCase();
		if (devam.equals("E")) {
			return true;
		} else {
			return false;
		}
	}

	private static void cıkıs() {
		System.out.println("Çıkış yapıldı, Güle GÜle .....");
	}

	public static void sifreDegistir() {
		int sayac = 3;
		while (sayac > 0) {
			Scanner scan = new Scanner(System.in);
			System.out.print("Lütfen Mevcut Şifreyi Giriniz: ");
			String mevcutSifre = scan.next();
			if (mevcutSifre.equals(password)) {
				System.out.print("Lütfen Yeni Şifreyi Giriniz: ");
				password = mevcutSifre;
				System.out.println("Şifreniz değiştirildi yeni şifreniz: " + password);
				break;

			} else {
				sayac -= 1;
				System.out.println("Mevcut sifreyi hatalı girdiniz " + sayac + " hakkınız kaldı.");
			}
		}
		System.out.println("Şifreyi 3 kez hatalı girdiniz çıkış yapılıyor...");
		cıkıs();

	}

	public static int paraGonderme() {
		Scanner scan = new Scanner(System.in);
		System.out.print("IBAN'ı giriniz: ");
		String iban = scan.next();
		System.out.print("Gönderilcek tutarı giriniz: ");
		int tutar = scan.nextInt();

		if (tutar > bakiye) {
			System.out.println("Girdiğiniz tutar " + tutar + " Bakiyenizden " + bakiye + " Fazla Tekrar işlem seçin.");
			islemler();
		} else {
			System.out.println(tutar + "$ ilgili hesaba gönderildi.");
			bakiye -= tutar;
			System.out.println("Para gönderme işleminden sonra bakiyeniz: " + bakiye);
		}
		return bakiye;
	}

	public static void islemler() {
		System.out.println("********* İSLEMLER **********");
		System.out.println("1) Bakiye Sorgula		: 1\n" + "2) Para Yatırma		: 2\n" + "3) Para Çekme		: 3\n"
				+ "4) para Gönderme		: 4\n" + "5) Şifre Değiştirme	: 5\n" + "6) Çıkış				: 6");
	}

	public static int paraCekme() {

		Scanner scan = new Scanner(System.in);
		System.out.print("Çekilecek Tutarı Girin: ");
		int cekilecekTutar = scan.nextInt();
		if (cekilecekTutar > bakiye) {
			System.out.println("Çekilmek isteten tutar: " + cekilecekTutar + " Mevcut Bakiyeniz " + bakiye
					+ "☠️ işlem başarısız.");
		} else {
			bakiye -= cekilecekTutar;
			System.out.println("Çekilen tutar: " + cekilecekTutar + " Mevcut Bakiyeniz " + bakiye + " ✅ ");
		}
		return bakiye;

	}

	public static int paraYatırma() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Yatırılacak Tutarı Girin: ");
		int yatır = scan.nextInt();
		bakiye += yatır;
		return bakiye;
	}

	public static int bakiyeSorgula() {

		return bakiye;
	}

}
