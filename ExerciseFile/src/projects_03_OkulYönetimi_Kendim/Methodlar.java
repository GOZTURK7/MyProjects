package projects_03_OkulYönetimi_Kendim;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Methodlar {

	static Scanner scan = new Scanner(System.in);

	static String secilenKisi;

	static List<Ogrenci> listeOgrenci = new ArrayList<>();
	static List<Ogretmen> listeOgretmen = new ArrayList<>();
	


	
	
	
	public static void menu() {

		System.out.println("\t====================================\n" + "	 ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ\n"
				+ "	====================================\n" + "	 1- ÖĞRENCİ İŞLEMLERİ\n"
				+ "	 2- ÖĞRETMEN İŞLEMLERİ\n" + "	 Q- ÇIKIŞ\n" + "");

		System.out.print("Lütfen bir işlem seçiniz: ");
		int islem = Integer.parseInt(scan.next().toUpperCase());

		switch (islem) {
		case 1:
			secilenKisi = "Ogrenci";
			islemler();
			break;
		case 2:
			secilenKisi = "Ogretmen";
			islemler();
			break;
		case 0 :
			cıkıs();
			break;
		default:
			System.out.println("Lütfen geçerli bir işlem giriniz: ");
			break;
		}

	}

	private static void cıkıs() {

		System.out.println("YİNE BEKLERİZ....");
	}

	private static void islemler() {

		System.out.println(
				"\t============= İŞLEMLER =============\n" + "		 1-EKLEME			 \n" + "		 2-ARAMA\n"
						+ "		 3-LİSTELEME\n" + "		 4-SİLME\n" + "		 5-ANA MENÜ\n" + "		 Q-ÇIKIŞ\n" + "");

		System.out.println("Lütfen bir islem seçiniz: ");
		int islem = Integer.parseInt(scan.next().toUpperCase());

		switch (islem) {
		case 1:
			ekleme();
			break;
		case 2:
			arama();
			break;
		case 3:
			//listeleme();
			break;
		case 4:
			//silme();
			break;
		case 5:
			//anaMenu();
			break;
		case 0:

			cıkıs();
			break;
		default:
			System.out.println("Lütfen geçerli bir işlem giriniz: ");
			break;

		}

	}

	private static void arama() {
		System.out.println("************* "+secilenKisi + " arama sayfası ******************");
		
		boolean kontrol = true;
if(secilenKisi.equals("Ogrenci")) {
			System.out.println("aradığınız ogrenci kimlikNo giriniz:");
			int araOgrenciKimlik =scan.nextInt();
			//scan.nextLine();
			for (Personel k : listeOgrenci) {
				if (k.getKimlikNo()==araOgrenciKimlik) {
					System.out.println("Aradığınız Öğrenci"+k.getAd() + k.getSoyAd());
					kontrol=false;
					break;
				}else {
					kontrol=false;
					break;
				}
			}if(kontrol==true) {
				System.out.println("Aradığınız kişi bulunamadı");
			}
			
		}
	}
	

	private static void ekleme() {
		String bolumSinif = "";
		String sicilNumara = "";

		if (secilenKisi.equals("Ogrenci")) {
			bolumSinif = "Sınıfı";
			sicilNumara = "Numara";
		} else {
			bolumSinif = "Bölümü";
			sicilNumara = "Sicil";
		}
		System.out.println(secilenKisi + " Bilgilerini Giriniz: ");
		System.out.print(secilenKisi + " Adı: ");
		String ad = scan.nextLine();
		String dummy = scan.nextLine(); // DUMMY 
		System.out.print(secilenKisi + " Soyadı: ");
		String soyAd = scan.nextLine();
		System.out.print(secilenKisi + " Kimlik No: ");
		int kimlikNo = scan.nextInt();
		System.out.print(secilenKisi + " Yaşı: ");
		int yas = scan.nextInt();
		System.out.print(secilenKisi + " " + sicilNumara + ": ");
		int sicilnumara = scan.nextInt();
		System.out.print(secilenKisi + " " + bolumSinif + ": ");
		String bolumsinif = scan.next();
		//scan.nextLine(); // dummy 

		if (secilenKisi.equals("Ogrenci")) {
			Ogrenci ogc = new Ogrenci(ad, soyAd, kimlikNo, yas, sicilnumara, bolumsinif);
			listeOgrenci.add(ogc);
			System.out.print("Öğrenci Sisteme Kaydedildi.\r");
			System.out.println(ogc.toString());
			islemler();
		} else {
			Ogretmen ogr = new Ogretmen(ad, soyAd, kimlikNo, yas, sicilnumara, bolumsinif);
			listeOgretmen.add(ogr);
			System.out.println("Öğretmen Sisteme Kaydedildi.");
			islemler();
		}

	}

}
