package _07_ForLoop;

import java.util.Scanner;

public class Q14 {

    /*  Problem Tanımı
        Girilen bir sayı kadar satır ve sütünu olan ve
        sağ kenara dayalı üçgeni basan kodu yazınız.

        Ekran Çıktısı
        Bir sayi giriniz: 5
            *
           **
          ***
         ****
        *****

        */

    public static void main(String[] args) {



       
         /*
                    *
                    * *
                    * * *
                    * * * *
                    * * * * *
                    şeklini yazdırınız
             */

    	
    	
    	////////////1 . şekil ////////////////////
    	
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Lütfen bir sayı giriniz:");
    	int num = scan.nextInt();
    	
    	for(int i=0; i<num; i++) {    // 
    		for(int j=i+1; j<num; j++) { // aynı satıra 4 boşluktan başlayıp her satırda azalarark " " boşluk yazdırıyor.
    			System.out.print(" ");
    			}
    		for(int k=0; k<=i; k++) { // aynı hizadaki yukarıdaki for 4 boşluk koyduysa bu i'yi baz alıp 1 den başlayarak artan yıldız işareti koyuyor
    			System.out.print("* "); // buraya "*" koyarsak sağa yanaşık dik üçgen "* " şeklinde koyarsak eşkenar üçgen şekline çıkıyor.
    		}System.out.println();
    	}
    	

///////////// ikinci şekil ///////////////////

    	System.out.println();
    	System.out.println();
    	
    	
    	
    	for(int i=0; i<num; i++) {
    		for(int j=0; j<=i; j++) {
    			System.out.print("* ");
    		}System.out.println();
    	}

    	
    	scan.close();
    	
    }
}


