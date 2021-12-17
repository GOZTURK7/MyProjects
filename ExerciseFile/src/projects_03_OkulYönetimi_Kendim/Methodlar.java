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
				+ "	 2- ÖĞRETMEN İŞLEMLERİ\n" + "	 O- ÇIKIŞ\n" + "");

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
			listeleme();
			break;
		case 4:
			silme();
			break;
		case 5:
			anaMenu();
			break;
		case 0:
			cıkıs();
			break;
		default:
			System.out.println("Lütfen geçerli bir işlem giriniz: ");
			break;

		}

	}

	private static void silme() {
		if(secilenKisi.equals("Ogrenci")) {
			System.out.print("Silmek İstediğiniz Öğrencinin Kimlik Numarasını Girin: ");
			int araOgrenciKimlik =scan.nextInt();
			for (Ogrenci k : listeOgrenci) {
				if (k.getKimlikNo()==araOgrenciKimlik) {
					listeOgrenci.remove(k);
					break; // buraya break koymazsak silme işleminden sonra liste uzunluğu for each bitmeden değiştiği için 
					//java.util.ConcurrentModificationException hataası alıyoruz o yüzden break koymalıyız eğer 
					// bir iterator'e ekleme veya silme gibi uzunluğunu değiştirecek bir işlem yapacaksak,
					
				}
				
			}
		}
		
		if(secilenKisi.equals("Ogretmen")) {
			System.out.print("Silmek İstediğiniz Öğretmenin Kimlik Numarasını Girin: ");
			int araOgretmenKimlik =scan.nextInt();
			for (Ogretmen k : listeOgretmen) {
				if (k.getKimlikNo()==araOgretmenKimlik) {
					listeOgretmen.remove(k);
					break;
					
				}
				
			}
		}
		islemler();
		
		
	}

	private static void anaMenu() {
		menu();
		
	}

	private static void listeleme() {
		
		System.out.println("***************** ÖĞRETMEN LİSTESİ *****************");
		System.out.println();
		for (Ogretmen Ogretmen : listeOgretmen) {
			System.out.println(Ogretmen.toString());
			
		}
		
		System.out.println("***************** ÖĞRENCİ LİSTESİ *****************");
		System.out.println();
		for (Ogrenci Ogrenci : listeOgrenci) {
			System.out.println(Ogrenci.toString());
		}
		islemler();
		

		
	}

	private static void arama() {
		System.out.println("************* "+secilenKisi + " arama sayfası ******************");
		
		boolean kontrol = true;
		if(secilenKisi.equals("Ogrenci")) {
					System.out.print("Aradığınız Öğrencinin Kimlik Numarasını Girin: ");
					int araOgrenciKimlik =scan.nextInt();
					//scan.nextLine();
					for (Personel k : listeOgrenci) {
						if (k.getKimlikNo()==araOgrenciKimlik) {
							System.out.println("Aradığınız Öğrenci "+k.toString()); 
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
		
		if(secilenKisi.equals("Ogretmen")) {
			System.out.print("Aradığınız Öğretmenin Kimlik Numarasını Girin: ");
			int araOgretmenKimlik =scan.nextInt();
			//scan.nextLine();
			for (Personel k : listeOgretmen) {
				if (k.getKimlikNo()==araOgretmenKimlik) {
					System.out.println("Aradığınız Öğretmen "+k.toString()); 
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
		islemler();
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
		scan.nextLine();
		String ad = scan.nextLine();

		System.out.print(secilenKisi + " Soyadı: ");
		String soyAd = scan.next();

		System.out.print(secilenKisi + " Kimlik No: ");
		int kimlikNo = scan.nextInt();

		System.out.print(secilenKisi + " Yaşı: ");
		int yas = scan.nextInt();

		System.out.print(secilenKisi + " " + sicilNumara + ": ");
		int sicilnumara = scan.nextInt();
		
		System.out.print(secilenKisi + " " + bolumSinif + ": ");
		String bolumsinif = scan.next();

		if (secilenKisi.equals("Ogrenci")) {
			Ogrenci ogc = new Ogrenci(ad, soyAd, kimlikNo, yas, sicilnumara, bolumsinif);
			listeOgrenci.add(ogc);
			System.out.println("Öğrenci Sisteme Kaydedildi.\r");
			System.out.println(ogc.toString());
			islemler();
		} else {
			Ogretmen ogr = new Ogretmen(ad, soyAd, kimlikNo, yas, sicilnumara, bolumsinif);
			listeOgretmen.add(ogr);
			System.out.println(ogr.toString());
			System.out.println("Öğretmen Sisteme Kaydedildi.");
			islemler();
		}

	}

}
