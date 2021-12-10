package Team_Working_Proje1;

import java.util.Scanner;

public class Armstrong_Numberr {

	public static void main(String[] args) {
		/*
		 * Bir say�n�n basamaklar�ndaki t�m rakamlar�n ayr� ayr� k�plerinin toplam�
		 * kendisine e�itse bu say�ya Armstrong say� denir. sayi 4 basakli ise kupleri
		 * degil 4 kuvvetleri alinacak 5 basamakli ise 5 . kuvvetleri kac basamakli ise
		 * o degerde kuvvet alinacak Math.pow vb hazir java metodlari kullanmayiniz.
		 * 
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Amstrong sayiya aday bir sayi gir");
		int ady = scan.nextInt();
		
		
		int num = ady;
		int uzunluk = (String.valueOf(ady).length()); // ady sayısının uzunluğu
		int üslerToplamı = 0;

		if (ady > 0 && ady < 1000) { // eğer sayı 0-3 basamaklı ise;
			uzunluk = 3;			// uzunluğu 3'e sabitle yani üssü,
		}

		for (int i = 1; i <= uzunluk; i++) {
			int a = num % 10;
			num = num / 10;
			int usCarpım = a;
			for (int j = 1; j < uzunluk; j++) {
				usCarpım = usCarpım * a;
			}
			üslerToplamı += usCarpım;

		}
		System.out.println("üsler toplamı: " + üslerToplamı);
		if (üslerToplamı == ady) {
			System.out.println(ady + " Armstrong sayıdır.");
		}else {
			System.out.println(ady + " Armstrong sayı değildir.");
		}
		scan.close();
	}
}