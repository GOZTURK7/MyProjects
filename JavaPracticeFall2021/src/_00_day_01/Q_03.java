package _00_day_01;

import java.util.Scanner;

public class Q_03 {

	public static void main(String[] args) {

		/*
	      * kullanicinin ad soyad yas boy kilosunu alt alata yazdiriniz
	      */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Lütfen adınızı girin: ");
		String ad = scan.nextLine();
		
		System.out.print("Lütfen soyadınızı girin: ");
		String soyad = scan.nextLine();
		
		System.out.print("Lütfen yaşınızı girin: ");
		int yas = scan.nextInt();
		
		System.out.print("Lütfen kilonuzu girin: ");	
		int kilo = scan.nextInt();
		
		System.out.print("Lütfen boyunuzu girin: ");
		double boy = scan.nextDouble();
		
		System.out.println("Adı: " + ad 
				+ "\n"  + "Soyadı: " + soyad
				+ "\n" + "Yaşı: " + yas 
				+ "\n" + "Kilosu: " + kilo 
				+ "\n" + "Boyu: "+ boy +"cm");

		
		
		scan.close();
		

		
		
	}

}
