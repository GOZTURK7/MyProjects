package projeler;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kitapcı_KitapEkle {

	public static int count = 1000;
	public static List<String> liste;
	
	
	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		List<String> liste = new ArrayList<>();
//
//		
//		boolean isFinish = false;
//		do {
//			
//			System.out.println(kitapEkle(liste));
//			System.out.println("Devam etmek istiyor musunuz? Bitirmek için 0' a basın:");
//			String str = scan.next();
//			if(str.equals("0")) {
//				isFinish = true;
//			}else {
//				isFinish=false;
//			}
//			
//		}while(isFinish==false);
//		System.out.println(liste + "  count: " + count);
		
		
//	}

	}

	public static List<String> kitapEkle() {
		
		Scanner scan = new Scanner(System.in);

		
		
		boolean isFinish = false;
		do {

			//Scanner scan = new Scanner(System.in);
			System.out.println("Lütfen Kitap adını, yazarını ve fiyatını giriniz:");
			String kitapAd = scan.nextLine();
			String yazarAd = scan.nextLine();
			String fiyat = scan.nextLine();
			
			liste.add("Kitap No: "+ String.valueOf(count));
			liste.add("Kitap Adı: "+kitapAd);
			liste.add("Yazar Adı: "+yazarAd);
			liste.add("Kitap Fiyatı: "+fiyat);
			count++;	
			//System.out.println(kitapEkle(liste));
			System.out.println("Devam etmek istiyor musunuz? Bitirmek için 0' a basın:");
			String str = scan.nextLine();
			if(str.equals("0")) {
				isFinish = true;
			}else {
				isFinish=false;
			}
			
		}while(isFinish==false);
		System.out.println(liste + "  count: " + count);
				
		return liste;
	}

}
