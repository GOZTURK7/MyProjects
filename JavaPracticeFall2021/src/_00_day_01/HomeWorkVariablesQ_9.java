package _00_day_01;

import java.util.Scanner;


public class HomeWorkVariablesQ_9 {

	public static void main(String[] args) {
		
		/*  Problem Tanımı
        Kullanıcıdan a,b ve c sayılarını okuyarak aşağıdaki işlemi yapan kodu yazınız
        a'nın karesinden b'nin karesini cikarip c nin 3 katina bolunuz nin karesi
        Örnek Ekran Çıktısı
        a sayısını giriniz: 5
        b sayısını giriniz: 3
        c sayısını giriniz: 1
        sonuç : 5.333333333333333
        */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("a sayısını giriniz: ");
		int a = scan.nextInt();
		
		System.out.print("b sayısını giriniz: ");
		int b = scan.nextInt();
		
		System.out.print("c sayısını giriniz: ");
		int c = scan.nextInt();
		
		double sonuc = (double) ((a*a) - (b*b))/3*c;
		System.out.print("Sonuç: " + sonuc);
		
		scan.close();
		

	}

}
