package _07_ForLoop;

import java.util.Scanner;

public class Q11_MükemmelSayiMi {
    /*
        Bir sayinin mükemmel olup olmadiğini bulan bir method yaziniz.
        Mükemmel sayi : bir sayinin kendisi hariç bölenlerinin toplamı, kendisine eşitse o sayi mükemmeldir.
        ORNEK:
        INPUT     : 6
        OUTPUT : 1,2,3
                      1+2+3 = 6 = 6 (Mükemmel)

                      mukemmel sayi kontrolu
                      1. kullanicidan sayi alalim
                      2. bir toplam degiskeni olusturuyoruz
                      3. sayinin bolenleri bul
                      4. bolenleri toplamla topla
                      5. sayiyla toplamin esitligini kontrol et

        */
    public static void main(String[] args) {
        
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Lütfen bir tam sayı giriniz:");
    	int num = scan.nextInt();
    	
    	int toplam=0;
    	
    	for(int i=1; i<num; i++) {
    		if(num%i==0) {
    			toplam+=i;
    		}
    		
    	}System.out.println( (num==toplam) ? (num + " sayısı mükemmel sayıdır.") : (num + " sayısı mükemmel sayı değildir"));
    	
    	scan.close();
    	

    }


}
