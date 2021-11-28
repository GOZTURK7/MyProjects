package _08_While_DoWhile;

import java.util.Scanner;

public class Q09_PinKodunuKontrolEt {

    public static void main(String[] args) {
//  kullanicinin INTEGER OLAN PIN kodunuzu kontrol eden bir kod yazınız.
    	
    	
    	
    	
    	Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen pin numaranızı giriniz.");
		int kullaniciPin=scan.nextInt();
		
    	int sistemPin = 1453;
    	int hak=1;
    	while(kullaniciPin!=sistemPin) { 
    		System.out.println("Hatalı pin girdiniz.");
    		System.out.println("Lütfen bir daha deneyin.");
    		kullaniciPin=scan.nextInt();
   

    		
    	}System.out.println("Başarıyla giriş yaptınız.");
    }
}

