package _08_While_DoWhile;

import java.util.Scanner;

public class Q03_BirSayınınÜssünüHesaplayanCode {

    public static void main(String[] args) {
        // Kullanicidan 2 sayi alaliniz.
        //1. sayi taban
        //2. sayi Ust
        //1 sayinin ussunu hesaplatan code create edinim.
        // 3, 3  sonuc = 27

        //2  3 = 2*2*2=8


    	Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir sayıyı giriniz.");
		int sayi=scan.nextInt();
		System.out.println("Lütfen üssü sayıyı giriniz");
		int us=scan.nextInt();
    	
    	
		int usCounter=0;
		int sonuc=1;
		
		do {
			sonuc*=sayi;			
			usCounter++;
		}while(usCounter!=us);
		
		System.out.println("girmiş olduğunuz sayı; " +sayi+" ve bu sayının "+ us +". kuvveti : " + sonuc);

    }  


}
