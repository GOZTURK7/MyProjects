package _08_While_DoWhile;

import java.util.Scanner;

public class Q16_GirilenSayınınBasamaklarıToplamı {
    public static void main(String[] args) {

        // --------GİRİLEN SAYININ BASAMAKLARINDAKİ RAKAMLARIN TOPLAMINI BULUNUZ.

    	Scanner scan = new Scanner(System.in);
    	System.out.println("Lütfen sayı giriniz.");
		int sayi = scan.nextInt();
		
		int uzunluk=(sayi+"".length());
		
		int toplam=0;
		do {
			toplam+=sayi%10;
			sayi=sayi/10;
			
			
			uzunluk--;
		}while(uzunluk!=1);
    	System.out.println(toplam);
    	
    }

}
