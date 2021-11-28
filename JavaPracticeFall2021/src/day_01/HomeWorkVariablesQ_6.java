package day_01;

import java.util.Scanner;

public class HomeWorkVariablesQ_6 {


	public static void main(String[] args) {
	
		 /*  Problem Tanımı
        Mesafeyi ve hızı alıp süreyi hesaplayan bir kod yazınız.
        Örneğin:İstanbul ile Ankara arası 400km olarak ölçülmektedir. Bu yolu ortalama
        120 km/saat hızla giden bir araç ne kadar sürede hedefe varır?
        Örnek Ekran Çıktısı
        Mesafeyi giriniz: 400
        Hızı giriniz: 100
        Süre 4 saattir.
     */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Mesafeyi Giriniz: ");
		int mesafe = scan.nextInt();
		
		System.out.print("Hızı Giriniz: ");
		int hız = scan.nextInt();
		
		int sure = mesafe/hız;
		System.out.print("Sure " + sure + " Saattir.");
		
		scan.close();
		
	
	}

}
