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
	private static boolean flag = true;

	public static void main(String[] args) {

		String kartNumarası = "";
		String sifre = "";

		do {
			Scanner scan = new Scanner(System.in);

			System.out.println("Lütfen Kart Numaranızı Giriniz: ");
			kartNumarası = scan.nextLine().replaceAll("\s", "");

			System.out.println("Lütfen Şifrenizi Giriniz: ");
			sifre = scan.next();

		} while (!(kartNumarası.equals(cardNo) || !(sifre.equals(password))));

		do {
			Scanner scan = new Scanner(System.in);
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

			}
		} while (flag);

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

	private static boolean cıkıs() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Çıkış yapmak istediğinize Emin misiniz? E/H");
		String cıkıs = scan.next();
		if (cıkıs.equalsIgnoreCase("e")) {
			System.out.println("çıkış yapıldı güle güle.");
			flag = false;
			return false;
		}
		return true;

	}

	public static void sifreDegistir() {
		boolean dogruMu = true;
		while (dogruMu) {
			Scanner scan = new Scanner(System.in);
			System.out.print("Lütfen Mevcut Şifreyi Giriniz: ");
			String mevcutSifre = scan.next();
			if (mevcutSifre.equals(password)) {
				System.out.print("Lütfen Yeni Şifreyi Giriniz: ");
				String yeniSifre = scan.next();
				password = yeniSifre;
				System.out.println("Şifreniz değiştirildi yeni şifreniz: " + password);
				dogruMu = false;

			} else {
				System.out.println("Mevcut sifreyi hatalı girdiniz tekrar deneyin");
			}
		}

	}

	public static int paraGonderme() {
		Scanner scan = new Scanner(System.in);
		boolean flag = true;
		do {
			System.out.print("IBAN'ı giriniz: ");
			String iban = scan.next().replaceAll(" ", "").toUpperCase();
			if (!iban.contains("TR") || !iban.startsWith("TR")) {
				System.out.print("IBAN' TR ile başlamalıdır. ");
			} else if (iban.length() != 28) {
				System.out.println("IBAN 26 Numara Olmalıdır.");
			} else {
				flag = false;
			}

		} while (flag);

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
