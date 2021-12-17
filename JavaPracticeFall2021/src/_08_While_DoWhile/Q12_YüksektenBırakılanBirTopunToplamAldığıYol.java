package _08_While_DoWhile;

import java.util.Scanner;

public class Q12_YüksektenBırakılanBirTopunToplamAldığıYol {

    //Bir top 220 m  yükseklikten atılmaktadır.
    // Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
    // Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
    // Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulunuz.

    public static void main(String[] args) {

    	Scanner scan = new Scanner(System.in);
    	System.out.println("Topun bırakıldığı ilk yüksekliği giriniz");
		double yukseklik = scan.nextInt();
    	
    	
    	double topunToplamYolu=0;
    	int yereVurmaSayisi=0;
    	
    	do {
    		
    		yereVurmaSayisi++;
    		topunToplamYolu+=yukseklik;
    		yukseklik*=(0.75);
    		topunToplamYolu+=yukseklik; 	
    	
    	}while(yukseklik>=1);
    	System.out.println(topunToplamYolu +"" +yereVurmaSayisi);
    	

    }
}
