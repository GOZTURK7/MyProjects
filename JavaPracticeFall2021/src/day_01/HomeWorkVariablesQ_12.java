package day_01;

import java.util.Scanner;

public class HomeWorkVariablesQ_12 {

	public static void main(String[] args) {
		 /*  Problem Tanımı
        Bir işçinin işi bitirme süresini ve toplam işçi sayısını alarak, işin bitme süresini
        hesaplayan kodu yazınız.
        Örneğin, Bir işçi bir işi 10 günde yapabilmektedir.
        Buna göre 2 işçi aynı işi kaç günde yapar?
        Örnek Ekran Çıktısı
         Bir işçi işi kaç günde bitirmektedir? 10
         Toplam kaç işçi çalışacak? 2
        İşin bitme süresi 5 gündür.
    */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("İşi bir işçi kaç günde yapıyor?: ");
		int birIsci = scan.nextInt();
		System.out.print("Toplam İşçi Sayısı Nedir?: ");
		int toplamIsci = scan.nextInt();
		
		double sonuc = (double) birIsci / toplamIsci;
		System.out.println("İşin bitme süresi: "+sonuc );
		
		scan.close();
		
		
		
	}

}
