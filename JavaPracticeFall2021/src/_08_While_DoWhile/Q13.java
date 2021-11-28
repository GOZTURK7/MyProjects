package _08_While_DoWhile;

import java.util.Scanner;

public class Q13 {

    public static void main(String[] args) {
        /*
         * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
         * musteri karti olup olmadigini sorun
         *
         * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin
         * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az alirsa %10
         * indirim yapin
         */
    	
    	
    	Scanner scan = new Scanner(System.in);
    	System.out.print("Kaç adet ürün aldınız?:");
    	int urunAdedi= scan.nextInt();
    	System.out.println("Ürünün liste fiyatı nedir?: ");
    	int listeFiyati= scan.nextInt();
    	System.out.println("Müşteri Kartınız var mı?: ");
    	String musteriKartıVarMi= scan.next();
		int toplamFiyat=urunAdedi*listeFiyati;
		int fiyat = 0;
    	if(musteriKartıVarMi.equalsIgnoreCase("evet")) {
    		if (urunAdedi >=10) {
    			 fiyat = toplamFiyat -(toplamFiyat*(2/10));
    		}else {
    			 fiyat = toplamFiyat -(toplamFiyat*(15/100));

    		}
    	}else {
    		if (urunAdedi < 10) {
    			 fiyat = toplamFiyat -(toplamFiyat*(15/100));
    		}else {
    			 fiyat = toplamFiyat -(toplamFiyat*(1/10));

    		}
    	}
    	
    	System.out.println("ürün adaedi: " + urunAdedi + " liste fiyatı : "+ listeFiyati + " Müsteri Kartı varmı?: " + musteriKartıVarMi + " Toplam fiyat = " + fiyat);
    }
}
