package _08_While_DoWhile;

import java.util.Scanner;

public class Q15_VerilenSayınınKombinasyonunuBulma {

    public static void main(String[] args) {
         /*  Problem Tanımı
        Verilen iki sayının kombinasyonunu bulan kodu yazınız.
        Hatırlatma C(n,r) = n! / (r!(n-r)!)

        Ekran Çıktısı
        Birinci sayıyı giriniz: 15
        Ikinci sayıyı giriniz: 4
        Kombinasyon: 1365

        Birinci sayıyı giriniz: 5
        Ikinci sayıyı giriniz: 3
        Kombinasyon: 10
    	
		
		
		

      */
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Lütfen iki sayı giriniz giriniz.");
		long n = scan.nextInt();
		long r =scan.nextInt();
		
		long n1=n;
		long r1=r;
		long n_eksi_r=(n1-r1);
		if (n_eksi_r <0) {
			n_eksi_r*=(-1);
		}
		
		
		long nFact=1;
		while(n1>0) {
			nFact*=n1;
			n1--;		
		}
		
		System.out.println(nFact);
		long rFact=1;
		while(r1>0) {
			rFact*=r1;
			r1--;		
		}
		
		System.out.println(rFact);

		long n_eksi_rFact=1;
		while(n_eksi_r>0) {
			n_eksi_rFact*=n_eksi_r;
			n_eksi_r--;		
		}
		System.out.println(n_eksi_rFact);	
	
		System.out.println("Verilen sayının kombinasyonu: " + nFact / (rFact*n_eksi_rFact));
	
		scan.close();
		
		
    }
}

