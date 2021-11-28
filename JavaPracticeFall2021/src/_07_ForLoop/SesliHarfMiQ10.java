package _07_ForLoop;

import java.util.Scanner;

public class SesliHarfMiQ10 {
    /*Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
    değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada
            1 karakterden fazla ise hata mesajı göstersin. 
            (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)

    Sesli harfler: a,e,i,o,u

    Test Data:
    a

    Beklenen Çıktı:
    a harfi sesli harfdir.

    Test Data:
    d

    Beklenen Çıktı:
    d harfi sesiz harftir.

    Test Data:
    we  yada %

    Beklenen Çıktı:
    Yanlis karakter girdiniz!

     */
    public static void main(String[] args) {
    	
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Lütfen bir karakter giriniz:");
    	String karakter = scan.next();
    	System.out.println(karakter);
    	char karakterChar=karakter.charAt(0);
       
    	if(((karakterChar>='a' && karakterChar<='z') || 
    			(karakterChar>='A' && karakterChar<='Z')) && karakter.length()==1) {
    		sesliMi(karakter);
    	}else {
    		System.out.println("Yanlış karakter girdiniz.");
    	}
    	scan.close();
    	
    	
    	
    	
    	
    }

	public static void sesliMi(String karakter) {
		String sesliHarfler="aeiou";
		if(sesliHarfler.contains(karakter)){
			System.out.println(karakter + " harfi sesli harftir.");
		}else {
			System.out.println(karakter + " harfi sesli değildir.");
		}
			
	
	}
}

