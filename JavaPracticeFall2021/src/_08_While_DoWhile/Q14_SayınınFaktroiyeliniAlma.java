package _08_While_DoWhile;

import java.util.Scanner;

public class Q14_SayınınFaktroiyeliniAlma {

    public static void main(String[] args) {
        /*  Problem Tanımı
        Verilen bir sayının faktöriyelini özyineli (recursive) olarak
        hespalayan fonksiyonu yazınız.

        Örnek Ekran Çıktıları
        Bir sayi giriniz: 6
        Faktöriyeli: 720

        Bir sayı giriniz: 3
        Faktöriyeli 6
     */

    	Scanner scan = new Scanner(System.in);
    	System.out.println("Lütfen sayı giriniz.");
		int sayi = scan.nextInt();
		System.out.println("girdiğiniz sayı: "+sayi);
		int factorial=1;
		while(sayi>=1) {
			factorial*=sayi;
			sayi--;
		}System.out.println("Faktoriyeli: " +factorial);
			
    	
    }
}


