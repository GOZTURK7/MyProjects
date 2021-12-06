package _00_day_01;

import java.util.Scanner;

public class Q_4 {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("Birinci Sayıyı giriniz: ");
		int sayi1 = scan.nextInt();
		
		System.out.print("İkinci Sayıyı giriniz: ");
		int sayi2 = scan.nextInt();
		
		int toplam = sayi1 + sayi2;
		int fark = sayi1 - sayi2;
		int çarpım = sayi1 * sayi2;
		int bölme = sayi1 / sayi2; 
		
		System.out.println("Toplam: " + toplam 
				+"\n" + "Fark: " + fark
				+ "\n" + "Çarpım:" + çarpım
				+ "\n" + "Bölüm:" + bölme);
		
		scan.close();
		
	}

}
