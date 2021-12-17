package day04;

import java.util.Scanner;

public class C01_Scanner {

	public static void main(String[] args) {

		
		//Kullanicidan yaricap isteyip cemberin cevresini ve dairenin alanini hesaplayip yazdirin
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen Çemberin Yarıçapını Giriniz.:");
		
		double yaricap = scan.nextDouble();
		
		double cevre = 2*3.14*yaricap;
		
		double alan = 3.14* yaricap*yaricap;
		
		
		// çemberin çevresi : 25.7
		// dairenin alanı : 26.31
		
		System.out.println("cemberin cevresi : " + cevre);
		System.out.println("dairenin alanı : " + alan);
		
		scan.close();
		
		
		
	}

}
